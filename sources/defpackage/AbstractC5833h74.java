package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h74, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5833h74 {
    public static boolean d(byte b) {
        return b > -65;
    }

    public static void c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || d(b2)) {
            throw C1127Ir1.c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static void b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || d(b3)))) {
            throw C1127Ir1.c();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!d(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !d(b3) && !d(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw C1127Ir1.c();
    }
}
