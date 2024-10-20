package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kt */
/* loaded from: classes2.dex */
public final class C1395Kt extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public C0207Bp1 b;
    public C4377cu c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C1395Kt(int i) {
        super(24);
    }

    public static C1395Kt d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C1395Kt c1395Kt = new C1395Kt(a.c(d).b);
            c1395Kt.b = a.p(8);
            c1395Kt.c = C4377cu.d(a.s(16, false));
            return c1395Kt;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.j(this.b, 8);
        t.k(this.c, 16, false);
    }
}
