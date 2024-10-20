package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.C11717yH0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class FadingShadowView extends View {
    public C11717yH0 a;
    public int g;
    public final float h;

    public FadingShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 1.0f;
    }

    public final void a(int i) {
        this.a = new C11717yH0(i);
        this.g = 0;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C11717yH0 c11717yH0 = this.a;
        if (c11717yH0 != null) {
            int i = this.g;
            float max = Math.max(0.0f, Math.min(1.0f, this.h)) * getHeight();
            if (max < 1.0f) {
                return;
            }
            int scrollX = getScrollX();
            int right = getRight() + scrollX;
            Paint paint = c11717yH0.a;
            LinearGradient linearGradient = c11717yH0.c;
            Matrix matrix = c11717yH0.b;
            if (i == 1) {
                int bottom = (getBottom() + getScrollY()) - getTop();
                matrix.setScale(1.0f, max);
                matrix.postRotate(180.0f);
                float f = scrollX;
                float f2 = bottom;
                matrix.postTranslate(f, f2);
                linearGradient.setLocalMatrix(matrix);
                paint.setShader(linearGradient);
                canvas.drawRect(f, f2 - max, right, f2, paint);
                return;
            }
            if (i == 0) {
                int scrollY = getScrollY();
                matrix.setScale(1.0f, max);
                float f3 = scrollX;
                float f4 = scrollY;
                matrix.postTranslate(f3, f4);
                linearGradient.setLocalMatrix(matrix);
                paint.setShader(linearGradient);
                canvas.drawRect(f3, f4, right, f4 + max, paint);
            }
        }
    }
}
