package defpackage;

import android.animation.Animator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5592gS implements Animator.AnimatorListener {
    public final /* synthetic */ C5936hS a;
    public final /* synthetic */ C6280iS g;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    public C5592gS(C6280iS c6280iS, C5936hS c5936hS) {
        this.g = c6280iS;
        this.a = c5936hS;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.g.j = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C6280iS c6280iS = this.g;
        C5936hS c5936hS = this.a;
        c6280iS.b(1.0f, c5936hS, true);
        c5936hS.k = c5936hS.e;
        c5936hS.l = c5936hS.f;
        c5936hS.m = c5936hS.g;
        c5936hS.a((c5936hS.j + 1) % c5936hS.i.length);
        if (c6280iS.k) {
            c6280iS.k = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (c5936hS.n) {
                c5936hS.n = false;
                return;
            }
            return;
        }
        c6280iS.j += 1.0f;
    }
}
