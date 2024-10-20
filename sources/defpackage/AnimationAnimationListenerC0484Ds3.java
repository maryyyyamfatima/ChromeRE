package defpackage;

import android.view.animation.Animation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ds3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AnimationAnimationListenerC0484Ds3 implements Animation.AnimationListener {
    public final /* synthetic */ C2303Rs3 a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC2173Qs3 interfaceC2173Qs3;
        C2303Rs3 c2303Rs3 = this.a;
        if (c2303Rs3.h) {
            c2303Rs3.t.setAlpha(255);
            c2303Rs3.t.start();
            if (c2303Rs3.y && (interfaceC2173Qs3 = c2303Rs3.a) != null) {
                interfaceC2173Qs3.a();
            }
        } else {
            c2303Rs3.f();
        }
        c2303Rs3.j = c2303Rs3.o.getTop();
    }

    public AnimationAnimationListenerC0484Ds3(C2303Rs3 c2303Rs3) {
        this.a = c2303Rs3;
    }
}
