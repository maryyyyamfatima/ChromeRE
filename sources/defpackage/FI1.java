package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class FI1 {
    public static long a(long j, long j2) {
        long j3 = j + j2;
        IM1.a("checkedAdd", j, ((j ^ j2) < 0) | ((j ^ j3) >= 0), j2);
        return j3;
    }

    public static long c(long j, long j2) {
        long j3 = j - j2;
        IM1.a("checkedSubtract", j, ((j ^ j2) >= 0) | ((j ^ j3) >= 0), j2);
        return j3;
    }

    public static long b(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        IM1.a("checkedMultiply", j, numberOfLeadingZeros >= 64, j2);
        IM1.a("checkedMultiply", j, (j >= 0) | (j2 != Long.MIN_VALUE), j2);
        long j3 = j * j2;
        IM1.a("checkedMultiply", j, j == 0 || j3 / j == j2, j2);
        return j3;
    }
}
