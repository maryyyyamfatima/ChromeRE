package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rT */
/* loaded from: classes.dex */
public final class C9375rT extends AnimatorListenerAdapter {
    public final /* synthetic */ C9718sT a;

    public C9375rT(C9718sT c9718sT) {
        this.a = c9718sT;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.g(false);
    }
}
