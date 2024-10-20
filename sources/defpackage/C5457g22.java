package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g22, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5457g22 extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public C6145i22[] b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C5457g22(int i) {
        super(16);
    }

    public static C5457g22 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C5457g22 c5457g22 = new C5457g22(c1730Ni0.c(c).b);
            C1730Ni0 s = c1730Ni0.s(8, false);
            int i = s.j(-1).b;
            c5457g22.b = new C6145i22[i];
            for (int i2 = 0; i2 < i; i2++) {
                c5457g22.b[i2] = C6145i22.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return c5457g22;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(d);
        C6145i22[] c6145i22Arr = this.b;
        if (c6145i22Arr == null) {
            t.q(8, false);
            return;
        }
        KA0 r = t.r(c6145i22Arr.length, 8);
        int i = 0;
        while (true) {
            C6145i22[] c6145i22Arr2 = this.b;
            if (i >= c6145i22Arr2.length) {
                return;
            }
            r.k(c6145i22Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
