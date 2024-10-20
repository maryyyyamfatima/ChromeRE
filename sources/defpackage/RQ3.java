package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class RQ3 extends AnimatorListenerAdapter {
    public final /* synthetic */ TQ3 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TQ3 tq3 = this.a;
        if (tq3.l) {
            return;
        }
        tq3.i.setStartDelay(1000L);
        tq3.b();
        if (animator == tq3.j) {
            tq3.i.start();
        }
    }

    public RQ3(TQ3 tq3) {
        this.a = tq3;
    }
}
