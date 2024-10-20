package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XQ0 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ int g;

    public XQ0(View view, int i) {
        this.a = view;
        this.g = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setTranslationY(0.0f);
        view.setBottom(view.getTop() + this.g);
    }
}
