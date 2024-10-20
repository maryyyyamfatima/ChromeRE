package org.chromium.chrome.browser.suggestions.tile;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.JG2;
import defpackage.JM1;
import defpackage.MJ0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MostVisitedTilesGridLayout extends FrameLayout {
    public final int a;
    public final int g;
    public final int h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    public MostVisitedTilesGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.l = true;
        Resources resources = getResources();
        Resources resources2 = getResources();
        if (this.l) {
            if (MJ0.c()) {
                i = R.dimen.f41960_resource_name_obfuscated_res_0x7f0807e1;
            } else if (MJ0.d()) {
                i = R.dimen.f41970_resource_name_obfuscated_res_0x7f0807e2;
            }
            this.i = resources2.getDimensionPixelOffset(i);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.v0);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(0, resources.getDimensionPixelOffset(R.dimen.f41890_resource_name_obfuscated_res_0x7f0807da));
            obtainStyledAttributes.recycle();
            this.g = Integer.MAX_VALUE;
            this.h = Integer.MAX_VALUE;
        }
        i = R.dimen.f41950_resource_name_obfuscated_res_0x7f0807e0;
        this.i = resources2.getDimensionPixelOffset(i);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, JG2.v0);
        this.a = obtainStyledAttributes2.getDimensionPixelOffset(0, resources.getDimensionPixelOffset(R.dimen.f41890_resource_name_obfuscated_res_0x7f0807da));
        obtainStyledAttributes2.recycle();
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int min = Math.min(View.MeasureSpec.getSize(i), this.h);
        int childCount = getChildCount();
        int i7 = 0;
        if (childCount == 0) {
            setMeasuredDimension(min, View.resolveSize(0, i2));
            return;
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            measureChild(getChildAt(i8), 0, 0);
        }
        int measuredHeight = getChildAt(0).getMeasuredHeight();
        int measuredWidth = getChildAt(0).getMeasuredWidth();
        int i9 = this.a;
        int c = JM1.c((min + i9) / (i9 + measuredWidth), 1, this.k);
        Pair a = a(Math.max(0, min - (c * measuredWidth)), c, true);
        int intValue = ((Integer) a.first).intValue();
        int intValue2 = ((Integer) a.second).intValue();
        int min2 = Math.min(childCount, this.j * c);
        int i10 = ((min2 + c) - 1) / c;
        int paddingTop = getPaddingTop();
        boolean z = getLayoutDirection() == 1;
        int i11 = 0;
        while (i11 < min2) {
            View childAt = getChildAt(i11);
            childAt.setVisibility(i7);
            int i12 = (this.i + measuredHeight) * (i11 / c);
            int i13 = ((measuredWidth + intValue2) * (i11 % c)) + intValue;
            int i14 = measuredWidth;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i15 = c;
            int i16 = z ? 0 : i13;
            if (z) {
                i4 = intValue;
                i6 = 0;
                i3 = intValue2;
                i5 = i13;
            } else {
                i3 = intValue2;
                i4 = intValue;
                i5 = 0;
                i6 = 0;
            }
            marginLayoutParams.setMargins(i16, i12, i5, i6);
            childAt.setLayoutParams(marginLayoutParams);
            i11++;
            i7 = i6;
            intValue2 = i3;
            c = i15;
            intValue = i4;
            measuredWidth = i14;
        }
        while (min2 < childCount) {
            getChildAt(min2).setVisibility(8);
            min2++;
        }
        setMeasuredDimension(min, View.resolveSize(((i10 - 1) * this.i) + (measuredHeight * i10) + getPaddingBottom() + paddingTop, i2));
    }

    public final Pair a(int i, int i2, boolean z) {
        float max;
        int i3 = 0;
        if (z) {
            max = i / (i2 + 1);
            int round = Math.round(max);
            if (max < this.a) {
                return a(i, i2, false);
            }
            i3 = round;
        } else {
            int i4 = this.g;
            long j = i - (i4 * (i2 - 1));
            if (j > 0) {
                i3 = (int) (j / 2);
                max = i4;
            } else {
                max = i / Math.max(1, r10);
            }
        }
        return Pair.create(Integer.valueOf(i3), Integer.valueOf(Math.round(max)));
    }
}
