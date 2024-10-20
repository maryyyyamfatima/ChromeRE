package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gz2 */
/* loaded from: classes.dex */
public final class C5783gz2 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public byte[] b;
    public byte[] c;
    public byte[] d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C5783gz2(int i) {
        super(32);
    }

    public static C5783gz2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C5783gz2 c5783gz2 = new C5783gz2(c1730Ni0.c(e).b);
            c5783gz2.b = c1730Ni0.e(8, 1, -1);
            c5783gz2.c = c1730Ni0.e(16, 0, 32);
            c5783gz2.d = c1730Ni0.e(24, 1, 32);
            return c5783gz2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.c(8, 1, -1, this.b);
        t.c(16, 0, 32, this.c);
        t.c(24, 1, 32, this.d);
    }
}
