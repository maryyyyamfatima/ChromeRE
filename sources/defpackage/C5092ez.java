package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ez */
/* loaded from: classes.dex */
public final class C5092ez extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public long b;
    public long c;
    public InterfaceC6356ig0 d;
    public InterfaceC1160Iy e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C5092ez(int i) {
        super(40);
        this.d = C0607Er1.a;
    }

    public static C5092ez d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C5092ez c5092ez = new C5092ez(a.c(f).b);
            c5092ez.b = a.r(8);
            c5092ez.c = a.r(16);
            c5092ez.d = a.w(24, false).W();
            c5092ez.e = (InterfaceC1160Iy) a.t(28, true, AbstractC1939Oy.a);
            return c5092ez;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.f(8, this.b);
        t.f(16, this.c);
        t.h(this.d, 24, false);
        t.i(this.e, 28, true, AbstractC1939Oy.a);
    }
}
