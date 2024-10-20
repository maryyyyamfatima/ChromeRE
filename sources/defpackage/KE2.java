package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KE2 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public int b;
    public byte[] c;
    public int[] d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public KE2(int i) {
        super(32);
    }

    public static KE2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            KE2 ke2 = new KE2(c1730Ni0.c(e).b);
            int o = c1730Ni0.o(8);
            ke2.b = o;
            if (!(o >= 0 && o <= 0)) {
                throw new C12221zl0("Invalid enum value.");
            }
            ke2.b = o;
            ke2.c = c1730Ni0.e(16, 0, -1);
            ke2.d = c1730Ni0.q(24, 0);
            int i = 0;
            while (true) {
                int[] iArr = ke2.d;
                if (i >= iArr.length) {
                    return ke2;
                }
                int i2 = iArr[i];
                if (!(i2 >= 0 && i2 <= 4)) {
                    throw new C12221zl0("Invalid enum value.");
                }
                i++;
            }
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.b(this.b, 8);
        t.c(16, 0, -1, this.c);
        t.o(this.d, 24, 0);
    }
}
