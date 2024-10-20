package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FJ1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ JJ1 a;

    public FJ1(JJ1 jj1) {
        this.a = jj1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        JJ1 jj1 = this.a;
        T10 t10 = jj1.q;
        if (t10 != null) {
            SJ1 sj1 = jj1.h;
            C8985qJ1 c8985qJ1 = sj1.o;
            if (c8985qJ1 == null) {
                f = 0.0f;
            } else {
                float f2 = sj1.k;
                float f3 = c8985qJ1.j;
                f = (f2 - f3) / (c8985qJ1.k - f3);
            }
            t10.p(f);
        }
    }
}
