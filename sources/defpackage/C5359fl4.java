package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fl4 */
/* loaded from: classes.dex */
public final class C5359fl4 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public String b;
    public String c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C5359fl4(int i) {
        super(24);
    }

    public static C5359fl4 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C5359fl4 c5359fl4 = new C5359fl4(c1730Ni0.c(d).b);
            c5359fl4.b = c1730Ni0.v(8, false);
            c5359fl4.c = c1730Ni0.v(16, false);
            return c5359fl4;
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
