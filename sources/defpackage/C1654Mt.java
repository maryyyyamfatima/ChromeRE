package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1654Mt extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public int[] b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C1654Mt(int i) {
        super(16);
    }

    public static C1654Mt d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C1654Mt c1654Mt = new C1654Mt(a.c(c).b);
            int i = 0;
            c1654Mt.b = a.q(8, 0);
            while (true) {
                int[] iArr = c1654Mt.b;
                if (i >= iArr.length) {
                    return c1654Mt;
                }
                AbstractC5064eu.a(iArr[i]);
                i++;
            }
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        ka0.t(d).o(this.b, 8, 0);
    }
}
