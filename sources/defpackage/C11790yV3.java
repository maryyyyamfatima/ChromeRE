package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yV3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11790yV3 extends AnimatorListenerAdapter {
    public final /* synthetic */ QV3 a;

    public C11790yV3(QV3 qv3) {
        this.a = qv3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.n();
        animator.removeListener(this);
    }
}
