package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9739sX0 {
    public static float b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static float a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float a = a(((i >> 16) & 255) / 255.0f);
        float a2 = a(((i >> 8) & 255) / 255.0f);
        float a3 = a((i & 255) / 255.0f);
        float a4 = a(((i2 >> 16) & 255) / 255.0f);
        float a5 = a(((i2 >> 8) & 255) / 255.0f);
        float a6 = a((i2 & 255) / 255.0f);
        float a7 = AbstractC2277Rn2.a(f3, f2, f, f2);
        float a8 = AbstractC2277Rn2.a(a4, a, f, a);
        float a9 = AbstractC2277Rn2.a(a5, a2, f, a2);
        float a10 = AbstractC2277Rn2.a(a6, a3, f, a3);
        float b = b(a8) * 255.0f;
        float b2 = b(a9) * 255.0f;
        return Math.round(b(a10) * 255.0f) | (Math.round(b) << 16) | (Math.round(a7 * 255.0f) << 24) | (Math.round(b2) << 8);
    }
}
