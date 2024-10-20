package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cz */
/* loaded from: classes.dex */
public final class C4405cz extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public C0207Bp1 b;
    public String c;
    public C3916ba1 d;
    public InterfaceC11644y34 e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C4405cz(int i) {
        super(40);
    }

    public static C4405cz d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C4405cz c4405cz = new C4405cz(a.c(f).b);
            c4405cz.b = a.p(8);
            c4405cz.c = a.v(16, false);
            c4405cz.d = C3916ba1.d(a.s(24, false));
            c4405cz.e = (InterfaceC11644y34) a.t(32, false, M34.a);
            return c4405cz;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.j(this.b, 8);
        t.m(this.c, 16, false);
        t.k(this.d, 24, false);
        t.i(this.e, 32, false, M34.a);
    }
}
