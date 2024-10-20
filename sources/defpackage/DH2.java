package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class DH2 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public V14 b;
    public boolean c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public DH2(int i) {
        super(16);
        this.b = C0607Er1.a;
    }

    public static DH2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            DH2 dh2 = new DH2(c1730Ni0.c(d).b);
            dh2.b = c1730Ni0.w(8, false);
            dh2.c = c1730Ni0.d(12, 0);
            return dh2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.h(this.b, 8, false);
        t.d(12, 0, this.c);
    }
}
