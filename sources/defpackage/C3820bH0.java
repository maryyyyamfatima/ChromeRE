package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bH0 */
/* loaded from: classes2.dex */
public final class C3820bH0 extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public YG0[] b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C3820bH0(int i) {
        super(16);
    }

    public static C3820bH0 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C3820bH0 c3820bH0 = new C3820bH0(a.c(c).b);
            C1730Ni0 s = a.s(8, false);
            int i = s.j(-1).b;
            c3820bH0.b = new YG0[i];
            for (int i2 = 0; i2 < i; i2++) {
                c3820bH0.b[i2] = YG0.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return c3820bH0;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(d);
        YG0[] yg0Arr = this.b;
        if (yg0Arr == null) {
            t.q(8, false);
            return;
        }
        KA0 r = t.r(yg0Arr.length, 8);
        int i = 0;
        while (true) {
            YG0[] yg0Arr2 = this.b;
            if (i >= yg0Arr2.length) {
                return;
            }
            r.k(yg0Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
