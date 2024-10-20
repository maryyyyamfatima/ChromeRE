package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OE2 extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public byte[] b;
    public String c;
    public U24 d;
    public String e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public OE2(int i) {
        super(40);
    }

    public static OE2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            OE2 oe2 = new OE2(c1730Ni0.c(f).b);
            oe2.b = c1730Ni0.e(8, 0, -1);
            oe2.c = c1730Ni0.v(16, false);
            oe2.d = U24.d(c1730Ni0.s(24, true));
            oe2.e = c1730Ni0.v(32, false);
            return oe2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.c(8, 0, -1, this.b);
        t.m(this.c, 16, false);
        t.k(this.d, 24, true);
        t.m(this.e, 32, false);
    }
}
