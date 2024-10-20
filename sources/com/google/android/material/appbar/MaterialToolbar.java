package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;
import defpackage.BR3;
import defpackage.C11770yR3;
import defpackage.DM1;
import defpackage.EM1;
import defpackage.Ec4;
import defpackage.GM1;
import defpackage.JG2;
import defpackage.SJ3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer W;
    public final boolean a0;
    public final boolean b0;
    public final ImageView.ScaleType c0;
    public final Boolean d0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, R.attr.0_resource_name_obfuscated_res_0x7f0504e9, R.style.f113600_resource_name_obfuscated_res_0x7f150891), attributeSet, 0);
        Context context2 = getContext();
        TypedArray d = SJ3.d(context2, attributeSet, JG2.q0, R.attr.0_resource_name_obfuscated_res_0x7f0504e9, R.style.f113600_resource_name_obfuscated_res_0x7f150891, new int[0]);
        if (d.hasValue(2)) {
            this.W = Integer.valueOf(d.getColor(2, -1));
            Drawable p = p();
            if (p != null) {
                C(p);
            }
        }
        this.a0 = d.getBoolean(4, false);
        this.b0 = d.getBoolean(3, false);
        int i = d.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = e0;
            if (i < scaleTypeArr.length) {
                this.c0 = scaleTypeArr[i];
            }
        }
        if (d.hasValue(0)) {
            this.d0 = Boolean.valueOf(d.getBoolean(0, false));
        }
        d.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            DM1 dm1 = new DM1();
            dm1.j(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            dm1.g(context2);
            WeakHashMap weakHashMap = Ec4.a;
            dm1.i(getElevation());
            setBackground(dm1);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        boolean z2 = this.b0;
        boolean z3 = this.a0;
        if (z3 || z2) {
            ArrayList a = BR3.a(this, this.C);
            boolean isEmpty = a.isEmpty();
            C11770yR3 c11770yR3 = BR3.a;
            TextView textView = isEmpty ? null : (TextView) Collections.min(a, c11770yR3);
            ArrayList a2 = BR3.a(this, this.D);
            TextView textView2 = a2.isEmpty() ? null : (TextView) Collections.max(a2, c11770yR3);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (z3 && textView != null) {
                    I(textView, pair);
                }
                if (z2 && textView2 != null) {
                    I(textView2, pair);
                }
            }
        }
        AppCompatImageView appCompatImageView = this.j;
        Drawable drawable2 = appCompatImageView != null ? appCompatImageView.getDrawable() : null;
        if (drawable2 != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.d0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.c0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public final void I(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof DM1) {
            EM1.b(this, (DM1) background);
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof DM1) {
            ((DM1) background).i(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void C(Drawable drawable) {
        if (drawable != null && this.W != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.W.intValue());
        }
        super.C(drawable);
    }
}
