package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rw */
/* loaded from: classes.dex */
public final class RunnableC2319Rw implements Runnable {
    public final /* synthetic */ AbstractC2969Ww a;

    public RunnableC2319Rw(AbstractC2969Ww abstractC2969Ww) {
        this.a = abstractC2969Ww;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2969Ww abstractC2969Ww = this.a;
        Snackbar$SnackbarLayout snackbar$SnackbarLayout = abstractC2969Ww.c;
        if (snackbar$SnackbarLayout == null) {
            return;
        }
        ViewParent parent = snackbar$SnackbarLayout.getParent();
        Snackbar$SnackbarLayout snackbar$SnackbarLayout2 = abstractC2969Ww.c;
        if (parent != null) {
            snackbar$SnackbarLayout2.setVisibility(0);
        }
        if (snackbar$SnackbarLayout2.h == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(AbstractC0270Cc.a);
            ofFloat.addUpdateListener(new C0630Ew(abstractC2969Ww));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat2.setInterpolator(AbstractC0270Cc.d);
            ofFloat2.addUpdateListener(new C0760Fw(abstractC2969Ww));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(150L);
            animatorSet.addListener(new C2449Sw(abstractC2969Ww));
            animatorSet.start();
            return;
        }
        int height = snackbar$SnackbarLayout2.getHeight();
        ViewGroup.LayoutParams layoutParams = snackbar$SnackbarLayout2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        snackbar$SnackbarLayout2.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(AbstractC0270Cc.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C0890Gw(abstractC2969Ww));
        valueAnimator.addUpdateListener(new C1020Hw(abstractC2969Ww, height));
        valueAnimator.start();
    }
}
