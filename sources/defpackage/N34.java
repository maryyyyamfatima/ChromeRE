package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class N34 extends AbstractC7094ko3 {
    public static final C4638dg0[] s;
    public static final C4638dg0 t;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public TM3 f;
    public long g;
    public long h;
    public long i;
    public U90 j;
    public int k;
    public C11863yi3 l;
    public C7842mz m;
    public boolean n;
    public GE2 o;
    public EO2 p;
    public boolean q;
    public boolean r;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(96, 0);
        s = new C4638dg0[]{c4638dg0};
        t = c4638dg0;
    }

    public N34(int i) {
        super(96);
        this.b = 0;
        this.c = 0;
        this.d = false;
        this.e = false;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.k = 0;
        this.n = false;
        this.q = false;
        this.r = false;
    }

    public static N34 d(C1730Ni0 c1730Ni0) {
        C11863yi3 c11863yi3;
        GE2 ge2;
        EO2 eo2 = null;
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            N34 n34 = new N34(c1730Ni0.c(s).b);
            n34.b = c1730Ni0.o(8);
            n34.c = c1730Ni0.o(12);
            n34.d = c1730Ni0.d(16, 0);
            n34.e = c1730Ni0.d(16, 1);
            n34.n = c1730Ni0.d(16, 2);
            n34.q = c1730Ni0.d(16, 3);
            n34.r = c1730Ni0.d(16, 4);
            int o = c1730Ni0.o(20);
            n34.k = o;
            if (!(o >= 0 && o <= 9)) {
                throw new C12221zl0("Invalid enum value.");
            }
            n34.k = o;
            n34.f = TM3.d(c1730Ni0.s(24, false));
            n34.g = c1730Ni0.r(32);
            n34.h = c1730Ni0.r(40);
            n34.i = c1730Ni0.r(48);
            n34.j = U90.d(c1730Ni0.s(56, true));
            C1730Ni0 s2 = c1730Ni0.s(64, true);
            if (s2 == null) {
                c11863yi3 = null;
            } else {
                s2.b();
                try {
                    c11863yi3 = new C11863yi3(s2.c(C11863yi3.b).b);
                } finally {
                }
            }
            n34.l = c11863yi3;
            n34.m = C7842mz.d(c1730Ni0.s(72, true));
            s2 = c1730Ni0.s(80, false);
            if (s2 == null) {
                ge2 = null;
            } else {
                s2.b();
                try {
                    ge2 = new GE2(s2.c(GE2.b).b);
                } finally {
                }
            }
            n34.o = ge2;
            s2 = c1730Ni0.s(88, false);
            if (s2 != null) {
                s2.b();
                try {
                    EO2 eo22 = new EO2(s2.c(EO2.d).b);
                    eo22.b = s2.o(8);
                    eo22.c = s2.d(12, 0);
                    s2.a();
                    eo2 = eo22;
                } finally {
                }
            }
            n34.p = eo2;
            return n34;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t2 = ka0.t(t);
        t2.b(this.b, 8);
        t2.b(this.c, 12);
        t2.d(16, 0, this.d);
        t2.d(16, 1, this.e);
        t2.d(16, 2, this.n);
        t2.d(16, 3, this.q);
        t2.d(16, 4, this.r);
        t2.b(this.k, 20);
        t2.k(this.f, 24, false);
        t2.f(32, this.g);
        t2.f(40, this.h);
        t2.f(48, this.i);
        t2.k(this.j, 56, true);
        t2.k(this.l, 64, true);
        t2.k(this.m, 72, true);
        t2.k(this.o, 80, false);
        t2.k(this.p, 88, false);
    }
}
