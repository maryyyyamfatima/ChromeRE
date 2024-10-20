package defpackage;

import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7878n5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C8565p5 a;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C8565p5 c8565p5 = this.a;
        if (c8565p5.e.a != null) {
            valueAnimator.setIntValues((int) Math.max(0.0f, c8565p5.a() - c8565p5.c));
        }
    }

    public C7878n5(C8565p5 c8565p5) {
        this.a = c8565p5;
    }
}
