package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class KI2 extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public float b;
    public float c;
    public float d;
    public float e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public KI2(int i) {
        super(24);
    }

    public static KI2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            KI2 ki2 = new KI2(c1730Ni0.c(f).b);
            ki2.b = c1730Ni0.m(8);
            ki2.c = c1730Ni0.m(12);
            ki2.d = c1730Ni0.m(16);
            ki2.e = c1730Ni0.m(20);
            return ki2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.a(8, this.b);
        t.a(12, this.c);
        t.a(16, this.d);
        t.a(20, this.e);
    }
}
