package defpackage;

import com.google.vr.internal.controller.ControllerServiceBridge;
import com.google.vr.vrcore.controller.api.ControllerListenerOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class S80 {
    public final ControllerServiceBridge.Callbacks a;
    public final ControllerListenerOptions b;
    public final int c;

    public S80(int i, ControllerServiceBridge.Callbacks callbacks, ControllerListenerOptions controllerListenerOptions) {
        this.a = callbacks;
        this.b = controllerListenerOptions;
        this.c = i;
    }
}
