package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lx */
/* loaded from: classes2.dex */
public final class C1544Lx extends AbstractC7859n14 {
    public byte[] b;
    public C1674Mx c;
    public boolean d;

    @Override // defpackage.AbstractC7859n14
    public final void a(KA0 ka0, int i) {
        ka0.b(16, i);
        ka0.b(this.a, i + 4);
        int i2 = this.a;
        if (i2 == 0) {
            ka0.c(i + 8, 0, -1, this.b);
        } else if (i2 == 1) {
            ka0.k(this.c, i + 8, false);
        } else {
            if (i2 != 2) {
                return;
            }
            ka0.d(i + 8, 0, this.d);
        }
    }

    public static final C1544Lx b(C1730Ni0 c1730Ni0, int i) {
        C4638dg0 k = c1730Ni0.k(i);
        C1674Mx c1674Mx = null;
        if (k.a == 0) {
            return null;
        }
        C1544Lx c1544Lx = new C1544Lx();
        int i2 = k.b;
        if (i2 == 0) {
            c1544Lx.b = c1730Ni0.e(i + 8, 0, -1);
            c1544Lx.a = 0;
        } else if (i2 == 1) {
            C1730Ni0 s = c1730Ni0.s(i + 8, false);
            if (s != null) {
                s.b();
                try {
                    c1674Mx = new C1674Mx(s.c(C1674Mx.d).b);
                    c1674Mx.b = s.w(8, false).G();
                    c1674Mx.c = s.o(12);
                } finally {
                    s.a();
                }
            }
            c1544Lx.c = c1674Mx;
            c1544Lx.a = 1;
        } else if (i2 == 2) {
            c1544Lx.d = c1730Ni0.d(i + 8, 0);
            c1544Lx.a = 2;
        }
        return c1544Lx;
    }
}
