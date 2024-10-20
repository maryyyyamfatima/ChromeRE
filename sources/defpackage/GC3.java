package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GC3 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ IC3 g;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        IC3 ic3 = this.g;
        ic3.v = null;
        ic3.A.S().setY(0.0f);
        ic3.g();
        ic3.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        IC3 ic3 = this.g;
        ic3.A.S().setVisibility(0);
        ic3.A.m0(this.a);
        InterfaceC8947qB3 interfaceC8947qB3 = ic3.A;
        interfaceC8947qB3.E(interfaceC8947qB3.S());
    }

    public GC3(IC3 ic3, boolean z) {
        this.g = ic3;
        this.a = z;
    }
}
