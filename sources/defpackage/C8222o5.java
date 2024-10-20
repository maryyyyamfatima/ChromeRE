package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8222o5 extends AnimatorListenerAdapter {
    public final /* synthetic */ C8565p5 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C8565p5 c8565p5 = this.a;
        c8565p5.a = null;
        C11840ye4 c11840ye4 = c8565p5.e;
        c11840ye4.getClass();
        c11840ye4.c.setVisibility(8);
    }

    public C8222o5(C8565p5 c8565p5) {
        this.a = c8565p5;
    }
}
