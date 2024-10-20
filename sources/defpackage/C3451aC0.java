package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aC0 */
/* loaded from: classes2.dex */
public final class C3451aC0 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public String b;
    public C10327uD2[] c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C3451aC0(int i) {
        super(24);
    }

    public static C3451aC0 d(C1730Ni0 c1730Ni0) {
        C10327uD2 c10327uD2;
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C3451aC0 c3451aC0 = new C3451aC0(c1730Ni0.c(d).b);
            c3451aC0.b = c1730Ni0.v(8, false);
            C1730Ni0 s = c1730Ni0.s(16, false);
            int i = s.j(-1).b;
            c3451aC0.c = new C10327uD2[i];
            for (int i2 = 0; i2 < i; i2++) {
                C1730Ni0 a = AbstractC7558m9.a(i2, 8, 8, s, false);
                C10327uD2[] c10327uD2Arr = c3451aC0.c;
                if (a == null) {
                    c10327uD2 = null;
                } else {
                    a.b();
                    try {
                        c10327uD2 = new C10327uD2(a.c(C10327uD2.d).b);
                        c10327uD2.b = a.v(8, false);
                        c10327uD2.c = O74.b(a);
                    } finally {
                    }
                }
                c10327uD2Arr[i2] = c10327uD2;
            }
            return c3451aC0;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.m(this.b, 8, false);
        C10327uD2[] c10327uD2Arr = this.c;
        if (c10327uD2Arr == null) {
            t.q(16, false);
            return;
        }
        KA0 r = t.r(c10327uD2Arr.length, 16);
        int i = 0;
        while (true) {
            C10327uD2[] c10327uD2Arr2 = this.c;
            if (i >= c10327uD2Arr2.length) {
                return;
            }
            r.k(c10327uD2Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
