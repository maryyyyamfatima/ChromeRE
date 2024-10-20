package defpackage;

import android.animation.Animator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t74, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9953t74 implements Animator.AnimatorListener {
    public final Runnable a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C9953t74(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.run();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.a.run();
    }
}
