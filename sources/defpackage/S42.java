package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class S42 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public C5457g22 b;
    public C6487j22 c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public S42(int i) {
        super(24);
    }

    public static S42 d(C8697pU1 c8697pU1) {
        C6487j22 c6487j22;
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            S42 s42 = new S42(a.c(d).b);
            s42.b = C5457g22.d(a.s(8, false));
            C1730Ni0 s = a.s(16, true);
            if (s == null) {
                c6487j22 = null;
            } else {
                s.b();
                try {
                    C6487j22 c6487j222 = new C6487j22(s.c(C6487j22.c).b);
                    c6487j222.b = s.d(8, 0);
                    s.a();
                    c6487j22 = c6487j222;
                } catch (Throwable th) {
                    s.a();
                    throw th;
                }
            }
            s42.c = c6487j22;
            return s42;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.k(this.b, 8, false);
        t.k(this.c, 16, true);
    }
}
