package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yV1 */
/* loaded from: classes.dex */
public final class C11788yV1 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public InterfaceC11102wV1 b;
    public C4422d14 c;
    public long d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C11788yV1(int i) {
        super(32);
        this.b = C0607Er1.a;
    }

    public static C11788yV1 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C11788yV1 c11788yV1 = new C11788yV1(c1730Ni0.c(e).b);
            c11788yV1.b = c1730Ni0.w(8, false).Z();
            c11788yV1.c = C4422d14.d(c1730Ni0.s(16, false));
            c11788yV1.d = c1730Ni0.r(24);
            return c11788yV1;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.h(this.b, 8, false);
        t.k(this.c, 16, false);
        t.f(24, this.d);
    }
}
