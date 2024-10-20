package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4174cJ1 {
    public static float a(float[] fArr, float f, float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = (f2 - (min * f)) / f;
        float f4 = fArr[min];
        return AbstractC2277Rn2.a(fArr[min + 1], f4, f3, f4);
    }
}
