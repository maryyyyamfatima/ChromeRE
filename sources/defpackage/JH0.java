package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JH0 implements Runnable {
    public final /* synthetic */ NH0 a;

    public JH0(NH0 nh0) {
        this.a = nh0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NH0 nh0 = this.a;
        int i = nh0.F;
        ValueAnimator valueAnimator = nh0.E;
        if (i == 1) {
            valueAnimator.cancel();
        } else if (i != 2) {
            return;
        }
        nh0.F = 3;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        valueAnimator.setDuration(500);
        valueAnimator.start();
    }
}
