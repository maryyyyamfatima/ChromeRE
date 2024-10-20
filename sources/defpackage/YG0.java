package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class YG0 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public KI2 b;
    public C5766gw1[] c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public YG0(int i) {
        super(24);
    }

    public static YG0 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            YG0 yg0 = new YG0(c1730Ni0.c(d).b);
            yg0.b = KI2.d(c1730Ni0.s(8, false));
            C1730Ni0 s = c1730Ni0.s(16, false);
            int i = s.j(-1).b;
            yg0.c = new C5766gw1[i];
            for (int i2 = 0; i2 < i; i2++) {
                yg0.c[i2] = C5766gw1.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return yg0;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.k(this.b, 8, false);
        C5766gw1[] c5766gw1Arr = this.c;
        if (c5766gw1Arr == null) {
            t.q(16, false);
            return;
        }
        KA0 r = t.r(c5766gw1Arr.length, 16);
        int i = 0;
        while (true) {
            C5766gw1[] c5766gw1Arr2 = this.c;
            if (i >= c5766gw1Arr2.length) {
                return;
            }
            r.k(c5766gw1Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
