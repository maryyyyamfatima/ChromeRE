package defpackage;

import android.view.animation.Interpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fs1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC0742Fs1 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return f * f * f * f * f;
    }
}
