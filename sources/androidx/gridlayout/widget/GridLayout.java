package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.android.chrome.R;
import defpackage.AbstractC7848n0;
import defpackage.B41;
import defpackage.C41;
import defpackage.D41;
import defpackage.E41;
import defpackage.Ec4;
import defpackage.F41;
import defpackage.H41;
import defpackage.I41;
import defpackage.J41;
import defpackage.JG2;
import defpackage.O41;
import defpackage.P41;
import defpackage.Q41;
import defpackage.R41;
import defpackage.T41;
import defpackage.U41;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GridLayout extends ViewGroup {
    public static final E41 A;
    public static final F41 B;
    public static final H41 C;
    public static final I41 D;
    public static final LogPrinter n = new LogPrinter(3, GridLayout.class.getName());
    public static final int o = 3;
    public static final int p = 4;
    public static final int q = 1;
    public static final int r = 6;
    public static final int s = 5;
    public static final int t = 2;
    public static final B41 u = new B41();
    public static final C41 v;
    public static final D41 w;
    public static final C41 x;
    public static final D41 y;
    public static final E41 z;
    public final O41 a;
    public final O41 g;
    public int h;
    public boolean i;
    public int j;
    public final int k;
    public int l;
    public final LogPrinter m;

    static {
        C41 c41 = new C41();
        D41 d41 = new D41();
        v = c41;
        w = d41;
        x = c41;
        y = d41;
        z = new E41(c41, d41);
        A = new E41(d41, c41);
        B = new F41();
        C = new H41();
        D = new I41();
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        O41 o41 = new O41(this, true);
        this.a = o41;
        O41 o412 = new O41(this, false);
        this.g = o412;
        this.h = 0;
        this.i = false;
        this.j = 1;
        this.l = 0;
        this.m = n;
        this.k = context.getResources().getDimensionPixelOffset(R.dimen.f30510_resource_name_obfuscated_res_0x7f08017d);
        int[] iArr = JG2.X;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        Ec4.l(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            o412.n(obtainStyledAttributes.getInt(p, Integer.MIN_VALUE));
            h();
            requestLayout();
            o41.n(obtainStyledAttributes.getInt(q, Integer.MIN_VALUE));
            h();
            requestLayout();
            int i = obtainStyledAttributes.getInt(o, 0);
            if (this.h != i) {
                this.h = i;
                h();
                requestLayout();
            }
            this.i = obtainStyledAttributes.getBoolean(r, false);
            requestLayout();
            this.j = obtainStyledAttributes.getInt(0, 1);
            requestLayout();
            o412.u = obtainStyledAttributes.getBoolean(s, true);
            o412.l();
            h();
            requestLayout();
            o41.u = obtainStyledAttributes.getBoolean(t, true);
            o41.l();
            h();
            requestLayout();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static J41 d(int i, boolean z2) {
        int i2 = (i & (z2 ? 7 : 112)) >> (z2 ? 0 : 4);
        if (i2 == 1) {
            return B;
        }
        if (i2 == 3) {
            return z2 ? z : v;
        }
        if (i2 == 5) {
            return z2 ? A : w;
        }
        if (i2 == 7) {
            return D;
        }
        if (i2 == 8388611) {
            return x;
        }
        if (i2 == 8388613) {
            return y;
        }
        return u;
    }

    public final int e(View view, boolean z2, boolean z3) {
        int[] iArr;
        if (this.j == 1) {
            return f(view, z2, z3);
        }
        O41 o41 = z2 ? this.a : this.g;
        if (z3) {
            if (o41.j == null) {
                o41.j = new int[o41.f() + 1];
            }
            if (!o41.k) {
                o41.c(true);
                o41.k = true;
            }
            iArr = o41.j;
        } else {
            if (o41.l == null) {
                o41.l = new int[o41.f() + 1];
            }
            if (!o41.m) {
                o41.c(false);
                o41.m = true;
            }
            iArr = o41.l;
        }
        R41 r41 = (R41) view.getLayoutParams();
        Q41 q41 = (z2 ? r41.b : r41.a).b;
        return iArr[z3 ? q41.a : q41.b];
    }

    public final void i(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, e(view, true, false) + e(view, true, true), i3), ViewGroup.getChildMeasureSpec(i2, e(view, false, false) + e(view, false, true), i4));
    }

    public static void k(R41 r41, int i, int i2, int i3, int i4) {
        Q41 q41 = new Q41(i, i2 + i);
        U41 u41 = r41.a;
        r41.a = new U41(u41.a, q41, u41.c, u41.d);
        Q41 q412 = new Q41(i3, i4 + i3);
        U41 u412 = r41.b;
        r41.b = new U41(u412.a, q412, u412.c, u412.d);
    }

    public final void h() {
        this.l = 0;
        O41 o41 = this.a;
        if (o41 != null) {
            o41.l();
        }
        O41 o412 = this.g;
        if (o412 != null) {
            o412.l();
        }
        if (o41 == null || o412 == null) {
            return;
        }
        o41.m();
        o412.m();
    }

    public final int f(View view, boolean z2, boolean z3) {
        int i;
        R41 r41 = (R41) view.getLayoutParams();
        if (z2) {
            i = z3 ? ((ViewGroup.MarginLayoutParams) r41).leftMargin : ((ViewGroup.MarginLayoutParams) r41).rightMargin;
        } else {
            i = z3 ? ((ViewGroup.MarginLayoutParams) r41).topMargin : ((ViewGroup.MarginLayoutParams) r41).bottomMargin;
        }
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (this.i && view.getClass() != Space.class) {
            return this.k / 2;
        }
        return 0;
    }

    public static void g(String str) {
        throw new IllegalArgumentException(AbstractC7848n0.a(str, ". "));
    }

    public final void a(R41 r41, boolean z2) {
        String str = z2 ? "column" : "row";
        Q41 q41 = (z2 ? r41.b : r41.a).b;
        int i = q41.a;
        if (i != Integer.MIN_VALUE && i < 0) {
            g(str.concat(" indices must be positive"));
            throw null;
        }
        int i2 = (z2 ? this.a : this.g).b;
        if (i2 != Integer.MIN_VALUE) {
            int i3 = q41.b;
            if (i3 > i2) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (i3 - i <= i2) {
                return;
            }
            g(str + " span mustn't exceed the " + str + " count");
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof R41)) {
            return false;
        }
        R41 r41 = (R41) layoutParams;
        a(r41, true);
        a(r41, false);
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        U41 u41 = U41.e;
        return new R41(u41, u41);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new R41(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof R41) {
            return new R41((R41) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new R41((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new R41(layoutParams);
    }

    public final int b() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = ((R41) childAt.getLayoutParams()).hashCode() + (i * 31);
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0092 A[EDGE_INSN: B:58:0x0092->B:32:0x0092 BREAK  A[LOOP:1: B:34:0x0070->B:51:0x0070], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.gridlayout.widget.GridLayout.c():void");
    }

    public final void j(int i, int i2, boolean z2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                R41 r41 = (R41) childAt.getLayoutParams();
                if (z2) {
                    i(childAt, i, i2, ((ViewGroup.MarginLayoutParams) r41).width, ((ViewGroup.MarginLayoutParams) r41).height);
                } else {
                    boolean z3 = this.h == 0;
                    U41 u41 = z3 ? r41.b : r41.a;
                    if (u41.a(z3) == D) {
                        int[] h = (z3 ? this.a : this.g).h();
                        Q41 q41 = u41.b;
                        int e = (h[q41.b] - h[q41.a]) - (e(childAt, z3, false) + e(childAt, z3, true));
                        if (z3) {
                            i(childAt, i, i2, e, ((ViewGroup.MarginLayoutParams) r41).height);
                        } else {
                            i(childAt, i, i2, ((ViewGroup.MarginLayoutParams) r41).width, e);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int j;
        int j2;
        c();
        O41 o41 = this.g;
        O41 o412 = this.a;
        if (o412 != null && o41 != null) {
            o412.m();
            o41.m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i), View.MeasureSpec.getMode(i));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i2), View.MeasureSpec.getMode(i2));
        j(makeMeasureSpec, makeMeasureSpec2, true);
        if (this.h == 0) {
            j2 = o412.j(makeMeasureSpec);
            j(makeMeasureSpec, makeMeasureSpec2, false);
            j = o41.j(makeMeasureSpec2);
        } else {
            j = o41.j(makeMeasureSpec2);
            j(makeMeasureSpec, makeMeasureSpec2, false);
            j2 = o412.j(makeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(j2 + paddingRight, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(j + paddingBottom, getSuggestedMinimumHeight()), i2, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int[] iArr;
        O41 o41;
        int i5;
        boolean z3;
        int i6;
        View view;
        GridLayout gridLayout = this;
        c();
        int i7 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i8 = (i7 - paddingLeft) - paddingRight;
        O41 o412 = gridLayout.a;
        o412.v.a = i8;
        o412.w.a = -i8;
        boolean z4 = false;
        o412.q = false;
        o412.h();
        int i9 = ((i4 - i2) - paddingTop) - paddingBottom;
        O41 o413 = gridLayout.g;
        o413.v.a = i9;
        o413.w.a = -i9;
        o413.q = false;
        o413.h();
        int[] h = o412.h();
        int[] h2 = o413.h();
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = gridLayout.getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                i5 = i10;
                i6 = childCount;
                o41 = o412;
                z3 = z4;
                iArr = h;
            } else {
                R41 r41 = (R41) childAt.getLayoutParams();
                U41 u41 = r41.b;
                U41 u412 = r41.a;
                Q41 q41 = u41.b;
                Q41 q412 = u412.b;
                int i11 = childCount;
                int i12 = h[q41.a];
                int i13 = h2[q412.a];
                int i14 = h[q41.b];
                int i15 = h2[q412.b];
                int i16 = i14 - i12;
                int i17 = i15 - i13;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                iArr = h;
                J41 a = u41.a(true);
                J41 a2 = u412.a(false);
                T41 g = o412.g();
                P41 p41 = (P41) g.c[g.a[i10]];
                T41 g2 = o413.g();
                o41 = o412;
                P41 p412 = (P41) g2.c[g2.a[i10]];
                i5 = i10;
                int d = a.d(childAt, i16 - p41.d(true));
                int d2 = a2.d(childAt, i17 - p412.d(true));
                int e = gridLayout.e(childAt, true, true);
                int e2 = gridLayout.e(childAt, false, true);
                int e3 = gridLayout.e(childAt, true, false);
                int i18 = e + e3;
                int e4 = e2 + gridLayout.e(childAt, false, false);
                z3 = false;
                i6 = i11;
                int a3 = p41.a(this, childAt, a, measuredWidth + i18, true);
                int a4 = p412.a(this, childAt, a2, measuredHeight + e4, false);
                int e5 = a.e(measuredWidth, i16 - i18);
                int e6 = a2.e(measuredHeight, i17 - e4);
                int i19 = i12 + d + a3;
                WeakHashMap weakHashMap = Ec4.a;
                int i20 = !(getLayoutDirection() == 1) ? paddingLeft + e + i19 : (((i7 - e5) - paddingRight) - e3) - i19;
                int i21 = paddingTop + i13 + d2 + a4 + e2;
                if (e5 == childAt.getMeasuredWidth() && e6 == childAt.getMeasuredHeight()) {
                    view = childAt;
                } else {
                    view = childAt;
                    view.measure(View.MeasureSpec.makeMeasureSpec(e5, 1073741824), View.MeasureSpec.makeMeasureSpec(e6, 1073741824));
                }
                view.layout(i20, i21, e5 + i20, e6 + i21);
            }
            i10 = i5 + 1;
            gridLayout = this;
            h = iArr;
            o412 = o41;
            childCount = i6;
            z4 = z3;
        }
    }

    public static U41 l(int i, int i2, J41 j41, float f) {
        return new U41(i != Integer.MIN_VALUE, new Q41(i, i2 + i), j41, f);
    }
}
