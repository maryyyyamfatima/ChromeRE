package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fa */
/* loaded from: classes2.dex */
public final class C5288fa extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public C0207Bp1 b;
    public O9 c;
    public C3570aa d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C5288fa(int i) {
        super(32);
    }

    public static C5288fa d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C5288fa c5288fa = new C5288fa(a.c(e).b);
            c5288fa.b = a.p(8);
            c5288fa.c = (O9) a.t(12, false, Z9.a);
            c5288fa.d = C3570aa.d(a.s(24, false));
            return c5288fa;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.j(this.b, 8);
        t.i(this.c, 12, false, Z9.a);
        t.k(this.d, 24, false);
    }
}
