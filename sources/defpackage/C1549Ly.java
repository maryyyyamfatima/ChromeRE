package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ly */
/* loaded from: classes.dex */
public final class C1549Ly extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public int b;
    public long c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C1549Ly(int i) {
        super(24);
    }

    public static C1549Ly d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C1549Ly c1549Ly = new C1549Ly(a.c(d).b);
            c1549Ly.b = a.o(8);
            c1549Ly.c = a.r(16);
            return c1549Ly;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.b(this.b, 8);
        t.f(16, this.c);
    }
}
