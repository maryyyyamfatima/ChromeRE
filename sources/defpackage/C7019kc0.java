package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kc0 */
/* loaded from: classes2.dex */
public final class C7019kc0 extends AbstractC7094ko3 {
    public static final C4638dg0[] h;
    public static final C4638dg0 i;
    public String b;
    public String c;
    public int d;
    public String e;
    public boolean f;
    public boolean g;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        h = new C4638dg0[]{c4638dg0};
        i = c4638dg0;
    }

    public C7019kc0(int i2) {
        super(40);
        this.d = -1;
        this.f = false;
        this.g = false;
    }

    public static C7019kc0 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C7019kc0 c7019kc0 = new C7019kc0(c1730Ni0.c(h).b);
            c7019kc0.b = c1730Ni0.v(8, false);
            c7019kc0.c = c1730Ni0.v(16, false);
            c7019kc0.d = c1730Ni0.o(24);
            c7019kc0.f = c1730Ni0.d(28, 0);
            c7019kc0.g = c1730Ni0.d(28, 1);
            c7019kc0.e = c1730Ni0.v(32, false);
            return c7019kc0;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(i);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
        t.b(this.d, 24);
        t.d(28, 0, this.f);
        t.d(28, 1, this.g);
        t.m(this.e, 32, false);
    }
}
