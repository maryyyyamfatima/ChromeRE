package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FI3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TextInputLayout a;

    public FI3(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.w0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
