package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4377cu extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public int[] b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C4377cu(int i) {
        super(16);
    }

    public static C4377cu d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C4377cu c4377cu = new C4377cu(c1730Ni0.c(c).b);
            int i = 0;
            c4377cu.b = c1730Ni0.q(8, 0);
            while (true) {
                int[] iArr = c4377cu.b;
                if (i >= iArr.length) {
                    return c4377cu;
                }
                AbstractC5064eu.a(iArr[i]);
                i++;
            }
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        ka0.t(d).o(this.b, 8, 0);
    }
}
