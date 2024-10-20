package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ct1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4373ct1 {
    public static boolean a(int i, int i2, long[] jArr, long[] jArr2) {
        if (i >= 0 && i2 >= 0 && i < jArr.length && i2 < jArr.length) {
            if ((jArr[i2] - jArr2[i2]) - jArr[i] < 50000000) {
                return true;
            }
        }
        return false;
    }

    public static long[] b(Long[] lArr) {
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }
}
