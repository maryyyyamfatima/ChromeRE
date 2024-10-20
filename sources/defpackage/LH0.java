package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LH0 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ NH0 g;

    public LH0(NH0 nh0) {
        this.g = nh0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        NH0 nh0 = this.g;
        if (((Float) nh0.E.getAnimatedValue()).floatValue() == 0.0f) {
            nh0.F = 0;
            nh0.l(0);
        } else {
            nh0.F = 2;
            nh0.x.invalidate();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }
}
