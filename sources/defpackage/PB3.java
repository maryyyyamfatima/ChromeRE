package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PB3 extends AnimatorListenerAdapter {
    public final /* synthetic */ RB3 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RB3 rb3 = this.a;
        rb3.v = null;
        ((C10154tj3) rb3.y).c.O.setY(0.0f);
        rb3.g();
        rb3.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RB3 rb3 = this.a;
        ((C10154tj3) rb3.y).c.O.setVisibility(0);
        InterfaceC7408lj3 interfaceC7408lj3 = rb3.y;
        ((C10154tj3) interfaceC7408lj3).h(false);
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = ((C10154tj3) interfaceC7408lj3).c;
        ViewGroup viewGroup = viewOnClickListenerC0699Fj3.O;
        ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = viewOnClickListenerC0699Fj3.P;
        if (viewOnClickListenerC1069If3 == null) {
            return;
        }
        viewOnClickListenerC1069If3.l = viewGroup;
        C1978Pf3 c1978Pf3 = viewOnClickListenerC1069If3.g;
        if (c1978Pf3 != null) {
            c1978Pf3.e(viewGroup);
        }
    }

    public PB3(RB3 rb3) {
        this.a = rb3;
    }
}
