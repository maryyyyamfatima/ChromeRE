package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D74 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public int b;
    public short c;
    public short d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public D74(int i) {
        super(16);
    }

    public static D74 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            D74 d74 = new D74(c1730Ni0.c(e).b);
            d74.b = c1730Ni0.o(8);
            d74.c = c1730Ni0.u(12);
            d74.d = c1730Ni0.u(14);
            return d74;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.b(this.b, 8);
        t.n(this.c, 12);
        t.n(this.d, 14);
    }
}
