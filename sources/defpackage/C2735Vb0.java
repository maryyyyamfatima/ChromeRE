package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vb0 */
/* loaded from: classes2.dex */
public final class C2735Vb0 extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public int b;
    public String c;
    public int d;
    public String e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C2735Vb0(int i) {
        super(32);
        this.b = 0;
        this.d = 0;
    }

    public static C2735Vb0 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C2735Vb0 c2735Vb0 = new C2735Vb0(c1730Ni0.c(f).b);
            int o = c1730Ni0.o(8);
            c2735Vb0.b = o;
            boolean z = false;
            if (!(o >= 0 && o <= 2)) {
                throw new C12221zl0("Invalid enum value.");
            }
            c2735Vb0.b = o;
            int o2 = c1730Ni0.o(12);
            c2735Vb0.d = o2;
            if (o2 >= 0 && o2 <= 2) {
                z = true;
            }
            if (!z) {
                throw new C12221zl0("Invalid enum value.");
            }
            c2735Vb0.d = o2;
            c2735Vb0.c = c1730Ni0.v(16, true);
            c2735Vb0.e = c1730Ni0.v(24, true);
            return c2735Vb0;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.b(this.b, 8);
        t.b(this.d, 12);
        t.m(this.c, 16, true);
        t.m(this.e, 24, true);
    }
}
