package defpackage;

import android.view.animation.Interpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gs1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC0872Gs1 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
