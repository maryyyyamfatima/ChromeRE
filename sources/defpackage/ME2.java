package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ME2 extends AbstractC7094ko3 {
    public static final C4638dg0[] q;
    public static final C4638dg0 r;
    public boolean b;
    public byte[] c;
    public JM3 d;
    public String e;
    public KE2[] f;
    public int g;
    public String h;
    public C5178fE[] i;
    public boolean j;
    public boolean k;
    public C5783gz2[] l;
    public boolean m;
    public byte[] n;
    public boolean o;
    public C6253iM2 p;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(88, 0);
        q = new C4638dg0[]{c4638dg0};
        r = c4638dg0;
    }

    public ME2(int i) {
        super(88);
    }

    public static ME2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            ME2 me2 = new ME2(c1730Ni0.c(q).b);
            me2.b = c1730Ni0.d(8, 0);
            me2.j = c1730Ni0.d(8, 1);
            me2.k = c1730Ni0.d(8, 2);
            me2.m = c1730Ni0.d(8, 3);
            me2.o = c1730Ni0.d(8, 4);
            int o = c1730Ni0.o(12);
            me2.g = o;
            if (!(o >= 0 && o <= 2)) {
                throw new C12221zl0("Invalid enum value.");
            }
            me2.g = o;
            me2.c = c1730Ni0.e(16, 0, -1);
            me2.d = JM3.d(c1730Ni0.s(24, true));
            me2.e = c1730Ni0.v(32, false);
            C1730Ni0 s = c1730Ni0.s(40, false);
            int i = s.j(-1).b;
            me2.f = new KE2[i];
            for (int i2 = 0; i2 < i; i2++) {
                me2.f[i2] = KE2.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            me2.h = c1730Ni0.v(48, true);
            C1730Ni0 s2 = c1730Ni0.s(56, false);
            int i3 = s2.j(-1).b;
            me2.i = new C5178fE[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                me2.i[i4] = C5178fE.d(AbstractC7558m9.a(i4, 8, 8, s2, false));
            }
            C1730Ni0 s3 = c1730Ni0.s(64, false);
            int i5 = s3.j(-1).b;
            me2.l = new C5783gz2[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                me2.l[i6] = C5783gz2.d(AbstractC7558m9.a(i6, 8, 8, s3, false));
            }
            me2.n = c1730Ni0.e(72, 1, -1);
            me2.p = C6253iM2.d(c1730Ni0.s(80, true));
            return me2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(r);
        t.d(8, 0, this.b);
        t.d(8, 1, this.j);
        t.d(8, 2, this.k);
        t.d(8, 3, this.m);
        t.d(8, 4, this.o);
        t.b(this.g, 12);
        t.c(16, 0, -1, this.c);
        t.k(this.d, 24, true);
        t.m(this.e, 32, false);
        KE2[] ke2Arr = this.f;
        if (ke2Arr == null) {
            t.q(40, false);
        } else {
            KA0 r2 = t.r(ke2Arr.length, 40);
            int i = 0;
            while (true) {
                KE2[] ke2Arr2 = this.f;
                if (i >= ke2Arr2.length) {
                    break;
                }
                r2.k(ke2Arr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        t.m(this.h, 48, true);
        C5178fE[] c5178fEArr = this.i;
        if (c5178fEArr == null) {
            t.q(56, false);
        } else {
            KA0 r3 = t.r(c5178fEArr.length, 56);
            int i2 = 0;
            while (true) {
                C5178fE[] c5178fEArr2 = this.i;
                if (i2 >= c5178fEArr2.length) {
                    break;
                }
                r3.k(c5178fEArr2[i2], (i2 * 8) + 8, false);
                i2++;
            }
        }
        C5783gz2[] c5783gz2Arr = this.l;
        if (c5783gz2Arr == null) {
            t.q(64, false);
        } else {
            KA0 r4 = t.r(c5783gz2Arr.length, 64);
            int i3 = 0;
            while (true) {
                C5783gz2[] c5783gz2Arr2 = this.l;
                if (i3 >= c5783gz2Arr2.length) {
                    break;
                }
                r4.k(c5783gz2Arr2[i3], (i3 * 8) + 8, false);
                i3++;
            }
        }
        t.c(72, 1, -1, this.n);
        t.k(this.p, 80, true);
    }
}
