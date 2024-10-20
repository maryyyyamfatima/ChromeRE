package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2449Sw extends AnimatorListenerAdapter {
    public final /* synthetic */ AbstractC2969Ww a;

    public C2449Sw(AbstractC2969Ww abstractC2969Ww) {
        this.a = abstractC2969Ww;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d();
    }
}
