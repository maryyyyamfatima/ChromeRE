package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class WQ0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public WQ0(View view, int i, int i2, int i3) {
        this.a = view;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = 1.0f - floatValue;
        View view = this.a;
        view.setTranslationY(this.g * f);
        int i = this.h;
        int i2 = this.i;
        if (i != i2) {
            view.setBottom(view.getTop() + ((int) ((i2 * floatValue) + (i * f))));
        }
    }
}
