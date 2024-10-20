package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.Presentation;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.common.logging.nano.Vr$VREvent$SdkConfigurationParams;
import com.google.vr.cardboard.DisplaySynchronizer;
import com.google.vr.cardboard.EglReadyListener;
import com.google.vr.ndk.base.GvrApi;
import defpackage.AV2;
import defpackage.AbstractC9595s51;
import defpackage.C3230Yw0;
import defpackage.ChoreographerFrameCallbackC10410uU0;
import defpackage.F02;
import defpackage.KK3;
import defpackage.U60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class GvrLayoutImpl extends FrameLayout {
    private int asyncReprojectionFlags;
    private boolean attachedToWindow;
    private boolean autoFadeEnabled;
    private CardboardEmulator cardboardEmulator;
    private SdkDaydreamTouchListener daydreamTouchListener;
    private DaydreamUtilsWrapper daydreamUtils;
    private DisplaySynchronizer displaySynchronizer;
    private C3230Yw0 eglFactory;
    private EglReadyListener eglReadyListener;
    private FadeOverlayView fadeOverlayView;
    private FrameFlushWorkaround frameFlushWorkaround;
    private GvrApi gvrApi;
    private boolean isResumed;
    private PresentationHelper presentationHelper;
    private FrameLayout presentationLayout;
    private View presentationView;
    private AV2 scanlineRacingRenderer;
    private AsyncReprojectionSurfaceView scanlineRacingView;
    private ScreenOnManager screenOnManager;
    private final Runnable showRenderingViewsRunnable;
    private boolean stereoModeEnabled;
    private GvrUiLayoutImpl uiLayout;
    private VrCoreSdkClient vrCoreSdkClient;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: com.google.vr.ndk.base.GvrLayoutImpl$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GvrLayoutImpl.this.updateRenderingViewsVisibility(0);
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: com.google.vr.ndk.base.GvrLayoutImpl$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GvrLayoutImpl.this.vrCoreSdkClient != null) {
                GvrLayoutImpl.this.vrCoreSdkClient.onExitingFromVr();
            }
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: com.google.vr.ndk.base.GvrLayoutImpl$3 */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GvrLayoutImpl.this.scanlineRacingRenderer.a.onPauseReprojectionThread();
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: com.google.vr.ndk.base.GvrLayoutImpl$4 */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GvrLayoutImpl.this.uiLayout.invokeCloseButtonListener();
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public interface PresentationFactory {
    }

    public GvrLayoutImpl(Context context) {
        this(context, null);
    }

    public static /* synthetic */ PresentationFactory access$500() {
        return null;
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public class AsyncReprojectionSurfaceView extends GvrSurfaceView {
        private AV2 scanlineRacingRenderer;

        /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
        /* renamed from: com.google.vr.ndk.base.GvrLayoutImpl$AsyncReprojectionSurfaceView$1 */
        /* loaded from: classes4.dex */
        class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AsyncReprojectionSurfaceView.this.scanlineRacingRenderer.a.onPauseReprojectionThread();
            }
        }

        public AsyncReprojectionSurfaceView(Context context) {
            super(context);
        }

        public void setRenderer(AV2 av2) {
            this.scanlineRacingRenderer = av2;
            super.setRenderer((GLSurfaceView.Renderer) av2);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (!isDetachedFromWindow() && this.scanlineRacingRenderer != null) {
                onSurfaceDestroyed(new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.AsyncReprojectionSurfaceView.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        AsyncReprojectionSurfaceView.this.scanlineRacingRenderer.a.onPauseReprojectionThread();
                    }
                });
            } else {
                onSurfaceDestroyed(null);
            }
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public class FrameFlushWorkaround implements Choreographer.FrameCallback {
        private final Choreographer choreographer = Choreographer.getInstance();
        private int framesRemaining;

        public void onResume() {
            if (this.framesRemaining > 0) {
                this.choreographer.removeFrameCallback(this);
            }
            this.framesRemaining = 5;
            this.choreographer.postFrameCallback(this);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            int i = this.framesRemaining - 1;
            this.framesRemaining = i;
            if (i > 0) {
                this.choreographer.postFrameCallback(this);
            }
        }
    }

    public GvrLayoutImpl(Context context, ExtensionManager extensionManager) {
        super(context);
        this.asyncReprojectionFlags = -1;
        this.autoFadeEnabled = true;
        this.isResumed = false;
        this.stereoModeEnabled = true;
        this.showRenderingViewsRunnable = new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                GvrLayoutImpl.this.updateRenderingViewsVisibility(0);
            }
        };
        if (U60.a(context) == null) {
            throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
        }
        init(extensionManager);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public class ScreenOnManager implements GvrApi.IdleListener {
        private static final long QUIET_PERIOD_AFTER_RESUME_MILLIS = TimeUnit.SECONDS.toMillis(5);
        private boolean isEnabled = true;
        private boolean isIdle;
        private boolean isResumed;
        private long lastResumeTimeMillis;
        private final View parentView;

        /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
        /* renamed from: com.google.vr.ndk.base.GvrLayoutImpl$ScreenOnManager$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ boolean val$newIsEnabled;

            public AnonymousClass1(boolean z) {
                z = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = ScreenOnManager.this.isEnabled;
                boolean z2 = z;
                if (z == z2) {
                    return;
                }
                ScreenOnManager.this.isEnabled = z2;
                ScreenOnManager.this.updateSetScreenOn();
            }
        }

        /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
        /* renamed from: com.google.vr.ndk.base.GvrLayoutImpl$ScreenOnManager$2 */
        /* loaded from: classes4.dex */
        class AnonymousClass2 implements Runnable {
            final /* synthetic */ boolean val$newIsIdle;

            public AnonymousClass2(boolean z) {
                z = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                TraceCompat.beginSection("GvrLayoutImpl.onIdleChanged");
                try {
                    if (SystemClock.elapsedRealtime() - ScreenOnManager.this.lastResumeTimeMillis < ScreenOnManager.QUIET_PERIOD_AFTER_RESUME_MILLIS) {
                        return;
                    }
                    boolean unused = ScreenOnManager.this.isIdle;
                    ScreenOnManager.this.isIdle = z;
                    ScreenOnManager.this.updateSetScreenOn();
                } finally {
                    TraceCompat.endSection();
                }
            }
        }

        public ScreenOnManager(View view) {
            this.parentView = view;
        }

        public void onResume() {
            this.isResumed = true;
            this.isIdle = false;
            this.lastResumeTimeMillis = SystemClock.elapsedRealtime();
            updateSetScreenOn();
        }

        public void onPause() {
            this.isResumed = false;
            updateSetScreenOn();
        }

        public void setEnabled(boolean z) {
            KK3.a(new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.ScreenOnManager.1
                final /* synthetic */ boolean val$newIsEnabled;

                public AnonymousClass1(boolean z2) {
                    z = z2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean z2 = ScreenOnManager.this.isEnabled;
                    boolean z22 = z;
                    if (z2 == z22) {
                        return;
                    }
                    ScreenOnManager.this.isEnabled = z22;
                    ScreenOnManager.this.updateSetScreenOn();
                }
            });
        }

        @Override // com.google.vr.ndk.base.GvrApi.IdleListener
        public void onIdleChanged(boolean z) {
            KK3.a(new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.ScreenOnManager.2
                final /* synthetic */ boolean val$newIsIdle;

                public AnonymousClass2(boolean z2) {
                    z = z2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    TraceCompat.beginSection("GvrLayoutImpl.onIdleChanged");
                    try {
                        if (SystemClock.elapsedRealtime() - ScreenOnManager.this.lastResumeTimeMillis < ScreenOnManager.QUIET_PERIOD_AFTER_RESUME_MILLIS) {
                            return;
                        }
                        boolean unused = ScreenOnManager.this.isIdle;
                        ScreenOnManager.this.isIdle = z;
                        ScreenOnManager.this.updateSetScreenOn();
                    } finally {
                        TraceCompat.endSection();
                    }
                }
            });
        }

        public void updateSetScreenOn() {
            this.parentView.setKeepScreenOn(this.isEnabled && this.isResumed && !this.isIdle);
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public class PresentationHelper implements DisplayManager.DisplayListener {
        private final Context context;
        private final DisplayManager displayManager;
        private final DisplaySynchronizer displaySynchronizer;
        private String externalDisplayName;
        private final RelativeLayout.LayoutParams layout = new RelativeLayout.LayoutParams(-1, -1);
        private final List listeners = new ArrayList();
        private final FrameLayout originalParent;
        private Presentation presentation;
        private final View view;

        public PresentationHelper(Context context, FrameLayout frameLayout, View view, DisplaySynchronizer displaySynchronizer, String str) {
            this.context = context;
            this.originalParent = frameLayout;
            this.view = view;
            this.displaySynchronizer = displaySynchronizer;
            this.externalDisplayName = str;
            this.displayManager = (DisplayManager) context.getSystemService("display");
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
        }

        public boolean isPresenting() {
            Presentation presentation = this.presentation;
            return presentation != null && presentation.isShowing();
        }

        public void onPause() {
            this.displayManager.unregisterDisplayListener(this);
        }

        public void onResume() {
            String str;
            Resources resources = this.context.getResources();
            Display display = null;
            try {
                str = resources.getString(resources.getIdentifier("display_manager_hdmi_display_name", "string", "android"));
            } catch (Resources.NotFoundException unused) {
                str = null;
            }
            this.externalDisplayName = str;
            if (str == null) {
                setDisplay(null);
                return;
            }
            this.displayManager.registerDisplayListener(this, null);
            Display[] displays = this.displayManager.getDisplays();
            int length = displays.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Display display2 = displays[i];
                if (isValidExternalDisplay(display2)) {
                    display = display2;
                    break;
                }
                i++;
            }
            setDisplay(display);
        }

        public void shutdown() {
            this.displayManager.unregisterDisplayListener(this);
            Presentation presentation = this.presentation;
            if (presentation != null) {
                presentation.cancel();
                this.presentation = null;
                Iterator it = this.listeners.iterator();
                if (it.hasNext()) {
                    AbstractC9595s51.a(it.next());
                    throw null;
                }
            }
        }

        public void onDetachedFromWindow() {
            this.displayManager.unregisterDisplayListener(this);
            setDisplay(null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
            Display display = this.displayManager.getDisplay(i);
            if (isValidExternalDisplay(display)) {
                setDisplay(display);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
            Presentation presentation = this.presentation;
            if (presentation == null || presentation.getDisplay().getDisplayId() != i) {
                return;
            }
            setDisplay(null);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0107 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void setDisplay(android.view.Display r6) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.GvrLayoutImpl.PresentationHelper.setDisplay(android.view.Display):void");
        }

        private static void detachViewFromParent(View view) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }

        private boolean isValidExternalDisplay(Display display) {
            return display != null && display.isValid() && display.getName().equals(this.externalDisplayName);
        }

        private boolean hasCurrentPresentationExpired() {
            Presentation presentation = this.presentation;
            if (presentation == null) {
                return false;
            }
            return (presentation.isShowing() && this.presentation.getDisplay().isValid()) ? false : true;
        }
    }

    public VrCoreSdkClient createVrCoreSdkClient(Context context, GvrApi gvrApi, DaydreamUtilsWrapper daydreamUtilsWrapper, FadeOverlayView fadeOverlayView) {
        Activity a = U60.a(context);
        return new VrCoreSdkClient(context, gvrApi, a != null ? a.getComponentName() : null, daydreamUtilsWrapper, new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.4
            public AnonymousClass4() {
            }

            @Override // java.lang.Runnable
            public void run() {
                GvrLayoutImpl.this.uiLayout.invokeCloseButtonListener();
            }
        }, fadeOverlayView);
    }

    private void init(ExtensionManager extensionManager) {
        DisplaySynchronizer createDefaultDisplaySynchronizer = GvrApi.createDefaultDisplaySynchronizer(getContext());
        initWithInjectedObjects(new GvrApi(getContext(), createDefaultDisplaySynchronizer), createDefaultDisplaySynchronizer, new EglReadyListener(), null, new DaydreamUtilsWrapper(), extensionManager, new GvrUiLayoutImpl(getContext(), new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.2
            public AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (GvrLayoutImpl.this.vrCoreSdkClient != null) {
                    GvrLayoutImpl.this.vrCoreSdkClient.onExitingFromVr();
                }
            }
        }));
    }

    private void initWithInjectedObjects(GvrApi gvrApi, DisplaySynchronizer displaySynchronizer, EglReadyListener eglReadyListener, FadeOverlayView fadeOverlayView, DaydreamUtilsWrapper daydreamUtilsWrapper, ExtensionManager extensionManager, GvrUiLayoutImpl gvrUiLayoutImpl) {
        this.gvrApi = gvrApi;
        if (isContextSharingEnabled()) {
            gvrApi.requestContextSharing(eglReadyListener);
        }
        this.daydreamUtils = daydreamUtilsWrapper;
        this.presentationLayout = new FrameLayout(getContext());
        this.uiLayout = gvrUiLayoutImpl;
        this.displaySynchronizer = displaySynchronizer;
        this.eglReadyListener = eglReadyListener;
        this.presentationHelper = tryCreatePresentationHelper();
        this.frameFlushWorkaround = new FrameFlushWorkaround();
        addView(this.presentationLayout, 0);
        addView(gvrUiLayoutImpl.getRoot(), 1);
        updateUiLayout();
        boolean isDaydreamPhone = daydreamUtilsWrapper.isDaydreamPhone(getContext());
        if (isDaydreamPhone) {
            this.daydreamTouchListener = createDaydreamTouchListener();
            gvrUiLayoutImpl.getRoot().setOnTouchListener(this.daydreamTouchListener);
        }
        DaydreamCompatibility componentDaydreamCompatibility = daydreamUtilsWrapper.getComponentDaydreamCompatibility(getContext());
        boolean supportsDaydream = componentDaydreamCompatibility.supportsDaydream();
        if (isDaydreamPhone || componentDaydreamCompatibility.requiresDaydream()) {
            if (supportsDaydream) {
                getContext();
                if (fadeOverlayView == null) {
                    fadeOverlayView = new FadeOverlayView(getContext(), this.autoFadeEnabled);
                }
                this.fadeOverlayView = fadeOverlayView;
                addView(fadeOverlayView, 2);
            }
            this.vrCoreSdkClient = createVrCoreSdkClient(getContext(), gvrApi, daydreamUtilsWrapper, this.fadeOverlayView);
        }
        this.screenOnManager = new ScreenOnManager(this);
        if (isDeviceDetectionEnabled()) {
            gvrApi.setIdleListener(this.screenOnManager);
        }
        if (extensionManager != null) {
            extensionManager.initialize(this, gvrApi);
            if (extensionManager.bootsToVr()) {
                gvrUiLayoutImpl.getRoot().setVisibility(8);
            }
        }
    }

    public GvrUiLayoutImpl getUiLayoutImpl() {
        return this.uiLayout;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        updateFadeVisibility();
        if (isDimUiEnabled()) {
            if (i == 0) {
                this.uiLayout.delayDimmingUiLayerAfterVisible();
            } else {
                this.uiLayout.cancelDimmingUiLayer();
            }
        }
    }

    public void onPause() {
        this.gvrApi.pause();
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = this.scanlineRacingView;
        if (asyncReprojectionSurfaceView != null) {
            asyncReprojectionSurfaceView.onPause(new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.3
                public AnonymousClass3() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    GvrLayoutImpl.this.scanlineRacingRenderer.a.onPauseReprojectionThread();
                }
            });
        }
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onPause();
        }
        ChoreographerFrameCallbackC10410uU0 choreographerFrameCallbackC10410uU0 = this.displaySynchronizer.g;
        if (choreographerFrameCallbackC10410uU0.j) {
            choreographerFrameCallbackC10410uU0.j = false;
            choreographerFrameCallbackC10410uU0.h.sendEmptyMessage(2);
        }
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.onPause();
        }
        CardboardEmulator cardboardEmulator = this.cardboardEmulator;
        if (cardboardEmulator != null) {
            cardboardEmulator.onPause();
        }
        this.screenOnManager.onPause();
        this.isResumed = false;
        updateFadeVisibility();
    }

    public void onResume() {
        this.gvrApi.resume();
        SdkDaydreamTouchListener sdkDaydreamTouchListener = this.daydreamTouchListener;
        if (sdkDaydreamTouchListener != null) {
            sdkDaydreamTouchListener.refreshViewerProfile();
        }
        DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
        displaySynchronizer.b();
        ChoreographerFrameCallbackC10410uU0 choreographerFrameCallbackC10410uU0 = displaySynchronizer.g;
        if (!choreographerFrameCallbackC10410uU0.j) {
            choreographerFrameCallbackC10410uU0.j = true;
            choreographerFrameCallbackC10410uU0.h.sendEmptyMessage(1);
        }
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onResume();
        }
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = this.scanlineRacingView;
        if (asyncReprojectionSurfaceView != null) {
            asyncReprojectionSurfaceView.onResume();
        }
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.onResume();
        }
        if (this.cardboardEmulator != null && this.gvrApi.getViewerType() == 1) {
            this.cardboardEmulator.onResume();
        }
        this.screenOnManager.onResume();
        this.frameFlushWorkaround.onResume();
        this.isResumed = true;
        updateFadeVisibility();
        updateUiLayout();
    }

    public void onBackPressed() {
        this.uiLayout.invokeCloseButtonListener();
    }

    public void shutdown() {
        this.displaySynchronizer.e();
        SdkDaydreamTouchListener sdkDaydreamTouchListener = this.daydreamTouchListener;
        if (sdkDaydreamTouchListener != null) {
            sdkDaydreamTouchListener.shutdown();
        }
        removeView(this.presentationLayout);
        removeView(this.uiLayout.getRoot());
        this.scanlineRacingRenderer = null;
        this.scanlineRacingView = null;
        this.presentationView = null;
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.shutdown();
            this.presentationHelper = null;
        }
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.onPause();
            this.vrCoreSdkClient = null;
        }
        CardboardEmulator cardboardEmulator = this.cardboardEmulator;
        if (cardboardEmulator != null) {
            cardboardEmulator.onPause();
            this.cardboardEmulator = null;
        }
        GvrApi gvrApi = this.gvrApi;
        if (gvrApi != null) {
            gvrApi.shutdown();
            this.gvrApi = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        updateFadeVisibility();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.attachedToWindow = false;
        updateFadeVisibility();
        super.onDetachedFromWindow();
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.displaySynchronizer.c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.presentationView != null && isPresenting() && this.presentationView.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPresentationView(View view) {
        View view2 = this.presentationView;
        if (view2 != null) {
            this.presentationLayout.removeView(view2);
        }
        this.presentationLayout.addView(view, 0);
        this.presentationView = view;
    }

    public boolean enableAsyncReprojection(int i) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Async reprojection may only be enabled from the UI thread");
        }
        int i2 = this.asyncReprojectionFlags;
        if (i2 != -1) {
            if ((i2 & i) == i) {
                return true;
            }
            throw new UnsupportedOperationException("Async reprojection flags cannot be added once initialized.");
        }
        if (this.scanlineRacingView != null) {
            return true;
        }
        if (!this.daydreamUtils.isDaydreamPhone(getContext())) {
            return false;
        }
        if (!this.gvrApi.setAsyncReprojectionEnabled(true)) {
            Log.e("GvrLayoutImpl", "Failed to initialize async reprojection, unsupported device.");
            return false;
        }
        this.asyncReprojectionFlags = i;
        if (!this.gvrApi.usingVrDisplayService()) {
            addScanlineRacingView();
        }
        return true;
    }

    public boolean enableCardboardTriggerEmulation(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException("The Cardboard trigger listener must not be null.");
        }
        if (this.cardboardEmulator != null) {
            return true;
        }
        if (!this.daydreamUtils.isDaydreamPhone(getContext())) {
            return false;
        }
        this.cardboardEmulator = new CardboardEmulator(getContext(), runnable);
        return true;
    }

    public GvrApi getGvrApi() {
        return this.gvrApi;
    }

    public void setStereoModeEnabled(boolean z) {
        KK3.a(new Runnable(this, z) { // from class: com.google.vr.ndk.base.GvrLayoutImpl$$Lambda$0
            private final GvrLayoutImpl arg$1;
            private final boolean arg$2;

            {
                this.arg$1 = this;
                this.arg$2 = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.arg$1.lambda$setStereoModeEnabled$0$GvrLayoutImpl(this.arg$2);
            }
        });
    }

    /* renamed from: setStereoModeEnabledImpl */
    public void lambda$setStereoModeEnabled$0$GvrLayoutImpl(boolean z) {
        if (this.stereoModeEnabled == z) {
            return;
        }
        this.stereoModeEnabled = z;
        this.uiLayout.setEnabled(z);
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.setEnabled(z);
        }
        FadeOverlayView fadeOverlayView = this.fadeOverlayView;
        if (fadeOverlayView != null) {
            fadeOverlayView.setEnabled(z);
        }
        SdkDaydreamTouchListener sdkDaydreamTouchListener = this.daydreamTouchListener;
        if (sdkDaydreamTouchListener != null) {
            sdkDaydreamTouchListener.setEnabled(z);
        }
        this.screenOnManager.setEnabled(z);
        updateRenderingViewsVisibility(0);
    }

    public void setReentryIntent(PendingIntent pendingIntent) {
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.setReentryIntent(pendingIntent);
        }
    }

    public boolean setOnDonNotNeededListener(Runnable runnable) {
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient == null) {
            return false;
        }
        vrCoreSdkClient.setOnDonNotNeededListener(runnable);
        return true;
    }

    public boolean isPresenting() {
        PresentationHelper presentationHelper;
        return (this.presentationView == null || (presentationHelper = this.presentationHelper) == null || !presentationHelper.isPresenting()) ? false : true;
    }

    public VrCoreSdkClient getVrCoreSdkClient() {
        return this.vrCoreSdkClient;
    }

    public SdkDaydreamTouchListener createDaydreamTouchListener() {
        return new SdkDaydreamTouchListener(this);
    }

    private boolean isDeviceDetectionEnabled() {
        if (this.gvrApi.getSdkConfigurationParams().useDeviceIdleDetection == null) {
            return false;
        }
        return this.gvrApi.getSdkConfigurationParams().useDeviceIdleDetection.booleanValue();
    }

    private boolean isContextSharingEnabled() {
        Long l;
        GvrApi gvrApi = this.gvrApi;
        if (gvrApi == null) {
            throw new IllegalStateException("GvrApi must be ready before isContextSharingEnabled is called");
        }
        Vr$VREvent$SdkConfigurationParams.AsyncReprojectionConfig asyncReprojectionConfig = gvrApi.getSdkConfigurationParams().asyncReprojectionConfig;
        return (asyncReprojectionConfig == null || (l = asyncReprojectionConfig.flags) == null || (l.longValue() & 16) == 0) ? false : true;
    }

    private boolean isDimUiEnabled() {
        Boolean bool;
        GvrApi gvrApi = this.gvrApi;
        if (gvrApi == null || (bool = gvrApi.getSdkConfigurationParams().dimUiLayer) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private void addScanlineRacingView() {
        if (this.scanlineRacingView != null) {
            return;
        }
        C3230Yw0 c3230Yw0 = new C3230Yw0();
        this.eglFactory = c3230Yw0;
        c3230Yw0.c = this.gvrApi.isOpenGLKHRDebugEnabled();
        C3230Yw0 c3230Yw02 = this.eglFactory;
        c3230Yw02.a = true;
        c3230Yw02.b = (this.asyncReprojectionFlags & 1) != 0;
        c3230Yw02.e = 3;
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = new AsyncReprojectionSurfaceView(getContext());
        this.scanlineRacingView = asyncReprojectionSurfaceView;
        asyncReprojectionSurfaceView.setEGLConfigChooser(new F02());
        this.scanlineRacingView.setZOrderMediaOverlay(true);
        this.scanlineRacingView.setEGLContextFactory(this.eglFactory);
        this.scanlineRacingView.setEGLWindowSurfaceFactory(this.eglFactory);
        if (isContextSharingEnabled()) {
            this.scanlineRacingView.setEglReadyListener(this.eglReadyListener);
        }
        if (!this.stereoModeEnabled) {
            Log.w("GvrLayoutImpl", "Disabling stereo mode with async reprojection enabled may not work properly.");
            this.scanlineRacingView.setVisibility(8);
        }
        if (this.scanlineRacingRenderer == null) {
            this.scanlineRacingRenderer = new AV2(this.gvrApi);
        }
        AV2 av2 = this.scanlineRacingRenderer;
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView2 = this.scanlineRacingView;
        if (asyncReprojectionSurfaceView2 != null) {
            av2.b = asyncReprojectionSurfaceView2;
            asyncReprojectionSurfaceView2.setRenderer(av2);
            this.scanlineRacingView.setSwapMode(1);
            if (!this.isResumed) {
                this.scanlineRacingView.onPause();
            }
            this.presentationLayout.addView(this.scanlineRacingView, 0);
            return;
        }
        av2.getClass();
        throw new IllegalArgumentException("GvrSurfaceView must be supplied for proper scanline rendering");
    }

    private PresentationHelper tryCreatePresentationHelper() {
        String str;
        Resources resources = getContext().getResources();
        try {
            str = resources.getString(resources.getIdentifier("display_manager_hdmi_display_name", "string", "android"));
        } catch (Resources.NotFoundException unused) {
            str = null;
        }
        if (str == null) {
            Log.e("GvrLayoutImpl", "HDMI display name could not be found, disabling external presentation support");
            return null;
        }
        return new PresentationHelper(getContext(), this, this.presentationLayout, this.displaySynchronizer, str);
    }

    public void updateRenderingViewsVisibility(int i) {
        View view = this.presentationView;
        if (view != null) {
            view.setVisibility(this.stereoModeEnabled ? i : 0);
        }
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = this.scanlineRacingView;
        if (asyncReprojectionSurfaceView != null) {
            if (!this.stereoModeEnabled) {
                i = 8;
            }
            asyncReprojectionSurfaceView.setVisibility(i);
        }
    }

    private void updateFadeVisibility() {
        FadeOverlayView fadeOverlayView = this.fadeOverlayView;
        if (fadeOverlayView == null) {
            return;
        }
        if (!this.autoFadeEnabled) {
            if (this.isResumed) {
                fadeOverlayView.onVisible();
                return;
            } else {
                fadeOverlayView.onInvisible();
                return;
            }
        }
        boolean z = this.attachedToWindow && getWindowVisibility() == 0;
        if (z && this.isResumed) {
            this.fadeOverlayView.onVisible();
            removeCallbacks(this.showRenderingViewsRunnable);
            postDelayed(this.showRenderingViewsRunnable, 50L);
        } else {
            if (z || this.isResumed) {
                return;
            }
            this.fadeOverlayView.onInvisible();
            updateRenderingViewsVisibility(4);
            removeCallbacks(this.showRenderingViewsRunnable);
        }
    }

    private void updateUiLayout() {
        this.uiLayout.setDaydreamModeEnabled(this.gvrApi.getViewerType() == 1);
    }
}
