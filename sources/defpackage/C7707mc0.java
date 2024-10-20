package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mc0 */
/* loaded from: classes2.dex */
public final class C7707mc0 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public String[] b;
    public boolean c;
    public boolean d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C7707mc0(int i) {
        super(24);
        this.c = false;
        this.d = false;
    }

    public static C7707mc0 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C7707mc0 c7707mc0 = new C7707mc0(c1730Ni0.c(e).b);
            C1730Ni0 s = c1730Ni0.s(8, false);
            int i = s.j(-1).b;
            c7707mc0.b = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                c7707mc0.b[i2] = AbstractC7214l9.a(i2, 8, 8, s, false);
            }
            c7707mc0.c = c1730Ni0.d(16, 0);
            c7707mc0.d = c1730Ni0.d(16, 1);
            return c7707mc0;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        String[] strArr = this.b;
        if (strArr == null) {
            t.q(8, false);
        } else {
            KA0 r = t.r(strArr.length, 8);
            int i = 0;
            while (true) {
                String[] strArr2 = this.b;
                if (i >= strArr2.length) {
                    break;
                }
                r.m(strArr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        t.d(16, 0, this.c);
        t.d(16, 1, this.d);
    }
}
