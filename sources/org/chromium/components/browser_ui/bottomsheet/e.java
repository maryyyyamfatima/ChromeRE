package org.chromium.components.browser_ui.bottomsheet;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheet g;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        BottomSheet bottomSheet = this.g;
        if (valueAnimator != bottomSheet.m) {
            return;
        }
        bottomSheet.s(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a, true);
    }

    public e(BottomSheet bottomSheet, int i) {
        this.g = bottomSheet;
        this.a = i;
    }
}
