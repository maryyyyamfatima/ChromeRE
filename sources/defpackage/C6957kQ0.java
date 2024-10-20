package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kQ0 */
/* loaded from: classes.dex */
public final class C6957kQ0 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a = false;
    public final /* synthetic */ AbstractC10390uQ0 g;

    public C6957kQ0(AbstractC10390uQ0 abstractC10390uQ0) {
        this.g = abstractC10390uQ0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC10390uQ0 abstractC10390uQ0 = this.g;
        abstractC10390uQ0.r.c(0, this.a);
        abstractC10390uQ0.q = 2;
        abstractC10390uQ0.k = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC10390uQ0 abstractC10390uQ0 = this.g;
        abstractC10390uQ0.q = 0;
        abstractC10390uQ0.k = null;
    }
}
