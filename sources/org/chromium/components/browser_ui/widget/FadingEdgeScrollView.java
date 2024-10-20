package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class FadingEdgeScrollView extends ScrollView {
    public final Paint a;
    public final int g;
    public final int h;
    public int i;
    public int j;

    public FadingEdgeScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        this.i = 1;
        this.j = 1;
        this.g = getContext().getColor(R.color.f26860_resource_name_obfuscated_res_0x7f0708ad);
        this.h = getResources().getDimensionPixelSize(R.dimen.f31080_resource_name_obfuscated_res_0x7f0801c5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        setVerticalFadingEdgeEnabled(true);
        float topFadingEdgeStrength = getTopFadingEdgeStrength();
        float bottomFadingEdgeStrength = getBottomFadingEdgeStrength();
        setVerticalFadingEdgeEnabled(false);
        a(canvas, 0, topFadingEdgeStrength, this.i);
        a(canvas, 1, bottomFadingEdgeStrength, this.j);
    }

    public final void a(Canvas canvas, int i, float f, int i2) {
        if (i2 == 0) {
            return;
        }
        float max = i2 == 1 ? Math.max(0.0f, Math.min(1.0f, f)) : 1.0f;
        if (max <= 0.0f) {
            return;
        }
        int i3 = this.g;
        Paint paint = this.a;
        paint.setColor(Color.argb((int) (Color.alpha(i3) * max), (int) (Color.red(i3) * max), (int) (Color.green(i3) * max), (int) (Color.blue(i3) * max)));
        int scrollX = getScrollX();
        int right = getRight() + scrollX;
        int i4 = this.h;
        if (i == 1) {
            canvas.drawRect(scrollX, r1 - i4, right, (getBottom() + getScrollY()) - getTop(), paint);
        } else if (i == 0) {
            canvas.drawRect(scrollX, getScrollY(), right, r12 + i4, paint);
        }
    }
}
