package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zR2 */
/* loaded from: classes2.dex */
public final class C12112zR2 extends AbstractC7859n14 {
    public C10342uG2 b;
    public UQ0 c;

    @Override // defpackage.AbstractC7859n14
    public final void a(KA0 ka0, int i) {
        ka0.b(16, i);
        ka0.b(this.a, i + 4);
        int i2 = this.a;
        if (i2 == 0) {
            ka0.k(this.b, i + 8, false);
        } else {
            if (i2 != 1) {
                return;
            }
            ka0.k(this.c, i + 8, false);
        }
    }

    public static final C12112zR2 b(C1730Ni0 c1730Ni0) {
        C4638dg0 k = c1730Ni0.k(8);
        C10342uG2 c10342uG2 = null;
        UQ0 uq0 = null;
        if (k.a == 0) {
            return null;
        }
        C12112zR2 c12112zR2 = new C12112zR2();
        int i = k.b;
        if (i == 0) {
            C1730Ni0 s = c1730Ni0.s(16, false);
            if (s != null) {
                s.b();
                try {
                    c10342uG2 = new C10342uG2(s.c(C10342uG2.b).b);
                } finally {
                }
            }
            c12112zR2.b = c10342uG2;
            c12112zR2.a = 0;
        } else if (i == 1) {
            C1730Ni0 s2 = c1730Ni0.s(16, false);
            if (s2 != null) {
                s2.b();
                try {
                    uq0 = new UQ0(s2.c(UQ0.b).b);
                } finally {
                }
            }
            c12112zR2.c = uq0;
            c12112zR2.a = 1;
        }
        return c12112zR2;
    }
}
