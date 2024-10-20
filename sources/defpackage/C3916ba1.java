package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ba1 */
/* loaded from: classes2.dex */
public final class C3916ba1 extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public C3572aa1[] b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C3916ba1(int i) {
        super(16);
    }

    public static C3916ba1 d(C1730Ni0 c1730Ni0) {
        C3572aa1 c3572aa1;
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C3916ba1 c3916ba1 = new C3916ba1(c1730Ni0.c(c).b);
            C1730Ni0 s = c1730Ni0.s(8, false);
            int i = s.j(-1).b;
            c3916ba1.b = new C3572aa1[i];
            for (int i2 = 0; i2 < i; i2++) {
                C1730Ni0 a = AbstractC7558m9.a(i2, 8, 8, s, false);
                C3572aa1[] c3572aa1Arr = c3916ba1.b;
                if (a == null) {
                    c3572aa1 = null;
                } else {
                    a.b();
                    try {
                        c3572aa1 = new C3572aa1(a.c(C3572aa1.d).b);
                        c3572aa1.b = a.v(8, false);
                        c3572aa1.c = a.v(16, false);
                    } finally {
                    }
                }
                c3572aa1Arr[i2] = c3572aa1;
            }
            return c3916ba1;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(d);
        C3572aa1[] c3572aa1Arr = this.b;
        if (c3572aa1Arr == null) {
            t.q(8, false);
            return;
        }
        KA0 r = t.r(c3572aa1Arr.length, 8);
        int i = 0;
        while (true) {
            C3572aa1[] c3572aa1Arr2 = this.b;
            if (i >= c3572aa1Arr2.length) {
                return;
            }
            r.k(c3572aa1Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
