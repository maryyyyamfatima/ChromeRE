package org.chromium.components.browser_ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.chrome.R;
import defpackage.AbstractC10957w33;
import defpackage.Ec4;
import defpackage.JG2;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MaterialProgressBar extends View implements ValueAnimator.AnimatorUpdateListener {
    public final ValueAnimator a;
    public final Paint g;
    public final Paint h;
    public boolean i;
    public int j;

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 3.0f);
        this.a = ofFloat;
        this.g = new Paint();
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        context.getResources();
        int color = context.getColor(R.color.f25840_resource_name_obfuscated_res_0x7f070827);
        int b = AbstractC10957w33.b(context);
        int color2 = context.getColor(R.color.f25850_resource_name_obfuscated_res_0x7f070828);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.l0, 0, 0);
            color = obtainStyledAttributes.getColor(0, color);
            b = obtainStyledAttributes.getColor(1, b);
            color2 = obtainStyledAttributes.getColor(2, color2);
            obtainStyledAttributes.recycle();
        }
        setBackgroundColor(color);
        paint.setColor(b);
        postInvalidateOnAnimation();
        paint2.setColor(color2);
        postInvalidateOnAnimation();
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(3000L);
        ofFloat.addUpdateListener(this);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.g.setColor(i);
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            b();
            return;
        }
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.i;
        Paint paint = this.h;
        Paint paint2 = this.g;
        if (z) {
            float width = canvas.getWidth();
            a(0.0f, width, canvas, paint2);
            float floatValue = ((Float) this.a.getAnimatedValue()).floatValue();
            a(((float) (Math.pow(floatValue, 1.5d) - 0.5d)) * width, width * floatValue, canvas, paint);
            if (floatValue >= 1.1f) {
                float f = (floatValue - 1.1f) / 1.0f;
                a(((float) (Math.pow(f, 2.5d) - 0.10000000149011612d)) * width, width * f, canvas, paint);
                return;
            }
            return;
        }
        float width2 = canvas.getWidth();
        a(0.0f, width2, canvas, paint2);
        int i = this.j;
        if (i > 0) {
            a(0.0f, width2 * (i / 100.0f), canvas, paint);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.i) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator.isRunning()) {
                return;
            }
            WeakHashMap weakHashMap = Ec4.a;
            if (isAttachedToWindow() && getVisibility() == 0) {
                valueAnimator.start();
            }
        }
    }

    public final void a(float f, float f2, Canvas canvas, Paint paint) {
        WeakHashMap weakHashMap = Ec4.a;
        if (getLayoutDirection() == 1) {
            float width = canvas.getWidth();
            canvas.drawRect(width - f2, 0.0f, width - f, canvas.getHeight(), paint);
        } else {
            canvas.drawRect(f, 0.0f, f2, canvas.getHeight(), paint);
        }
    }
}
