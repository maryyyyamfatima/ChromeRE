package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Us4 {
    static {
        AbstractC0087Ar1.d("0123456789abcdef".getBytes(AbstractC3829bJ.a), "this as java.lang.String).getBytes(charset)");
    }

    public static final boolean a(C7520m23 c7520m23, int i, byte[] bArr, int i2) {
        int i3 = c7520m23.c;
        byte[] bArr2 = c7520m23.a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                c7520m23 = c7520m23.f;
                AbstractC0087Ar1.b(c7520m23);
                i = c7520m23.b;
                i3 = c7520m23.c;
                bArr2 = c7520m23.a;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final int b(C5173fD c5173fD, C0413De2 c0413De2, boolean z) {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        C7520m23 c7520m23;
        AbstractC0087Ar1.e(c5173fD, "<this>");
        AbstractC0087Ar1.e(c0413De2, "options");
        C7520m23 c7520m232 = c5173fD.a;
        int i4 = -2;
        if (c7520m232 == null) {
            return z ? -2 : -1;
        }
        int i5 = c7520m232.b;
        int i6 = c7520m232.c;
        byte[] bArr2 = c7520m232.a;
        C7520m23 c7520m233 = c7520m232;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int[] iArr = c0413De2.g;
            int i10 = iArr[i8];
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (c7520m233 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr2[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            c7520m233 = c7520m233.f;
                            AbstractC0087Ar1.b(c7520m233);
                            i2 = c7520m233.b;
                            i6 = c7520m233.c;
                            bArr2 = c7520m233.a;
                            if (c7520m233 == c7520m232) {
                                c7520m233 = null;
                            }
                        } else {
                            i2 = i13;
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i16 = (i10 * (-1)) + i11;
            while (true) {
                int i17 = i5 + 1;
                int i18 = i11 + 1;
                if ((bArr2[i5] & 255) != iArr[i11]) {
                    return i7;
                }
                boolean z2 = i18 == i16;
                if (i17 == i6) {
                    AbstractC0087Ar1.b(c7520m233);
                    C7520m23 c7520m234 = c7520m233.f;
                    AbstractC0087Ar1.b(c7520m234);
                    i3 = c7520m234.b;
                    int i19 = c7520m234.c;
                    bArr = c7520m234.a;
                    if (c7520m234 != c7520m232) {
                        c7520m23 = c7520m234;
                        i6 = i19;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        i6 = i19;
                        c7520m23 = null;
                    }
                } else {
                    C7520m23 c7520m235 = c7520m233;
                    bArr = bArr2;
                    i3 = i17;
                    c7520m23 = c7520m235;
                }
                if (z2) {
                    i = iArr[i18];
                    i2 = i3;
                    bArr2 = bArr;
                    c7520m233 = c7520m23;
                    break;
                }
                i5 = i3;
                bArr2 = bArr;
                i11 = i18;
                c7520m233 = c7520m23;
            }
            if (i >= 0) {
                return i;
            }
            i8 = -i;
            i5 = i2;
            i4 = -2;
        }
        return z ? i4 : i7;
    }
}
