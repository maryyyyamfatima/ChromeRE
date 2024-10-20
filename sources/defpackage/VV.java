package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VV {
    public final ViewOnAttachStateChangeListenerC8362oW a;
    public final AbstractC10422uW2 b;
    public final AbstractC10422uW2 c;
    public final AtomicReference d;
    public final AtomicBoolean e;

    public VV(ViewOnAttachStateChangeListenerC8362oW viewOnAttachStateChangeListenerC8362oW, AbstractC10422uW2 abstractC10422uW2) {
        I51 a = AbstractC2209Ra.a();
        this.a = viewOnAttachStateChangeListenerC8362oW;
        this.b = abstractC10422uW2;
        this.c = a;
        this.d = new AtomicReference();
        this.e = new AtomicBoolean(true);
    }

    public final void a() {
        InterfaceC6416iq0 interfaceC6416iq0 = (InterfaceC6416iq0) this.d.getAndSet(null);
        if (interfaceC6416iq0 != null) {
            interfaceC6416iq0.dispose();
        }
    }
}
