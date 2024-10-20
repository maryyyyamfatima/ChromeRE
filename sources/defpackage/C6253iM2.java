package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iM2 */
/* loaded from: classes.dex */
public final class C6253iM2 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public C1063Ie2 b;
    public boolean c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C6253iM2(int i) {
        super(24);
    }

    public static C6253iM2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C6253iM2 c6253iM2 = new C6253iM2(c1730Ni0.c(d).b);
            c6253iM2.b = C1063Ie2.d(c1730Ni0.s(8, false));
            c6253iM2.c = c1730Ni0.d(16, 0);
            return c6253iM2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.k(this.b, 8, false);
        t.d(16, 0, this.c);
    }
}
