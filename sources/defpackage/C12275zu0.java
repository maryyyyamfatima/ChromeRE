package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12275zu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ C0101Au0 a;

    public C12275zu0(C0101Au0 c0101Au0) {
        this.a = c0101Au0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0101Au0 c0101Au0 = this.a;
        c0101Au0.q();
        c0101Au0.o.start();
    }
}
