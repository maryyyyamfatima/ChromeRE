package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class M8 extends AbstractC7859n14 {
    public boolean b;
    public C1063Ie2 c;
    public String d;

    @Override // defpackage.AbstractC7859n14
    public final void a(KA0 ka0, int i) {
        ka0.b(16, i);
        ka0.b(this.a, i + 4);
        int i2 = this.a;
        if (i2 == 0) {
            ka0.d(i + 8, 0, this.b);
        } else if (i2 == 1) {
            ka0.k(this.c, i + 8, false);
        } else {
            if (i2 != 2) {
                return;
            }
            ka0.m(this.d, i + 8, false);
        }
    }

    public static final M8 b(C1730Ni0 c1730Ni0) {
        C4638dg0 k = c1730Ni0.k(16);
        if (k.a == 0) {
            return null;
        }
        M8 m8 = new M8();
        int i = k.b;
        if (i == 0) {
            m8.b = c1730Ni0.d(24, 0);
            m8.a = 0;
        } else if (i == 1) {
            m8.c = C1063Ie2.d(c1730Ni0.s(24, false));
            m8.a = 1;
        } else if (i == 2) {
            m8.d = c1730Ni0.v(24, false);
            m8.a = 2;
        }
        return m8;
    }
}
