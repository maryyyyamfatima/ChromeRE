package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ZB1 extends AbstractC7094ko3 {
    public static final C4638dg0[] g;
    public static final C4638dg0 h;
    public U24 b;
    public int c;
    public int d;
    public int e;
    public String f;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        g = new C4638dg0[]{c4638dg0};
        h = c4638dg0;
    }

    public ZB1(int i) {
        super(40);
        this.d = 0;
        this.e = 0;
    }

    public static ZB1 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            ZB1 zb1 = new ZB1(c1730Ni0.c(g).b);
            boolean z = false;
            zb1.b = U24.d(c1730Ni0.s(8, false));
            int o = c1730Ni0.o(16);
            zb1.c = o;
            if (!(o >= 0 && o <= 2)) {
                throw new C12221zl0("Invalid enum value.");
            }
            zb1.c = o;
            int o2 = c1730Ni0.o(20);
            zb1.d = o2;
            if (!(o2 >= 0 && o2 <= 4)) {
                throw new C12221zl0("Invalid enum value.");
            }
            zb1.d = o2;
            int o3 = c1730Ni0.o(24);
            zb1.e = o3;
            if (o3 >= 0 && o3 <= 2) {
                z = true;
            }
            if (!z) {
                throw new C12221zl0("Invalid enum value.");
            }
            zb1.e = o3;
            zb1.f = c1730Ni0.v(32, true);
            return zb1;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(h);
        t.k(this.b, 8, false);
        t.b(this.c, 16);
        t.b(this.d, 20);
        t.b(this.e, 24);
        t.m(this.f, 32, true);
    }
}
