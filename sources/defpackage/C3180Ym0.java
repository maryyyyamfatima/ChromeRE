package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ym0 */
/* loaded from: classes2.dex */
public final class C3180Ym0 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public int b;
    public InterfaceC0711Fm0 c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C3180Ym0(int i) {
        super(24);
    }

    public static C3180Ym0 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C3180Ym0 c3180Ym0 = new C3180Ym0(a.c(d).b);
            c3180Ym0.b = a.o(8);
            c3180Ym0.c = (InterfaceC0711Fm0) a.t(12, true, AbstractC11890yn0.a);
            return c3180Ym0;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.b(this.b, 8);
        t.i(this.c, 12, true, AbstractC11890yn0.a);
    }
}
