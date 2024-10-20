package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5485g70 extends AnimatorListenerAdapter {
    public final /* synthetic */ C5829h70 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.t = false;
    }

    public C5485g70(C5829h70 c5829h70) {
        this.a = c5829h70;
    }
}
