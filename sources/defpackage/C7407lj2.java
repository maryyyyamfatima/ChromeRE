package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lj2 */
/* loaded from: classes2.dex */
public final class C7407lj2 extends AbstractC7094ko3 {
    public static final C4638dg0[] p;
    public static final C4638dg0 q;
    public J50[] b;
    public M8 c;
    public C2735Vb0 d;
    public C2865Wb0 e;
    public int f;
    public int[] g;
    public int[] h;
    public int i;
    public ZB1[] j;
    public C12093zN3 k;
    public boolean l;
    public HashMap m;
    public S74[] n;
    public String[] o;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(128, 0);
        p = new C4638dg0[]{c4638dg0};
        q = c4638dg0;
    }

    public C7407lj2(int i) {
        super(128);
        this.i = 0;
        this.l = false;
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(q);
        J50[] j50Arr = this.b;
        if (j50Arr == null) {
            t.q(8, false);
        } else {
            KA0 r = t.r(j50Arr.length, 8);
            int i = 0;
            while (true) {
                J50[] j50Arr2 = this.b;
                if (i >= j50Arr2.length) {
                    break;
                }
                r.k(j50Arr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        t.l(this.c, 16, true);
        t.k(this.d, 32, false);
        t.k(this.e, 40, false);
        t.b(this.f, 48);
        t.b(this.i, 52);
        t.o(this.g, 56, 1);
        t.o(this.h, 64, 1);
        ZB1[] zb1Arr = this.j;
        if (zb1Arr == null) {
            t.q(72, false);
        } else {
            KA0 r2 = t.r(zb1Arr.length, 72);
            int i2 = 0;
            while (true) {
                ZB1[] zb1Arr2 = this.j;
                if (i2 >= zb1Arr2.length) {
                    break;
                }
                r2.k(zb1Arr2[i2], (i2 * 8) + 8, false);
                i2++;
            }
        }
        t.l(this.k, 80, true);
        t.d(96, 0, this.l);
        if (this.m == null) {
            t.q(104, true);
        } else {
            t.f(104, t.b.d - (t.a + 104));
            KA0 t2 = t.t(AbstractC3104Xx.a);
            int size = this.m.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            int i3 = 0;
            for (Map.Entry entry : this.m.entrySet()) {
                strArr[i3] = (String) entry.getKey();
                strArr2[i3] = (String) entry.getValue();
                i3++;
            }
            KA0 r3 = t2.r(size, 8);
            for (int i4 = 0; i4 < size; i4++) {
                r3.m(strArr[i4], (i4 * 8) + 8, false);
            }
            KA0 r4 = t2.r(size, 16);
            for (int i5 = 0; i5 < size; i5++) {
                r4.m(strArr2[i5], (i5 * 8) + 8, false);
            }
        }
        S74[] s74Arr = this.n;
        if (s74Arr == null) {
            t.q(112, true);
        } else {
            KA0 r5 = t.r(s74Arr.length, 112);
            int i6 = 0;
            while (true) {
                S74[] s74Arr2 = this.n;
                if (i6 >= s74Arr2.length) {
                    break;
                }
                r5.k(s74Arr2[i6], (i6 * 8) + 8, false);
                i6++;
            }
        }
        String[] strArr3 = this.o;
        if (strArr3 == null) {
            t.q(120, true);
            return;
        }
        KA0 r6 = t.r(strArr3.length, 120);
        int i7 = 0;
        while (true) {
            String[] strArr4 = this.o;
            if (i7 >= strArr4.length) {
                return;
            }
            r6.m(strArr4[i7], (i7 * 8) + 8, false);
            i7++;
        }
    }
}
