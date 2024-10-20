package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qT */
/* loaded from: classes.dex */
public final class C9033qT extends AnimatorListenerAdapter {
    public final /* synthetic */ C9718sT a;

    public C9033qT(C9718sT c9718sT) {
        this.a = c9718sT;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.b.g(true);
    }
}
