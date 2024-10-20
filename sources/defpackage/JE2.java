package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JE2 extends AbstractC7094ko3 {
    public static final C4638dg0[] w;
    public static final C4638dg0 x;
    public NE2 b;
    public OE2 c;
    public byte[] d;
    public LE2[] e;
    public JM3 f;
    public KE2[] g;
    public C1749Nm h;
    public int i;
    public C6552jE j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public String o;
    public boolean p;
    public int q;
    public boolean r;
    public byte[] s;
    public boolean t;
    public boolean u;
    public C6253iM2 v;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(112, 0);
        w = new C4638dg0[]{c4638dg0};
        x = c4638dg0;
    }

    public JE2(int i) {
        super(112);
        this.t = false;
        this.u = false;
    }

    public static JE2 d(C1730Ni0 c1730Ni0) {
        C6552jE c6552jE = null;
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            JE2 je2 = new JE2(c1730Ni0.c(w).b);
            boolean z = false;
            je2.b = NE2.d(c1730Ni0.s(8, false));
            je2.c = OE2.d(c1730Ni0.s(16, false));
            je2.d = c1730Ni0.e(24, 0, -1);
            C1730Ni0 s = c1730Ni0.s(32, false);
            int i = s.j(-1).b;
            je2.e = new LE2[i];
            for (int i2 = 0; i2 < i; i2++) {
                je2.e[i2] = LE2.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            je2.f = JM3.d(c1730Ni0.s(40, true));
            C1730Ni0 s2 = c1730Ni0.s(48, false);
            int i3 = s2.j(-1).b;
            je2.g = new KE2[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                je2.g[i4] = KE2.d(AbstractC7558m9.a(i4, 8, 8, s2, false));
            }
            je2.h = C1749Nm.d(c1730Ni0.s(56, true));
            int o = c1730Ni0.o(64);
            je2.i = o;
            if (!(o >= 0 && o <= 3)) {
                throw new C12221zl0("Invalid enum value.");
            }
            je2.i = o;
            je2.k = c1730Ni0.d(68, 0);
            je2.l = c1730Ni0.d(68, 1);
            je2.n = c1730Ni0.d(68, 2);
            je2.p = c1730Ni0.d(68, 3);
            je2.r = c1730Ni0.d(68, 4);
            je2.t = c1730Ni0.d(68, 5);
            je2.u = c1730Ni0.d(68, 6);
            C1730Ni0 s3 = c1730Ni0.s(72, true);
            if (s3 != null) {
                s3.b();
                try {
                    C6552jE c6552jE2 = new C6552jE(s3.c(C6552jE.d).b);
                    c6552jE2.b = s3.e(8, 0, -1);
                    c6552jE2.c = s3.e(16, 0, 65);
                    s3.a();
                    c6552jE = c6552jE2;
                } catch (Throwable th) {
                    s3.a();
                    throw th;
                }
            }
            je2.j = c6552jE;
            int o2 = c1730Ni0.o(80);
            je2.m = o2;
            if (!(o2 >= 0 && o2 <= 3)) {
                throw new C12221zl0("Invalid enum value.");
            }
            je2.m = o2;
            int o3 = c1730Ni0.o(84);
            je2.q = o3;
            if (o3 >= 0 && o3 <= 2) {
                z = true;
            }
            if (!z) {
                throw new C12221zl0("Invalid enum value.");
            }
            je2.q = o3;
            je2.o = c1730Ni0.v(88, true);
            je2.s = c1730Ni0.e(96, 1, -1);
            je2.v = C6253iM2.d(c1730Ni0.s(104, true));
            return je2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(x);
        t.k(this.b, 8, false);
        t.k(this.c, 16, false);
        t.c(24, 0, -1, this.d);
        LE2[] le2Arr = this.e;
        if (le2Arr == null) {
            t.q(32, false);
        } else {
            KA0 r = t.r(le2Arr.length, 32);
            int i = 0;
            while (true) {
                LE2[] le2Arr2 = this.e;
                if (i >= le2Arr2.length) {
                    break;
                }
                r.k(le2Arr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        t.k(this.f, 40, true);
        KE2[] ke2Arr = this.g;
        if (ke2Arr == null) {
            t.q(48, false);
        } else {
            KA0 r2 = t.r(ke2Arr.length, 48);
            int i2 = 0;
            while (true) {
                KE2[] ke2Arr2 = this.g;
                if (i2 >= ke2Arr2.length) {
                    break;
                }
                r2.k(ke2Arr2[i2], (i2 * 8) + 8, false);
                i2++;
            }
        }
        t.k(this.h, 56, true);
        t.b(this.i, 64);
        t.d(68, 0, this.k);
        t.d(68, 1, this.l);
        t.d(68, 2, this.n);
        t.d(68, 3, this.p);
        t.d(68, 4, this.r);
        t.d(68, 5, this.t);
        t.d(68, 6, this.u);
        t.k(this.j, 72, true);
        t.b(this.m, 80);
        t.b(this.q, 84);
        t.m(this.o, 88, true);
        t.c(96, 1, -1, this.s);
        t.k(this.v, 104, true);
    }
}
