package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wy */
/* loaded from: classes2.dex */
public final class C11267wy extends AbstractC7094ko3 {
    public static final C4638dg0[] g;
    public static final C4638dg0 h;
    public int b;
    public int c;
    public int d;
    public float[] e;
    public float[] f;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        g = new C4638dg0[]{c4638dg0};
        h = c4638dg0;
    }

    public C11267wy(int i) {
        super(40);
    }

    public static C11267wy d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C11267wy c11267wy = new C11267wy(c1730Ni0.c(g).b);
            int o = c1730Ni0.o(8);
            c11267wy.b = o;
            if (!(o >= 0 && o <= 3)) {
                o = 0;
            }
            c11267wy.b = o;
            c11267wy.c = c1730Ni0.o(12);
            c11267wy.d = c1730Ni0.o(16);
            c11267wy.e = c1730Ni0.n(24, 7);
            c11267wy.f = c1730Ni0.n(32, 9);
            return c11267wy;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(h);
        t.b(this.b, 8);
        t.b(this.c, 12);
        t.b(this.d, 16);
        t.e(24, 7, this.e);
        t.e(32, 9, this.f);
    }
}
