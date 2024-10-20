package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eq2 */
/* loaded from: classes.dex */
public final class C5043eq2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ViewOnLayoutChangeListenerC5387fq2 a;

    public C5043eq2(ViewOnLayoutChangeListenerC5387fq2 viewOnLayoutChangeListenerC5387fq2) {
        this.a = viewOnLayoutChangeListenerC5387fq2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnLayoutChangeListenerC5387fq2 viewOnLayoutChangeListenerC5387fq2 = this.a;
        float f = viewOnLayoutChangeListenerC5387fq2.g * floatValue;
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = viewOnLayoutChangeListenerC5387fq2.h;
        viewOnClickListenerC5731gq2.o.setTranslationY(f);
        if (viewOnLayoutChangeListenerC5387fq2.a) {
            viewOnClickListenerC5731gq2.v.setTranslationY(-f);
            viewOnClickListenerC5731gq2.s.setBottom(Math.min(viewOnClickListenerC5731gq2.s.getMeasuredHeight() + viewOnClickListenerC5731gq2.s.getTop(), viewOnClickListenerC5731gq2.v.getTop()));
        }
    }
}
