package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Of3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1848Of3 extends AnimatorListenerAdapter {
    public final /* synthetic */ C1978Pf3 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1978Pf3 c1978Pf3 = this.a;
        c1978Pf3.l.removeOnLayoutChangeListener(c1978Pf3.p);
        c1978Pf3.j.removeView(c1978Pf3.b);
    }

    public C1848Of3(C1978Pf3 c1978Pf3) {
        this.a = c1978Pf3;
    }
}
