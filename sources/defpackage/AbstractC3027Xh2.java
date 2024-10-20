package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xh2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3027Xh2 {
    public static final double[] a = {-7.6d, -6.08d, -3.8d, -2.2d, -1.58d, -1.22d, -0.58d, 0.0d, 0.52d, 1.22d, 1.56d, 2.22d, 3.07d, 3.8d, 5.03d, 6.03d, 7.6d, 8.83d};

    static {
        b(0.0d);
    }

    public static double a(int i) {
        return Math.round((Math.log10(((i / 475.0f) * 4.75f) + 0.25f) / Math.log10(1.2000000476837158d)) * 100.0d) / 100.0d;
    }

    public static int b(double d) {
        return (int) Math.round(((Math.pow(1.2000000476837158d, d) - 0.25d) / 4.75d) * 475.0d);
    }

    public static int c(double d, boolean z) {
        int binarySearch = Arrays.binarySearch(a, d);
        if (binarySearch >= 0) {
            binarySearch = z ? binarySearch - 1 : binarySearch + 1;
        }
        if (binarySearch >= 0) {
            return binarySearch;
        }
        int i = (binarySearch + 1) * (-1);
        return z ? i - 1 : i;
    }
}
