package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lh2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7395lh2 extends AnimatorListenerAdapter {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ C7739mh2 g;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.g.h = null;
        Runnable runnable = this.a;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public C7395lh2(C7739mh2 c7739mh2, RunnableC6021hh2 runnableC6021hh2) {
        this.g = c7739mh2;
        this.a = runnableC6021hh2;
    }
}
