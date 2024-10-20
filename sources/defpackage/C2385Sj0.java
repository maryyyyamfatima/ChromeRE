package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2385Sj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ d a;
    public final /* synthetic */ View g;
    public final /* synthetic */ ViewPropertyAnimator h;
    public final /* synthetic */ C3165Yj0 i;

    public C2385Sj0(View view, ViewPropertyAnimator viewPropertyAnimator, C3165Yj0 c3165Yj0, d dVar) {
        this.i = c3165Yj0;
        this.a = dVar;
        this.g = view;
        this.h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.i.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.g.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.h.setListener(null);
        C3165Yj0 c3165Yj0 = this.i;
        d dVar = this.a;
        c3165Yj0.h(dVar);
        c3165Yj0.o.remove(dVar);
        c3165Yj0.o();
    }
}
