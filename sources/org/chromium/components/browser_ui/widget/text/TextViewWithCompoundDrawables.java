package org.chromium.components.browser_ui.widget.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.C10475ug;
import defpackage.JG2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TextViewWithCompoundDrawables extends C10475ug {
    public int k;
    public int l;
    public ColorStateList m;

    public TextViewWithCompoundDrawables(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.a1, 0, 0);
        this.k = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.m = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        if (this.k > 0 || this.l > 0 || this.m != null) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            g(compoundDrawablesRelative);
            if (this.m != null) {
                h(compoundDrawablesRelative);
            }
            setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
        }
    }

    @Override // defpackage.C10475ug, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.m != null) {
            h(getCompoundDrawablesRelative());
        }
    }

    @Override // defpackage.C10475ug, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        Drawable[] drawableArr = {drawable, drawable2, drawable3, drawable4};
        g(drawableArr);
        if (this.m != null) {
            h(drawableArr);
        }
        super.setCompoundDrawablesRelative(drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
    }

    public final void h(Drawable[] drawableArr) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.mutate();
                drawable.setColorFilter(this.m.getColorForState(getDrawableState(), 0), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    public final void g(Drawable[] drawableArr) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null && (this.k > 0 || this.l > 0)) {
                Rect copyBounds = drawable.copyBounds();
                int i = this.k;
                if (i > 0) {
                    copyBounds.right = copyBounds.left + i;
                }
                int i2 = this.l;
                if (i2 > 0) {
                    copyBounds.bottom = copyBounds.top + i2;
                }
                drawable.setBounds(copyBounds);
            }
        }
    }
}
