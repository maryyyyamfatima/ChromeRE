package defpackage;

import android.graphics.Color;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EW implements N74 {
    public static final EW a = new EW();

    @Override // defpackage.N74
    public final Object a(AbstractC3086Xt1 abstractC3086Xt1, float f) {
        boolean z = abstractC3086Xt1.u() == 1;
        if (z) {
            abstractC3086Xt1.b();
        }
        double k = abstractC3086Xt1.k();
        double k2 = abstractC3086Xt1.k();
        double k3 = abstractC3086Xt1.k();
        double k4 = abstractC3086Xt1.u() == 7 ? abstractC3086Xt1.k() : 1.0d;
        if (z) {
            abstractC3086Xt1.e();
        }
        if (k <= 1.0d && k2 <= 1.0d && k3 <= 1.0d) {
            k *= 255.0d;
            k2 *= 255.0d;
            k3 *= 255.0d;
            if (k4 <= 1.0d) {
                k4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) k4, (int) k, (int) k2, (int) k3));
    }
}
