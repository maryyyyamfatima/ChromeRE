package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: St */
/* loaded from: classes2.dex */
public final class C2434St extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public String b;
    public KI2 c;
    public int d;
    public C2452Sw2[] e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C2434St(int i) {
        super(40);
    }

    public static C2434St d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C2434St c2434St = new C2434St(c1730Ni0.c(f).b);
            c2434St.b = c1730Ni0.v(8, false);
            c2434St.c = KI2.d(c1730Ni0.s(16, false));
            int o = c1730Ni0.o(24);
            c2434St.d = o;
            AbstractC5064eu.a(o);
            c2434St.d = c2434St.d;
            C1730Ni0 s = c1730Ni0.s(32, false);
            int i = s.j(-1).b;
            c2434St.e = new C2452Sw2[i];
            for (int i2 = 0; i2 < i; i2++) {
                c2434St.e[i2] = C2452Sw2.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return c2434St;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.m(this.b, 8, false);
        t.k(this.c, 16, false);
        t.b(this.d, 24);
        C2452Sw2[] c2452Sw2Arr = this.e;
        if (c2452Sw2Arr == null) {
            t.q(32, false);
            return;
        }
        KA0 r = t.r(c2452Sw2Arr.length, 32);
        int i = 0;
        while (true) {
            C2452Sw2[] c2452Sw2Arr2 = this.e;
            if (i >= c2452Sw2Arr2.length) {
                return;
            }
            r.k(c2452Sw2Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
