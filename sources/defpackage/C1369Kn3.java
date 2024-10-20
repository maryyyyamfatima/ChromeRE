package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kn3 */
/* loaded from: classes.dex */
public final class C1369Kn3 extends AnimatorListenerAdapter {
    public final /* synthetic */ C1758Nn3 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.U = false;
    }

    public C1369Kn3(C1758Nn3 c1758Nn3) {
        this.a = c1758Nn3;
    }
}
