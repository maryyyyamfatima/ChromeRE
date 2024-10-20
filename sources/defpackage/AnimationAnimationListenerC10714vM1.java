package defpackage;

import android.view.animation.Animation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vM1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AnimationAnimationListenerC10714vM1 implements Animation.AnimationListener {
    public final /* synthetic */ C11400xM1 a;
    public final /* synthetic */ C11743yM1 b;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.b.k = 0.0f;
    }

    public AnimationAnimationListenerC10714vM1(C11743yM1 c11743yM1, C11400xM1 c11400xM1) {
        this.b = c11743yM1;
        this.a = c11400xM1;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        C11400xM1 c11400xM1 = this.a;
        c11400xM1.l = c11400xM1.e;
        c11400xM1.m = c11400xM1.f;
        c11400xM1.n = c11400xM1.g;
        c11400xM1.b((c11400xM1.k + 1) % c11400xM1.j.length);
        c11400xM1.e = c11400xM1.f;
        c11400xM1.a();
        C11743yM1 c11743yM1 = this.b;
        if (!c11743yM1.n) {
            c11743yM1.k = (c11743yM1.k + 1.0f) % 5.0f;
            return;
        }
        c11743yM1.n = false;
        animation.setDuration(1332L);
        if (c11400xM1.o) {
            c11400xM1.o = false;
            c11400xM1.a();
        }
    }
}
