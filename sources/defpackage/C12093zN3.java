package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zN3 */
/* loaded from: classes2.dex */
public final class C12093zN3 extends AbstractC7859n14 {
    public String[] b;
    public byte c;

    @Override // defpackage.AbstractC7859n14
    public final void a(KA0 ka0, int i) {
        ka0.b(16, i);
        ka0.b(this.a, i + 4);
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            ka0.b.b.put(ka0.a + i + 8, this.c);
            return;
        }
        String[] strArr = this.b;
        if (strArr == null) {
            ka0.q(i + 8, false);
            return;
        }
        KA0 r = ka0.r(strArr.length, i + 8);
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.b;
            if (i3 >= strArr2.length) {
                return;
            }
            r.m(strArr2[i3], (i3 * 8) + 8, false);
            i3++;
        }
    }

    public static final C12093zN3 b(C1730Ni0 c1730Ni0) {
        C4638dg0 k = c1730Ni0.k(80);
        if (k.a == 0) {
            return null;
        }
        C12093zN3 c12093zN3 = new C12093zN3();
        int i = k.b;
        if (i == 0) {
            C1730Ni0 s = c1730Ni0.s(88, false);
            int i2 = s.j(-1).b;
            c12093zN3.b = new String[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                c12093zN3.b[i3] = AbstractC7214l9.a(i3, 8, 8, s, false);
            }
            c12093zN3.a = 0;
        } else if (i == 1) {
            c1730Ni0.x(88, 1);
            c12093zN3.c = c1730Ni0.a.a.get(c1730Ni0.b + 88);
            c12093zN3.a = 1;
        }
        return c12093zN3;
    }
}
