package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZY extends AtomicReference implements InterfaceC10434uZ {
    public final C3565aZ a;

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        C3565aZ c3565aZ = this.a;
        if (c3565aZ.j.compareAndSet(false, true)) {
            c3565aZ.n.cancel();
            c3565aZ.a.onError(th);
        } else {
            MR2.b(th);
        }
    }

    public ZY(C3565aZ c3565aZ) {
        this.a = c3565aZ;
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        EnumC7791mq0.c(this, interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        C3565aZ c3565aZ = this.a;
        c3565aZ.p = false;
        c3565aZ.a();
    }
}
