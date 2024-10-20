package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CY0 extends AbstractC7094ko3 {
    public static final C4638dg0[] r;
    public static final C4638dg0 s;
    public C10772vY b;
    public int c;
    public byte[] d;
    public byte[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public D74[] i;
    public boolean j;
    public C5783gz2 k;
    public boolean l;
    public boolean m;
    public byte[] n;
    public boolean o;
    public boolean p;
    public byte[] q;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(72, 0);
        r = new C4638dg0[]{c4638dg0};
        s = c4638dg0;
    }

    public CY0(int i) {
        super(72);
    }

    public static CY0 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            CY0 cy0 = new CY0(c1730Ni0.c(r).b);
            cy0.b = C10772vY.d(c1730Ni0.s(8, false));
            int o = c1730Ni0.o(16);
            cy0.c = o;
            AbstractC0060Am.a(o);
            cy0.c = cy0.c;
            cy0.f = c1730Ni0.d(20, 0);
            cy0.g = c1730Ni0.d(20, 1);
            cy0.h = c1730Ni0.d(20, 2);
            cy0.j = c1730Ni0.d(20, 3);
            cy0.l = c1730Ni0.d(20, 4);
            cy0.m = c1730Ni0.d(20, 5);
            cy0.o = c1730Ni0.d(20, 6);
            cy0.p = c1730Ni0.d(20, 7);
            cy0.d = c1730Ni0.e(24, 0, -1);
            cy0.e = c1730Ni0.e(32, 1, -1);
            C1730Ni0 s2 = c1730Ni0.s(40, true);
            if (s2 == null) {
                cy0.i = null;
            } else {
                int i = s2.j(-1).b;
                cy0.i = new D74[i];
                for (int i2 = 0; i2 < i; i2++) {
                    cy0.i[i2] = D74.d(AbstractC7558m9.a(i2, 8, 8, s2, false));
                }
            }
            cy0.k = C5783gz2.d(c1730Ni0.s(48, true));
            cy0.n = c1730Ni0.e(56, 1, -1);
            cy0.q = c1730Ni0.e(64, 1, -1);
            return cy0;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(s);
        t.k(this.b, 8, false);
        t.b(this.c, 16);
        t.d(20, 0, this.f);
        t.d(20, 1, this.g);
        t.d(20, 2, this.h);
        t.d(20, 3, this.j);
        t.d(20, 4, this.l);
        t.d(20, 5, this.m);
        t.d(20, 6, this.o);
        t.d(20, 7, this.p);
        t.c(24, 0, -1, this.d);
        t.c(32, 1, -1, this.e);
        D74[] d74Arr = this.i;
        if (d74Arr == null) {
            t.q(40, true);
        } else {
            KA0 r2 = t.r(d74Arr.length, 40);
            int i = 0;
            while (true) {
                D74[] d74Arr2 = this.i;
                if (i >= d74Arr2.length) {
                    break;
                }
                r2.k(d74Arr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        t.k(this.k, 48, true);
        t.c(56, 1, -1, this.n);
        t.c(64, 1, -1, this.q);
    }
}
