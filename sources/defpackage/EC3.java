package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EC3 extends AnimatorListenerAdapter {
    public final /* synthetic */ IC3 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        IC3 ic3 = this.a;
        ic3.v = null;
        ic3.A.m0(true);
        IC3.Q(ic3, true);
    }

    public EC3(IC3 ic3) {
        this.a = ic3;
    }
}
