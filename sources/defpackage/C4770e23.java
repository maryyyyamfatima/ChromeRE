package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e23 */
/* loaded from: classes2.dex */
public final class C4770e23 extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public C10772vY b;
    public byte[] c;
    public int d;
    public byte[] e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C4770e23(int i) {
        super(40);
    }

    public static C4770e23 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C4770e23 c4770e23 = new C4770e23(c1730Ni0.c(f).b);
            c4770e23.b = C10772vY.d(c1730Ni0.s(8, false));
            c4770e23.c = c1730Ni0.e(16, 0, -1);
            int o = c1730Ni0.o(24);
            c4770e23.d = o;
            AbstractC0060Am.a(o);
            c4770e23.d = c4770e23.d;
            c4770e23.e = c1730Ni0.e(32, 1, -1);
            return c4770e23;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.k(this.b, 8, false);
        t.c(16, 0, -1, this.c);
        t.b(this.d, 24);
        t.c(32, 1, -1, this.e);
    }
}
