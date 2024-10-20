package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0270Cc {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final HH0 b = new HH0();
    public static final GH0 c = new GH0();
    public static final UB1 d = new UB1();
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : AbstractC2277Rn2.a(f2, f, (f5 - f3) / (f4 - f3), f);
    }

    public static int b(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
