package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NE2 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public String b;
    public String c;
    public U24 d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public NE2(int i) {
        super(32);
    }

    public static NE2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            NE2 ne2 = new NE2(c1730Ni0.c(e).b);
            ne2.b = c1730Ni0.v(8, false);
            ne2.c = c1730Ni0.v(16, false);
            ne2.d = U24.d(c1730Ni0.s(24, true));
            return ne2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
        t.k(this.d, 24, true);
    }
}
