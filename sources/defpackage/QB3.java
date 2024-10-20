package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QB3 extends AnimatorListenerAdapter {
    public final /* synthetic */ RB3 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RB3 rb3 = this.a;
        rb3.v = null;
        InterfaceC7408lj3 interfaceC7408lj3 = rb3.y;
        ((C10154tj3) interfaceC7408lj3).c.g.w(false);
        ((C10154tj3) interfaceC7408lj3).c.O.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = ((C10154tj3) this.a.y).c.P;
        if (viewOnClickListenerC1069If3 == null) {
            return;
        }
        viewOnClickListenerC1069If3.l = null;
        C1978Pf3 c1978Pf3 = viewOnClickListenerC1069If3.g;
        if (c1978Pf3 != null) {
            c1978Pf3.e(null);
        }
    }

    public QB3(RB3 rb3) {
        this.a = rb3;
    }
}
