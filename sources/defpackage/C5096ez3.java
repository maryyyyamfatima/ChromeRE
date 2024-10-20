package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ez3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5096ez3 extends AnimatorListenerAdapter {
    public final /* synthetic */ AbstractC6470iz3 a;

    public C5096ez3(AbstractC6470iz3 abstractC6470iz3) {
        this.a = abstractC6470iz3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.j(true);
    }
}
