package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500Dw extends AnimatorListenerAdapter {
    public final /* synthetic */ AbstractC2969Ww a;

    public C0500Dw(AbstractC2969Ww abstractC2969Ww, int i) {
        this.a = abstractC2969Ww;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c();
    }
}
