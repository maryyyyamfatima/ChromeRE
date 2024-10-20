package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.android.chrome.R;
import com.google.vr.sdk.common.deps.c;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import defpackage.AbstractBinderC10104tb1;
import defpackage.AbstractBinderC1716Nf1;
import defpackage.AbstractBinderC2106Qf1;
import defpackage.AbstractC8883q04;
import defpackage.C10790vb1;
import defpackage.C1586Mf1;
import defpackage.C1976Pf1;
import defpackage.C6029hi4;
import defpackage.C7770mm3;
import defpackage.DialogInterfaceOnCancelListenerC7165l04;
import defpackage.DialogInterfaceOnClickListenerC6477j04;
import defpackage.DialogInterfaceOnClickListenerC6821k04;
import defpackage.InterfaceC11476xb1;
import defpackage.InterfaceC1846Of1;
import defpackage.InterfaceC2236Rf1;
import defpackage.KK3;
import defpackage.U60;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class VrCoreSdkClient {
    private final Runnable closeVrRunnable;
    private final ComponentName componentName;
    private final Context context;
    private final DaydreamListenerImpl daydreamListener;
    private InterfaceC11476xb1 daydreamManager;
    private final DaydreamUtilsWrapper daydreamUtils;
    private final FadeOverlayView fadeOverlayView;
    private final GvrApi gvrApi;
    private AlertDialog helpCenterDialog;
    private boolean isBound;
    private boolean isResumed;
    private InterfaceC1846Of1 loggingService;
    private Runnable onDonNotNeededListener;
    private PendingIntent optionalReentryIntent;
    private final boolean shouldBind;
    private int vrCoreClientApiVersion;
    private InterfaceC2236Rf1 vrCoreSdkService;
    private boolean isEnabled = true;
    private final ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.google.vr.ndk.base.VrCoreSdkClient.1
        public AnonymousClass1() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC2236Rf1 c1976Pf1;
            HeadTrackingState headTrackingState;
            int prepareVr;
            int i = AbstractBinderC2106Qf1.a;
            InterfaceC1846Of1 interfaceC1846Of1 = null;
            if (iBinder == null) {
                c1976Pf1 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
                c1976Pf1 = queryLocalInterface instanceof InterfaceC2236Rf1 ? (InterfaceC2236Rf1) queryLocalInterface : new C1976Pf1(iBinder);
            }
            try {
                C1976Pf1 c1976Pf12 = (C1976Pf1) c1976Pf1;
                Parcel obtainAndWriteInterfaceToken = c1976Pf12.obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(21);
                Parcel transactAndReadException = c1976Pf12.transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean a = c.a(transactAndReadException);
                transactAndReadException.recycle();
                if (!a) {
                    Log.e("VrCoreSdkClient", "Failed to initialize VrCore SDK Service.");
                    VrCoreSdkClient.this.handleBindFailed();
                    return;
                }
                VrCoreSdkClient.this.vrCoreSdkService = c1976Pf1;
                try {
                    VrCoreSdkClient vrCoreSdkClient = VrCoreSdkClient.this;
                    vrCoreSdkClient.daydreamManager = ((C1976Pf1) vrCoreSdkClient.vrCoreSdkService).a();
                    if (VrCoreSdkClient.this.daydreamManager == null) {
                        Log.w("VrCoreSdkClient", "Failed to obtain DaydreamManager from VrCore SDK Service.");
                        VrCoreSdkClient.this.handleNoDaydreamManager();
                        return;
                    }
                    InterfaceC11476xb1 interfaceC11476xb1 = VrCoreSdkClient.this.daydreamManager;
                    ComponentName componentName2 = VrCoreSdkClient.this.componentName;
                    DaydreamListenerImpl daydreamListenerImpl = VrCoreSdkClient.this.daydreamListener;
                    C10790vb1 c10790vb1 = (C10790vb1) interfaceC11476xb1;
                    Parcel obtainAndWriteInterfaceToken2 = c10790vb1.obtainAndWriteInterfaceToken();
                    c.a(obtainAndWriteInterfaceToken2, componentName2);
                    c.a(obtainAndWriteInterfaceToken2, daydreamListenerImpl);
                    Parcel transactAndReadException2 = c10790vb1.transactAndReadException(1, obtainAndWriteInterfaceToken2);
                    c.a(transactAndReadException2);
                    transactAndReadException2.recycle();
                    try {
                        try {
                            headTrackingState = VrCoreSdkClient.this.getHeadTrackingState();
                            prepareVr = VrCoreSdkClient.this.prepareVr(headTrackingState);
                            if (prepareVr == 0 && VrCoreSdkClient.this.onDonNotNeededListener != null) {
                                VrCoreSdkClient.this.onDonNotNeededListener.run();
                            }
                        } catch (Throwable th) {
                            if (VrCoreSdkClient.this.isResumed) {
                                VrCoreSdkClient.this.resumeTracking(null);
                            }
                            throw th;
                        }
                    } catch (RemoteException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                        sb.append("Error while registering listener with the VrCore SDK Service:");
                        sb.append(valueOf);
                        Log.w("VrCoreSdkClient", sb.toString());
                        if (VrCoreSdkClient.this.isResumed) {
                            VrCoreSdkClient.this.resumeTracking(null);
                        }
                    }
                    if (prepareVr == 2) {
                        Log.e("VrCoreSdkClient", "Daydream VR preparation failed, closing VR session.");
                        VrCoreSdkClient.this.handlePrepareVrFailed();
                        if (VrCoreSdkClient.this.isResumed) {
                            VrCoreSdkClient.this.resumeTracking(null);
                            return;
                        }
                        return;
                    }
                    if (prepareVr != 0) {
                        headTrackingState = null;
                    }
                    if (VrCoreSdkClient.this.isResumed) {
                        VrCoreSdkClient.this.resumeTracking(headTrackingState);
                    }
                    try {
                        VrCoreSdkClient vrCoreSdkClient2 = VrCoreSdkClient.this;
                        C1976Pf1 c1976Pf13 = (C1976Pf1) vrCoreSdkClient2.vrCoreSdkService;
                        Parcel transactAndReadException3 = c1976Pf13.transactAndReadException(4, c1976Pf13.obtainAndWriteInterfaceToken());
                        IBinder readStrongBinder = transactAndReadException3.readStrongBinder();
                        int i2 = AbstractBinderC1716Nf1.a;
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
                            interfaceC1846Of1 = queryLocalInterface2 instanceof InterfaceC1846Of1 ? (InterfaceC1846Of1) queryLocalInterface2 : new C1586Mf1(readStrongBinder);
                        }
                        transactAndReadException3.recycle();
                        vrCoreSdkClient2.loggingService = interfaceC1846Of1;
                    } catch (RemoteException e2) {
                        String valueOf2 = String.valueOf(e2);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 42);
                        sb2.append("Error getting logging service from VrCore:");
                        sb2.append(valueOf2);
                        Log.w("VrCoreSdkClient", sb2.toString());
                    }
                } catch (RemoteException e3) {
                    String valueOf3 = String.valueOf(e3);
                    StringBuilder sb3 = new StringBuilder(valueOf3.length() + 57);
                    sb3.append("Failed to obtain DaydreamManager from VrCore SDK Service:");
                    sb3.append(valueOf3);
                    Log.w("VrCoreSdkClient", sb3.toString());
                    VrCoreSdkClient.this.handleNoDaydreamManager();
                }
            } catch (RemoteException e4) {
                String valueOf4 = String.valueOf(e4);
                StringBuilder sb4 = new StringBuilder(valueOf4.length() + 41);
                sb4.append("Failed to initialize VrCore SDK Service: ");
                sb4.append(valueOf4);
                Log.w("VrCoreSdkClient", sb4.toString());
                VrCoreSdkClient.this.handleBindFailed();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            VrCoreSdkClient.this.vrCoreSdkService = null;
            VrCoreSdkClient.this.daydreamManager = null;
            VrCoreSdkClient.this.loggingService = null;
        }
    };

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: com.google.vr.ndk.base.VrCoreSdkClient$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements ServiceConnection {
        public AnonymousClass1() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC2236Rf1 c1976Pf1;
            HeadTrackingState headTrackingState;
            int prepareVr;
            int i = AbstractBinderC2106Qf1.a;
            InterfaceC1846Of1 interfaceC1846Of1 = null;
            if (iBinder == null) {
                c1976Pf1 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
                c1976Pf1 = queryLocalInterface instanceof InterfaceC2236Rf1 ? (InterfaceC2236Rf1) queryLocalInterface : new C1976Pf1(iBinder);
            }
            try {
                C1976Pf1 c1976Pf12 = (C1976Pf1) c1976Pf1;
                Parcel obtainAndWriteInterfaceToken = c1976Pf12.obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(21);
                Parcel transactAndReadException = c1976Pf12.transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean a = c.a(transactAndReadException);
                transactAndReadException.recycle();
                if (!a) {
                    Log.e("VrCoreSdkClient", "Failed to initialize VrCore SDK Service.");
                    VrCoreSdkClient.this.handleBindFailed();
                    return;
                }
                VrCoreSdkClient.this.vrCoreSdkService = c1976Pf1;
                try {
                    VrCoreSdkClient vrCoreSdkClient = VrCoreSdkClient.this;
                    vrCoreSdkClient.daydreamManager = ((C1976Pf1) vrCoreSdkClient.vrCoreSdkService).a();
                    if (VrCoreSdkClient.this.daydreamManager == null) {
                        Log.w("VrCoreSdkClient", "Failed to obtain DaydreamManager from VrCore SDK Service.");
                        VrCoreSdkClient.this.handleNoDaydreamManager();
                        return;
                    }
                    InterfaceC11476xb1 interfaceC11476xb1 = VrCoreSdkClient.this.daydreamManager;
                    ComponentName componentName2 = VrCoreSdkClient.this.componentName;
                    DaydreamListenerImpl daydreamListenerImpl = VrCoreSdkClient.this.daydreamListener;
                    C10790vb1 c10790vb1 = (C10790vb1) interfaceC11476xb1;
                    Parcel obtainAndWriteInterfaceToken2 = c10790vb1.obtainAndWriteInterfaceToken();
                    c.a(obtainAndWriteInterfaceToken2, componentName2);
                    c.a(obtainAndWriteInterfaceToken2, daydreamListenerImpl);
                    Parcel transactAndReadException2 = c10790vb1.transactAndReadException(1, obtainAndWriteInterfaceToken2);
                    c.a(transactAndReadException2);
                    transactAndReadException2.recycle();
                    try {
                        try {
                            headTrackingState = VrCoreSdkClient.this.getHeadTrackingState();
                            prepareVr = VrCoreSdkClient.this.prepareVr(headTrackingState);
                            if (prepareVr == 0 && VrCoreSdkClient.this.onDonNotNeededListener != null) {
                                VrCoreSdkClient.this.onDonNotNeededListener.run();
                            }
                        } catch (Throwable th) {
                            if (VrCoreSdkClient.this.isResumed) {
                                VrCoreSdkClient.this.resumeTracking(null);
                            }
                            throw th;
                        }
                    } catch (RemoteException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                        sb.append("Error while registering listener with the VrCore SDK Service:");
                        sb.append(valueOf);
                        Log.w("VrCoreSdkClient", sb.toString());
                        if (VrCoreSdkClient.this.isResumed) {
                            VrCoreSdkClient.this.resumeTracking(null);
                        }
                    }
                    if (prepareVr == 2) {
                        Log.e("VrCoreSdkClient", "Daydream VR preparation failed, closing VR session.");
                        VrCoreSdkClient.this.handlePrepareVrFailed();
                        if (VrCoreSdkClient.this.isResumed) {
                            VrCoreSdkClient.this.resumeTracking(null);
                            return;
                        }
                        return;
                    }
                    if (prepareVr != 0) {
                        headTrackingState = null;
                    }
                    if (VrCoreSdkClient.this.isResumed) {
                        VrCoreSdkClient.this.resumeTracking(headTrackingState);
                    }
                    try {
                        VrCoreSdkClient vrCoreSdkClient2 = VrCoreSdkClient.this;
                        C1976Pf1 c1976Pf13 = (C1976Pf1) vrCoreSdkClient2.vrCoreSdkService;
                        Parcel transactAndReadException3 = c1976Pf13.transactAndReadException(4, c1976Pf13.obtainAndWriteInterfaceToken());
                        IBinder readStrongBinder = transactAndReadException3.readStrongBinder();
                        int i2 = AbstractBinderC1716Nf1.a;
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
                            interfaceC1846Of1 = queryLocalInterface2 instanceof InterfaceC1846Of1 ? (InterfaceC1846Of1) queryLocalInterface2 : new C1586Mf1(readStrongBinder);
                        }
                        transactAndReadException3.recycle();
                        vrCoreSdkClient2.loggingService = interfaceC1846Of1;
                    } catch (RemoteException e2) {
                        String valueOf2 = String.valueOf(e2);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 42);
                        sb2.append("Error getting logging service from VrCore:");
                        sb2.append(valueOf2);
                        Log.w("VrCoreSdkClient", sb2.toString());
                    }
                } catch (RemoteException e3) {
                    String valueOf3 = String.valueOf(e3);
                    StringBuilder sb3 = new StringBuilder(valueOf3.length() + 57);
                    sb3.append("Failed to obtain DaydreamManager from VrCore SDK Service:");
                    sb3.append(valueOf3);
                    Log.w("VrCoreSdkClient", sb3.toString());
                    VrCoreSdkClient.this.handleNoDaydreamManager();
                }
            } catch (RemoteException e4) {
                String valueOf4 = String.valueOf(e4);
                StringBuilder sb4 = new StringBuilder(valueOf4.length() + 41);
                sb4.append("Failed to initialize VrCore SDK Service: ");
                sb4.append(valueOf4);
                Log.w("VrCoreSdkClient", sb4.toString());
                VrCoreSdkClient.this.handleBindFailed();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            VrCoreSdkClient.this.vrCoreSdkService = null;
            VrCoreSdkClient.this.daydreamManager = null;
            VrCoreSdkClient.this.loggingService = null;
        }
    }

    public VrCoreSdkClient(Context context, GvrApi gvrApi, ComponentName componentName, DaydreamUtilsWrapper daydreamUtilsWrapper, Runnable runnable, FadeOverlayView fadeOverlayView) {
        this.context = context;
        this.gvrApi = gvrApi;
        this.componentName = componentName;
        this.daydreamUtils = daydreamUtilsWrapper;
        this.closeVrRunnable = runnable;
        this.fadeOverlayView = fadeOverlayView;
        this.daydreamListener = new DaydreamListenerImpl(gvrApi, fadeOverlayView, runnable);
        this.shouldBind = hasCompatibleSdkService(context);
        gvrApi.setIgnoreManualTrackerPauseResume(true);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public final class DaydreamListenerImpl extends AbstractBinderC10104tb1 {
        private final WeakReference closeVrRunnableWeak;
        private final WeakReference fadeOverlayViewWeak;
        private final WeakReference gvrApiWeak;
        private final Handler safeguardHandler = new Handler() { // from class: com.google.vr.ndk.base.VrCoreSdkClient.DaydreamListenerImpl.1
            public AnonymousClass1() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    Log.w("VrCoreSdkClient", "Forcing tracking resume: VrCore unresponsive");
                    DaydreamListenerImpl.this.resumeHeadTrackingImpl(null);
                } else if (i == 2) {
                    Log.w("VrCoreSdkClient", "Forcing fade in: VrCore unresponsive");
                    DaydreamListenerImpl.this.applyColorfulFadeImpl(1, 350L, -16777216);
                } else {
                    super.handleMessage(message);
                }
            }
        };

        /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
        /* renamed from: com.google.vr.ndk.base.VrCoreSdkClient$DaydreamListenerImpl$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 extends Handler {
            public AnonymousClass1() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    Log.w("VrCoreSdkClient", "Forcing tracking resume: VrCore unresponsive");
                    DaydreamListenerImpl.this.resumeHeadTrackingImpl(null);
                } else if (i == 2) {
                    Log.w("VrCoreSdkClient", "Forcing fade in: VrCore unresponsive");
                    DaydreamListenerImpl.this.applyColorfulFadeImpl(1, 350L, -16777216);
                } else {
                    super.handleMessage(message);
                }
            }
        }

        /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
        /* renamed from: com.google.vr.ndk.base.VrCoreSdkClient$DaydreamListenerImpl$2 */
        /* loaded from: classes4.dex */
        public class AnonymousClass2 implements Runnable {
            final /* synthetic */ int val$color;
            final /* synthetic */ long val$durationMillis;
            final /* synthetic */ FadeOverlayView val$fadeOverlayView;
            final /* synthetic */ int val$fadeType;

            public AnonymousClass2(DaydreamListenerImpl daydreamListenerImpl, FadeOverlayView fadeOverlayView, int i, long j, int i2) {
                fadeOverlayView = fadeOverlayView;
                i = i;
                j = j;
                i2 = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                fadeOverlayView.startFade(i, j, i2);
            }
        }

        public DaydreamListenerImpl(GvrApi gvrApi, FadeOverlayView fadeOverlayView, Runnable runnable) {
            this.gvrApiWeak = new WeakReference(gvrApi);
            this.fadeOverlayViewWeak = new WeakReference(fadeOverlayView);
            this.closeVrRunnableWeak = new WeakReference(runnable);
        }

        @Override // defpackage.InterfaceC10447ub1
        public final int getTargetApiVersion() {
            return 21;
        }

        public final void resetSafeguards() {
            this.safeguardHandler.removeCallbacksAndMessages(null);
        }

        @Override // defpackage.InterfaceC10447ub1
        public final HeadTrackingState requestStopTracking() {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid requestStopTracking() call: GvrApi no longer valid");
                return null;
            }
            byte[] pauseTrackingGetState = gvrApi.pauseTrackingGetState();
            rescheduleSafeguard(1, 5000L);
            if (pauseTrackingGetState != null) {
                return new HeadTrackingState(pauseTrackingGetState);
            }
            return null;
        }

        @Override // defpackage.InterfaceC10447ub1
        public final void applyFade(int i, long j) {
            applyColorfulFadeImpl(i, j, -16777216);
        }

        @Override // defpackage.InterfaceC10447ub1
        public final void applyColorfulFade(int i, long j, int i2) {
            applyColorfulFadeImpl(i, j, i2);
        }

        @Override // defpackage.InterfaceC10447ub1
        public final void recenterHeadTracking() {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid recenterHeadTracking() call: GvrApi no longer valid");
            } else {
                gvrApi.recenterTracking();
            }
        }

        @Override // defpackage.InterfaceC10447ub1
        public final void dumpDebugData() {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid dumpDebugData() call: GvrApi no longer valid");
            } else {
                gvrApi.dumpDebugData();
            }
        }

        @Override // defpackage.InterfaceC10447ub1
        public final void resumeHeadTracking(HeadTrackingState headTrackingState) {
            resumeHeadTrackingImpl(headTrackingState);
        }

        @Override // defpackage.InterfaceC10447ub1
        public final void invokeCloseAction() {
            Runnable runnable = (Runnable) this.closeVrRunnableWeak.get();
            if (runnable == null) {
                Log.w("VrCoreSdkClient", "Invalid invokeCloseAction() call: Runnable no longer valid");
            } else {
                KK3.a(runnable);
            }
        }

        @Override // defpackage.InterfaceC10447ub1
        public final void deprecated_setLensOffsets(float f, float f2, float f3, float f4) {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid setLensOffsets() call: GvrApi no longer valid");
            } else {
                gvrApi.setLensOffset(f, f2, 0.0f);
            }
        }

        @Override // defpackage.InterfaceC10447ub1
        public final void setLensOffset(float f, float f2, float f3) {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid setLensOffset() call: GvrApi no longer valid");
            } else {
                gvrApi.setLensOffset(f, f2, f3);
            }
        }

        public final void resumeHeadTrackingImpl(HeadTrackingState headTrackingState) {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid resumeHeadTracking() call: GvrApi no longer valid");
            } else {
                cancelSafeguard(1);
                VrCoreSdkClient.resumeTracking(gvrApi, headTrackingState);
            }
        }

        public final void applyColorfulFadeImpl(int i, long j, int i2) {
            FadeOverlayView fadeOverlayView = (FadeOverlayView) this.fadeOverlayViewWeak.get();
            if (fadeOverlayView == null) {
                return;
            }
            cancelSafeguard(2);
            fadeOverlayView.post(new Runnable(this) { // from class: com.google.vr.ndk.base.VrCoreSdkClient.DaydreamListenerImpl.2
                final /* synthetic */ int val$color;
                final /* synthetic */ long val$durationMillis;
                final /* synthetic */ FadeOverlayView val$fadeOverlayView;
                final /* synthetic */ int val$fadeType;

                public AnonymousClass2(DaydreamListenerImpl this, FadeOverlayView fadeOverlayView2, int i3, long j2, int i22) {
                    fadeOverlayView = fadeOverlayView2;
                    i = i3;
                    j = j2;
                    i2 = i22;
                }

                @Override // java.lang.Runnable
                public void run() {
                    fadeOverlayView.startFade(i, j, i2);
                }
            });
            if (i3 == 2) {
                rescheduleSafeguard(2, j2 + 5500);
            }
        }

        private final void cancelSafeguard(int i) {
            this.safeguardHandler.removeMessages(i);
        }

        private final void rescheduleSafeguard(int i, long j) {
            cancelSafeguard(i);
            this.safeguardHandler.sendEmptyMessageDelayed(i, j);
        }
    }

    public InterfaceC1846Of1 getLoggingService() {
        return this.loggingService;
    }

    public HeadTrackingState getHeadTrackingState() {
        return new HeadTrackingState();
    }

    public boolean onResume() {
        this.isResumed = true;
        if (this.isEnabled) {
            return doBind();
        }
        return false;
    }

    public void onPause() {
        this.isResumed = false;
        this.daydreamListener.resetSafeguards();
        if (this.isEnabled) {
            doUnbind();
        }
    }

    public void setEnabled(boolean z) {
        if (this.isEnabled == z) {
            return;
        }
        this.isEnabled = z;
        this.gvrApi.setIgnoreManualTrackerPauseResume(z);
        if (this.isResumed) {
            if (this.isEnabled) {
                doBind();
            } else {
                doUnbind();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:            if ((r2 == null || r2.length == 0) == false) goto L58;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void resumeTracking(com.google.vr.ndk.base.GvrApi r1, com.google.vr.vrcore.common.api.HeadTrackingState r2) {
        /*
            if (r2 == 0) goto L10
            byte[] r2 = r2.a
            if (r2 == 0) goto Lc
            int r0 = r2.length
            if (r0 != 0) goto La
            goto Lc
        La:
            r0 = 0
            goto Ld
        Lc:
            r0 = 1
        Ld:
            if (r0 != 0) goto L10
            goto L11
        L10:
            r2 = 0
        L11:
            r1.resumeTrackingSetState(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.VrCoreSdkClient.resumeTracking(com.google.vr.ndk.base.GvrApi, com.google.vr.vrcore.common.api.HeadTrackingState):void");
    }

    public void setReentryIntent(PendingIntent pendingIntent) {
        this.optionalReentryIntent = pendingIntent;
    }

    public void setOnDonNotNeededListener(Runnable runnable) {
        this.onDonNotNeededListener = runnable;
    }

    public void onExitingFromVr() {
        InterfaceC11476xb1 interfaceC11476xb1 = this.daydreamManager;
        if (interfaceC11476xb1 != null && this.vrCoreClientApiVersion >= 16) {
            try {
                C10790vb1 c10790vb1 = (C10790vb1) interfaceC11476xb1;
                c10790vb1.transactOneway(14, c10790vb1.obtainAndWriteInterfaceToken());
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 41);
                sb.append("Failed to signal exit from VR to VrCore: ");
                sb.append(valueOf);
                Log.e("VrCoreSdkClient", sb.toString());
            }
        }
    }

    private boolean doBind() {
        if (this.isBound) {
            return true;
        }
        if (this.shouldBind) {
            Intent intent = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
            intent.setPackage("com.google.vr.vrcore");
            this.isBound = this.context.bindService(intent, this.serviceConnection, 1);
        }
        if (!this.isBound) {
            handleBindFailed();
        }
        return this.isBound;
    }

    private void doUnbind() {
        if (this.isResumed) {
            resumeTracking(null);
        } else {
            this.gvrApi.pauseTrackingGetState();
        }
        if (this.isBound) {
            InterfaceC11476xb1 interfaceC11476xb1 = this.daydreamManager;
            if (interfaceC11476xb1 != null) {
                try {
                    ComponentName componentName = this.componentName;
                    C10790vb1 c10790vb1 = (C10790vb1) interfaceC11476xb1;
                    Parcel obtainAndWriteInterfaceToken = c10790vb1.obtainAndWriteInterfaceToken();
                    c.a(obtainAndWriteInterfaceToken, componentName);
                    Parcel transactAndReadException = c10790vb1.transactAndReadException(2, obtainAndWriteInterfaceToken);
                    c.a(transactAndReadException);
                    transactAndReadException.recycle();
                } catch (RemoteException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                    sb.append("Failed to unregister Daydream listener: ");
                    sb.append(valueOf);
                    Log.w("VrCoreSdkClient", sb.toString());
                }
                this.daydreamManager = null;
            }
            this.vrCoreSdkService = null;
            this.loggingService = null;
            this.context.unbindService(this.serviceConnection);
            this.isBound = false;
        }
    }

    public void handleBindFailed() {
        doUnbind();
        warnIfIncompatibleClient();
    }

    public void handleNoDaydreamManager() {
        doUnbind();
        warnIfIncompatibleClient();
    }

    public void handlePrepareVrFailed() {
        doUnbind();
        this.closeVrRunnable.run();
    }

    private void warnIfIncompatibleClient() {
        if (this.daydreamUtils.isDaydreamPhone(this.context) || !this.daydreamUtils.isDaydreamRequiredComponent(this.context) || ActivityManager.isRunningInTestHarness()) {
            return;
        }
        AlertDialog alertDialog = this.helpCenterDialog;
        if (alertDialog != null) {
            alertDialog.show();
            return;
        }
        Context context = this.context;
        Runnable runnable = this.closeVrRunnable;
        DialogInterfaceOnClickListenerC6477j04 dialogInterfaceOnClickListenerC6477j04 = new DialogInterfaceOnClickListenerC6477j04(context);
        C7770mm3 c7770mm3 = AbstractC8883q04.a;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.f96380_resource_name_obfuscated_res_0x7f1501cd);
        builder.setTitle(R.string.0_resource_name_obfuscated_res_0x7f1403fa).setMessage(R.string.0_resource_name_obfuscated_res_0x7f1403f7).setCancelable(false).setPositiveButton(R.string.0_resource_name_obfuscated_res_0x7f1403f6, dialogInterfaceOnClickListenerC6477j04).setNegativeButton(R.string.0_resource_name_obfuscated_res_0x7f1403f5, new DialogInterfaceOnClickListenerC6821k04());
        if (runnable != null) {
            builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC7165l04(runnable));
        }
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        AbstractC8883q04.b(context, create);
        this.helpCenterDialog = create;
    }

    public void resumeTracking(HeadTrackingState headTrackingState) {
        resumeTracking(this.gvrApi, headTrackingState);
        FadeOverlayView fadeOverlayView = this.fadeOverlayView;
        if (fadeOverlayView != null) {
            fadeOverlayView.flushAutoFade();
        }
    }

    private boolean hasCompatibleSdkService(Context context) {
        int vrCoreClientApiVersion;
        try {
            vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            this.vrCoreClientApiVersion = vrCoreClientApiVersion;
        } catch (C6029hi4 unused) {
        }
        if (vrCoreClientApiVersion >= 5) {
            return true;
        }
        Log.w("VrCoreSdkClient", String.format("VrCore service obsolete, GVR SDK requires API %d but found API %d.", 5, Integer.valueOf(this.vrCoreClientApiVersion)));
        return false;
    }

    public int prepareVr(HeadTrackingState headTrackingState) {
        if (this.vrCoreClientApiVersion < 13) {
            if (this.optionalReentryIntent != null) {
                Log.i("VrCoreSdkClient", "Ignoring client re-entry intent; unsupported by current VrCore.");
            }
            InterfaceC11476xb1 interfaceC11476xb1 = this.daydreamManager;
            ComponentName componentName = this.componentName;
            C10790vb1 c10790vb1 = (C10790vb1) interfaceC11476xb1;
            Parcel obtainAndWriteInterfaceToken = c10790vb1.obtainAndWriteInterfaceToken();
            c.a(obtainAndWriteInterfaceToken, componentName);
            Parcel transactAndReadException = c10790vb1.transactAndReadException(3, obtainAndWriteInterfaceToken);
            int readInt = transactAndReadException.readInt();
            if (transactAndReadException.readInt() != 0) {
                headTrackingState.a(transactAndReadException);
            }
            transactAndReadException.recycle();
            return readInt;
        }
        DaydreamCompatibility componentDaydreamCompatibility = DaydreamUtils.getComponentDaydreamCompatibility(this.context, this.componentName);
        PendingIntent pendingIntent = this.optionalReentryIntent;
        if (pendingIntent == null) {
            Intent createVrIntent = DaydreamApi.createVrIntent(this.componentName);
            createVrIntent.addFlags(536870912);
            Activity a = U60.a(this.context);
            if (a != null && a.getIntent() != null) {
                createVrIntent.putExtras(a.getIntent());
                createVrIntent.fillIn(a.getIntent(), 2);
            }
            pendingIntent = PendingIntent.getActivity(this.context, 0, createVrIntent, 1073741824);
        }
        if (this.vrCoreClientApiVersion >= 22) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("COMPONENT_NAME_KEY", this.componentName);
            bundle.putInt("DAYDREAM_COMPATIBILITY_KEY", componentDaydreamCompatibility.toDeprecated());
            bundle.putInt("DAYDREAM_COMPATIBILITY_BITMASK_KEY", componentDaydreamCompatibility.getSupportedHeadsets());
            bundle.putParcelable("OPTIONAL_REENTRY_INTENT_KEY", pendingIntent);
            bundle.putBoolean("IS_USING_VR_DISPLAY_SERVICE_KEY", this.gvrApi.usingVrDisplayService());
            C10790vb1 c10790vb12 = (C10790vb1) this.daydreamManager;
            Parcel obtainAndWriteInterfaceToken2 = c10790vb12.obtainAndWriteInterfaceToken();
            c.a(obtainAndWriteInterfaceToken2, bundle);
            Parcel transactAndReadException2 = c10790vb12.transactAndReadException(16, obtainAndWriteInterfaceToken2);
            int readInt2 = transactAndReadException2.readInt();
            if (transactAndReadException2.readInt() != 0) {
                headTrackingState.a(transactAndReadException2);
            }
            transactAndReadException2.recycle();
            return readInt2;
        }
        InterfaceC11476xb1 interfaceC11476xb12 = this.daydreamManager;
        ComponentName componentName2 = this.componentName;
        int deprecated = componentDaydreamCompatibility.toDeprecated();
        C10790vb1 c10790vb13 = (C10790vb1) interfaceC11476xb12;
        Parcel obtainAndWriteInterfaceToken3 = c10790vb13.obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken3, componentName2);
        obtainAndWriteInterfaceToken3.writeInt(deprecated);
        c.a(obtainAndWriteInterfaceToken3, pendingIntent);
        Parcel transactAndReadException3 = c10790vb13.transactAndReadException(13, obtainAndWriteInterfaceToken3);
        int readInt3 = transactAndReadException3.readInt();
        if (transactAndReadException3.readInt() != 0) {
            headTrackingState.a(transactAndReadException3);
        }
        transactAndReadException3.recycle();
        return readInt3;
    }
}
