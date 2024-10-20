package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3289Zi extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;

    public C3289Zi(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setAlpha(0.0f);
    }
}
