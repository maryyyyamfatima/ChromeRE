package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760Fw implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AbstractC2969Ww a;

    public C0760Fw(AbstractC2969Ww abstractC2969Ww) {
        this.a = abstractC2969Ww;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AbstractC2969Ww abstractC2969Ww = this.a;
        abstractC2969Ww.c.setScaleX(floatValue);
        abstractC2969Ww.c.setScaleY(floatValue);
    }
}
