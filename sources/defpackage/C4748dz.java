package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dz */
/* loaded from: classes.dex */
public final class C4748dz extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public InterfaceC6356ig0 b;
    public InterfaceC1160Iy c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C4748dz(int i) {
        super(24);
        this.b = C0607Er1.a;
    }

    public static C4748dz d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C4748dz c4748dz = new C4748dz(a.c(d).b);
            c4748dz.b = a.w(8, false).W();
            c4748dz.c = (InterfaceC1160Iy) a.t(12, true, AbstractC1939Oy.a);
            return c4748dz;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.h(this.b, 8, false);
        t.i(this.c, 12, true, AbstractC1939Oy.a);
    }
}
