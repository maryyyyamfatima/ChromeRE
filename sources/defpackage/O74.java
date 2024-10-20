package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class O74 extends AbstractC7859n14 {
    public boolean[] b;
    public long[] c;
    public String[] d;
    public C3451aC0[] e;

    @Override // defpackage.AbstractC7859n14
    public final void a(KA0 ka0, int i) {
        ka0.b(16, i);
        ka0.b(this.a, i + 4);
        int i2 = this.a;
        boolean a = AbstractC3104Xx.a(0);
        if (i2 == 0) {
            boolean[] zArr = this.b;
            int i3 = i + 8;
            if (zArr == null) {
                ka0.q(i3, a);
                return;
            }
            int length = (zArr.length + 7) / 8;
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                for (int i5 = 0; i5 < 8; i5++) {
                    int i6 = (i4 * 8) + i5;
                    if (i6 < zArr.length && zArr[i6]) {
                        bArr[i4] = (byte) (bArr[i4] | ((byte) (1 << i5)));
                    }
                }
            }
            int length2 = zArr.length;
            ka0.f(i3, ka0.b.d - (ka0.a + i3));
            KA0 t = ka0.t(new C4638dg0(length + 8, length2));
            IA0 ia0 = t.b;
            ia0.b.position(t.a + 8);
            ia0.b.put(bArr);
            return;
        }
        if (i2 == 1) {
            long[] jArr = this.c;
            int i7 = i + 8;
            if (jArr == null) {
                ka0.q(i7, a);
                return;
            }
            KA0 s = ka0.s(8, jArr.length, i7, -1);
            IA0 ia02 = s.b;
            ia02.b.position(s.a + 8);
            ia02.b.asLongBuffer().put(jArr);
            return;
        }
        if (i2 == 2) {
            String[] strArr = this.d;
            if (strArr == null) {
                ka0.q(i + 8, false);
                return;
            }
            KA0 r = ka0.r(strArr.length, i + 8);
            int i8 = 0;
            while (true) {
                String[] strArr2 = this.d;
                if (i8 >= strArr2.length) {
                    return;
                }
                r.m(strArr2[i8], (i8 * 8) + 8, false);
                i8++;
            }
        } else {
            if (i2 != 3) {
                return;
            }
            C3451aC0[] c3451aC0Arr = this.e;
            if (c3451aC0Arr == null) {
                ka0.q(i + 8, false);
                return;
            }
            KA0 r2 = ka0.r(c3451aC0Arr.length, i + 8);
            int i9 = 0;
            while (true) {
                C3451aC0[] c3451aC0Arr2 = this.e;
                if (i9 >= c3451aC0Arr2.length) {
                    return;
                }
                r2.k(c3451aC0Arr2[i9], (i9 * 8) + 8, false);
                i9++;
            }
        }
    }

    public static final O74 b(C1730Ni0 c1730Ni0) {
        C4638dg0 k = c1730Ni0.k(16);
        boolean[] zArr = null;
        long[] jArr = null;
        if (k.a == 0) {
            return null;
        }
        O74 o74 = new O74();
        int i = k.b;
        if (i == 0) {
            C1730Ni0 s = c1730Ni0.s(24, AbstractC3104Xx.a(0));
            if (s != null) {
                C4638dg0 f = s.f();
                int i2 = f.b;
                int i3 = (i2 + 7) / 8;
                if (f.a < i3 + 8) {
                    throw new C12221zl0("Array header is incorrect.");
                }
                byte[] bArr = new byte[i3];
                C8697pU1 c8697pU1 = s.a;
                c8697pU1.a.position(s.b + 8);
                c8697pU1.a.get(bArr);
                boolean[] zArr2 = new boolean[i2];
                for (int i4 = 0; i4 < i3; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        int i6 = (i4 * 8) + i5;
                        if (i6 < i2) {
                            zArr2[i6] = (bArr[i4] & (1 << i5)) != 0;
                        }
                    }
                }
                zArr = zArr2;
            }
            o74.b = zArr;
            o74.a = 0;
        } else if (i == 1) {
            C1730Ni0 s2 = c1730Ni0.s(24, AbstractC3104Xx.a(0));
            if (s2 != null) {
                jArr = new long[s2.h(-1, 8L).b];
                C8697pU1 c8697pU12 = s2.a;
                c8697pU12.a.position(s2.b + 8);
                c8697pU12.a.asLongBuffer().get(jArr);
            }
            o74.c = jArr;
            o74.a = 1;
        } else if (i == 2) {
            C1730Ni0 s3 = c1730Ni0.s(24, false);
            int i7 = s3.j(-1).b;
            o74.d = new String[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                o74.d[i8] = AbstractC7214l9.a(i8, 8, 8, s3, false);
            }
            o74.a = 2;
        } else if (i == 3) {
            C1730Ni0 s4 = c1730Ni0.s(24, false);
            int i9 = s4.j(-1).b;
            o74.e = new C3451aC0[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                o74.e[i10] = C3451aC0.d(AbstractC7558m9.a(i10, 8, 8, s4, false));
            }
            o74.a = 3;
        }
        return o74;
    }
}
