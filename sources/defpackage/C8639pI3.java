package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pI3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8639pI3 extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public String[] b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C8639pI3(int i) {
        super(16);
    }

    public static C8639pI3 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C8639pI3 c8639pI3 = new C8639pI3(a.c(c).b);
            C1730Ni0 s = a.s(8, false);
            int i = s.j(-1).b;
            c8639pI3.b = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                c8639pI3.b[i2] = AbstractC7214l9.a(i2, 8, 8, s, false);
            }
            return c8639pI3;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(d);
        String[] strArr = this.b;
        if (strArr == null) {
            t.q(8, false);
            return;
        }
        KA0 r = t.r(strArr.length, 8);
        int i = 0;
        while (true) {
            String[] strArr2 = this.b;
            if (i >= strArr2.length) {
                return;
            }
            r.m(strArr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
