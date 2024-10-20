package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i42 */
/* loaded from: classes2.dex */
public final class C6157i42 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public int[] b;
    public String c;
    public C5457g22 d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C6157i42(int i) {
        super(32);
    }

    public static C6157i42 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C6157i42 c6157i42 = new C6157i42(a.c(e).b);
            c6157i42.b = a.q(8, 0);
            c6157i42.c = a.v(16, true);
            c6157i42.d = C5457g22.d(a.s(24, false));
            return c6157i42;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.o(this.b, 8, 0);
        t.m(this.c, 16, true);
        t.k(this.d, 24, false);
    }
}
