package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U92 extends AtomicReference implements Runnable, InterfaceC11303x40 {
    public final W92 a;
    public long g;
    public boolean h;
    public boolean i;

    @Override // defpackage.InterfaceC11303x40
    public final void accept(Object obj) {
        InterfaceC6416iq0 interfaceC6416iq0 = (InterfaceC6416iq0) obj;
        EnumC7791mq0.c(this, interfaceC6416iq0);
        synchronized (this.a) {
            if (this.i) {
                ((InterfaceC11754yO2) this.a.a).e(interfaceC6416iq0);
            }
        }
    }

    public U92(W92 w92) {
        this.a = w92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k(this);
    }
}
