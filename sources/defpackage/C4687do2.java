package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: do2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4687do2 extends AbstractC7094ko3 {
    public static final C4638dg0[] l;
    public static final C4638dg0 m;
    public String b;
    public String[] c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(88, 0);
        l = new C4638dg0[]{c4638dg0};
        m = c4638dg0;
    }

    public C4687do2(int i) {
        super(88);
    }

    public static C4687do2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C4687do2 c4687do2 = new C4687do2(c1730Ni0.c(l).b);
            c4687do2.b = c1730Ni0.v(8, false);
            C1730Ni0 s = c1730Ni0.s(16, false);
            int i = s.j(-1).b;
            c4687do2.c = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                c4687do2.c[i2] = AbstractC7214l9.a(i2, 8, 8, s, false);
            }
            c4687do2.d = c1730Ni0.v(24, false);
            c4687do2.e = c1730Ni0.v(32, false);
            c4687do2.f = c1730Ni0.v(40, false);
            c4687do2.g = c1730Ni0.v(48, false);
            c4687do2.h = c1730Ni0.v(56, false);
            c4687do2.i = c1730Ni0.v(64, false);
            c4687do2.j = c1730Ni0.v(72, false);
            c4687do2.k = c1730Ni0.v(80, false);
            return c4687do2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(m);
        t.m(this.b, 8, false);
        String[] strArr = this.c;
        if (strArr == null) {
            t.q(16, false);
        } else {
            KA0 r = t.r(strArr.length, 16);
            int i = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i >= strArr2.length) {
                    break;
                }
                r.m(strArr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        t.m(this.d, 24, false);
        t.m(this.e, 32, false);
        t.m(this.f, 40, false);
        t.m(this.g, 48, false);
        t.m(this.h, 56, false);
        t.m(this.i, 64, false);
        t.m(this.j, 72, false);
        t.m(this.k, 80, false);
    }
}
