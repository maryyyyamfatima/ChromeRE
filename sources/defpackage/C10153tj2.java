package defpackage;

import android.animation.Animator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tj2 */
/* loaded from: classes.dex */
public final class C10153tj2 implements Animator.AnimatorListener {
    public final /* synthetic */ C11182wj2 a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C11182wj2 c11182wj2 = this.a;
        c11182wj2.B.stop();
        c11182wj2.z.setVisibility(8);
    }

    public C10153tj2(C11182wj2 c11182wj2) {
        this.a = c11182wj2;
    }
}
