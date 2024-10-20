package defpackage;

import android.animation.Animator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ki4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7059ki4 implements Animator.AnimatorListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ View g;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C7059ki4(FrameLayout frameLayout, View view) {
        this.a = frameLayout;
        this.g = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.removeView(this.g);
    }
}
