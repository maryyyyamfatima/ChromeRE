package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dq2 */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC4699dq2 extends AnimatorListenerAdapter implements View.OnLayoutChangeListener {
    public final /* synthetic */ ViewOnClickListenerC5731gq2 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.S = null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = this.a;
        viewOnClickListenerC5731gq2.o.removeOnLayoutChangeListener(this);
        viewOnClickListenerC5731gq2.S = ObjectAnimator.ofFloat(viewOnClickListenerC5731gq2.o, (Property<ViewGroup, Float>) View.TRANSLATION_Y, viewOnClickListenerC5731gq2.r, 0.0f);
        viewOnClickListenerC5731gq2.S.setDuration(225L);
        viewOnClickListenerC5731gq2.S.setInterpolator(AbstractC8142nr1.g);
        viewOnClickListenerC5731gq2.S.addListener(this);
        viewOnClickListenerC5731gq2.S.start();
    }

    public ViewOnLayoutChangeListenerC4699dq2(ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2) {
        this.a = viewOnClickListenerC5731gq2;
    }
}
