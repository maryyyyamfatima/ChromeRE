package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class E83 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public C9036qT2 b;
    public C6500j43 c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public E83(int i) {
        super(24);
    }

    public static E83 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            E83 e83 = new E83(c1730Ni0.c(d).b);
            e83.b = C9036qT2.d(c1730Ni0.s(8, false));
            e83.c = C6500j43.d(c1730Ni0.s(16, false));
            return e83;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.k(this.b, 8, false);
        t.k(this.c, 16, false);
    }
}
