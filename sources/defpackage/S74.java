package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class S74 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public String b;
    public String[] c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public S74(int i) {
        super(24);
    }

    public static S74 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            S74 s74 = new S74(c1730Ni0.c(d).b);
            s74.b = c1730Ni0.v(8, false);
            C1730Ni0 s = c1730Ni0.s(16, false);
            int i = s.j(-1).b;
            s74.c = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                s74.c[i2] = AbstractC7214l9.a(i2, 8, 8, s, false);
            }
            return s74;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.m(this.b, 8, false);
        String[] strArr = this.c;
        if (strArr == null) {
            t.q(16, false);
            return;
        }
        KA0 r = t.r(strArr.length, 16);
        int i = 0;
        while (true) {
            String[] strArr2 = this.c;
            if (i >= strArr2.length) {
                return;
            }
            r.m(strArr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
