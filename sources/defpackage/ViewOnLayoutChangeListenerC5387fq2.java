package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fq2 */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC5387fq2 extends AnimatorListenerAdapter implements View.OnLayoutChangeListener {
    public final boolean a;
    public int g;
    public final /* synthetic */ ViewOnClickListenerC5731gq2 h;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = this.h;
        viewOnClickListenerC5731gq2.o.setTranslationY(0.0f);
        viewOnClickListenerC5731gq2.v.setTranslationY(0.0f);
        viewOnClickListenerC5731gq2.o.requestLayout();
        viewOnClickListenerC5731gq2.S = null;
        C4356cq2 c4356cq2 = viewOnClickListenerC5731gq2.a;
        if (c4356cq2.c) {
            return;
        }
        c4356cq2.c = true;
        c4356cq2.a.post(c4356cq2.b);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = this.h;
        Animator animator = viewOnClickListenerC5731gq2.S;
        if (animator != null) {
            animator.cancel();
        }
        viewOnClickListenerC5731gq2.o.removeOnLayoutChangeListener(this);
        this.g = (i4 - i2) - (i8 - i6);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new C5043eq2(this));
        viewOnClickListenerC5731gq2.S = ofFloat;
        ofFloat.setDuration(225L);
        viewOnClickListenerC5731gq2.S.setInterpolator(AbstractC8142nr1.g);
        viewOnClickListenerC5731gq2.S.addListener(this);
        viewOnClickListenerC5731gq2.S.start();
    }

    public ViewOnLayoutChangeListenerC5387fq2(ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2, boolean z) {
        this.h = viewOnClickListenerC5731gq2;
        this.a = z;
    }
}
