package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vY */
/* loaded from: classes.dex */
public final class C10772vY extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public String b;
    public byte[] c;
    public byte[] d;
    public byte[] e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C10772vY(int i) {
        super(40);
    }

    public static C10772vY d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C10772vY c10772vY = new C10772vY(c1730Ni0.c(f).b);
            c10772vY.b = c1730Ni0.v(8, false);
            c10772vY.c = c1730Ni0.e(16, 0, -1);
            c10772vY.d = c1730Ni0.e(24, 0, -1);
            c10772vY.e = c1730Ni0.e(32, 0, -1);
            return c10772vY;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.m(this.b, 8, false);
        t.c(16, 0, -1, this.c);
        t.c(24, 0, -1, this.d);
        t.c(32, 0, -1, this.e);
    }
}
