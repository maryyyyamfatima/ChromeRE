package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bS, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3874bS extends ImageView {
    public Animation.AnimationListener a;
    public final int g;
    public final int h;

    public C3874bS(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (3.5f * f);
        this.g = i;
        this.h = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        setBackground(shapeDrawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.g;
        int i4 = this.h;
        if (i4 > i3) {
            setMeasuredDimension((i4 * 2) + getMeasuredWidth(), (i4 * 2) + getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
