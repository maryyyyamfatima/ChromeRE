package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nq2 */
/* loaded from: classes2.dex */
public final class C8137nq2 extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public InterfaceC9161qp2 b;
    public C6755jp2[] c;
    public C10869vo2 d;
    public C7787mp2 e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C8137nq2(int i) {
        super(40);
    }

    public static C8137nq2 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C8137nq2 c8137nq2 = new C8137nq2(a.c(f).b);
            c8137nq2.b = (InterfaceC9161qp2) a.t(8, false, AbstractC0728Fp2.a);
            C1730Ni0 s = a.s(16, false);
            int i = s.j(-1).b;
            c8137nq2.c = new C6755jp2[i];
            for (int i2 = 0; i2 < i; i2++) {
                c8137nq2.c[i2] = C6755jp2.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            c8137nq2.d = C10869vo2.d(a.s(24, false));
            c8137nq2.e = C7787mp2.d(a.s(32, false));
            return c8137nq2;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.i(this.b, 8, false, AbstractC0728Fp2.a);
        C6755jp2[] c6755jp2Arr = this.c;
        if (c6755jp2Arr == null) {
            t.q(16, false);
        } else {
            KA0 r = t.r(c6755jp2Arr.length, 16);
            int i = 0;
            while (true) {
                C6755jp2[] c6755jp2Arr2 = this.c;
                if (i >= c6755jp2Arr2.length) {
                    break;
                }
                r.k(c6755jp2Arr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        t.k(this.d, 24, false);
        t.k(this.e, 32, false);
    }
}
