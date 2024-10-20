package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Js1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1262Js1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0482Ds1 a;

    public C1262Js1(C0482Ds1 c0482Ds1) {
        this.a = c0482Ds1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.r = valueAnimator.getAnimatedFraction();
    }
}
