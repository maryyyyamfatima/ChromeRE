package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wb0 */
/* loaded from: classes2.dex */
public final class C2865Wb0 extends AbstractC7094ko3 {
    public static final C4638dg0[] g;
    public static final C4638dg0 h;
    public int b;
    public String c;
    public int d;
    public String e;
    public int f;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        g = new C4638dg0[]{c4638dg0};
        h = c4638dg0;
    }

    public C2865Wb0(int i) {
        super(40);
        this.b = 0;
        this.d = 0;
        this.f = 0;
    }

    public static C2865Wb0 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C2865Wb0 c2865Wb0 = new C2865Wb0(c1730Ni0.c(g).b);
            int o = c1730Ni0.o(8);
            c2865Wb0.b = o;
            AbstractC2995Xb0.a(o);
            c2865Wb0.b = c2865Wb0.b;
            int o2 = c1730Ni0.o(12);
            c2865Wb0.d = o2;
            AbstractC2995Xb0.a(o2);
            c2865Wb0.d = c2865Wb0.d;
            c2865Wb0.c = c1730Ni0.v(16, true);
            c2865Wb0.e = c1730Ni0.v(24, true);
            int o3 = c1730Ni0.o(32);
            c2865Wb0.f = o3;
            AbstractC2995Xb0.a(o3);
            c2865Wb0.f = c2865Wb0.f;
            return c2865Wb0;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(h);
        t.b(this.b, 8);
        t.b(this.d, 12);
        t.m(this.c, 16, true);
        t.m(this.e, 24, true);
        t.b(this.f, 32);
    }
}
