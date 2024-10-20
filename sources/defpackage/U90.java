package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class U90 extends AbstractC7094ko3 {
    public static final C4638dg0[] h;
    public static final C4638dg0 i;
    public int b;
    public String c;
    public int d;
    public int e;
    public boolean f;
    public C4422d14 g;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        h = new C4638dg0[]{c4638dg0};
        i = c4638dg0;
    }

    public U90(int i2) {
        super(40);
        this.d = 3;
        this.e = 3;
        this.f = false;
    }

    public static U90 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            U90 u90 = new U90(c1730Ni0.c(h).b);
            int o = c1730Ni0.o(8);
            u90.b = o;
            if (o >= 0 && o <= 26) {
                u90.b = o;
                int o2 = c1730Ni0.o(12);
                u90.d = o2;
                AbstractC4710ds1.a(o2);
                u90.d = u90.d;
                u90.c = c1730Ni0.v(16, false);
                int o3 = c1730Ni0.o(24);
                u90.e = o3;
                AbstractC4710ds1.a(o3);
                u90.e = u90.e;
                u90.f = c1730Ni0.d(28, 0);
                u90.g = C4422d14.d(c1730Ni0.s(32, false));
                return u90;
            }
            throw new C12221zl0("Invalid enum value.");
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(i);
        t.b(this.b, 8);
        t.b(this.d, 12);
        t.m(this.c, 16, false);
        t.b(this.e, 24);
        t.d(28, 0, this.f);
        t.k(this.g, 32, false);
    }
}
