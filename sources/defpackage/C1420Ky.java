package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ky */
/* loaded from: classes.dex */
public final class C1420Ky extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public long b;
    public long c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C1420Ky(int i) {
        super(24);
    }

    public static C1420Ky d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C1420Ky c1420Ky = new C1420Ky(a.c(d).b);
            c1420Ky.b = a.r(8);
            c1420Ky.c = a.r(16);
            return c1420Ky;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.f(8, this.b);
        t.f(16, this.c);
    }
}
