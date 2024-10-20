package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yp2 */
/* loaded from: classes2.dex */
public final class C11904yp2 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public String b;
    public String c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C11904yp2(int i) {
        super(24);
    }

    public static C11904yp2 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C11904yp2 c11904yp2 = new C11904yp2(a.c(d).b);
            c11904yp2.b = a.v(8, false);
            c11904yp2.c = a.v(16, false);
            return c11904yp2;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
    }
}
