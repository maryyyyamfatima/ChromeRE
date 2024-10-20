package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jn1 */
/* loaded from: classes2.dex */
public final class C6742jn1 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public WL2[] b;
    public U24 c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C6742jn1(int i) {
        super(24);
    }

    public static C6742jn1 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C6742jn1 c6742jn1 = new C6742jn1(a.c(d).b);
            C1730Ni0 s = a.s(8, false);
            int i = s.j(-1).b;
            c6742jn1.b = new WL2[i];
            for (int i2 = 0; i2 < i; i2++) {
                c6742jn1.b[i2] = WL2.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            c6742jn1.c = U24.d(a.s(16, false));
            return c6742jn1;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        WL2[] wl2Arr = this.b;
        if (wl2Arr == null) {
            t.q(8, false);
        } else {
            KA0 r = t.r(wl2Arr.length, 8);
            int i = 0;
            while (true) {
                WL2[] wl2Arr2 = this.b;
                if (i >= wl2Arr2.length) {
                    break;
                }
                r.k(wl2Arr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        t.k(this.c, 16, false);
    }
}
