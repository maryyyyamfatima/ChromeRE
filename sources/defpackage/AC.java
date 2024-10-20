package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AC extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ CC g;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.g.B = null;
    }

    public AC(CC cc, int i) {
        this.g = cc;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        CC cc = this.g;
        cc.q(false, 0, 0, this.a, cc.n, cc.p);
    }
}
