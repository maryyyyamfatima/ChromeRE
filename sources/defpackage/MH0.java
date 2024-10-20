package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MH0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ NH0 a;

    public MH0(NH0 nh0) {
        this.a = nh0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        NH0 nh0 = this.a;
        nh0.h.setAlpha(floatValue);
        nh0.i.setAlpha(floatValue);
        nh0.x.invalidate();
    }
}
