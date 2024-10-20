package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ln0 */
/* loaded from: classes2.dex */
public final class C7429ln0 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public int b;
    public C0092As1[] c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C7429ln0(int i) {
        super(24);
    }

    public static C7429ln0 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C7429ln0 c7429ln0 = new C7429ln0(a.c(d).b);
            c7429ln0.b = a.o(8);
            C1730Ni0 s = a.s(16, false);
            int i = s.j(-1).b;
            c7429ln0.c = new C0092As1[i];
            for (int i2 = 0; i2 < i; i2++) {
                c7429ln0.c[i2] = C0092As1.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return c7429ln0;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.b(this.b, 8);
        C0092As1[] c0092As1Arr = this.c;
        if (c0092As1Arr == null) {
            t.q(16, false);
            return;
        }
        KA0 r = t.r(c0092As1Arr.length, 16);
        int i = 0;
        while (true) {
            C0092As1[] c0092As1Arr2 = this.c;
            if (i >= c0092As1Arr2.length) {
                return;
            }
            r.k(c0092As1Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
