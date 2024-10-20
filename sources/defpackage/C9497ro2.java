package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ro2 */
/* loaded from: classes.dex */
public final class C9497ro2 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public String b;
    public U24 c;
    public boolean d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C9497ro2(int i) {
        super(32);
    }

    public static C9497ro2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C9497ro2 c9497ro2 = new C9497ro2(c1730Ni0.c(e).b);
            c9497ro2.b = c1730Ni0.v(8, false);
            c9497ro2.c = U24.d(c1730Ni0.s(16, false));
            c9497ro2.d = c1730Ni0.d(24, 0);
            return c9497ro2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.m(this.b, 8, false);
        t.k(this.c, 16, false);
        t.d(24, 0, this.d);
    }
}
