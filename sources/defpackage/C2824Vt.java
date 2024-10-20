package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vt */
/* loaded from: classes2.dex */
public final class C2824Vt extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public C2434St[] b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C2824Vt(int i) {
        super(16);
    }

    public static C2824Vt d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C2824Vt c2824Vt = new C2824Vt(a.c(c).b);
            C1730Ni0 s = a.s(8, false);
            int i = s.j(-1).b;
            c2824Vt.b = new C2434St[i];
            for (int i2 = 0; i2 < i; i2++) {
                c2824Vt.b[i2] = C2434St.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            return c2824Vt;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(d);
        C2434St[] c2434StArr = this.b;
        if (c2434StArr == null) {
            t.q(8, false);
            return;
        }
        KA0 r = t.r(c2434StArr.length, 8);
        int i = 0;
        while (true) {
            C2434St[] c2434StArr2 = this.b;
            if (i >= c2434StArr2.length) {
                return;
            }
            r.k(c2434StArr2[i], (i * 8) + 8, false);
            i++;
        }
    }
}
