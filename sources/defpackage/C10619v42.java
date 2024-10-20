package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v42 */
/* loaded from: classes2.dex */
public final class C10619v42 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public int b;
    public C0207Bp1 c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C10619v42(int i) {
        super(16);
    }

    public static C10619v42 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C10619v42 c10619v42 = new C10619v42(a.c(d).b);
            c10619v42.b = a.o(8);
            c10619v42.c = a.p(12);
            return c10619v42;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.b(this.b, 8);
        t.j(this.c, 12);
    }
}
