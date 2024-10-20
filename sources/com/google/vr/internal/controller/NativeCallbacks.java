package com.google.vr.internal.controller;

import com.google.vr.internal.controller.ControllerServiceBridge;
import com.google.vr.vrcore.controller.api.ControllerAccelEvent;
import com.google.vr.vrcore.controller.api.ControllerButtonEvent;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerGyroEvent;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import com.google.vr.vrcore.controller.api.ControllerTouchEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class NativeCallbacks implements ControllerServiceBridge.Callbacks {
    public final long a;
    public boolean b;

    public NativeCallbacks(long j) {
        this.a = j;
    }

    private final native void handleAccelEvent(long j, int i, long j2, float f, float f2, float f3);

    private final native void handleBatteryEvent(long j, int i, long j2, boolean z, int i2);

    private final native void handleButtonEvent(long j, int i, long j2, int i2, boolean z);

    private final native void handleControllerRecentered(long j, int i, long j2, float f, float f2, float f3, float f4);

    private final native void handleGyroEvent(long j, int i, long j2, float f, float f2, float f3);

    private final native void handleOrientationEvent(long j, int i, long j2, float f, float f2, float f3, float f4);

    private final native void handlePositionEvent(long j, int i, long j2, float f, float f2, float f3);

    private final native void handleServiceConnected(long j, int i);

    private final native void handleServiceDisconnected(long j);

    private final native void handleServiceFailed(long j);

    private final native void handleServiceInitFailed(long j, int i);

    private final native void handleServiceUnavailable(long j);

    private final native void handleStateChanged(long j, int i, int i2);

    private final native void handleTouchEvent(long j, int i, long j2, int i2, float f, float f2);

    public final synchronized void close() {
        this.b = true;
    }

    @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
    public final synchronized void onControllerStateChanged(int i, int i2) {
        if (!this.b) {
            handleStateChanged(this.a, i, i2);
        }
    }

    @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
    public final synchronized void onControllerEventPacket(ControllerEventPacket controllerEventPacket) {
        if (this.b) {
            return;
        }
        a(controllerEventPacket);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:            throw new java.lang.IndexOutOfBoundsException();     */
    @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onControllerEventPacket2(com.google.vr.vrcore.controller.api.ControllerEventPacket2 r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.b     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L7
            monitor-exit(r11)
            return
        L7:
            r11.a(r12)     // Catch: java.lang.Throwable -> L57
            r0 = 0
        Lb:
            boolean r1 = r11.b     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L34
            int r2 = r12.r     // Catch: java.lang.Throwable -> L57
            if (r0 >= r2) goto L34
            if (r0 < 0) goto L2e
            if (r0 >= r2) goto L2e
            com.google.vr.vrcore.controller.api.ControllerPositionEvent[] r1 = r12.s     // Catch: java.lang.Throwable -> L57
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L57
            long r3 = r11.a     // Catch: java.lang.Throwable -> L57
            int r5 = r1.g     // Catch: java.lang.Throwable -> L57
            long r6 = r1.a     // Catch: java.lang.Throwable -> L57
            float r8 = r1.h     // Catch: java.lang.Throwable -> L57
            float r9 = r1.i     // Catch: java.lang.Throwable -> L57
            float r10 = r1.j     // Catch: java.lang.Throwable -> L57
            r2 = r11
            r2.handlePositionEvent(r3, r5, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L57
            int r0 = r0 + 1
            goto Lb
        L2e:
            java.lang.IndexOutOfBoundsException r12 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L57
            r12.<init>()     // Catch: java.lang.Throwable -> L57
            throw r12     // Catch: java.lang.Throwable -> L57
        L34:
            if (r1 != 0) goto L55
            boolean r0 = r12.t     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L55
            if (r0 == 0) goto L4d
            com.google.vr.vrcore.controller.api.ControllerBatteryEvent r12 = r12.u     // Catch: java.lang.Throwable -> L57
            long r1 = r11.a     // Catch: java.lang.Throwable -> L57
            int r3 = r12.g     // Catch: java.lang.Throwable -> L57
            long r4 = r12.a     // Catch: java.lang.Throwable -> L57
            boolean r6 = r12.i     // Catch: java.lang.Throwable -> L57
            int r7 = r12.h     // Catch: java.lang.Throwable -> L57
            r0 = r11
            r0.handleBatteryEvent(r1, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L57
            goto L55
        L4d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "ControllerEventPacket doesn't have a battery event."
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L57
            throw r12     // Catch: java.lang.Throwable -> L57
        L55:
            monitor-exit(r11)
            return
        L57:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.internal.controller.NativeCallbacks.onControllerEventPacket2(com.google.vr.vrcore.controller.api.ControllerEventPacket2):void");
    }

    public final void a(ControllerEventPacket controllerEventPacket) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        for (int i6 = 0; !this.b && i6 < (i5 = controllerEventPacket.a); i6++) {
            if (i6 < 0 || i6 >= i5) {
                throw new IndexOutOfBoundsException();
            }
            ControllerAccelEvent controllerAccelEvent = controllerEventPacket.g[i6];
            handleAccelEvent(this.a, controllerAccelEvent.g, controllerAccelEvent.a, controllerAccelEvent.h, controllerAccelEvent.i, controllerAccelEvent.j);
        }
        for (int i7 = 0; !this.b && i7 < (i4 = controllerEventPacket.h); i7++) {
            if (i7 < 0 || i7 >= i4) {
                throw new IndexOutOfBoundsException();
            }
            ControllerButtonEvent controllerButtonEvent = controllerEventPacket.i[i7];
            handleButtonEvent(this.a, controllerButtonEvent.g, controllerButtonEvent.a, controllerButtonEvent.h, controllerButtonEvent.i);
        }
        for (int i8 = 0; !this.b && i8 < (i3 = controllerEventPacket.j); i8++) {
            if (i8 < 0 || i8 >= i3) {
                throw new IndexOutOfBoundsException();
            }
            ControllerGyroEvent controllerGyroEvent = controllerEventPacket.k[i8];
            handleGyroEvent(this.a, controllerGyroEvent.g, controllerGyroEvent.a, controllerGyroEvent.h, controllerGyroEvent.i, controllerGyroEvent.j);
        }
        for (int i9 = 0; !this.b && i9 < (i2 = controllerEventPacket.l); i9++) {
            if (i9 < 0 || i9 >= i2) {
                throw new IndexOutOfBoundsException();
            }
            ControllerOrientationEvent controllerOrientationEvent = controllerEventPacket.m[i9];
            handleOrientationEvent(this.a, controllerOrientationEvent.g, controllerOrientationEvent.a, controllerOrientationEvent.h, controllerOrientationEvent.i, controllerOrientationEvent.j, controllerOrientationEvent.k);
        }
        for (int i10 = 0; !this.b && i10 < (i = controllerEventPacket.n); i10++) {
            if (i10 < 0 || i10 >= i) {
                throw new IndexOutOfBoundsException();
            }
            ControllerTouchEvent controllerTouchEvent = controllerEventPacket.o[i10];
            handleTouchEvent(this.a, controllerTouchEvent.g, controllerTouchEvent.a, controllerTouchEvent.i, controllerTouchEvent.j, controllerTouchEvent.k);
        }
    }

    @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
    public final synchronized void onControllerRecentered(ControllerOrientationEvent controllerOrientationEvent) {
        if (!this.b) {
            handleControllerRecentered(this.a, controllerOrientationEvent.g, controllerOrientationEvent.a, controllerOrientationEvent.h, controllerOrientationEvent.i, controllerOrientationEvent.j, controllerOrientationEvent.k);
        }
    }

    @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
    public final synchronized void onServiceConnected(int i) {
        if (!this.b) {
            handleServiceConnected(this.a, 1);
        }
    }

    @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
    public final synchronized void onServiceDisconnected() {
        if (!this.b) {
            handleServiceDisconnected(this.a);
        }
    }

    @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
    public final synchronized void onServiceFailed() {
        if (!this.b) {
            handleServiceFailed(this.a);
        }
    }

    @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
    public final synchronized void onServiceUnavailable() {
        if (!this.b) {
            handleServiceUnavailable(this.a);
        }
    }

    @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
    public final synchronized void onServiceInitFailed(int i) {
        if (!this.b) {
            handleServiceInitFailed(this.a, i);
        }
    }
}
