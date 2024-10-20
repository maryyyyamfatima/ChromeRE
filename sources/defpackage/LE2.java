package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LE2 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public int b;
    public int c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public LE2(int i) {
        super(16);
    }

    public static LE2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            LE2 le2 = new LE2(c1730Ni0.c(d).b);
            int o = c1730Ni0.o(8);
            le2.b = o;
            if (!(o >= 0 && o <= 0)) {
                throw new C12221zl0("Invalid enum value.");
            }
            le2.b = o;
            le2.c = c1730Ni0.o(12);
            return le2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.b(this.b, 8);
        t.b(this.c, 12);
    }
}
