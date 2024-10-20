package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NB3 extends AnimatorListenerAdapter {
    public final /* synthetic */ RB3 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RB3 rb3 = this.a;
        rb3.v = null;
        ((C10154tj3) rb3.y).h(true);
        RB3.Q(rb3, true);
    }

    public NB3(RB3 rb3) {
        this.a = rb3;
    }
}
