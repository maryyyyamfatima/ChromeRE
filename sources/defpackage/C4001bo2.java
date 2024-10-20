package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bo2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4001bo2 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public String b;
    public String c;
    public String d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C4001bo2(int i) {
        super(32);
    }

    public static C4001bo2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C4001bo2 c4001bo2 = new C4001bo2(c1730Ni0.c(e).b);
            c4001bo2.b = c1730Ni0.v(8, true);
            c4001bo2.c = c1730Ni0.v(16, true);
            c4001bo2.d = c1730Ni0.v(24, true);
            return c4001bo2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.m(this.b, 8, true);
        t.m(this.c, 16, true);
        t.m(this.d, 24, true);
    }
}
