package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ye0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11836ye0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewOnLayoutChangeListenerC12179ze0 a;

    public C11836ye0(ViewOnLayoutChangeListenerC12179ze0 viewOnLayoutChangeListenerC12179ze0) {
        this.a = viewOnLayoutChangeListenerC12179ze0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.h.c.animate().alpha(1.0f).setInterpolator(InterpolatorC0485Dt.e).setDuration(150L).start();
    }
}
