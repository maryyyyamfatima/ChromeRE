package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class R93 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;

    public R93(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        super.onAnimationEnd(animator);
    }
}
