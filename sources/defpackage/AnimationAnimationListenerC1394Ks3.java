package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ks3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC1394Ks3 implements Animation.AnimationListener {
    public final /* synthetic */ b a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC1394Ks3(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        b bVar = this.a;
        bVar.getClass();
        C1004Hs3 c1004Hs3 = new C1004Hs3(bVar);
        bVar.F = c1004Hs3;
        c1004Hs3.setDuration(150L);
        C4217cS c4217cS = bVar.y;
        c4217cS.a = null;
        c4217cS.clearAnimation();
        bVar.y.startAnimation(bVar.F);
    }
}
