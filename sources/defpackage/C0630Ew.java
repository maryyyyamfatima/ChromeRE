package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ew, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630Ew implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AbstractC2969Ww a;

    public C0630Ew(AbstractC2969Ww abstractC2969Ww) {
        this.a = abstractC2969Ww;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
