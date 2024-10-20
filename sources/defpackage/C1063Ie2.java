package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ie2 */
/* loaded from: classes2.dex */
public final class C1063Ie2 extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public String b;
    public String c;
    public short d;
    public C4422d14 e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C1063Ie2(int i) {
        super(40);
    }

    public static C1063Ie2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C1063Ie2 c1063Ie2 = new C1063Ie2(c1730Ni0.c(f).b);
            c1063Ie2.b = c1730Ni0.v(8, false);
            c1063Ie2.c = c1730Ni0.v(16, false);
            c1063Ie2.d = c1730Ni0.u(24);
            c1063Ie2.e = C4422d14.d(c1730Ni0.s(32, true));
            return c1063Ie2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
        t.n(this.d, 24);
        t.k(this.e, 32, true);
    }
}
