package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sj2 */
/* loaded from: classes.dex */
public final class C9810sj2 extends AnimatorListenerAdapter {
    public final /* synthetic */ C11182wj2 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C11182wj2 c11182wj2 = this.a;
        c11182wj2.u = c11182wj2.v;
        Runnable runnable = c11182wj2.G;
        if (runnable != null) {
            runnable.run();
            return;
        }
        c11182wj2.o();
        ImageView imageView = c11182wj2.z;
        if (imageView != null && imageView.getVisibility() == 0) {
            c11182wj2.z.animate().alpha(0.0f).setDuration(400L).setListener(c11182wj2.l);
        }
        c11182wj2.q(true);
    }

    public C9810sj2(C11182wj2 c11182wj2) {
        this.a = c11182wj2;
    }
}
