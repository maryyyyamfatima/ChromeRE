package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8578p70 extends AnimatorListenerAdapter {
    public final /* synthetic */ C8921q70 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C8921q70 c8921q70 = this.a;
        if (c8921q70.h == 0.0f) {
            c8921q70.c = 0;
            c8921q70.d = false;
            c8921q70.e = "";
            c8921q70.f = false;
            c8921q70.h = 0.0f;
        }
        c8921q70.i.removeAllListeners();
        c8921q70.i = null;
    }

    public C8578p70(C8921q70 c8921q70) {
        this.a = c8921q70;
    }
}
