package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: so2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9840so2 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public String b;
    public String c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C9840so2(int i) {
        super(24);
    }

    public static C9840so2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C9840so2 c9840so2 = new C9840so2(c1730Ni0.c(d).b);
            c9840so2.b = c1730Ni0.v(8, false);
            c9840so2.c = c1730Ni0.v(16, false);
            return c9840so2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
    }
}