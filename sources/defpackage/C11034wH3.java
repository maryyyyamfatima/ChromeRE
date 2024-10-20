package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wH3 */
/* loaded from: classes2.dex */
public final class C11034wH3 extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public C9319rH3[] b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C11034wH3(int i) {
        super(16);
    }

    public static C11034wH3 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C11034wH3 c11034wH3 = new C11034wH3(a.c(c).b);
            C1730Ni0 s = a.s(8, false);
            int i = s.j(-1).b;
            c11034wH3.b = new C9319rH3[i];
            for (int i2 = 0; i2 < i; i2++) {
                c11034wH3.b[i2] = C9319rH3.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return c11034wH3;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(d);
        C9319rH3[] c9319rH3Arr = this.b;
        if (c9319rH3Arr == null) {
            t.q(8, false);
            return;
        }
        KA0 r = t.r(c9319rH3Arr.length, 8);
        int i = 0;
        while (true) {
            C9319rH3[] c9319rH3Arr2 = this.b;
            if (i >= c9319rH3Arr2.length) {
                return;
            }
            r.k(c9319rH3Arr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
