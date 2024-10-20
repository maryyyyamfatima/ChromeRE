package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lk3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7414lk3 extends AnimatorListenerAdapter {
    public final /* synthetic */ C8102nk3 a;

    public C7414lk3(C8102nk3 c8102nk3) {
        this.a = c8102nk3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C8102nk3 c8102nk3 = this.a;
        if (c8102nk3.b == animator) {
            c8102nk3.b = null;
        }
    }
}
