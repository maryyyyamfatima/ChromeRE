package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class YQ0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C3526aR0 a;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C3526aR0 c3526aR0 = this.a;
        c3526aR0.a.setBottom(((Integer) valueAnimator.getAnimatedValue()).intValue());
        c3526aR0.b();
    }

    public YQ0(C3526aR0 c3526aR0) {
        this.a = c3526aR0;
    }
}
