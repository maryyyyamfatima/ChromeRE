package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10047tQ0 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    public float g;
    public float h;
    public final /* synthetic */ AbstractC10390uQ0 i;

    public abstract float a();

    public AbstractC10047tQ0(C11076wQ0 c11076wQ0) {
        this.i = c11076wQ0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z = this.a;
        AbstractC10390uQ0 abstractC10390uQ0 = this.i;
        if (!z) {
            DM1 dm1 = abstractC10390uQ0.b;
            this.g = dm1 == null ? 0.0f : dm1.a.n;
            this.h = a();
            this.a = true;
        }
        float f = this.g;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.h - f)) + f);
        DM1 dm12 = abstractC10390uQ0.b;
        if (dm12 != null) {
            dm12.i(animatedFraction);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = (int) this.h;
        DM1 dm1 = this.i.b;
        if (dm1 != null) {
            dm1.i(f);
        }
        this.a = false;
    }
}
