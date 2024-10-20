package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class F34 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public O34 b;
    public P34 c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public F34(int i) {
        super(24);
    }

    public static F34 d(C8697pU1 c8697pU1) {
        O34 o34;
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            F34 f34 = new F34(a.c(d).b);
            C1730Ni0 s = a.s(8, false);
            if (s == null) {
                o34 = null;
            } else {
                s.b();
                try {
                    o34 = new O34(s.c(O34.b).b);
                } finally {
                    s.a();
                }
            }
            f34.b = o34;
            P34.d(a.s(16, false));
            f34.c = null;
            return f34;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.k(this.b, 8, false);
        t.k(this.c, 16, false);
    }
}
