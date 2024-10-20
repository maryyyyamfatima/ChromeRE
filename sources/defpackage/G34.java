package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class G34 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public P34 b;
    public InterfaceC5669gg0 c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public G34(int i) {
        super(24);
        this.c = C0607Er1.a;
    }

    public static G34 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            G34 g34 = new G34(a.c(d).b);
            P34.d(a.s(8, false));
            g34.b = null;
            g34.c = a.w(16, true).n1();
            return g34;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.k(this.b, 8, false);
        t.h(this.c, 16, true);
    }
}
