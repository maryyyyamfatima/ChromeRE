package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uy */
/* loaded from: classes.dex */
public final class C2719Uy extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public long b;
    public IM3 c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C2719Uy(int i) {
        super(24);
    }

    public static C2719Uy d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C2719Uy c2719Uy = new C2719Uy(a.c(d).b);
            c2719Uy.b = a.r(8);
            c2719Uy.c = IM3.d(a.s(16, true));
            return c2719Uy;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.f(8, this.b);
        t.k(this.c, 16, true);
    }
}
