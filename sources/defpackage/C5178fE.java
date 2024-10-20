package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fE */
/* loaded from: classes.dex */
public final class C5178fE extends AbstractC7094ko3 {
    public static final C4638dg0[] h;
    public static final C4638dg0 i;
    public byte b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(56, 0);
        h = new C4638dg0[]{c4638dg0};
        i = c4638dg0;
    }

    public C5178fE(int i2) {
        super(56);
    }

    public static C5178fE d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C5178fE c5178fE = new C5178fE(c1730Ni0.c(h).b);
            c1730Ni0.x(8, 1);
            c5178fE.b = c1730Ni0.a.a.get(c1730Ni0.b + 8);
            c5178fE.c = c1730Ni0.e(16, 1, 16);
            c5178fE.d = c1730Ni0.e(24, 1, 16);
            c5178fE.e = c1730Ni0.e(32, 1, 32);
            c5178fE.f = c1730Ni0.e(40, 1, -1);
            c5178fE.g = c1730Ni0.e(48, 1, -1);
            return c5178fE;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(i);
        t.b.b.put(t.a + 8, this.b);
        t.c(16, 1, 16, this.c);
        t.c(24, 1, 16, this.d);
        t.c(32, 1, 32, this.e);
        t.c(40, 1, -1, this.f);
        t.c(48, 1, -1, this.g);
    }
}
