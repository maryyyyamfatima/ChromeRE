package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: As1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0092As1 extends AbstractC7094ko3 {
    public static final C4638dg0[] m;
    public static final C4638dg0 n;
    public String b;
    public String c;
    public String d;
    public C9840so2 e;
    public String f;
    public String g;
    public C9840so2 h;
    public String i;
    public int j;
    public int k;
    public U24[] l;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(88, 1);
        m = new C4638dg0[]{new C4638dg0(72, 0), c4638dg0};
        n = c4638dg0;
    }

    public C0092As1(int i) {
        super(88);
    }

    public static C0092As1 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            int i = c1730Ni0.c(m).b;
            C0092As1 c0092As1 = new C0092As1(i);
            c0092As1.b = c1730Ni0.v(8, false);
            c0092As1.c = c1730Ni0.v(16, false);
            c0092As1.d = c1730Ni0.v(24, false);
            c0092As1.e = C9840so2.d(c1730Ni0.s(32, false));
            c0092As1.f = c1730Ni0.v(40, true);
            c0092As1.g = c1730Ni0.v(48, true);
            c0092As1.h = C9840so2.d(c1730Ni0.s(56, true));
            c0092As1.i = c1730Ni0.v(64, true);
            if (i >= 1) {
                c0092As1.j = c1730Ni0.o(72);
                c0092As1.k = c1730Ni0.o(76);
                C1730Ni0 s = c1730Ni0.s(80, true);
                if (s == null) {
                    c0092As1.l = null;
                } else {
                    int i2 = s.j(-1).b;
                    c0092As1.l = new U24[i2];
                    for (int i3 = 0; i3 < i2; i3++) {
                        c0092As1.l[i3] = U24.d(AbstractC7558m9.a(i3, 8, 8, s, false));
                    }
                }
            }
            return c0092As1;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(n);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
        t.m(this.d, 24, false);
        t.k(this.e, 32, false);
        t.m(this.f, 40, true);
        t.m(this.g, 48, true);
        t.k(this.h, 56, true);
        t.m(this.i, 64, true);
        t.b(this.j, 72);
        t.b(this.k, 76);
        U24[] u24Arr = this.l;
        if (u24Arr == null) {
            t.q(80, true);
            return;
        }
        KA0 r = t.r(u24Arr.length, 80);
        int i = 0;
        while (true) {
            U24[] u24Arr2 = this.l;
            if (i >= u24Arr2.length) {
                return;
            }
            r.k(u24Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
