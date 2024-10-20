package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150Iw extends AnimatorListenerAdapter {
    public final /* synthetic */ AbstractC2969Ww a;

    public C1150Iw(AbstractC2969Ww abstractC2969Ww, int i) {
        this.a = abstractC2969Ww;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.a.d;
        snackbarContentLayout.a.setAlpha(1.0f);
        long j = 180;
        long j2 = 0;
        snackbarContentLayout.a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (snackbarContentLayout.g.getVisibility() == 0) {
            snackbarContentLayout.g.setAlpha(1.0f);
            snackbarContentLayout.g.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c();
    }
}
