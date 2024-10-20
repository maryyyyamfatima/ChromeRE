package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P34 extends AbstractC7094ko3 {
    public static final C4638dg0[] o;
    public static final C4638dg0 p;
    public IM3 b;
    public IM3 c;
    public C4603da1 d;
    public String e;
    public String f;
    public int g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(232, 0);
        o = new C4638dg0[]{c4638dg0};
        p = c4638dg0;
    }

    public P34(int i) {
        super(232);
        this.h = -1L;
        this.i = -1L;
        this.j = -1L;
        this.k = 3;
        this.l = 3;
        this.m = 2;
        this.n = true;
    }

    public static void d(C1730Ni0 c1730Ni0) {
        C4603da1 c4603da1;
        if (c1730Ni0 == null) {
            return;
        }
        c1730Ni0.b();
        try {
            P34 p34 = new P34(c1730Ni0.c(o).b);
            p34.b = IM3.d(c1730Ni0.s(8, false));
            p34.c = IM3.d(c1730Ni0.s(16, false));
            C1730Ni0 s = c1730Ni0.s(24, false);
            if (s == null) {
                c4603da1 = null;
            } else {
                s.b();
                try {
                    C4603da1 c4603da12 = new C4603da1(s.c(C4603da1.b).b);
                    s.a();
                    c4603da1 = c4603da12;
                } catch (Throwable th) {
                    s.a();
                    throw th;
                }
            }
            p34.d = c4603da1;
            p34.e = c1730Ni0.v(32, false);
            p34.f = c1730Ni0.v(40, false);
            p34.g = c1730Ni0.o(48);
            throw new C12221zl0("Invalid enum value.");
        } catch (Throwable th2) {
            c1730Ni0.a();
            throw th2;
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(p);
        t.k(this.b, 8, false);
        t.k(this.c, 16, false);
        t.k(this.d, 24, false);
        t.m(this.e, 32, false);
        t.m(this.f, 40, false);
        t.b(this.g, 48);
        t.d(54, 4, this.n);
        t.f(56, this.h);
        t.f(64, this.i);
        t.f(72, this.j);
        t.k(null, 80, false);
        t.b(0, 88);
        t.b(this.k, 92);
        t.m(null, 96, false);
        t.k(null, 104, false);
        t.b(this.l, 112);
        t.b(0, 116);
        t.k(null, 120, false);
        t.q(128, false);
        t.b(this.m, 136);
        t.b(0, 140);
        t.f(144, 0L);
        t.m(null, 152, false);
        t.k(null, 160, true);
        t.q(168, false);
        t.k(null, 176, true);
        t.k(null, 184, false);
        t.k(null, 192, false);
        t.k(null, 200, true);
        t.k(null, 208, true);
        t.q(216, false);
        t.k(null, 224, false);
    }
}
