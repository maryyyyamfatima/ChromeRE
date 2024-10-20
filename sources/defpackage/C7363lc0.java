package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lc0 */
/* loaded from: classes2.dex */
public final class C7363lc0 extends AbstractC7094ko3 {
    public static final C4638dg0[] o;
    public static final C4638dg0 p;
    public C7019kc0[] b;
    public String[] c;
    public C6675jc0[] d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        o = new C4638dg0[]{c4638dg0};
        p = c4638dg0;
    }

    public C7363lc0(int i) {
        super(40);
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
    }

    public static C7363lc0 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C7363lc0 c7363lc0 = new C7363lc0(c1730Ni0.c(o).b);
            C1730Ni0 s = c1730Ni0.s(8, false);
            int i = s.j(-1).b;
            c7363lc0.b = new C7019kc0[i];
            for (int i2 = 0; i2 < i; i2++) {
                c7363lc0.b[i2] = C7019kc0.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            C1730Ni0 s2 = c1730Ni0.s(16, false);
            int i3 = s2.j(-1).b;
            c7363lc0.c = new String[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                c7363lc0.c[i4] = AbstractC7214l9.a(i4, 8, 8, s2, false);
            }
            C1730Ni0 s3 = c1730Ni0.s(24, false);
            int i5 = s3.j(-1).b;
            c7363lc0.d = new C6675jc0[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                c7363lc0.d[i6] = C6675jc0.d(AbstractC7558m9.a(i6, 8, 8, s3, false));
            }
            c7363lc0.e = c1730Ni0.d(32, 0);
            c7363lc0.f = c1730Ni0.d(32, 1);
            c7363lc0.g = c1730Ni0.d(32, 2);
            c7363lc0.h = c1730Ni0.d(32, 3);
            c7363lc0.i = c1730Ni0.d(32, 4);
            c7363lc0.j = c1730Ni0.d(32, 5);
            c7363lc0.k = c1730Ni0.d(32, 6);
            c7363lc0.l = c1730Ni0.d(32, 7);
            c7363lc0.m = c1730Ni0.d(33, 0);
            c7363lc0.n = c1730Ni0.d(33, 1);
            return c7363lc0;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(p);
        C7019kc0[] c7019kc0Arr = this.b;
        if (c7019kc0Arr == null) {
            t.q(8, false);
        } else {
            KA0 r = t.r(c7019kc0Arr.length, 8);
            int i = 0;
            while (true) {
                C7019kc0[] c7019kc0Arr2 = this.b;
                if (i >= c7019kc0Arr2.length) {
                    break;
                }
                r.k(c7019kc0Arr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        String[] strArr = this.c;
        if (strArr == null) {
            t.q(16, false);
        } else {
            KA0 r2 = t.r(strArr.length, 16);
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i2 >= strArr2.length) {
                    break;
                }
                r2.m(strArr2[i2], (i2 * 8) + 8, false);
                i2++;
            }
        }
        C6675jc0[] c6675jc0Arr = this.d;
        if (c6675jc0Arr == null) {
            t.q(24, false);
        } else {
            KA0 r3 = t.r(c6675jc0Arr.length, 24);
            int i3 = 0;
            while (true) {
                C6675jc0[] c6675jc0Arr2 = this.d;
                if (i3 >= c6675jc0Arr2.length) {
                    break;
                }
                r3.k(c6675jc0Arr2[i3], (i3 * 8) + 8, false);
                i3++;
            }
        }
        t.d(32, 0, this.e);
        t.d(32, 1, this.f);
        t.d(32, 2, this.g);
        t.d(32, 3, this.h);
        t.d(32, 4, this.i);
        t.d(32, 5, this.j);
        t.d(32, 6, this.k);
        t.d(32, 7, this.l);
        t.d(33, 0, this.m);
        t.d(33, 1, this.n);
    }
}
