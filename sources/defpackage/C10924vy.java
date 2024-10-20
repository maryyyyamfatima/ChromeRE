package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10924vy extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public C11267wy b;
    public C1544Lx c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C10924vy(int i) {
        super(32);
    }

    public static C10924vy d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C10924vy c10924vy = new C10924vy(c1730Ni0.c(d).b);
            c10924vy.b = C11267wy.d(c1730Ni0.s(8, false));
            c10924vy.c = C1544Lx.b(c1730Ni0, 16);
            return c10924vy;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.k(this.b, 8, false);
        t.l(this.c, 16, false);
    }
}
