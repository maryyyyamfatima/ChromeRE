package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PR2 implements InterfaceC11128wa2 {
    public final AtomicBoolean a = new AtomicBoolean();
    public final /* synthetic */ InterfaceC11128wa2 g;
    public final /* synthetic */ QR2 h;

    public PR2(QR2 qr2, InterfaceC11128wa2 interfaceC11128wa2) {
        this.h = qr2;
        this.g = interfaceC11128wa2;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        this.g.c(interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (this.a.compareAndSet(false, true)) {
            try {
                this.h.a.accept(obj);
            } catch (Exception e) {
                throw new C10239ty0("Error happened with doOnFirst Action", e);
            }
        }
        this.g.d(obj);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        this.g.onError(th);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        this.g.b();
    }
}
