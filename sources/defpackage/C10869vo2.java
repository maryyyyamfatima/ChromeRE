package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vo2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10869vo2 extends AbstractC7094ko3 {
    public static final C4638dg0[] j;
    public static final C4638dg0 k;
    public C5037ep2 b;
    public C5037ep2[] c;
    public C12253zq2[] d;
    public C11212wo2[] e;
    public String f;
    public M7 g;
    public String h;
    public String i;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(72, 0);
        j = new C4638dg0[]{c4638dg0};
        k = c4638dg0;
    }

    public C10869vo2(int i) {
        super(72);
        this.f = "";
    }

    public static C10869vo2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C10869vo2 c10869vo2 = new C10869vo2(c1730Ni0.c(j).b);
            c10869vo2.b = C5037ep2.d(c1730Ni0.s(8, true));
            C1730Ni0 s = c1730Ni0.s(16, true);
            if (s == null) {
                c10869vo2.c = null;
            } else {
                int i = s.j(-1).b;
                c10869vo2.c = new C5037ep2[i];
                for (int i2 = 0; i2 < i; i2++) {
                    c10869vo2.c[i2] = C5037ep2.d(AbstractC7558m9.a(i2, 8, 8, s, false));
                }
            }
            C1730Ni0 s2 = c1730Ni0.s(24, true);
            if (s2 == null) {
                c10869vo2.d = null;
            } else {
                int i3 = s2.j(-1).b;
                c10869vo2.d = new C12253zq2[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    c10869vo2.d[i4] = C12253zq2.d(AbstractC7558m9.a(i4, 8, 8, s2, false));
                }
            }
            C1730Ni0 s3 = c1730Ni0.s(32, true);
            if (s3 == null) {
                c10869vo2.e = null;
            } else {
                int i5 = s3.j(-1).b;
                c10869vo2.e = new C11212wo2[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    c10869vo2.e[i6] = C11212wo2.d(AbstractC7558m9.a(i6, 8, 8, s3, false));
                }
            }
            c10869vo2.f = c1730Ni0.v(40, false);
            c10869vo2.g = M7.d(c1730Ni0.s(48, true));
            c10869vo2.h = c1730Ni0.v(56, true);
            c10869vo2.i = c1730Ni0.v(64, true);
            return c10869vo2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(k);
        t.k(this.b, 8, true);
        C5037ep2[] c5037ep2Arr = this.c;
        if (c5037ep2Arr == null) {
            t.q(16, true);
        } else {
            KA0 r = t.r(c5037ep2Arr.length, 16);
            int i = 0;
            while (true) {
                C5037ep2[] c5037ep2Arr2 = this.c;
                if (i >= c5037ep2Arr2.length) {
                    break;
                }
                r.k(c5037ep2Arr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        C12253zq2[] c12253zq2Arr = this.d;
        if (c12253zq2Arr == null) {
            t.q(24, true);
        } else {
            KA0 r2 = t.r(c12253zq2Arr.length, 24);
            int i2 = 0;
            while (true) {
                C12253zq2[] c12253zq2Arr2 = this.d;
                if (i2 >= c12253zq2Arr2.length) {
                    break;
                }
                r2.k(c12253zq2Arr2[i2], (i2 * 8) + 8, false);
                i2++;
            }
        }
        C11212wo2[] c11212wo2Arr = this.e;
        if (c11212wo2Arr == null) {
            t.q(32, true);
        } else {
            KA0 r3 = t.r(c11212wo2Arr.length, 32);
            int i3 = 0;
            while (true) {
                C11212wo2[] c11212wo2Arr2 = this.e;
                if (i3 >= c11212wo2Arr2.length) {
                    break;
                }
                r3.k(c11212wo2Arr2[i3], (i3 * 8) + 8, false);
                i3++;
            }
        }
        t.m(this.f, 40, false);
        t.k(this.g, 48, true);
        t.m(this.h, 56, true);
        t.m(this.i, 64, true);
    }
}
