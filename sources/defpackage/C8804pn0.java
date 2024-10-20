package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pn0 */
/* loaded from: classes2.dex */
public final class C8804pn0 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public int b;
    public C5874hF2[] c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C8804pn0(int i) {
        super(24);
    }

    public static C8804pn0 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C8804pn0 c8804pn0 = new C8804pn0(a.c(d).b);
            c8804pn0.b = a.o(8);
            C1730Ni0 s = a.s(16, false);
            int i = s.j(-1).b;
            c8804pn0.c = new C5874hF2[i];
            for (int i2 = 0; i2 < i; i2++) {
                c8804pn0.c[i2] = C5874hF2.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return c8804pn0;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.b(this.b, 8);
        C5874hF2[] c5874hF2Arr = this.c;
        if (c5874hF2Arr == null) {
            t.q(16, false);
            return;
        }
        KA0 r = t.r(c5874hF2Arr.length, 16);
        int i = 0;
        while (true) {
            C5874hF2[] c5874hF2Arr2 = this.c;
            if (i >= c5874hF2Arr2.length) {
                return;
            }
            r.k(c5874hF2Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
