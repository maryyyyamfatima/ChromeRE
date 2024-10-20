package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rp1 */
/* loaded from: classes2.dex */
public final class C9502rp1 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public String b;
    public InterfaceC11102wV1 c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C9502rp1(int i) {
        super(24);
        this.c = C0607Er1.a;
    }

    public static C9502rp1 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C9502rp1 c9502rp1 = new C9502rp1(a.c(d).b);
            c9502rp1.b = a.v(8, false);
            c9502rp1.c = a.w(16, false).Z();
            return c9502rp1;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.m(this.b, 8, false);
        t.h(this.c, 16, false);
    }
}
