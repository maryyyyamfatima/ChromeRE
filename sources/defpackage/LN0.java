package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class LN0 extends AnimatorListenerAdapter {
    public final /* synthetic */ NN0 a;

    public LN0(NN0 nn0) {
        this.a = nn0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        NN0 nn0 = this.a;
        if (nn0.getParent() != null) {
            ((ViewGroup) nn0.getParent()).removeView(nn0);
        }
    }
}
