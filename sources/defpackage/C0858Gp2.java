package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gp2 */
/* loaded from: classes2.dex */
public final class C0858Gp2 extends AbstractC7094ko3 {
    public static final C4638dg0 h = new C4638dg0(56, 0);
    public C9840so2 b;
    public C12253zq2[] c;
    public C2152Qo2[] d;
    public String e;
    public String f;
    public M7 g;

    public C0858Gp2() {
        super(56);
        this.e = "";
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(h);
        t.k(this.b, 8, true);
        C12253zq2[] c12253zq2Arr = this.c;
        if (c12253zq2Arr == null) {
            t.q(16, true);
        } else {
            KA0 r = t.r(c12253zq2Arr.length, 16);
            int i = 0;
            while (true) {
                C12253zq2[] c12253zq2Arr2 = this.c;
                if (i >= c12253zq2Arr2.length) {
                    break;
                }
                r.k(c12253zq2Arr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        C2152Qo2[] c2152Qo2Arr = this.d;
        if (c2152Qo2Arr == null) {
            t.q(24, true);
        } else {
            KA0 r2 = t.r(c2152Qo2Arr.length, 24);
            int i2 = 0;
            while (true) {
                C2152Qo2[] c2152Qo2Arr2 = this.d;
                if (i2 >= c2152Qo2Arr2.length) {
                    break;
                }
                r2.k(c2152Qo2Arr2[i2], (i2 * 8) + 8, false);
                i2++;
            }
        }
        t.m(this.e, 32, false);
        t.m(this.f, 40, true);
        t.k(this.g, 48, true);
    }
}
