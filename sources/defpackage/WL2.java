package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class WL2 extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public WL2(int i) {
        super(40);
    }

    public static WL2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            WL2 wl2 = new WL2(c1730Ni0.c(f).b);
            wl2.b = c1730Ni0.v(8, false);
            wl2.c = c1730Ni0.v(16, true);
            wl2.d = c1730Ni0.v(24, true);
            wl2.e = c1730Ni0.v(32, true);
            return wl2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.m(this.b, 8, false);
        t.m(this.c, 16, true);
        t.m(this.d, 24, true);
        t.m(this.e, 32, true);
    }
}
