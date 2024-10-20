package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rb3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2218Rb3 extends ViewGroup {
    public AbstractC2218Rb3(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int i5 = z2 ? -1 : 1;
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        for (int childCount = z2 ? getChildCount() - 1 : 0; childCount >= 0 && childCount < getChildCount(); childCount += i5) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                int measuredHeight2 = (measuredHeight - childAt.getMeasuredHeight()) / 2;
                if (measuredHeight2 < 0) {
                    measuredHeight2 = 0;
                }
                childAt.layout(paddingLeft, measuredHeight2, childAt.getMeasuredWidth() + paddingLeft, measuredHeight - measuredHeight2);
                paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        View view = null;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            C2088Qb3 c2088Qb3 = (C2088Qb3) childAt.getLayoutParams();
            if (c2088Qb3.a) {
                view = childAt;
            } else if (childAt.getVisibility() != 8 && (i3 = ((ViewGroup.LayoutParams) c2088Qb3).width) > 0) {
                paddingLeft -= i3;
            }
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2 != view) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().width, 1073741824), ViewGroup.getChildMeasureSpec(makeMeasureSpec, 0, childAt2.getLayoutParams().height));
            }
        }
        setMeasuredDimension(size, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + measuredHeight, 1073741824));
    }
}
