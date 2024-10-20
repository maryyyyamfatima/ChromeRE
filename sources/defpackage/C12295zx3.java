package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zx3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12295zx3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View g;
    public final /* synthetic */ C0119Ax3 h;

    public C12295zx3(C0119Ax3 c0119Ax3, View view, View view2) {
        this.h = c0119Ax3;
        this.a = view;
        this.g = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.h.b(this.a, this.g, valueAnimator.getAnimatedFraction());
    }
}
