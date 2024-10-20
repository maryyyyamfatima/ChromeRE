package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jQ0 */
/* loaded from: classes.dex */
public final class C6613jQ0 extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean g = false;
    public final /* synthetic */ AbstractC10390uQ0 h;

    public C6613jQ0(AbstractC10390uQ0 abstractC10390uQ0) {
        this.h = abstractC10390uQ0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC10390uQ0 abstractC10390uQ0 = this.h;
        abstractC10390uQ0.r.c(0, this.g);
        abstractC10390uQ0.q = 1;
        abstractC10390uQ0.k = animator;
        this.a = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC10390uQ0 abstractC10390uQ0 = this.h;
        abstractC10390uQ0.q = 0;
        abstractC10390uQ0.k = null;
        if (this.a) {
            return;
        }
        FloatingActionButton floatingActionButton = abstractC10390uQ0.r;
        boolean z = this.g;
        floatingActionButton.c(z ? 8 : 4, z);
    }
}
