package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.JG2;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WrappingLayout extends ViewGroup {
    public final int a;
    public final int g;
    public final ArrayList h;

    public WrappingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = new ArrayList();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, JG2.j1, 0, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(1, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0) {
            return;
        }
        measureChildren(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        int size = View.MeasureSpec.getSize(i) - (getPaddingRight() + getPaddingLeft());
        int i3 = 0;
        while (true) {
            int childCount = getChildCount();
            arrayList = this.h;
            if (i3 >= childCount) {
                break;
            }
            if (getChildAt(i3).getVisibility() != 8) {
                arrayList.add(Integer.valueOf(i3));
            }
            i3++;
        }
        int size2 = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < size2) {
            View childAt = getChildAt(((Integer) arrayList.get(i4)).intValue());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int marginEnd = marginLayoutParams.getMarginEnd() + childAt.getMeasuredWidth() + marginLayoutParams.getMarginStart();
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (i7 + marginEnd <= size) {
                if (i7 != 0) {
                    i7 += this.a;
                }
                i7 += marginEnd;
                i8 = Math.max(i8, measuredHeight);
            } else {
                if (i8 != 0) {
                    i6 += i8 + this.g;
                }
                i8 = measuredHeight;
                i7 = marginEnd;
            }
            i5 = Math.max(i5, i7);
            i4++;
            if (i4 == size2) {
                i6 += i8;
            }
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i6;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode3 = View.MeasureSpec.getMode(i);
        int size3 = View.MeasureSpec.getSize(i);
        if (mode3 != 1073741824) {
            if (mode3 == Integer.MIN_VALUE) {
                paddingRight = Math.min(paddingRight, size3);
            }
            size3 = Math.max(paddingRight, suggestedMinimumWidth);
        }
        int resolveSizeAndState = View.resolveSizeAndState(size3, i, 0);
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode4 = View.MeasureSpec.getMode(i2);
        int size4 = View.MeasureSpec.getSize(i2);
        if (mode4 != 1073741824) {
            if (mode4 == Integer.MIN_VALUE) {
                paddingBottom = Math.min(paddingBottom, size4);
            }
            size4 = Math.max(paddingBottom, suggestedMinimumHeight);
        }
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(size4, i2, 0));
        arrayList.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        boolean z2 = true;
        boolean z3 = getLayoutDirection() == 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int marginStart = marginLayoutParams.getMarginStart() + paddingStart;
                int i7 = marginLayoutParams.topMargin + paddingTop;
                boolean z4 = paddingStart == getPaddingStart() ? z2 : false;
                int marginEnd = marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart() + measuredWidth;
                int i8 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                if (!z4 && paddingStart + marginEnd > getMeasuredWidth()) {
                    marginStart = marginLayoutParams.getMarginStart() + getPaddingStart();
                    i7 += i6 + this.g;
                    paddingTop = i7 - marginLayoutParams.topMargin;
                    i6 = i8;
                } else {
                    i6 = Math.max(i6, i8);
                }
                int i9 = marginStart + measuredWidth;
                int marginEnd2 = marginLayoutParams.getMarginEnd() + i9 + this.a;
                if (z3) {
                    i9 = getMeasuredWidth() - marginStart;
                    marginStart = i9 - measuredWidth;
                }
                childAt.layout(marginStart, i7, i9, measuredHeight + i7);
                paddingStart = marginEnd2;
            }
            i5++;
            z2 = true;
        }
    }
}
