package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.android.chrome.R;
import defpackage.AbstractC0270Cc;
import defpackage.AbstractC2619Ue;
import defpackage.AbstractC3779b90;
import defpackage.AbstractC6516j71;
import defpackage.Bd4;
import defpackage.C1579Me;
import defpackage.C1709Ne;
import defpackage.C1839Oe;
import defpackage.C1969Pe;
import defpackage.C2099Qe;
import defpackage.C2229Re;
import defpackage.C2879We;
import defpackage.C5153f90;
import defpackage.C5389fq4;
import defpackage.C5792h1;
import defpackage.Cd4;
import defpackage.DM1;
import defpackage.EM1;
import defpackage.Ec4;
import defpackage.GM1;
import defpackage.InterfaceC2489Te;
import defpackage.InterfaceC3435a90;
import defpackage.InterfaceC8550p22;
import defpackage.JG2;
import defpackage.KM1;
import defpackage.SJ3;
import defpackage.Ue4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements InterfaceC3435a90 {
    public int a;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public C5389fq4 l;
    public ArrayList m;
    public boolean n;
    public boolean o;
    public final boolean p;
    public final int q;
    public WeakReference r;
    public ValueAnimator s;
    public final ArrayList t;
    public int[] u;
    public Drawable v;
    public Behavior w;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class ScrollingViewBehavior extends Bd4 {
        public final Rect c;
        public final Rect d;
        public int e;
        public int f;

        public ScrollingViewBehavior() {
            this.c = new Rect();
            this.d = new Rect();
            this.e = 0;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.c = new Rect();
            this.d = new Rect();
            this.e = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.I0);
            this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // defpackage.AbstractC3779b90
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout s;
            C5389fq4 c5389fq4;
            int i4 = view.getLayoutParams().height;
            if ((i4 != -1 && i4 != -2) || (s = s(coordinatorLayout.k(view))) == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                WeakHashMap weakHashMap = Ec4.a;
                if (s.getFitsSystemWindows() && (c5389fq4 = coordinatorLayout.r) != null) {
                    size += c5389fq4.a() + c5389fq4.d();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int f = s.f() + size;
            int measuredHeight = s.getMeasuredHeight();
            view.setTranslationY(0.0f);
            coordinatorLayout.s(view, i, i2, View.MeasureSpec.makeMeasureSpec(f - measuredHeight, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }

        @Override // defpackage.Bd4
        public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout s = s(coordinatorLayout.k(view));
            if (s == null) {
                coordinatorLayout.r(view, i);
                this.e = 0;
                return;
            }
            C5153f90 c5153f90 = (C5153f90) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c5153f90).leftMargin;
            int bottom = s.getBottom() + ((ViewGroup.MarginLayoutParams) c5153f90).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c5153f90).rightMargin;
            int bottom2 = ((s.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c5153f90).bottomMargin;
            Rect rect = this.c;
            rect.set(paddingLeft, bottom, width, bottom2);
            C5389fq4 c5389fq4 = coordinatorLayout.r;
            if (c5389fq4 != null) {
                WeakHashMap weakHashMap = Ec4.a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = c5389fq4.b() + rect.left;
                    rect.right -= c5389fq4.c();
                }
            }
            Rect rect2 = this.d;
            int i2 = c5153f90.c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int t = t(s);
            view.layout(rect2.left, rect2.top - t, rect2.right, rect2.bottom - t);
            this.e = rect2.top - s.getBottom();
        }

        public final int t(View view) {
            float f;
            int i;
            if (this.f == 0) {
                return 0;
            }
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int f2 = appBarLayout.f();
                int c = appBarLayout.c();
                AbstractC3779b90 abstractC3779b90 = ((C5153f90) appBarLayout.getLayoutParams()).a;
                int s = abstractC3779b90 instanceof Behavior ? ((Behavior) abstractC3779b90).s() : 0;
                if ((c == 0 || f2 + s > c) && (i = f2 - c) != 0) {
                    f = (s / i) + 1.0f;
                    int i2 = this.f;
                    return KM1.a((int) (f * i2), 0, i2);
                }
            }
            f = 0.0f;
            int i22 = this.f;
            return KM1.a((int) (f * i22), 0, i22);
        }

        @Override // defpackage.AbstractC3779b90
        public final boolean b(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // defpackage.AbstractC3779b90
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                Ec4.j(coordinatorLayout, C5792h1.o.a());
                Ec4.g(coordinatorLayout, 0);
                Ec4.j(coordinatorLayout, C5792h1.p.a());
                Ec4.g(coordinatorLayout, 0);
                Ec4.m(coordinatorLayout, null);
            }
        }

        @Override // defpackage.AbstractC3779b90
        public final boolean k(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout s = s(coordinatorLayout.k(view));
            if (s != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    s.i(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.AbstractC3779b90
        public final void d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC3779b90 abstractC3779b90 = ((C5153f90) view2.getLayoutParams()).a;
            if (abstractC3779b90 instanceof Behavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((Behavior) abstractC3779b90).j) + this.e) - t(view2);
                WeakHashMap weakHashMap = Ec4.a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.p) {
                    appBarLayout.j(appBarLayout.k(view));
                }
            }
        }

        public static AppBarLayout s(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, R.attr.0_resource_name_obfuscated_res_0x7f050038, R.style.f108050_resource_name_obfuscated_res_0x7f150666), attributeSet, R.attr.0_resource_name_obfuscated_res_0x7f050038);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        boolean z = false;
        this.k = 0;
        this.t = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray d = SJ3.d(context3, attributeSet, Ue4.a, R.attr.0_resource_name_obfuscated_res_0x7f050038, R.style.f108050_resource_name_obfuscated_res_0x7f150666, new int[0]);
        try {
            if (d.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, d.getResourceId(0, 0)));
            }
            d.recycle();
            TypedArray d2 = SJ3.d(context2, attributeSet, JG2.i, R.attr.0_resource_name_obfuscated_res_0x7f050038, R.style.f108050_resource_name_obfuscated_res_0x7f150666, new int[0]);
            Drawable drawable = d2.getDrawable(0);
            WeakHashMap weakHashMap = Ec4.a;
            setBackground(drawable);
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                DM1 dm1 = new DM1();
                dm1.j(ColorStateList.valueOf(colorDrawable.getColor()));
                dm1.g(context2);
                setBackground(dm1);
            }
            if (d2.hasValue(4)) {
                i(d2.getBoolean(4, false), false, false);
            }
            if (d2.hasValue(3)) {
                float dimensionPixelSize = d2.getDimensionPixelSize(3, 0);
                int integer = getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0002);
                StateListAnimator stateListAnimator = new StateListAnimator();
                long j = integer;
                stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.0_resource_name_obfuscated_res_0x7f05042e, -2131035183}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j));
                stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(this, "elevation", dimensionPixelSize).setDuration(j));
                stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
                setStateListAnimator(stateListAnimator);
            }
            if (i >= 26) {
                if (d2.hasValue(2)) {
                    setKeyboardNavigationCluster(d2.getBoolean(2, false));
                }
                if (d2.hasValue(1)) {
                    setTouchscreenBlocksFocus(d2.getBoolean(1, false));
                }
            }
            this.p = d2.getBoolean(5, false);
            this.q = d2.getResourceId(6, -1);
            Drawable drawable2 = d2.getDrawable(7);
            Drawable drawable3 = this.v;
            if (drawable3 != drawable2) {
                if (drawable3 != null) {
                    drawable3.setCallback(null);
                }
                Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
                this.v = mutate;
                if (mutate != null) {
                    if (mutate.isStateful()) {
                        this.v.setState(getDrawableState());
                    }
                    this.v.setLayoutDirection(getLayoutDirection());
                    this.v.setVisible(getVisibility() == 0, false);
                    this.v.setCallback(this);
                }
                if (this.v != null && e() > 0) {
                    z = true;
                }
                setWillNotDraw(!z);
                postInvalidateOnAnimation();
            }
            d2.recycle();
            Ec4.o(this, new C1579Me(this));
        } catch (Throwable th) {
            d.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.v != null && e() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.a);
            this.v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = Ec4.a;
            if (getFitsSystemWindows() && l()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = KM1.a(e() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += e();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        g();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = Ec4.a;
        boolean z3 = true;
        if (getFitsSystemWindows() && l()) {
            int e = e();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(e);
            }
        }
        g();
        this.j = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((C2879We) getChildAt(i5).getLayoutParams()).c != null) {
                this.j = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), e());
        }
        if (!this.p) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C2879We) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.n != z3) {
            this.n = z3;
            refreshDrawableState();
        }
    }

    public final void g() {
        Behavior behavior = this.w;
        AppBarLayout$BaseBehavior$SavedState y = (behavior == null || this.g == -1 || this.k != 0) ? null : behavior.y(AbsSavedState.g, this);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        if (y != null) {
            Behavior behavior2 = this.w;
            if (behavior2.m != null) {
                return;
            }
            behavior2.m = y;
        }
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof DM1) {
            EM1.b(this, (DM1) background);
        }
    }

    @Override // defpackage.InterfaceC3435a90
    public final AbstractC3779b90 a() {
        Behavior behavior = new Behavior();
        this.w = behavior;
        return behavior;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof DM1) {
            ((DM1) background).i(f);
        }
    }

    public final void i(boolean z, boolean z2, boolean z3) {
        this.k = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2879We;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2879We();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C2879We();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2879We(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2879We(getContext(), attributeSet);
    }

    public static C2879We b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C2879We((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C2879We((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C2879We(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.r = null;
    }

    public final int f() {
        int i = this.g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C2879We c2879We = (C2879We) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = c2879We.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + ((LinearLayout.LayoutParams) c2879We).topMargin + ((LinearLayout.LayoutParams) c2879We).bottomMargin + i3;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = Ec4.a;
                    if (childAt.getFitsSystemWindows()) {
                        i5 -= e();
                    }
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap2 = Ec4.a;
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.g = max;
        return max;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c() {
        /*
            r9 = this;
            int r0 = r9.h
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            We r4 = (defpackage.C2879We) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap r4 = defpackage.Ec4.a
            int r4 = r3.getMinimumHeight()
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap r4 = defpackage.Ec4.a
            int r4 = r3.getMinimumHeight()
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap r6 = defpackage.Ec4.a
            boolean r3 = r3.getFitsSystemWindows()
            if (r3 == 0) goto L61
            int r3 = r9.e()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.h = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.c():int");
    }

    public final int d() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C2879We c2879We = (C2879We) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c2879We).topMargin + ((LinearLayout.LayoutParams) c2879We).bottomMargin + childAt.getMeasuredHeight();
                int i4 = c2879We.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap = Ec4.a;
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.i = max;
        return max;
    }

    public final void h(int i) {
        this.a = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = Ec4.a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2489Te interfaceC2489Te = (InterfaceC2489Te) this.m.get(i2);
                if (interfaceC2489Te != null) {
                    interfaceC2489Te.a(i);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.u == null) {
            this.u = new int[4];
        }
        int[] iArr = this.u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.n;
        iArr[0] = z ? R.attr.0_resource_name_obfuscated_res_0x7f05042e : -2131035182;
        iArr[1] = (z && this.o) ? R.attr.0_resource_name_obfuscated_res_0x7f05042f : -2131035183;
        iArr[2] = z ? R.attr.0_resource_name_obfuscated_res_0x7f05042b : -2131035179;
        iArr[3] = (z && this.o) ? R.attr.0_resource_name_obfuscated_res_0x7f05042a : -2131035178;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final boolean j(boolean z) {
        if (this.o == z) {
            return false;
        }
        this.o = z;
        refreshDrawableState();
        if (this.p && (getBackground() instanceof DM1)) {
            DM1 dm1 = (DM1) getBackground();
            float dimension = getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080186);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
            this.s = ofFloat;
            ofFloat.setDuration(getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0002));
            this.s.setInterpolator(AbstractC0270Cc.a);
            this.s.addUpdateListener(new C1709Ne(this, dm1));
            this.s.start();
        }
        return true;
    }

    public final boolean k(View view) {
        int i;
        if (this.r == null && (i = this.q) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(i);
            }
            if (findViewById != null) {
                this.r = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.r;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final int e() {
        C5389fq4 c5389fq4 = this.l;
        if (c5389fq4 != null) {
            return c5389fq4.d();
        }
        return 0;
    }

    public final boolean l() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = Ec4.a;
        return !childAt.getFitsSystemWindows();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class Behavior extends AbstractC6516j71 {
        public int j;
        public int k;
        public ValueAnimator l;
        public AppBarLayout$BaseBehavior$SavedState m;
        public WeakReference n;
        public AbstractC2619Ue o;
        public boolean p;

        @Override // defpackage.Bd4, defpackage.AbstractC3779b90
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.g(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.k;
            AppBarLayout$BaseBehavior$SavedState appBarLayout$BaseBehavior$SavedState = this.m;
            if (appBarLayout$BaseBehavior$SavedState == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    boolean z = (i2 & 4) != 0;
                    if ((i2 & 2) != 0) {
                        int i3 = -appBarLayout.f();
                        if (z) {
                            v(coordinatorLayout, appBarLayout, i3);
                        } else {
                            u(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (z) {
                            v(coordinatorLayout, appBarLayout, 0);
                        } else {
                            u(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (appBarLayout$BaseBehavior$SavedState.h) {
                u(coordinatorLayout, appBarLayout, -appBarLayout.f());
            } else if (appBarLayout$BaseBehavior$SavedState.i) {
                u(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(appBarLayout$BaseBehavior$SavedState.j);
                int i4 = -childAt.getBottom();
                if (this.m.l) {
                    WeakHashMap weakHashMap = Ec4.a;
                    round = appBarLayout.e() + childAt.getMinimumHeight() + i4;
                } else {
                    round = Math.round(childAt.getHeight() * this.m.k) + i4;
                }
                u(coordinatorLayout, appBarLayout, round);
            }
            appBarLayout.k = 0;
            this.m = null;
            int a = KM1.a(q(), -appBarLayout.f(), 0);
            Cd4 cd4 = this.a;
            if (cd4 != null) {
                if (cd4.d != a) {
                    cd4.d = a;
                    cd4.a();
                }
            } else {
                this.b = a;
            }
            B(coordinatorLayout, appBarLayout, q(), 0, true);
            appBarLayout.h(q());
            A(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.AbstractC3779b90
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((C5153f90) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.AbstractC3779b90
        public final /* bridge */ /* synthetic */ void i(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            x(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // defpackage.AbstractC3779b90
        public final void j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i2 < 0) {
                iArr[1] = t(coordinatorLayout, appBarLayout, s() - i2, -appBarLayout.d(), 0);
            }
            if (i2 == 0) {
                A(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.AbstractC3779b90
        public final void l(View view, Parcelable parcelable) {
            if (!(parcelable instanceof AppBarLayout$BaseBehavior$SavedState)) {
                this.m = null;
            } else {
                AppBarLayout$BaseBehavior$SavedState appBarLayout$BaseBehavior$SavedState = this.m;
                this.m = (AppBarLayout$BaseBehavior$SavedState) parcelable;
            }
        }

        @Override // defpackage.AbstractC3779b90
        public final Parcelable m(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            AppBarLayout$BaseBehavior$SavedState y = y(absSavedState, (AppBarLayout) view);
            return y == null ? absSavedState : y;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:            if (((r4.f() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L108;     */
        @Override // defpackage.AbstractC3779b90
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean n(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                r6 = r6 & 2
                r0 = 0
                if (r6 == 0) goto L2c
                boolean r6 = r4.p
                r1 = 1
                if (r6 != 0) goto L2b
                int r6 = r4.f()
                if (r6 == 0) goto L14
                r6 = r1
                goto L15
            L14:
                r6 = r0
            L15:
                if (r6 == 0) goto L28
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L28
                r3 = r1
                goto L29
            L28:
                r3 = r0
            L29:
                if (r3 == 0) goto L2c
            L2b:
                r0 = r1
            L2c:
                if (r0 == 0) goto L35
                android.animation.ValueAnimator r3 = r2.l
                if (r3 == 0) goto L35
                r3.cancel()
            L35:
                r3 = 0
                r2.n = r3
                r2.k = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.Behavior.n(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int):boolean");
        }

        @Override // defpackage.AbstractC3779b90
        public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                z(coordinatorLayout, appBarLayout);
                if (appBarLayout.p) {
                    appBarLayout.j(appBarLayout.k(view2));
                }
            }
            this.n = new WeakReference(view2);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
        @Override // defpackage.AbstractC6516j71
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int t(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, int r21, int r22, int r23) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.Behavior.t(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(0);
        }

        public final void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i >= 0) {
                    i2 = -appBarLayout.f();
                    i3 = 0;
                } else {
                    i2 = -appBarLayout.f();
                    i3 = appBarLayout.c() + i2;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    iArr[1] = t(coordinatorLayout, appBarLayout, s() - i, i4, i5);
                }
            }
            if (appBarLayout.p) {
                appBarLayout.j(appBarLayout.k(view));
            }
        }

        public final void v(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(s() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int s = s();
            if (s == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(AbstractC0270Cc.e);
                this.l.addUpdateListener(new C1839Oe(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration(Math.min(height, 600));
            this.l.setIntValues(s, i);
            this.l.start();
        }

        public final void z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.e();
            int s = s() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C2879We c2879We = (C2879We) childAt.getLayoutParams();
                if ((c2879We.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) c2879We).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c2879We).bottomMargin;
                }
                int i2 = -s;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                C2879We c2879We2 = (C2879We) childAt2.getLayoutParams();
                int i3 = c2879We2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap weakHashMap = Ec4.a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            i4 -= appBarLayout.e();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap weakHashMap2 = Ec4.a;
                        i5 += childAt2.getMinimumHeight();
                    } else {
                        if ((i3 & 5) == 5) {
                            WeakHashMap weakHashMap3 = Ec4.a;
                            int minimumHeight = childAt2.getMinimumHeight() + i5;
                            if (s < minimumHeight) {
                                i4 = minimumHeight;
                            } else {
                                i5 = minimumHeight;
                            }
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) c2879We2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) c2879We2).bottomMargin;
                    }
                    if (s < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    v(coordinatorLayout, appBarLayout, KM1.a(i4 + paddingTop, -appBarLayout.f(), 0));
                }
            }
        }

        public final void A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View view;
            boolean z;
            boolean z2;
            Ec4.j(coordinatorLayout, C5792h1.o.a());
            boolean z3 = false;
            Ec4.g(coordinatorLayout, 0);
            Ec4.j(coordinatorLayout, C5792h1.p.a());
            Ec4.g(coordinatorLayout, 0);
            if (appBarLayout.f() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    view = null;
                    break;
                }
                view = coordinatorLayout.getChildAt(i);
                if (((C5153f90) view.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    break;
                } else {
                    i++;
                }
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = appBarLayout.getChildCount();
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (((C2879We) appBarLayout.getChildAt(i2).getLayoutParams()).a != 0) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z2) {
                if (!(Ec4.d(coordinatorLayout) != null)) {
                    Ec4.m(coordinatorLayout, new C1969Pe(this));
                }
                if (s() != (-appBarLayout.f())) {
                    Ec4.k(coordinatorLayout, C5792h1.o, new C2229Re(appBarLayout, false));
                    z3 = true;
                }
                if (s() != 0) {
                    if (view2.canScrollVertically(-1)) {
                        int i3 = -appBarLayout.c();
                        if (i3 != 0) {
                            Ec4.k(coordinatorLayout, C5792h1.p, new C2099Qe(this, coordinatorLayout, appBarLayout, view2, i3));
                        }
                    } else {
                        Ec4.k(coordinatorLayout, C5792h1.p, new C2229Re(appBarLayout, true));
                    }
                    this.p = z;
                }
                z = z3;
                this.p = z;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void B(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                r0 = 1
                if (r5 == 0) goto L5e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                We r1 = (defpackage.C2879We) r1
                int r1 = r1.a
                r3 = r1 & 1
                if (r3 == 0) goto L5e
                java.util.WeakHashMap r3 = defpackage.Ec4.a
                int r3 = r5.getMinimumHeight()
                if (r10 <= 0) goto L4b
                r10 = r1 & 12
                if (r10 == 0) goto L4b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.e()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
                goto L5c
            L4b:
                r10 = r1 & 2
                if (r10 == 0) goto L5e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.e()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
            L5c:
                r9 = r0
                goto L5f
            L5e:
                r9 = r2
            L5f:
                boolean r10 = r8.p
                if (r10 == 0) goto L6b
                android.view.View r9 = w(r7)
                boolean r9 = r8.k(r9)
            L6b:
                boolean r9 = r8.j(r9)
                if (r11 != 0) goto Lb1
                if (r9 == 0) goto Lb4
                Co0 r7 = r7.g
                Lb3 r7 = r7.b
                java.lang.Object r7 = r7.get(r8)
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                if (r7 != 0) goto L80
                goto L85
            L80:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r7)
            L85:
                if (r4 != 0) goto L8b
                java.util.List r4 = java.util.Collections.emptyList()
            L8b:
                int r7 = r4.size()
                r9 = r2
            L90:
                if (r9 >= r7) goto Laf
                java.lang.Object r10 = r4.get(r9)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                f90 r10 = (defpackage.C5153f90) r10
                b90 r10 = r10.a
                boolean r11 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r11 == 0) goto Lac
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r7 = r10.f
                if (r7 == 0) goto Laf
                r2 = r0
                goto Laf
            Lac:
                int r9 = r9 + 1
                goto L90
            Laf:
                if (r2 == 0) goto Lb4
            Lb1:
                r8.jumpDrawablesToCurrentState()
            Lb4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.Behavior.B(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public static View w(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC8550p22) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // defpackage.AbstractC6516j71
        public final int s() {
            return q() + this.j;
        }

        public final AppBarLayout$BaseBehavior$SavedState y(Parcelable parcelable, AppBarLayout appBarLayout) {
            int q = q();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + q;
                if (childAt.getTop() + q <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.g;
                    }
                    AppBarLayout$BaseBehavior$SavedState appBarLayout$BaseBehavior$SavedState = new AppBarLayout$BaseBehavior$SavedState(parcelable);
                    boolean z = q == 0;
                    appBarLayout$BaseBehavior$SavedState.i = z;
                    appBarLayout$BaseBehavior$SavedState.h = !z && (-q) >= appBarLayout.f();
                    appBarLayout$BaseBehavior$SavedState.j = i;
                    WeakHashMap weakHashMap = Ec4.a;
                    appBarLayout$BaseBehavior$SavedState.l = bottom == appBarLayout.e() + childAt.getMinimumHeight();
                    appBarLayout$BaseBehavior$SavedState.k = bottom / childAt.getHeight();
                    return appBarLayout$BaseBehavior$SavedState;
                }
            }
            return null;
        }
    }
}
