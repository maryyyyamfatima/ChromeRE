package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j43 */
/* loaded from: classes.dex */
public final class C6500j43 extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public String b;
    public String c;
    public long d;
    public InterfaceC1030Hy e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C6500j43(int i) {
        super(40);
    }

    public static C6500j43 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C6500j43 c6500j43 = new C6500j43(c1730Ni0.c(f).b);
            c6500j43.b = c1730Ni0.v(8, false);
            c6500j43.c = c1730Ni0.v(16, false);
            c6500j43.d = c1730Ni0.r(24);
            c6500j43.e = (InterfaceC1030Hy) c1730Ni0.t(32, false, AbstractC7498lz.a);
            return c6500j43;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
        t.f(24, this.d);
        t.i(this.e, 32, false, AbstractC7498lz.a);
    }
}
