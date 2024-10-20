package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fR2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5246fR2 extends Drawable {
    public static final double a = Math.cos(Math.toRadians(45.0d));

    public static float b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - a) * f2) + (f * 1.5f));
    }

    public static float a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - a) * f2) + f);
    }
}
