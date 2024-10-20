package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: he4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6005he4 extends AnimatorListenerAdapter {
    public final /* synthetic */ InterfaceC7379le4 a;
    public final /* synthetic */ View g;

    public C6005he4(InterfaceC7379le4 interfaceC7379le4, View view) {
        this.a = interfaceC7379le4;
        this.g = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.b(this.g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.c();
    }
}
