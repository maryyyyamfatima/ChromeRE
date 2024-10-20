package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w73 */
/* loaded from: classes2.dex */
public final class C10981w73 extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public String b;
    public String c;
    public U24 d;
    public E83[] e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C10981w73(int i) {
        super(40);
    }

    public static C10981w73 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C10981w73 c10981w73 = new C10981w73(a.c(f).b);
            c10981w73.b = a.v(8, false);
            c10981w73.c = a.v(16, false);
            c10981w73.d = U24.d(a.s(24, false));
            C1730Ni0 s = a.s(32, false);
            int i = s.j(-1).b;
            c10981w73.e = new E83[i];
            for (int i2 = 0; i2 < i; i2++) {
                c10981w73.e[i2] = E83.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return c10981w73;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
        t.k(this.d, 24, false);
        E83[] e83Arr = this.e;
        if (e83Arr == null) {
            t.q(32, false);
            return;
        }
        KA0 r = t.r(e83Arr.length, 32);
        int i = 0;
        while (true) {
            E83[] e83Arr2 = this.e;
            if (i >= e83Arr2.length) {
                return;
            }
            r.k(e83Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
