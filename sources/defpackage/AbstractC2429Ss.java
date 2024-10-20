package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ss, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2429Ss {
    public static ObjectAnimator a(View view, Property property, float f, float f2, long j) {
        return b(view, property, f, f2, j, null);
    }

    public static ObjectAnimator b(View view, Property property, float f, float f2, long j, Interpolator interpolator) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f, f2).setDuration(j);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        return duration;
    }
}
