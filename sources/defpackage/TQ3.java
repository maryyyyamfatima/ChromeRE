package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class TQ3 extends ImageView {
    public final ColorDrawable a;
    public final InterpolatorC0485Dt g;
    public float h;
    public final AnimatorSet i;
    public final ValueAnimator j;
    public final ValueAnimator k;
    public boolean l;
    public final boolean m;
    public float n;
    public ValueAnimator o;
    public final float p;

    public TQ3(Context context, FrameLayout.LayoutParams layoutParams) {
        super(context);
        this.g = InterpolatorC0485Dt.d;
        setLayoutParams(layoutParams);
        this.l = true;
        this.m = LocalizationUtils.isLayoutRtl();
        this.p = getResources().getDisplayMetrics().density;
        ColorDrawable colorDrawable = new ColorDrawable(-1);
        this.a = colorDrawable;
        setImageDrawable(colorDrawable);
        SQ3 sq3 = new SQ3(this);
        AnimatorSet animatorSet = new AnimatorSet();
        this.i = animatorSet;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.k = valueAnimator;
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(sq3);
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.j = valueAnimator2;
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        valueAnimator2.addUpdateListener(sq3);
        b();
        animatorSet.playSequentially(valueAnimator, valueAnimator2);
        RQ3 rq3 = new RQ3(this);
        valueAnimator.addListener(rq3);
        valueAnimator2.addListener(rq3);
    }

    public final void b() {
        if (this.h <= 0.0f) {
            return;
        }
        long log = ((long) (Math.log(r0 / this.p) / Math.log(2.718281828459045d))) * 260;
        if (log <= 0) {
            return;
        }
        float f = (float) log;
        this.k.setDuration(0.6f * f);
        ValueAnimator valueAnimator = this.j;
        valueAnimator.setStartDelay(0.02f * f);
        valueAnimator.setDuration(f * 0.38f);
    }

    public final void a(ValueAnimator valueAnimator, float f) {
        if (this.l) {
            return;
        }
        float interpolation = this.g.getInterpolation(f);
        boolean z = this.m;
        float f2 = z ? -this.h : 0.0f;
        float f3 = z ? 0.0f : this.h;
        float min = Math.min(this.p * 400.0f, this.h * ((valueAnimator != this.k || f > 0.6f) ? 0.3f : ((f / 0.6f) * 0.20000002f) + 0.1f));
        float f4 = min / 2.0f;
        float f5 = ((this.h + min) * interpolation) - f4;
        if (z) {
            f5 *= -1.0f;
        }
        float f6 = f5 + f4;
        float f7 = f5 - f4;
        if (f6 > f3) {
            float f8 = f6 - f3;
            min -= Math.abs(f8);
            f5 -= Math.abs(f8) / 2.0f;
        } else if (f7 < f2) {
            float f9 = f7 - f2;
            min -= Math.abs(f9);
            f5 += Math.abs(f9) / 2.0f;
        }
        setScaleX(min);
        setTranslationX(f5);
    }
}
