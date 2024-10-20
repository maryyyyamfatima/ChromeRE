package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wo2 */
/* loaded from: classes2.dex */
public final class C11212wo2 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public C5037ep2 b;
    public C5037ep2[] c;
    public C6755jp2 d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C11212wo2(int i) {
        super(32);
    }

    public static C11212wo2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C11212wo2 c11212wo2 = new C11212wo2(c1730Ni0.c(e).b);
            c11212wo2.b = C5037ep2.d(c1730Ni0.s(8, true));
            C1730Ni0 s = c1730Ni0.s(16, false);
            int i = s.j(-1).b;
            c11212wo2.c = new C5037ep2[i];
            for (int i2 = 0; i2 < i; i2++) {
                c11212wo2.c[i2] = C5037ep2.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            c11212wo2.d = C6755jp2.d(c1730Ni0.s(24, false));
            return c11212wo2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.k(this.b, 8, true);
        C5037ep2[] c5037ep2Arr = this.c;
        if (c5037ep2Arr == null) {
            t.q(16, false);
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
        t.k(this.d, 24, false);
    }
}
