package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xV3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11447xV3 extends AnimatorListenerAdapter {
    public final /* synthetic */ C4317ck a;
    public final /* synthetic */ QV3 g;

    public C11447xV3(QV3 qv3, C4317ck c4317ck) {
        this.g = qv3;
        this.a = c4317ck;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.g.r.add(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.g.r.remove(animator);
    }
}
