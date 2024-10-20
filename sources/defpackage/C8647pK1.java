package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pK1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8647pK1 {
    public final InterfaceC8990qK1 a;
    public ValueAnimator b;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;

    public C8647pK1(C9675sK1 c9675sK1) {
        this.a = c9675sK1;
        a();
        this.h = -1.0f;
        this.i = -1.0f;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.setDuration(100L);
        this.b.setInterpolator(new LinearInterpolator());
        this.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oK1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8647pK1 c8647pK1 = C8647pK1.this;
                float f = c8647pK1.f;
                c8647pK1.d = (valueAnimator.getAnimatedFraction() * (c8647pK1.h - f)) + f;
                float f2 = c8647pK1.g;
                float animatedFraction = (valueAnimator.getAnimatedFraction() * (c8647pK1.i - f2)) + f2;
                c8647pK1.e = animatedFraction;
                ((C9675sK1) c8647pK1.a).a(c8647pK1.d, animatedFraction);
            }
        });
    }
}
