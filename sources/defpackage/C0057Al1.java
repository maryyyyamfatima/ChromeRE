package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Al1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0057Al1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C2136Ql1 a;
    public final /* synthetic */ AbstractC0187Bl1 g;

    public C0057Al1(AbstractC0187Bl1 abstractC0187Bl1, C2136Ql1 c2136Ql1) {
        this.g = abstractC0187Bl1;
        this.a = c2136Ql1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.g.b.l.a();
    }
}
