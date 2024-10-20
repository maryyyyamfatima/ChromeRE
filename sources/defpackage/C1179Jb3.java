package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jb3 */
/* loaded from: classes.dex */
public final class C1179Jb3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1309Kb3 g;

    public C1179Jb3(C1309Kb3 c1309Kb3, int i) {
        this.g = c1309Kb3;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.g.J(this.a, false);
    }
}
