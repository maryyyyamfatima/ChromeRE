package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eo3 */
/* loaded from: classes.dex */
public final class C5032eo3 extends AnimatorListenerAdapter {
    public final /* synthetic */ C5720go3 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.y = null;
    }

    public C5032eo3(C5720go3 c5720go3) {
        this.a = c5720go3;
    }
}
