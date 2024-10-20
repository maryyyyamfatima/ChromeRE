package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kn1 */
/* loaded from: classes2.dex */
public final class C7086kn1 extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public WL2[] b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C7086kn1(int i) {
        super(16);
    }

    public static C7086kn1 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C7086kn1 c7086kn1 = new C7086kn1(a.c(c).b);
            C1730Ni0 s = a.s(8, false);
            int i = s.j(-1).b;
            c7086kn1.b = new WL2[i];
            for (int i2 = 0; i2 < i; i2++) {
                c7086kn1.b[i2] = WL2.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return c7086kn1;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(d);
        WL2[] wl2Arr = this.b;
        if (wl2Arr == null) {
            t.q(8, false);
            return;
        }
        KA0 r = t.r(wl2Arr.length, 8);
        int i = 0;
        while (true) {
            WL2[] wl2Arr2 = this.b;
            if (i >= wl2Arr2.length) {
                return;
            }
            r.k(wl2Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
