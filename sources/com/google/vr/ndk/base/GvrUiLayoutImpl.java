package com.google.vr.ndk.base;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.AbstractBinderC1182Jc1;
import defpackage.C4759e04;
import defpackage.CW3;
import defpackage.InterfaceC9094qe1;
import defpackage.KK3;
import defpackage.RunnableC3385a04;
import defpackage.RunnableC3729b04;
import defpackage.RunnableC4072c04;
import defpackage.SZ3;
import defpackage.TZ3;
import defpackage.U60;
import defpackage.UZ3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class GvrUiLayoutImpl extends AbstractBinderC1182Jc1 {
    private final Runnable beginDimmingUiLayerRunnable;
    private final CloseButtonListenerWrapper closeButtonListener;
    private boolean daydreamModeEnabled;
    private final Runnable delayDimmingUiLayerAfterVisibleRunnable;
    private final C4759e04 uiLayer;
    private ObjectAnimator uiLayerDimmingAnimation;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: com.google.vr.ndk.base.GvrUiLayoutImpl$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ Context val$context;
        final /* synthetic */ Intent val$homeIntent;

        public AnonymousClass1(Context context, Intent intent) {
            context = context;
            intent = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            context.startActivity(intent);
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: com.google.vr.ndk.base.GvrUiLayoutImpl$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Intent val$homeIntent;

        public AnonymousClass2(Activity activity, Intent intent) {
            a = activity;
            intent = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.startActivity(intent);
            a.finish();
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: com.google.vr.ndk.base.GvrUiLayoutImpl$3 */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ Activity val$activity;

        public AnonymousClass3(Activity activity) {
            a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.onBackPressed();
        }
    }

    public GvrUiLayoutImpl(Context context, Runnable runnable) {
        this(context, runnable, new DaydreamUtilsWrapper());
    }

    public GvrUiLayoutImpl(Context context, Runnable runnable, DaydreamUtilsWrapper daydreamUtilsWrapper) {
        this.delayDimmingUiLayerAfterVisibleRunnable = new Runnable(this) { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl$$Lambda$0
            private final GvrUiLayoutImpl arg$1;

            {
                this.arg$1 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.arg$1.delayDimmingUiLayerAfterVisible();
            }
        };
        this.beginDimmingUiLayerRunnable = new Runnable(this) { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl$$Lambda$1
            private final GvrUiLayoutImpl arg$1;

            {
                this.arg$1 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.arg$1.bridge$lambda$0$GvrUiLayoutImpl();
            }
        };
        this.daydreamModeEnabled = false;
        CloseButtonListenerWrapper closeButtonListenerWrapper = new CloseButtonListenerWrapper(context, runnable, daydreamUtilsWrapper);
        this.closeButtonListener = closeButtonListenerWrapper;
        C4759e04 c4759e04 = new C4759e04(context);
        this.uiLayer = c4759e04;
        c4759e04.m = closeButtonListenerWrapper;
        KK3.a(new RunnableC4072c04(c4759e04, closeButtonListenerWrapper));
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public class CloseButtonListenerWrapper implements Runnable {
        private Runnable activeCloseButtonListener;
        private final Context context;
        private final Runnable defaultCloseButtonListener;
        private boolean invokingCloseButton = false;
        private final Runnable passiveCloseButtonListener;

        public CloseButtonListenerWrapper(Context context, Runnable runnable, DaydreamUtilsWrapper daydreamUtilsWrapper) {
            this.context = context;
            this.passiveCloseButtonListener = runnable;
            Runnable createDefaultCloseButtonListener = GvrUiLayoutImpl.createDefaultCloseButtonListener(context, daydreamUtilsWrapper);
            this.defaultCloseButtonListener = createDefaultCloseButtonListener;
            this.activeCloseButtonListener = createDefaultCloseButtonListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.invokingCloseButton) {
                Log.w("GvrUiLayoutImpl", "GVR close behavior invoked recursively.");
                Activity a = U60.a(this.context);
                if (a != null) {
                    a.finish();
                    return;
                }
                return;
            }
            this.invokingCloseButton = true;
            try {
                Runnable runnable = this.passiveCloseButtonListener;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = this.activeCloseButtonListener;
                if (runnable2 != null) {
                    runnable2.run();
                }
            } finally {
                this.invokingCloseButton = false;
            }
        }

        public void setClientCloseButtonListener(Runnable runnable) {
            if (runnable == null) {
                runnable = this.defaultCloseButtonListener;
            }
            this.activeCloseButtonListener = runnable;
        }
    }

    @Override // defpackage.InterfaceC1312Kc1
    public void setEnabled(boolean z) {
        C4759e04 c4759e04 = this.uiLayer;
        c4759e04.j = z;
        KK3.a(new RunnableC3385a04(c4759e04, z));
    }

    @Override // defpackage.InterfaceC1312Kc1
    public InterfaceC9094qe1 getRootView() {
        return new ObjectWrapper(this.uiLayer.b);
    }

    @Override // defpackage.InterfaceC1312Kc1
    public boolean isEnabled() {
        return this.uiLayer.j;
    }

    @Override // defpackage.InterfaceC1312Kc1
    public void setCloseButtonListener(InterfaceC9094qe1 interfaceC9094qe1) {
        this.closeButtonListener.setClientCloseButtonListener(interfaceC9094qe1 != null ? (Runnable) ObjectWrapper.a(interfaceC9094qe1, Runnable.class) : null);
    }

    @Override // defpackage.InterfaceC1312Kc1
    public void setTransitionViewEnabled(boolean z) {
        C4759e04 c4759e04 = this.uiLayer;
        boolean z2 = z && !this.daydreamModeEnabled;
        c4759e04.p = z2;
        KK3.a(new SZ3(c4759e04, z2));
    }

    @Override // defpackage.InterfaceC1312Kc1
    public void setTransitionViewListener(InterfaceC9094qe1 interfaceC9094qe1) {
        C4759e04 c4759e04 = this.uiLayer;
        Runnable runnable = interfaceC9094qe1 != null ? (Runnable) ObjectWrapper.a(interfaceC9094qe1, Runnable.class) : null;
        c4759e04.o = runnable;
        KK3.a(new TZ3(c4759e04, runnable));
    }

    @Override // defpackage.InterfaceC1312Kc1
    public void setSettingsButtonEnabled(boolean z) {
        C4759e04 c4759e04 = this.uiLayer;
        c4759e04.k = z;
        KK3.a(new RunnableC3729b04(c4759e04, z));
    }

    @Override // defpackage.InterfaceC1312Kc1
    public void setSettingsButtonListener(InterfaceC9094qe1 interfaceC9094qe1) {
        this.uiLayer.n = interfaceC9094qe1 != null ? (Runnable) ObjectWrapper.a(interfaceC9094qe1, Runnable.class) : null;
    }

    @Override // defpackage.InterfaceC1312Kc1
    public void setViewerName(String str) {
        C4759e04 c4759e04 = this.uiLayer;
        c4759e04.q = str;
        KK3.a(new UZ3(c4759e04, str));
    }

    public ViewGroup getRoot() {
        return this.uiLayer.b;
    }

    public void invokeCloseButtonListener() {
        this.closeButtonListener.run();
    }

    public void setDaydreamModeEnabled(boolean z) {
        if (this.daydreamModeEnabled == z) {
            return;
        }
        this.daydreamModeEnabled = z;
        if (z) {
            this.uiLayer.d(0.35f);
            C4759e04 c4759e04 = this.uiLayer;
            c4759e04.p = false;
            KK3.a(new SZ3(c4759e04, false));
            return;
        }
        this.uiLayer.d(1.0f);
    }

    private void delayDimmingUiLayer(long j) {
        cancelDimmingUiLayer();
        getRoot().postDelayed(this.beginDimmingUiLayerRunnable, j);
    }

    public void delayDimmingUiLayerAfterVisible() {
        delayDimmingUiLayer(2500L);
    }

    /* renamed from: beginDimmingUiLayer */
    public void bridge$lambda$0$GvrUiLayoutImpl() {
        cancelDimmingUiLayer();
        CW3 cw3 = this.uiLayer.h;
        if (cw3 != null && cw3.getVisibility() == 0) {
            getRoot().postDelayed(this.delayDimmingUiLayerAfterVisibleRunnable, 100L);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.uiLayer.b, (Property<FrameLayout, Float>) View.ALPHA, 1.0f, 0.2f);
        this.uiLayerDimmingAnimation = ofFloat;
        ofFloat.setDuration(500L);
        this.uiLayerDimmingAnimation.start();
        setDimmedUiTouchOverride();
    }

    private void setDimmedUiTouchOverride() {
        this.uiLayer.l = new Runnable(this) { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl$$Lambda$2
            private final GvrUiLayoutImpl arg$1;

            {
                this.arg$1 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.arg$1.lambda$setDimmedUiTouchOverride$0$GvrUiLayoutImpl();
            }
        };
    }

    public void cancelDimmingUiLayer() {
        getRoot().removeCallbacks(this.beginDimmingUiLayerRunnable);
        ObjectAnimator objectAnimator = this.uiLayerDimmingAnimation;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.uiLayerDimmingAnimation = null;
        }
        this.uiLayer.b.setAlpha(1.0f);
        this.uiLayer.l = null;
    }

    public static Runnable createDefaultCloseButtonListener(Context context, DaydreamUtilsWrapper daydreamUtilsWrapper) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        Activity a = U60.a(context);
        if (a == null) {
            return new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl.1
                final /* synthetic */ Context val$context;
                final /* synthetic */ Intent val$homeIntent;

                public AnonymousClass1(Context context2, Intent intent2) {
                    context = context2;
                    intent = intent2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    context.startActivity(intent);
                }
            };
        }
        if (daydreamUtilsWrapper.isDaydreamActivity(a)) {
            return new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl.2
                final /* synthetic */ Activity val$activity;
                final /* synthetic */ Intent val$homeIntent;

                public AnonymousClass2(Activity a2, Intent intent2) {
                    a = a2;
                    intent = intent2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.startActivity(intent);
                    a.finish();
                }
            };
        }
        return new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl.3
            final /* synthetic */ Activity val$activity;

            public AnonymousClass3(Activity a2) {
                a = a2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.onBackPressed();
            }
        };
    }

    public final /* synthetic */ void lambda$setDimmedUiTouchOverride$0$GvrUiLayoutImpl() {
        delayDimmingUiLayer(5000L);
    }
}
