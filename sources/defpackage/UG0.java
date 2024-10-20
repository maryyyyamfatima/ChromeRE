package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class UG0 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public C0207Bp1 b;
    public C6226iH0 c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public UG0(int i) {
        super(24);
    }

    public static UG0 d(C8697pU1 c8697pU1) {
        C6226iH0 c6226iH0;
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            UG0 ug0 = new UG0(a.c(d).b);
            ug0.b = a.p(8);
            C1730Ni0 s = a.s(16, false);
            if (s == null) {
                c6226iH0 = null;
            } else {
                s.b();
                try {
                    C6226iH0 c6226iH02 = new C6226iH0(s.c(C6226iH0.d).b);
                    c6226iH02.b = s.o(8);
                    c6226iH02.c = s.d(12, 0);
                    s.a();
                    c6226iH0 = c6226iH02;
                } catch (Throwable th) {
                    s.a();
                    throw th;
                }
            }
            ug0.c = c6226iH0;
            return ug0;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.j(this.b, 8);
        t.k(this.c, 16, false);
    }
}
