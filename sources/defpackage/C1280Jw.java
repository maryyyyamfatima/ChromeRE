package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1280Jw implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AbstractC2969Ww a;

    public C1280Jw(AbstractC2969Ww abstractC2969Ww) {
        this.a = abstractC2969Ww;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Handler handler = AbstractC2969Ww.n;
        this.a.c.setTranslationY(intValue);
    }
}