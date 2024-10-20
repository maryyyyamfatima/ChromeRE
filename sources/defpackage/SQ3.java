package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class SQ3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TQ3 a;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TQ3 tq3 = this.a;
        tq3.o = valueAnimator;
        tq3.n = valueAnimator.getAnimatedFraction();
        tq3.a(tq3.o, tq3.n);
    }

    public SQ3(TQ3 tq3) {
        this.a = tq3;
    }
}
