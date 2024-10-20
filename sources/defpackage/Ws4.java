package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Ws4 {
    public static final int a(C8208o23 c8208o23, int i) {
        int i2;
        AbstractC0087Ar1.e(c8208o23, "<this>");
        int i3 = i + 1;
        int length = c8208o23.j.length;
        int[] iArr = c8208o23.k;
        AbstractC0087Ar1.e(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}
