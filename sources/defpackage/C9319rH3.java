package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rH3 */
/* loaded from: classes2.dex */
public final class C9319rH3 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public String b;
    public KI2 c;
    public C2452Sw2[] d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C9319rH3(int i) {
        super(32);
    }

    public static C9319rH3 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C9319rH3 c9319rH3 = new C9319rH3(c1730Ni0.c(e).b);
            c9319rH3.b = c1730Ni0.v(8, false);
            c9319rH3.c = KI2.d(c1730Ni0.s(16, false));
            C1730Ni0 s = c1730Ni0.s(24, false);
            int i = s.j(-1).b;
            c9319rH3.d = new C2452Sw2[i];
            for (int i2 = 0; i2 < i; i2++) {
                c9319rH3.d[i2] = C2452Sw2.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return c9319rH3;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.m(this.b, 8, false);
        t.k(this.c, 16, false);
        C2452Sw2[] c2452Sw2Arr = this.d;
        if (c2452Sw2Arr == null) {
            t.q(24, false);
            return;
        }
        KA0 r = t.r(c2452Sw2Arr.length, 24);
        int i = 0;
        while (true) {
            C2452Sw2[] c2452Sw2Arr2 = this.d;
            if (i >= c2452Sw2Arr2.length) {
                return;
            }
            r.k(c2452Sw2Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
