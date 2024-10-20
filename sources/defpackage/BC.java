package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BC extends AnimatorListenerAdapter {
    public final /* synthetic */ CC a;

    public BC(CC cc) {
        this.a = cc;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CC cc = this.a;
        cc.q(false, 0, 0, cc.m, cc.n, cc.p);
        this.a.B = null;
    }
}
