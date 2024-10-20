package defpackage;

import android.view.animation.Animation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hM3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AnimationAnimationListenerC5910hM3 implements Animation.AnimationListener {
    public final /* synthetic */ C6940kM3 a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.b.setLayoutAnimation(null);
    }

    public AnimationAnimationListenerC5910hM3(C6940kM3 c6940kM3) {
        this.a = c6940kM3;
    }
}
