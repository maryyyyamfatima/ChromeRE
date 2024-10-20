package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class AW3 implements Animation.AnimationListener {
    public final /* synthetic */ CW3 a;

    public AW3(CW3 cw3) {
        this.a = cw3;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        CW3 cw3 = this.a;
        cw3.setVisibility(8);
        ((ViewGroup) cw3.getParent()).removeView(cw3);
        Runnable runnable = cw3.i;
        if (runnable != null) {
            runnable.run();
        }
    }
}
