package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zq2 */
/* loaded from: classes2.dex */
public final class C12253zq2 extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public String b;
    public String c;
    public C9840so2 d;
    public boolean e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C12253zq2(int i) {
        super(40);
    }

    public static C12253zq2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C12253zq2 c12253zq2 = new C12253zq2(c1730Ni0.c(f).b);
            c12253zq2.b = c1730Ni0.v(8, false);
            c12253zq2.c = c1730Ni0.v(16, false);
            c12253zq2.d = C9840so2.d(c1730Ni0.s(24, false));
            c12253zq2.e = c1730Ni0.d(32, 0);
            return c12253zq2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
        t.k(this.d, 24, false);
        t.d(32, 0, this.e);
    }
}
