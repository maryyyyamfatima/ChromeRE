package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class MB1 extends ViewGroup {
    public boolean a;
    public final int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final float l;
    public final boolean m;
    public int[] n;
    public int[] o;
    public Drawable p;
    public int q;
    public int r;
    public final int s;
    public final int t;

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public MB1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        this.a = true;
        this.g = -1;
        this.h = 0;
        this.j = 8388659;
        int[] iArr = JG2.b0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        Ec4.l(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = obtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0 && this.i != i2) {
            this.i = i2;
            requestLayout();
        }
        int i3 = obtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0 && this.j != i3) {
            i3 = (8388615 & i3) == 0 ? i3 | 8388611 : i3;
            this.j = (i3 & 112) == 0 ? i3 | 48 : i3;
            requestLayout();
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            this.a = z;
        }
        this.l = obtainStyledAttributes.getFloat(4, -1.0f);
        this.g = obtainStyledAttributes.getInt(3, -1);
        this.m = obtainStyledAttributes.getBoolean(7, false);
        Drawable drawable = (!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) ? obtainStyledAttributes.getDrawable(5) : AbstractC2884Wf.a(context, resourceId);
        if (drawable != this.p) {
            this.p = drawable;
            if (drawable != null) {
                this.q = drawable.getIntrinsicWidth();
                this.r = drawable.getIntrinsicHeight();
            } else {
                this.q = 0;
                this.r = 0;
            }
            setWillNotDraw(drawable == null);
            requestLayout();
        }
        this.s = obtainStyledAttributes.getInt(8, 0);
        this.t = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.p == null) {
            return;
        }
        int i2 = 0;
        if (this.i == 1) {
            int childCount = getChildCount();
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && j(i2)) {
                    e(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((LB1) childAt.getLayoutParams())).topMargin) - this.r);
                }
                i2++;
            }
            if (j(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                e(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.r : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((LB1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean a = He4.a(this);
        while (i2 < childCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && j(i2)) {
                LB1 lb1 = (LB1) childAt3.getLayoutParams();
                f(canvas, a ? childAt3.getRight() + ((LinearLayout.LayoutParams) lb1).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) lb1).leftMargin) - this.q);
            }
            i2++;
        }
        if (j(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                LB1 lb12 = (LB1) childAt4.getLayoutParams();
                if (a) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) lb12).leftMargin;
                    i = this.q;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) lb12).rightMargin;
                }
            } else if (a) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.q;
                right = left - i;
            }
            f(canvas, right);
        }
    }

    public final void e(Canvas canvas, int i) {
        Drawable drawable = this.p;
        int paddingLeft = getPaddingLeft();
        int i2 = this.t;
        drawable.setBounds(paddingLeft + i2, i, (getWidth() - getPaddingRight()) - i2, this.r + i);
        this.p.draw(canvas);
    }

    public final void f(Canvas canvas, int i) {
        Drawable drawable = this.p;
        int paddingTop = getPaddingTop();
        int i2 = this.t;
        drawable.setBounds(i, paddingTop + i2, this.q + i, (getHeight() - getPaddingBottom()) - i2);
        this.p.draw(canvas);
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        int i2 = this.g;
        if (i2 < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (i2 == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.h;
        if (this.i == 1 && (i = this.j & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.k) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.k;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((LB1) childAt.getLayoutParams())).topMargin + baseline;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 2244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MB1.onMeasure(int, int):void");
    }

    public final boolean j(int i) {
        int i2 = this.s;
        if (i == 0) {
            return (i2 & 1) != 0;
        }
        if (i == getChildCount()) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) == 0) {
            return false;
        }
        for (int i3 = i - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0199  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MB1.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public LB1 generateLayoutParams(AttributeSet attributeSet) {
        return new LB1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public LB1 generateDefaultLayoutParams() {
        int i = this.i;
        if (i == 0) {
            return new LB1(-2);
        }
        if (i == 1) {
            return new LB1(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public LB1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LB1(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LB1;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }
}
