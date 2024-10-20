package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Um4 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public U24 b;
    public String c;
    public C3451aC0[] d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public Um4(int i) {
        super(32);
    }

    public static Um4 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            Um4 um4 = new Um4(c1730Ni0.c(e).b);
            um4.b = U24.d(c1730Ni0.s(8, false));
            um4.c = c1730Ni0.v(16, false);
            C1730Ni0 s = c1730Ni0.s(24, false);
            int i = s.j(-1).b;
            um4.d = new C3451aC0[i];
            for (int i2 = 0; i2 < i; i2++) {
                um4.d[i2] = C3451aC0.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return um4;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.k(this.b, 8, false);
        t.m(this.c, 16, false);
        C3451aC0[] c3451aC0Arr = this.d;
        if (c3451aC0Arr == null) {
            t.q(24, false);
            return;
        }
        KA0 r = t.r(c3451aC0Arr.length, 24);
        int i = 0;
        while (true) {
            C3451aC0[] c3451aC0Arr2 = this.d;
            if (i >= c3451aC0Arr2.length) {
                return;
            }
            r.k(c3451aC0Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
