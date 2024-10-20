package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gF1 */
/* loaded from: classes2.dex */
public final class C5529gF1 extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public HU0 b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C5529gF1(int i) {
        super(16);
    }

    public static C5529gF1 d(C8697pU1 c8697pU1) {
        HU0 hu0;
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C5529gF1 c5529gF1 = new C5529gF1(a.c(c).b);
            C1730Ni0 s = a.s(8, false);
            if (s == null) {
                hu0 = null;
            } else {
                s.b();
                try {
                    HU0 hu02 = new HU0(s.c(HU0.d).b);
                    hu02.b = C1063Ie2.d(s.s(8, false));
                    hu02.c = s.v(16, false);
                    s.a();
                    hu0 = hu02;
                } catch (Throwable th) {
                    s.a();
                    throw th;
                }
            }
            c5529gF1.b = hu0;
            return c5529gF1;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        ka0.t(d).k(this.b, 8, false);
    }
}
