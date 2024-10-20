package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vq2 */
/* loaded from: classes2.dex */
public final class C10881vq2 extends AbstractC7094ko3 {
    public static final C4638dg0[] h;
    public static final C4638dg0 i;
    public String b;
    public String c;
    public C4687do2 d;
    public String e;
    public C4001bo2 f;
    public C4770e23 g;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(56, 0);
        h = new C4638dg0[]{c4638dg0};
        i = c4638dg0;
    }

    public C10881vq2(int i2) {
        super(56);
    }

    public static C10881vq2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C10881vq2 c10881vq2 = new C10881vq2(c1730Ni0.c(h).b);
            c10881vq2.b = c1730Ni0.v(8, false);
            c10881vq2.c = c1730Ni0.v(16, false);
            c10881vq2.d = C4687do2.d(c1730Ni0.s(24, true));
            c10881vq2.e = c1730Ni0.v(32, true);
            c10881vq2.f = C4001bo2.d(c1730Ni0.s(40, false));
            c10881vq2.g = C4770e23.d(c1730Ni0.s(48, true));
            return c10881vq2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(i);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
        t.k(this.d, 24, true);
        t.m(this.e, 32, true);
        t.k(this.f, 40, false);
        t.k(this.g, 48, true);
    }
}
