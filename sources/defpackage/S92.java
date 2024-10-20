package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S92 implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;
    public final DV0 g;
    public InterfaceC6416iq0 h;

    public S92(InterfaceC11128wa2 interfaceC11128wa2, DV0 dv0) {
        this.a = interfaceC11128wa2;
        this.g = dv0;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.h, interfaceC6416iq0)) {
            this.h = interfaceC6416iq0;
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.h.dispose();
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        this.a.d(obj);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        InterfaceC11128wa2 interfaceC11128wa2 = this.a;
        try {
            Object apply = this.g.apply(th);
            if (apply == null) {
                NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                nullPointerException.initCause(th);
                interfaceC11128wa2.onError(nullPointerException);
            } else {
                interfaceC11128wa2.d(apply);
                interfaceC11128wa2.b();
            }
        } catch (Throwable th2) {
            AbstractC4148cE0.a(th2);
            interfaceC11128wa2.onError(new M10(th, th2));
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        this.a.b();
    }
}
