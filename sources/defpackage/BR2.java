package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BR2 extends AbstractC7859n14 {
    public C10039tO2 b;
    public FA0 c;
    public C9382rU1 d;
    public C4805e82 e;

    @Override // defpackage.AbstractC7859n14
    public final void a(KA0 ka0, int i) {
        ka0.b(16, i);
        ka0.b(this.a, i + 4);
        int i2 = this.a;
        if (i2 == 0) {
            ka0.k(this.b, i + 8, false);
            return;
        }
        if (i2 == 1) {
            ka0.k(this.c, i + 8, false);
        } else if (i2 == 2) {
            ka0.k(this.d, i + 8, false);
        } else {
            if (i2 != 3) {
                return;
            }
            ka0.k(this.e, i + 8, false);
        }
    }

    public static final BR2 b(C1730Ni0 c1730Ni0) {
        C4638dg0 k = c1730Ni0.k(8);
        C10039tO2 c10039tO2 = null;
        C4805e82 c4805e82 = null;
        C9382rU1 c9382rU1 = null;
        FA0 fa0 = null;
        if (k.a == 0) {
            return null;
        }
        BR2 br2 = new BR2();
        int i = k.b;
        if (i == 0) {
            C1730Ni0 s = c1730Ni0.s(16, false);
            if (s != null) {
                s.b();
                try {
                    c10039tO2 = new C10039tO2(s.c(C10039tO2.c).b);
                    c10039tO2.b = s.o(8);
                } finally {
                }
            }
            br2.b = c10039tO2;
            br2.a = 0;
        } else if (i == 1) {
            C1730Ni0 s2 = c1730Ni0.s(16, false);
            if (s2 != null) {
                s2.b();
                try {
                    fa0 = new FA0(s2.c(FA0.c).b);
                    fa0.b = s2.r(8);
                } finally {
                }
            }
            br2.c = fa0;
            br2.a = 1;
        } else if (i == 2) {
            C1730Ni0 s3 = c1730Ni0.s(16, false);
            if (s3 != null) {
                s3.b();
                try {
                    c9382rU1 = new C9382rU1(s3.c(C9382rU1.b).b);
                } finally {
                }
            }
            br2.d = c9382rU1;
            br2.a = 2;
        } else if (i == 3) {
            C1730Ni0 s4 = c1730Ni0.s(16, false);
            if (s4 != null) {
                s4.b();
                try {
                    c4805e82 = new C4805e82(s4.c(C4805e82.b).b);
                } finally {
                }
            }
            br2.e = c4805e82;
            br2.a = 3;
        }
        return br2;
    }
}
