package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class P92 implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;
    public InterfaceC6416iq0 g;

    public P92(InterfaceC11128wa2 interfaceC11128wa2) {
        this.a = interfaceC11128wa2;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.g, interfaceC6416iq0)) {
            this.g = interfaceC6416iq0;
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.g.dispose();
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        C5137f62 c5137f62 = C5137f62.b;
        InterfaceC11128wa2 interfaceC11128wa2 = this.a;
        interfaceC11128wa2.d(c5137f62);
        interfaceC11128wa2.b();
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value is null");
        }
        this.a.d(new C5137f62(obj));
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("error is null");
        }
        C5137f62 c5137f62 = new C5137f62(new W62(th));
        InterfaceC11128wa2 interfaceC11128wa2 = this.a;
        interfaceC11128wa2.d(c5137f62);
        interfaceC11128wa2.b();
    }
}
