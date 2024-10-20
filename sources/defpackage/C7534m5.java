package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7534m5 extends AnimatorListenerAdapter {
    public final /* synthetic */ C8565p5 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a = null;
    }

    public C7534m5(C8565p5 c8565p5) {
        this.a = c8565p5;
    }
}
