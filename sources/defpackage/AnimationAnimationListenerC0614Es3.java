package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Es3 */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0614Es3 implements Animation.AnimationListener {
    public final /* synthetic */ b a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC0614Es3(G13 g13) {
        this.a = g13;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C5211fK2 c5211fK2;
        b bVar = this.a;
        if (bVar.h) {
            bVar.D.setAlpha(255);
            bVar.D.start();
            if (bVar.I && (c5211fK2 = bVar.g) != null) {
                c5211fK2.getClass();
                int i = VI2.d0;
                C1847Of2 c1847Of2 = new C1847Of2();
                C6206iD0 c6206iD0 = c5211fK2.a;
            }
            bVar.s = bVar.y.getTop();
            return;
        }
        bVar.o();
    }
}
