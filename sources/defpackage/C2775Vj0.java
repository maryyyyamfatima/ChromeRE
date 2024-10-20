package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2775Vj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ C2905Wj0 a;
    public final /* synthetic */ ViewPropertyAnimator g;
    public final /* synthetic */ View h;
    public final /* synthetic */ C3165Yj0 i;

    public C2775Vj0(C3165Yj0 c3165Yj0, C2905Wj0 c2905Wj0, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.i = c3165Yj0;
        this.a = c2905Wj0;
        this.g = viewPropertyAnimator;
        this.h = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.a.b;
        this.i.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.g.setListener(null);
        View view = this.h;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C2905Wj0 c2905Wj0 = this.a;
        d dVar = c2905Wj0.b;
        C3165Yj0 c3165Yj0 = this.i;
        c3165Yj0.h(dVar);
        c3165Yj0.r.remove(c2905Wj0.b);
        c3165Yj0.o();
    }
}
