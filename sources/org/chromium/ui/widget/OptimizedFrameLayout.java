package org.chromium.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.C7721me2;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class OptimizedFrameLayout extends FrameLayout {
    public final ArrayList a;

    public OptimizedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int childMeasureSpec;
        int childMeasureSpec2;
        int i4;
        OptimizedFrameLayout optimizedFrameLayout = this;
        int i5 = i;
        int i6 = i2;
        int childCount = getChildCount();
        boolean z = (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) ? false : true;
        ArrayList arrayList = optimizedFrameLayout.a;
        arrayList.clear();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < childCount) {
            View childAt = optimizedFrameLayout.getChildAt(i8);
            if (getMeasureAllChildren()) {
                i4 = childCount;
            } else {
                i4 = childCount;
                if (childAt.getVisibility() == 8) {
                    i8++;
                    optimizedFrameLayout = this;
                    i5 = i;
                    i6 = i2;
                    childCount = i4;
                }
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft + paddingRight + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width);
            int childMeasureSpec4 = ViewGroup.getChildMeasureSpec(i6, paddingTop + paddingBottom + layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height);
            childAt.measure(childMeasureSpec3, childMeasureSpec4);
            i9 = Math.max(i9, childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            i10 = Math.max(i10, childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
            if (z && (layoutParams.width == -1 || layoutParams.height == -1)) {
                arrayList.add(new C7721me2(childAt, childMeasureSpec3, childMeasureSpec4));
            }
            i8++;
            optimizedFrameLayout = this;
            i5 = i;
            i6 = i2;
            childCount = i4;
        }
        int i11 = paddingLeft + paddingRight;
        int i12 = paddingTop + paddingBottom;
        int max = Math.max(i10 + i12, getSuggestedMinimumHeight());
        int max2 = Math.max(i9 + i11, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            max = Math.max(max, foreground.getMinimumHeight());
            max2 = Math.max(max2, foreground.getMinimumWidth());
        }
        setMeasuredDimension(View.resolveSizeAndState(max2, i, i7), View.resolveSizeAndState(max, i2, i7 << 16));
        int size = arrayList.size();
        if (size > 1) {
            int i13 = 0;
            while (i13 < size) {
                C7721me2 c7721me2 = (C7721me2) arrayList.get(i13);
                View view = c7721me2.a;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int i14 = marginLayoutParams.width;
                int i15 = size;
                if (i14 == -1) {
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredWidth() - paddingLeft) - paddingRight) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin), 1073741824);
                    i3 = i11;
                } else {
                    i3 = i11;
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i, marginLayoutParams.leftMargin + i11 + marginLayoutParams.rightMargin, i14);
                }
                int i16 = marginLayoutParams.height;
                if (i16 == -1) {
                    childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredHeight() - paddingTop) - paddingBottom) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin), 1073741824);
                } else {
                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, marginLayoutParams.topMargin + i12 + marginLayoutParams.bottomMargin, i16);
                }
                if (c7721me2.b != childMeasureSpec || c7721me2.c != childMeasureSpec2) {
                    view.measure(childMeasureSpec, childMeasureSpec2);
                }
                i13++;
                size = i15;
                i11 = i3;
            }
        }
        arrayList.clear();
    }
}
