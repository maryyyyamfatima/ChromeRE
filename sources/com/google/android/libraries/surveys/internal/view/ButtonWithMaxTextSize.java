package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.JG2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ButtonWithMaxTextSize extends MaterialButton {
    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.x);
        setTextSize(0, Math.min(getTextSize(), obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE)));
        obtainStyledAttributes.recycle();
    }
}
