package com.google.vr.ndk.base;

import android.content.Context;
import com.google.vr.internal.controller.ControllerServiceBridge;
import com.google.vr.vrcore.controller.api.ControllerButtonEvent;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import defpackage.KK3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class CardboardEmulator {
    private final ControllerServiceBridge controllerServiceBridge;
    private boolean resumed;

    public CardboardEmulator(Context context, Runnable runnable) {
        this.controllerServiceBridge = createServiceBridge(context, new ControllerCallbacks(runnable));
    }

    public void onResume() {
        if (this.resumed) {
            return;
        }
        this.resumed = true;
        this.controllerServiceBridge.requestBind();
    }

    public void onPause() {
        if (this.resumed) {
            this.resumed = false;
            this.controllerServiceBridge.requestUnbind();
        }
    }

    public ControllerServiceBridge createServiceBridge(Context context, ControllerServiceBridge.Callbacks callbacks) {
        return new ControllerServiceBridge(context, callbacks, 0);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public class ControllerCallbacks implements ControllerServiceBridge.Callbacks {
        private final Runnable cardboardTriggerCallback;

        public ControllerCallbacks(Runnable runnable) {
            this.cardboardTriggerCallback = runnable;
        }

        @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
        public void onControllerRecentered(ControllerOrientationEvent controllerOrientationEvent) {
        }

        @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
        public void onControllerStateChanged(int i, int i2) {
        }

        @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
        public void onServiceConnected(int i) {
        }

        @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
        public void onServiceDisconnected() {
        }

        @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
        public void onServiceFailed() {
        }

        @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
        public void onServiceInitFailed(int i) {
        }

        @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
        public void onServiceUnavailable() {
        }

        @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
        public void onControllerEventPacket2(ControllerEventPacket2 controllerEventPacket2) {
            onControllerEventPacket(controllerEventPacket2);
        }

        @Override // com.google.vr.internal.controller.ControllerServiceBridge.Callbacks
        public void onControllerEventPacket(ControllerEventPacket controllerEventPacket) {
            int i;
            int i2 = 0;
            while (true) {
                int i3 = controllerEventPacket.h;
                if (i2 >= i3) {
                    return;
                }
                if (i2 < 0 || i2 >= i3) {
                    break;
                }
                ControllerButtonEvent controllerButtonEvent = controllerEventPacket.i[i2];
                if (controllerButtonEvent.i && ((i = controllerButtonEvent.h) == 1 || i == 3)) {
                    KK3.a(this.cardboardTriggerCallback);
                }
                i2++;
            }
            throw new IndexOutOfBoundsException();
        }
    }
}
