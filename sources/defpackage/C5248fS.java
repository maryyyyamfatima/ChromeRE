package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5248fS implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C5936hS a;
    public final /* synthetic */ C6280iS g;

    public C5248fS(C6280iS c6280iS, C5936hS c5936hS) {
        this.g = c6280iS;
        this.a = c5936hS;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C6280iS c6280iS = this.g;
        c6280iS.getClass();
        C5936hS c5936hS = this.a;
        C6280iS.e(floatValue, c5936hS);
        c6280iS.b(floatValue, c5936hS, false);
        c6280iS.invalidateSelf();
    }
}
