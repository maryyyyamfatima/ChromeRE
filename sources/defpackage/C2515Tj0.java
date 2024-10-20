package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2515Tj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ d a;
    public final /* synthetic */ int g;
    public final /* synthetic */ View h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ViewPropertyAnimator j;
    public final /* synthetic */ C3165Yj0 k;

    public C2515Tj0(C3165Yj0 c3165Yj0, d dVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.k = c3165Yj0;
        this.a = dVar;
        this.g = i;
        this.h = view;
        this.i = i2;
        this.j = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.k.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.g;
        View view = this.h;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.i != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.j.setListener(null);
        C3165Yj0 c3165Yj0 = this.k;
        d dVar = this.a;
        c3165Yj0.h(dVar);
        c3165Yj0.p.remove(dVar);
        c3165Yj0.o();
    }
}
