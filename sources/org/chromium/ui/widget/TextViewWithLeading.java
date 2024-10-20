package org.chromium.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.JG2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TextViewWithLeading extends TextView {
    public TextViewWithLeading(Context context) {
        super(context);
    }

    public TextViewWithLeading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.b1, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setLineSpacing(obtainStyledAttributes.getDimension(0, 0.0f) - getPaint().getFontMetrics(null), 1.0f);
        }
        obtainStyledAttributes.recycle();
    }
}
