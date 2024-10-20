package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d23 */
/* loaded from: classes2.dex */
public final class C4427d23 extends AbstractC7094ko3 {
    public static final C4638dg0[] j;
    public static final C4638dg0 k;
    public byte[][] b;
    public byte[] c;
    public C9497ro2 d;
    public JM3 e;
    public C1063Ie2 f;
    public String g;
    public String h;
    public boolean i;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(72, 0);
        j = new C4638dg0[]{c4638dg0};
        k = c4638dg0;
    }

    public C4427d23(int i) {
        super(72);
    }

    public static C4427d23 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C4427d23 c4427d23 = new C4427d23(c1730Ni0.c(j).b);
            C1730Ni0 s = c1730Ni0.s(8, false);
            int i = s.j(-1).b;
            c4427d23.b = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                c4427d23.b[i2] = s.e((i2 * 8) + 8, 0, -1);
            }
            c4427d23.c = c1730Ni0.e(16, 0, -1);
            c4427d23.d = C9497ro2.d(c1730Ni0.s(24, false));
            c4427d23.e = JM3.d(c1730Ni0.s(32, true));
            c4427d23.f = C1063Ie2.d(c1730Ni0.s(40, true));
            c4427d23.g = c1730Ni0.v(48, true);
            c4427d23.h = c1730Ni0.v(56, false);
            c4427d23.i = c1730Ni0.d(64, 0);
            return c4427d23;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(k);
        byte[][] bArr = this.b;
        if (bArr == null) {
            t.q(8, false);
        } else {
            KA0 r = t.r(bArr.length, 8);
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.b;
                if (i >= bArr2.length) {
                    break;
                }
                r.c((i * 8) + 8, 0, -1, bArr2[i]);
                i++;
            }
        }
        t.c(16, 0, -1, this.c);
        t.k(this.d, 24, false);
        t.k(this.e, 32, true);
        t.k(this.f, 40, true);
        t.m(this.g, 48, true);
        t.m(this.h, 56, false);
        t.d(64, 0, this.i);
    }
}
