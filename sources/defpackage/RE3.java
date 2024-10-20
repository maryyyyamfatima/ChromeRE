package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RE3 extends AbstractC7891n70 {
    public static final double b = Math.pow(75.0d, 2.0d);
    public final boolean a;

    public RE3(C5491g80 c5491g80, C7209l80 c7209l80, int i, int i2, boolean z) {
        boolean z2;
        if (c7209l80 != null && !z) {
            float f = c7209l80.a - i;
            float f2 = c5491g80.b;
            float f3 = f * f2;
            float f4 = (c7209l80.b - i2) * f2;
            if ((f4 * f4) + (f3 * f3) > b) {
                z2 = false;
                this.a = z2;
            }
        }
        z2 = true;
        this.a = z2;
    }
}
