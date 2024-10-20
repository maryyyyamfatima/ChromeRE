package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class M7 extends AbstractC7094ko3 {
    public static final C4638dg0[] l;
    public static final C4638dg0 m;
    public String b;
    public String c;
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

    public M7(int i) {
        super(88);
    }

    public static M7 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            M7 m7 = new M7(c1730Ni0.c(l).b);
            m7.b = c1730Ni0.v(8, false);
            m7.c = c1730Ni0.v(16, false);
            m7.d = c1730Ni0.v(24, false);
            m7.e = c1730Ni0.v(32, false);
            m7.f = c1730Ni0.v(40, false);
            m7.g = c1730Ni0.v(48, false);
            m7.h = c1730Ni0.v(56, false);
            m7.i = c1730Ni0.v(64, false);
            m7.j = c1730Ni0.v(72, false);
            m7.k = c1730Ni0.v(80, false);
            return m7;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(m);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
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
