package defpackage;

import android.view.animation.Animation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AnimationAnimationListenerC9600s60 implements Animation.AnimationListener {
    public final /* synthetic */ DialogC9943t60 a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC9600s60(DialogC9943t60 dialogC9943t60) {
        this.a = dialogC9943t60;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        super/*N8*/.dismiss();
    }
}
