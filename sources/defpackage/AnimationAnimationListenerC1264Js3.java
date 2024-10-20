package defpackage;

import android.view.animation.Animation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Js3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AnimationAnimationListenerC1264Js3 implements Animation.AnimationListener {
    public final /* synthetic */ C2303Rs3 a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C2303Rs3 c2303Rs3 = this.a;
        if (c2303Rs3.m) {
            return;
        }
        c2303Rs3.k(c2303Rs3.D);
    }

    public AnimationAnimationListenerC1264Js3(C2303Rs3 c2303Rs3) {
        this.a = c2303Rs3;
    }
}
