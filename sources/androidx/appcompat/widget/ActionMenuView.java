package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.AS1;
import defpackage.BS1;
import defpackage.C11069wO3;
import defpackage.C4097c5;
import defpackage.C4784e5;
import defpackage.C5128f5;
import defpackage.C5472g5;
import defpackage.C6287iT1;
import defpackage.CT1;
import defpackage.He4;
import defpackage.InterfaceC11778yT1;
import defpackage.InterfaceC12116zS1;
import defpackage.InterfaceC4441d5;
import defpackage.LB1;
import defpackage.MB1;
import defpackage.V4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ActionMenuView extends MB1 implements AS1, CT1 {
    public InterfaceC12116zS1 A;
    public boolean B;
    public int C;
    public final int D;
    public final int E;
    public C11069wO3 F;
    public BS1 u;
    public Context v;
    public int w;
    public boolean x;
    public C4097c5 y;
    public InterfaceC11778yT1 z;

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.MB1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    @Override // defpackage.MB1
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ LB1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C4097c5 c4097c5 = this.y;
        if (c4097c5 != null) {
            c4097c5.j();
            if (this.y.d()) {
                this.y.b();
                this.y.l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // defpackage.MB1, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        ?? r4;
        int i8;
        int i9;
        int i10;
        BS1 bs1;
        boolean z3 = this.B;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.B = z4;
        if (z3 != z4) {
            this.C = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.B && (bs1 = this.u) != null && size != this.C) {
            this.C = size;
            bs1.p(true);
        }
        int childCount = getChildCount();
        if (!this.B || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C5128f5 c5128f5 = (C5128f5) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c5128f5).rightMargin = 0;
                ((LinearLayout.LayoutParams) c5128f5).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i12 = size2 - paddingRight;
        int i13 = this.D;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z5 = false;
        int i21 = 0;
        long j = 0;
        while (true) {
            i3 = this.E;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            int i23 = i12;
            if (childAt.getVisibility() == 8) {
                i8 = mode;
                i9 = paddingBottom;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i24 = i18 + 1;
                if (z6) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C5128f5 c5128f52 = (C5128f5) childAt.getLayoutParams();
                c5128f52.f = false;
                c5128f52.c = 0;
                c5128f52.b = 0;
                c5128f52.d = false;
                ((LinearLayout.LayoutParams) c5128f52).leftMargin = 0;
                ((LinearLayout.LayoutParams) c5128f52).rightMargin = 0;
                c5128f52.e = z6 && ((ActionMenuItemView) childAt).g();
                int i25 = c5128f52.a ? 1 : i14;
                C5128f5 c5128f53 = (C5128f5) childAt.getLayoutParams();
                i8 = mode;
                i9 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = actionMenuItemView != null && actionMenuItemView.g();
                if (i25 <= 0 || (z7 && i25 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i16, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i16;
                    if (measuredWidth % i16 != 0) {
                        i10++;
                    }
                    if (z7 && i10 < 2) {
                        i10 = 2;
                    }
                }
                c5128f53.d = !c5128f53.a && z7;
                c5128f53.b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i10, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i10);
                if (c5128f52.d) {
                    i21++;
                }
                if (c5128f52.a) {
                    z5 = true;
                }
                i14 -= i10;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j |= 1 << i20;
                }
                i18 = i24;
            }
            i20++;
            size3 = i22;
            i12 = i23;
            paddingBottom = i9;
            mode = i8;
        }
        int i26 = mode;
        int i27 = i12;
        int i28 = size3;
        boolean z8 = z5 && i18 == 2;
        boolean z9 = false;
        while (i21 > 0 && i14 > 0) {
            int i29 = Integer.MAX_VALUE;
            int i30 = 0;
            int i31 = 0;
            long j2 = 0;
            while (i31 < childCount2) {
                C5128f5 c5128f54 = (C5128f5) getChildAt(i31).getLayoutParams();
                boolean z10 = z9;
                if (c5128f54.d) {
                    int i32 = c5128f54.b;
                    if (i32 < i29) {
                        j2 = 1 << i31;
                        i29 = i32;
                        i30 = 1;
                    } else if (i32 == i29) {
                        j2 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z9 = z10;
            }
            z = z9;
            j |= j2;
            if (i30 > i14) {
                break;
            }
            int i33 = i29 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C5128f5 c5128f55 = (C5128f5) childAt2.getLayoutParams();
                int i35 = i17;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j3 = 1 << i34;
                if ((j2 & j3) == 0) {
                    if (c5128f55.b == i33) {
                        j |= j3;
                    }
                } else {
                    if (z8 && c5128f55.e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c5128f55.b += r4;
                    c5128f55.f = r4;
                    i14--;
                }
                i34++;
                childMeasureSpec = i36;
                i17 = i35;
                childCount2 = i37;
            }
            z9 = true;
        }
        z = z9;
        int i38 = i17;
        int i39 = childMeasureSpec;
        int i40 = childCount2;
        boolean z11 = !z5 && i18 == 1;
        if (i14 <= 0 || j == 0 || (i14 >= i18 - 1 && !z11 && i19 <= 1)) {
            i4 = i40;
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((C5128f5) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i41 = i40 - 1;
                if ((j & (1 << i41)) != 0 && !((C5128f5) getChildAt(i41).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i14 * i16) / bitCount) : 0;
            boolean z12 = z;
            i4 = i40;
            for (int i43 = 0; i43 < i4; i43++) {
                if ((j & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    C5128f5 c5128f56 = (C5128f5) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c5128f56.c = i42;
                        c5128f56.f = true;
                        if (i43 == 0 && !c5128f56.e) {
                            ((LinearLayout.LayoutParams) c5128f56).leftMargin = (-i42) / 2;
                        }
                        z12 = true;
                    } else {
                        if (c5128f56.a) {
                            c5128f56.c = i42;
                            c5128f56.f = true;
                            ((LinearLayout.LayoutParams) c5128f56).rightMargin = (-i42) / 2;
                            z12 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) c5128f56).leftMargin = i42 / 2;
                            }
                            if (i43 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c5128f56).rightMargin = i42 / 2;
                            }
                        }
                    }
                }
            }
            z2 = z12;
        }
        if (z2) {
            int i44 = 0;
            while (i44 < i4) {
                View childAt4 = getChildAt(i44);
                C5128f5 c5128f57 = (C5128f5) childAt4.getLayoutParams();
                if (c5128f57.f) {
                    i7 = i39;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c5128f57.b * i16) + c5128f57.c, 1073741824), i7);
                } else {
                    i7 = i39;
                }
                i44++;
                i39 = i7;
            }
        }
        if (i26 != 1073741824) {
            i6 = i27;
            i5 = i38;
        } else {
            i5 = i28;
            i6 = i27;
        }
        setMeasuredDimension(i6, i5);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.D = (int) (56.0f * f);
        this.E = (int) (f * 4.0f);
        this.v = context;
        this.w = 0;
    }

    @Override // defpackage.MB1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int i7 = this.q;
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a = He4.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C5128f5 c5128f5 = (C5128f5) childAt.getLayoutParams();
                if (c5128f5.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m(i11)) {
                        measuredWidth += i7;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c5128f5).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c5128f5).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i12 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c5128f5).leftMargin) + ((LinearLayout.LayoutParams) c5128f5).rightMargin;
                    m(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C5128f5 c5128f52 = (C5128f5) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c5128f52.a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) c5128f52).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c5128f52).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C5128f5 c5128f53 = (C5128f5) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c5128f53.a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) c5128f53).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c5128f53).rightMargin + max + i20;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4097c5 c4097c5 = this.y;
        if (c4097c5 != null) {
            c4097c5.b();
            V4 v4 = c4097c5.y;
            if (v4 == null || !v4.b()) {
                return;
            }
            v4.j.dismiss();
        }
    }

    @Override // defpackage.MB1
    /* renamed from: g */
    public final LB1 generateDefaultLayoutParams() {
        C5128f5 c5128f5 = new C5128f5();
        ((LinearLayout.LayoutParams) c5128f5).gravity = 16;
        return c5128f5;
    }

    @Override // defpackage.MB1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C5128f5 c5128f5 = new C5128f5();
        ((LinearLayout.LayoutParams) c5128f5).gravity = 16;
        return c5128f5;
    }

    @Override // defpackage.MB1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5128f5(getContext(), attributeSet);
    }

    @Override // defpackage.MB1
    /* renamed from: h */
    public final LB1 generateLayoutParams(AttributeSet attributeSet) {
        return new C5128f5(getContext(), attributeSet);
    }

    public static C5128f5 k(ViewGroup.LayoutParams layoutParams) {
        C5128f5 c5128f5;
        if (layoutParams == null) {
            C5128f5 c5128f52 = new C5128f5();
            ((LinearLayout.LayoutParams) c5128f52).gravity = 16;
            return c5128f52;
        }
        if (layoutParams instanceof C5128f5) {
            c5128f5 = new C5128f5((C5128f5) layoutParams);
        } else {
            c5128f5 = new C5128f5(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c5128f5).gravity <= 0) {
            ((LinearLayout.LayoutParams) c5128f5).gravity = 16;
        }
        return c5128f5;
    }

    @Override // defpackage.MB1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5128f5;
    }

    @Override // defpackage.AS1
    public final boolean a(C6287iT1 c6287iT1) {
        return this.u.q(c6287iT1, null, 0);
    }

    @Override // defpackage.CT1
    public final void b(BS1 bs1) {
        this.u = bs1;
    }

    public final Menu l() {
        if (this.u == null) {
            Context context = getContext();
            BS1 bs1 = new BS1(context);
            this.u = bs1;
            bs1.e = new C5472g5(this);
            C4097c5 c4097c5 = new C4097c5(context);
            this.y = c4097c5;
            c4097c5.q = true;
            c4097c5.r = true;
            InterfaceC11778yT1 interfaceC11778yT1 = this.z;
            if (interfaceC11778yT1 == null) {
                interfaceC11778yT1 = new C4784e5();
            }
            c4097c5.j = interfaceC11778yT1;
            this.u.b(c4097c5, this.v);
            C4097c5 c4097c52 = this.y;
            c4097c52.m = this;
            this.u = c4097c52.h;
        }
        return this.u;
    }

    public final boolean m(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC4441d5)) {
            z = false | ((InterfaceC4441d5) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC4441d5)) ? z : z | ((InterfaceC4441d5) childAt2).e();
    }
}
