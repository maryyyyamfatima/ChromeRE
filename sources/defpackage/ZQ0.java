package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ZQ0 extends AnimatorListenerAdapter {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ C3526aR0 g;

    public ZQ0(C3526aR0 c3526aR0, Runnable runnable) {
        this.g = c3526aR0;
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3526aR0 c3526aR0 = this.g;
        c3526aR0.b();
        this.a.run();
        c3526aR0.a.requestLayout();
    }
}
