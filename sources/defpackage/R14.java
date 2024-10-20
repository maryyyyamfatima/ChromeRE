package defpackage;

import java.math.BigInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class R14 {
    public static final long[] a = new long[37];
    public static final int[] b = new int[37];
    public static final int[] c = new int[37];

    static {
        long j;
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i = 2; i <= 36; i++) {
            long[] jArr = a;
            long j2 = i;
            long j3 = -1;
            if (j2 < 0) {
                j = S14.a(-1L, j2) < 0 ? 0L : 1L;
            } else {
                long j4 = (Long.MAX_VALUE / j2) << 1;
                j = j4 + (S14.a((-1) - (j4 * j2), j2) >= 0 ? 1 : 0);
            }
            jArr[i] = j;
            int[] iArr = b;
            if (j2 < 0) {
                if (S14.a(-1L, j2) < 0) {
                    iArr[i] = (int) j3;
                    c[i] = bigInteger.toString(i).length() - 1;
                }
            } else {
                j3 = (-1) - (((Long.MAX_VALUE / j2) << 1) * j2);
                if (S14.a(j3, j2) < 0) {
                    j2 = 0;
                }
            }
            j3 -= j2;
            iArr[i] = (int) j3;
            c[i] = bigInteger.toString(i).length() - 1;
        }
    }
}
