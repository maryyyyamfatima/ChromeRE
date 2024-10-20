package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d14, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4422d14 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public long b;
    public long c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C4422d14(int i) {
        super(24);
    }

    public static C4422d14 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C4422d14 c4422d14 = new C4422d14(c1730Ni0.c(d).b);
            c4422d14.b = c1730Ni0.r(8);
            c4422d14.c = c1730Ni0.r(16);
            return c4422d14;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.f(8, this.b);
        t.f(16, this.c);
    }
}
