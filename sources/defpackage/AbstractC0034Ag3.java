package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ag3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0034Ag3 {
    public static C11851yg3 a(int i, int i2, int[] iArr, boolean z) {
        int i3;
        int i4 = (i + i2) - 1;
        if (z) {
            i4++;
        }
        if (z && i == 0) {
            i3 = 0;
        } else {
            int binarySearch = Arrays.binarySearch(iArr, i);
            if (binarySearch >= 0) {
                while (binarySearch < iArr.length - 1) {
                    int i5 = binarySearch + 1;
                    if (iArr[i5] != i) {
                        break;
                    }
                    binarySearch = i5;
                }
            }
            i3 = binarySearch >= 0 ? binarySearch + 1 : (-binarySearch) - 1;
        }
        if (i2 > 0) {
            int binarySearch2 = Arrays.binarySearch(iArr, i4);
            if (binarySearch2 >= 0) {
                while (binarySearch2 < iArr.length - 1) {
                    int i6 = binarySearch2 + 1;
                    if (iArr[i6] != i4) {
                        break;
                    }
                    binarySearch2 = i6;
                }
            }
            i2 += (binarySearch2 >= 0 ? binarySearch2 + 1 : (-binarySearch2) - 1) - i3;
        }
        return new C11851yg3(i + i3, i2);
    }
}
