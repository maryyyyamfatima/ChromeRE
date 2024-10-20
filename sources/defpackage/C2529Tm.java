package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tm */
/* loaded from: classes.dex */
public final class C2529Tm extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public int b;
    public CY0 c;
    public C5359fl4 d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C2529Tm(int i) {
        super(32);
    }

    public static C2529Tm d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C2529Tm c2529Tm = new C2529Tm(a.c(e).b);
            int o = a.o(8);
            c2529Tm.b = o;
            if (!(o >= 0 && o <= 23)) {
                throw new C12221zl0("Invalid enum value.");
            }
            c2529Tm.b = o;
            c2529Tm.c = CY0.d(a.s(16, true));
            c2529Tm.d = C5359fl4.d(a.s(24, true));
            return c2529Tm;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.b(this.b, 8);
        t.k(this.c, 16, true);
        t.k(this.d, 24, true);
    }
}
