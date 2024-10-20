package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.JG2;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class DualControlLayout extends ViewGroup {
    public final int a;
    public int g;
    public int h;
    public boolean i;
    public View j;
    public View k;

    public static ButtonCompat a(Context context, boolean z, String str, View.OnClickListener onClickListener) {
        if (z) {
            ButtonCompat buttonCompat = new ButtonCompat(context, null, R.style.f96340_resource_name_obfuscated_res_0x7f1501c8);
            buttonCompat.setId(R.id.button_primary);
            buttonCompat.setOnClickListener(onClickListener);
            buttonCompat.setText(str);
            return buttonCompat;
        }
        ButtonCompat buttonCompat2 = new ButtonCompat(context, null, R.style.f103240_resource_name_obfuscated_res_0x7f150481);
        buttonCompat2.setId(R.id.button_secondary);
        buttonCompat2.setOnClickListener(onClickListener);
        buttonCompat2.setText(str);
        return buttonCompat2;
    }

    public DualControlLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.a = getContext().getResources().getDimensionPixelSize(R.dimen.f31380_resource_name_obfuscated_res_0x7f0801e3);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, JG2.L, 0, 0);
            if (obtainStyledAttributes.hasValue(5)) {
                this.h = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            }
            String string = obtainStyledAttributes.hasValue(3) ? obtainStyledAttributes.getString(3) : null;
            if (!TextUtils.isEmpty(string)) {
                addView(a(getContext(), true, string, null));
            }
            String string2 = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getString(4) : null;
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                addView(a(getContext(), false, string2, null));
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.g = obtainStyledAttributes.getInt(0, 0);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.j == null) {
            this.j = view;
        } else {
            if (this.k == null) {
                this.k = view;
                return;
            }
            throw new IllegalStateException("Too many children added to DualControlLayout");
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.i = false;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int size = View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : View.MeasureSpec.getSize(i) - paddingRight;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        measureChild(this.j, makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        View view = this.k;
        if (view != null) {
            measureChild(view, makeMeasureSpec, makeMeasureSpec);
            int measuredWidth2 = this.k.getMeasuredWidth() + this.j.getMeasuredWidth();
            if (this.j.getMeasuredWidth() > 0 && this.k.getMeasuredWidth() > 0) {
                measuredWidth2 += this.a;
            }
            if (measuredWidth2 > size) {
                this.i = true;
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                this.j.measure(makeMeasureSpec2, makeMeasureSpec);
                this.k.measure(makeMeasureSpec2, makeMeasureSpec);
                measuredHeight = this.k.getMeasuredHeight() + this.j.getMeasuredHeight() + this.h;
            } else {
                measuredHeight = Math.max(measuredHeight, this.k.getMeasuredHeight());
                size = measuredWidth2;
            }
        } else {
            size = measuredWidth;
        }
        setMeasuredDimension(View.resolveSize(size + paddingRight, i), View.resolveSize(measuredHeight + paddingBottom, i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i6 = i3 - i;
        boolean z2 = true;
        boolean z3 = getLayoutDirection() == 1;
        if ((!z3 || this.g != 0) && (z3 || ((i5 = this.g) != 2 && i5 != 1))) {
            z2 = false;
        }
        int measuredWidth2 = this.j.getVisibility() != 8 ? this.j.getMeasuredWidth() : 0;
        int i7 = z2 ? i6 - paddingRight : measuredWidth2 + paddingLeft;
        int i8 = i7 - measuredWidth2;
        int paddingTop = getPaddingTop();
        int measuredHeight = this.j.getMeasuredHeight() + paddingTop;
        this.j.layout(i8, paddingTop, i7, measuredHeight);
        if (this.i) {
            int i9 = measuredHeight + this.h;
            int measuredHeight2 = this.k.getMeasuredHeight() + i9;
            View view = this.k;
            view.layout(paddingLeft, i9, view.getMeasuredWidth() + paddingLeft, measuredHeight2);
            return;
        }
        View view2 = this.k;
        if (view2 != null) {
            int measuredHeight3 = view2.getMeasuredHeight();
            int i10 = ((paddingTop + measuredHeight) / 2) - (measuredHeight3 / 2);
            int i11 = measuredHeight3 + i10;
            if (this.g == 2) {
                if (!z2) {
                    paddingLeft = (i6 - paddingRight) - this.k.getMeasuredWidth();
                }
                measuredWidth = this.k.getMeasuredWidth() + paddingLeft;
            } else {
                int i12 = this.a;
                if (z2) {
                    if (measuredWidth2 > 0) {
                        i8 -= i12;
                    }
                    paddingLeft = i8 - this.k.getMeasuredWidth();
                    measuredWidth = i8;
                } else {
                    if (measuredWidth2 > 0) {
                        i7 += i12;
                    }
                    int i13 = i7;
                    measuredWidth = this.k.getMeasuredWidth() + i7;
                    paddingLeft = i13;
                }
            }
            this.k.layout(paddingLeft, i10, measuredWidth, i11);
        }
    }
}
