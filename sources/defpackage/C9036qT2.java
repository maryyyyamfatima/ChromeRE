package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qT2 */
/* loaded from: classes2.dex */
public final class C9036qT2 extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public CM0 b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C9036qT2(int i) {
        super(16);
    }

    public static C9036qT2 d(C1730Ni0 c1730Ni0) {
        CM0 cm0 = null;
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C9036qT2 c9036qT2 = new C9036qT2(c1730Ni0.c(c).b);
            C1730Ni0 s = c1730Ni0.s(8, false);
            if (s != null) {
                s.b();
                try {
                    CM0 cm02 = new CM0(s.c(CM0.c).b);
                    cm02.b = s.v(8, false);
                    s.a();
                    cm0 = cm02;
                } catch (Throwable th) {
                    s.a();
                    throw th;
                }
            }
            c9036qT2.b = cm0;
            return c9036qT2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        ka0.t(d).k(this.b, 8, false);
    }
}
