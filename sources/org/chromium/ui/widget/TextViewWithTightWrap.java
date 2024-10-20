package org.chromium.ui.widget;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TextViewWithTightWrap extends TextView {
    public TextViewWithTightWrap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || layout.getLineCount() <= 1) {
            return;
        }
        int lineCount = layout.getLineCount();
        float f = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            f = Math.max(f, layout.getLineWidth(i3));
        }
        int compoundPaddingRight = getCompoundPaddingRight() + getCompoundPaddingLeft() + ((int) Math.ceil(f));
        getMeasuredHeight();
        if (compoundPaddingRight < getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(compoundPaddingRight, Integer.MIN_VALUE), i2);
        }
    }
}
