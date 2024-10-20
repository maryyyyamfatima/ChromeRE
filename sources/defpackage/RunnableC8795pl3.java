package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8795pl3 implements Runnable {
    public final /* synthetic */ ViewOnLayoutChangeListenerC0059Al3 a;

    public /* synthetic */ RunnableC8795pl3(ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3) {
        this.a = viewOnLayoutChangeListenerC0059Al3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3 = this.a;
        viewOnLayoutChangeListenerC0059Al3.getClass();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        viewOnLayoutChangeListenerC0059Al3.q = ofFloat;
        ofFloat.setInterpolator(AbstractC8142nr1.e);
        viewOnLayoutChangeListenerC0059Al3.q.setDuration(150L);
        viewOnLayoutChangeListenerC0059Al3.q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sl3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al32 = ViewOnLayoutChangeListenerC0059Al3.this;
                viewOnLayoutChangeListenerC0059Al32.getClass();
                viewOnLayoutChangeListenerC0059Al32.a.l(AbstractC0189Bl3.f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        viewOnLayoutChangeListenerC0059Al3.q.addListener(new C10509ul3(viewOnLayoutChangeListenerC0059Al3));
        viewOnLayoutChangeListenerC0059Al3.q.start();
    }
}
