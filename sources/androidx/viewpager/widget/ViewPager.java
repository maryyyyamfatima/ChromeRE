package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.tabs.TabLayout;
import defpackage.AbstractC2185Qv0;
import defpackage.AbstractC3965bi2;
import defpackage.AbstractC8207o22;
import defpackage.C10923vx3;
import defpackage.Dd4;
import defpackage.Ec4;
import defpackage.Ed4;
import defpackage.Fd4;
import defpackage.Gd4;
import defpackage.Hd4;
import defpackage.Id4;
import defpackage.Jd4;
import defpackage.Kd4;
import defpackage.Ld4;
import defpackage.Md4;
import defpackage.Nd4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] V = {R.attr.layout_gravity};
    public static final Dd4 W = new Dd4();
    public static final Ed4 a0 = new Ed4();
    public int A;
    public final boolean B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public VelocityTracker H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f11492J;
    public int K;
    public int L;
    public EdgeEffect M;
    public EdgeEffect N;
    public boolean O;
    public boolean P;
    public int Q;
    public ArrayList R;
    public ArrayList S;
    public final Fd4 T;
    public int U;
    public int a;
    public final ArrayList g;
    public final Id4 h;
    public final Rect i;
    public AbstractC3965bi2 j;
    public int k;
    public int l;
    public Parcelable m;
    public Scroller n;
    public boolean o;
    public Md4 p;
    public float q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final int v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new Nd4();
        public int h;
        public Parcelable i;
        public final ClassLoader j;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeInt(this.h);
            parcel.writeParcelable(this.i, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return AbstractC8207o22.a(sb, this.h, "}");
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.h = parcel.readInt();
            this.i = parcel.readParcelable(classLoader);
            this.j = classLoader;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ArrayList();
        this.h = new Id4();
        this.i = new Rect();
        this.l = -1;
        this.m = null;
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.v = 1;
        this.B = true;
        this.G = -1;
        this.O = true;
        this.T = new Fd4(this);
        this.U = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.n = new Scroller(context, a0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A = viewConfiguration.getScaledPagingTouchSlop();
        this.I = (int) (400.0f * f);
        this.f11492J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.M = new EdgeEffect(context);
        this.N = new EdgeEffect(context);
        this.K = (int) (25.0f * f);
        this.L = (int) (2.0f * f);
        this.y = (int) (f * 16.0f);
        Ec4.m(this, new Kd4(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        Ec4.o(this, new Gd4(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.T);
        Scroller scroller = this.n;
        if (scroller != null && !scroller.isFinished()) {
            this.n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final void y(int i) {
        if (this.U == i) {
            return;
        }
        this.U = i;
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Ld4 ld4 = (Ld4) this.R.get(i2);
                if (ld4 != null) {
                    ld4.b(i);
                }
            }
        }
    }

    public final void v(AbstractC3965bi2 abstractC3965bi2) {
        ArrayList arrayList;
        AbstractC3965bi2 abstractC3965bi22 = this.j;
        if (abstractC3965bi22 != null) {
            synchronized (abstractC3965bi22) {
                abstractC3965bi22.b = null;
            }
            this.j.n(this);
            int i = 0;
            while (true) {
                arrayList = this.g;
                if (i >= arrayList.size()) {
                    break;
                }
                Id4 id4 = (Id4) arrayList.get(i);
                AbstractC3965bi2 abstractC3965bi23 = this.j;
                int i2 = id4.b;
                abstractC3965bi23.d(this, id4.a);
                i++;
            }
            this.j.e();
            arrayList.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((Jd4) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.k = 0;
            scrollTo(0, 0);
        }
        this.j = abstractC3965bi2;
        this.a = 0;
        if (this.p == null) {
            this.p = new Md4(this);
        }
        AbstractC3965bi2 abstractC3965bi24 = this.j;
        Md4 md4 = this.p;
        synchronized (abstractC3965bi24) {
            abstractC3965bi24.b = md4;
        }
        this.u = false;
        boolean z = this.O;
        this.O = true;
        this.a = this.j.f();
        if (this.l >= 0) {
            this.j.k();
            x(this.l, 0, false, true);
            this.l = -1;
            this.m = null;
        } else if (z) {
            requestLayout();
        } else {
            r();
        }
        ArrayList arrayList2 = this.S;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.S.size();
        for (int i4 = 0; i4 < size; i4++) {
            C10923vx3 c10923vx3 = (C10923vx3) this.S.get(i4);
            TabLayout tabLayout = c10923vx3.b;
            if (tabLayout.M == this) {
                tabLayout.s(abstractC3965bi2, c10923vx3.a);
            }
        }
    }

    public final int i() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void w(int i) {
        this.u = false;
        x(i, 0, !this.O, false);
    }

    public final void x(int i, int i2, boolean z, boolean z2) {
        AbstractC3965bi2 abstractC3965bi2 = this.j;
        if (abstractC3965bi2 == null || abstractC3965bi2.f() <= 0) {
            z(false);
            return;
        }
        ArrayList arrayList = this.g;
        if (!z2 && this.k == i && arrayList.size() != 0) {
            z(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.j.f()) {
            i = this.j.f() - 1;
        }
        int i3 = this.k;
        int i4 = this.v;
        if (i > i3 + i4 || i < i3 - i4) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((Id4) arrayList.get(i5)).c = true;
            }
        }
        boolean z3 = this.k != i;
        if (this.O) {
            this.k = i;
            if (z3) {
                g(i);
            }
            requestLayout();
            return;
        }
        s(i);
        u(i, i2, z, z3);
    }

    public final void u(int i, int i2, boolean z, boolean z2) {
        int scrollX;
        int abs;
        Id4 l = l(i);
        int max = l != null ? (int) (Math.max(this.q, Math.min(l.e, this.r)) * i()) : 0;
        if (!z) {
            if (z2) {
                g(i);
            }
            e(false);
            scrollTo(max, 0);
            p(max);
            return;
        }
        if (getChildCount() == 0) {
            z(false);
        } else {
            Scroller scroller = this.n;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.o ? this.n.getCurrX() : this.n.getStartX();
                this.n.abortAnimation();
                z(false);
            } else {
                scrollX = getScrollX();
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = max - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                e(false);
                r();
                y(0);
            } else {
                z(true);
                y(2);
                int i6 = i();
                int i7 = i6 / 2;
                float f = i6;
                float f2 = i7;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int abs2 = Math.abs(i2);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.j.getClass();
                    abs = (int) (((Math.abs(i4) / ((f * 1.0f) + 0)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.o = false;
                this.n.startScroll(i3, scrollY, i4, i5, min);
                WeakHashMap weakHashMap = Ec4.a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            g(i);
        }
    }

    public final void b(Ld4 ld4) {
        if (this.R == null) {
            this.R = new ArrayList();
        }
        this.R.add(ld4);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final Id4 a(int i, int i2) {
        Id4 id4 = new Id4();
        id4.b = i;
        id4.a = this.j.h(i, this);
        this.j.getClass();
        id4.d = 1.0f;
        ArrayList arrayList = this.g;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(id4);
        } else {
            arrayList.add(i2, id4);
        }
        return id4;
    }

    public final void f() {
        int f = this.j.f();
        this.a = f;
        ArrayList arrayList = this.g;
        boolean z = arrayList.size() < (this.v * 2) + 1 && arrayList.size() < f;
        int i = this.k;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < arrayList.size()) {
            Id4 id4 = (Id4) arrayList.get(i2);
            int g = this.j.g(id4.a);
            if (g != -1) {
                if (g == -2) {
                    arrayList.remove(i2);
                    i2--;
                    if (!z2) {
                        this.j.n(this);
                        z2 = true;
                    }
                    this.j.d(this, id4.a);
                    int i3 = this.k;
                    if (i3 == id4.b) {
                        i = Math.max(0, Math.min(i3, (-1) + f));
                    }
                } else {
                    int i4 = id4.b;
                    if (i4 != g) {
                        if (i4 == this.k) {
                            i = g;
                        }
                        id4.b = g;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.j.e();
        }
        Collections.sort(arrayList, W);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                Jd4 jd4 = (Jd4) getChildAt(i5).getLayoutParams();
                if (!jd4.a) {
                    jd4.c = 0.0f;
                }
            }
            x(i, 0, false, true);
            requestLayout();
        }
    }

    public final void r() {
        s(this.k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:            if (r7 == r8) goto L26;     */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r15) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.s(int):void");
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.h = this.k;
        AbstractC3965bi2 abstractC3965bi2 = this.j;
        if (abstractC3965bi2 != null) {
            abstractC3965bi2.l();
            savedState.i = null;
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        AbstractC3965bi2 abstractC3965bi2 = this.j;
        if (abstractC3965bi2 != null) {
            abstractC3965bi2.k();
            x(savedState.h, 0, false, true);
        } else {
            this.l = savedState.h;
            this.m = savedState.i;
            ClassLoader classLoader = savedState.j;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        Jd4 jd4 = (Jd4) layoutParams;
        boolean z = jd4.a | (view.getClass().getAnnotation(Hd4.class) != null);
        jd4.a = z;
        if (!this.s) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            jd4.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.s) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final Id4 j(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return null;
            }
            Id4 id4 = (Id4) arrayList.get(i);
            if (this.j.i(view, id4.a)) {
                return id4;
            }
            i++;
        }
    }

    public final Id4 l(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i2 >= arrayList.size()) {
                return null;
            }
            Id4 id4 = (Id4) arrayList.get(i2);
            if (id4.b == i) {
                return id4;
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Jd4 jd4;
        Jd4 jd42;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.z = Math.min(measuredWidth / 10, this.y);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (jd42 = (Jd4) childAt.getLayoutParams()) != null && jd42.a) {
                int i6 = jd42.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) jd42).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) jd42).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.s = true;
        r();
        this.s = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((jd4 = (Jd4) childAt2.getLayoutParams()) == null || !jd4.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * jd4.c), 1073741824), makeMeasureSpec);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 > 0 && !this.g.isEmpty()) {
                if (!this.n.isFinished()) {
                    this.n.setFinalX(i() * this.k);
                    return;
                } else {
                    scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + 0)) * (((i - getPaddingLeft()) - getPaddingRight()) + 0)), getScrollY());
                    return;
                }
            }
            Id4 l = l(this.k);
            int min = (int) ((l != null ? Math.min(l.e, this.r) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (min != getScrollX()) {
                e(false);
                scrollTo(min, getScrollY());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.o = true;
        if (!this.n.isFinished() && this.n.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.n.getCurrX();
            int currY = this.n.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!p(currX)) {
                    this.n.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap weakHashMap = Ec4.a;
            postInvalidateOnAnimation();
            return;
        }
        e(true);
    }

    public final boolean p(int i) {
        if (this.g.size() == 0) {
            if (this.O) {
                return false;
            }
            this.P = false;
            m(0.0f, 0, 0);
            if (this.P) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        Id4 k = k();
        int i2 = i();
        int i3 = i2 + 0;
        float f = i2;
        int i4 = k.b;
        float f2 = ((i / f) - k.e) / (k.d + (0 / f));
        this.P = false;
        m(f2, i4, (int) (i3 * f2));
        if (this.P) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(float r13, int r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.Q
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            Jd4 r9 = (defpackage.Jd4) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            java.util.ArrayList r0 = r12.R
            if (r0 == 0) goto L85
            int r0 = r0.size()
        L73:
            if (r1 >= r0) goto L85
            java.util.ArrayList r3 = r12.R
            java.lang.Object r3 = r3.get(r1)
            Ld4 r3 = (defpackage.Ld4) r3
            if (r3 == 0) goto L82
            r3.a(r13, r14, r15)
        L82:
            int r1 = r1 + 1
            goto L73
        L85:
            r12.P = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m(float, int, int):void");
    }

    public final void g(int i) {
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Ld4 ld4 = (Ld4) this.R.get(i2);
                if (ld4 != null) {
                    ld4.c(i);
                }
            }
        }
    }

    public final void e(boolean z) {
        boolean z2 = this.U == 2;
        if (z2) {
            z(false);
            if (!this.n.isFinished()) {
                this.n.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.n.getCurrX();
                int currY = this.n.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        p(currX);
                    }
                }
            }
        }
        this.u = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                break;
            }
            Id4 id4 = (Id4) arrayList.get(i);
            if (id4.c) {
                id4.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            Fd4 fd4 = this.T;
            if (z) {
                WeakHashMap weakHashMap = Ec4.a;
                postOnAnimation(fd4);
            } else {
                fd4.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.w) {
                return true;
            }
            if (this.x) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.E = x;
            this.C = x;
            float y = motionEvent.getY();
            this.F = y;
            this.D = y;
            this.G = motionEvent.getPointerId(0);
            this.x = false;
            this.o = true;
            this.n.computeScrollOffset();
            if (this.U == 2 && Math.abs(this.n.getFinalX() - this.n.getCurrX()) > this.L) {
                this.n.abortAnimation();
                this.u = false;
                r();
                this.w = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                y(1);
            } else if (AbstractC2185Qv0.a(this.M) != 0.0f || AbstractC2185Qv0.a(this.N) != 0.0f) {
                this.w = true;
                y(1);
                if (AbstractC2185Qv0.a(this.M) != 0.0f) {
                    AbstractC2185Qv0.b(this.M, 0.0f, 1.0f - (this.D / getHeight()));
                }
                if (AbstractC2185Qv0.a(this.N) != 0.0f) {
                    AbstractC2185Qv0.b(this.N, 0.0f, this.D / getHeight());
                }
            } else {
                e(false);
                this.w = false;
            }
        } else if (action == 2) {
            int i = this.G;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.C;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.F);
                if (f != 0.0f) {
                    float f2 = this.C;
                    if (!(!this.B && ((f2 < ((float) this.z) && f > 0.0f) || (f2 > ((float) (getWidth() - this.z)) && f < 0.0f))) && d((int) f, (int) x2, (int) y2, this, false)) {
                        this.C = x2;
                        this.D = y2;
                        this.x = true;
                        return false;
                    }
                }
                float f3 = this.A;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.w = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    y(1);
                    this.C = f > 0.0f ? this.E + this.A : this.E - this.A;
                    this.D = y2;
                    z(true);
                } else if (abs2 > f3) {
                    this.x = true;
                }
                if (this.w && q(x2, y2)) {
                    WeakHashMap weakHashMap = Ec4.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            n(motionEvent);
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        return this.w;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC3965bi2 abstractC3965bi2;
        int i;
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC3965bi2 = this.j) == null || abstractC3965bi2.f() == 0) {
            return false;
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.n.abortAnimation();
            this.u = false;
            r();
            float x = motionEvent.getX();
            this.E = x;
            this.C = x;
            float y = motionEvent.getY();
            this.F = y;
            this.D = y;
            this.G = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.w) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.G);
                    if (findPointerIndex == -1) {
                        z = t();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.C);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.D);
                        if (abs > this.A && abs > abs2) {
                            this.w = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f = this.E;
                            this.C = x2 - f > 0.0f ? f + this.A : f - this.A;
                            this.D = y2;
                            y(1);
                            z(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.w) {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.G);
                    z = false | q(motionEvent.getX(findPointerIndex2), motionEvent.getY(findPointerIndex2));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.C = motionEvent.getX(actionIndex);
                    this.G = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    n(motionEvent);
                    this.C = motionEvent.getX(motionEvent.findPointerIndex(this.G));
                }
            } else if (this.w) {
                u(this.k, 0, true, false);
                z = t();
            }
        } else if (this.w) {
            VelocityTracker velocityTracker = this.H;
            velocityTracker.computeCurrentVelocity(1000, this.f11492J);
            int xVelocity = (int) velocityTracker.getXVelocity(this.G);
            this.u = true;
            int i2 = i();
            int scrollX = getScrollX();
            Id4 k = k();
            float f2 = i2;
            int i3 = k.b;
            float f3 = ((scrollX / f2) - k.e) / (k.d + (0 / f2));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.G)) - this.E)) <= this.K || Math.abs(xVelocity) <= this.I || AbstractC2185Qv0.a(this.M) != 0.0f || AbstractC2185Qv0.a(this.N) != 0.0f) {
                i = ((int) (f3 + (i3 >= this.k ? 0.4f : 0.6f))) + i3;
            } else {
                i = xVelocity > 0 ? i3 : i3 + 1;
            }
            ArrayList arrayList = this.g;
            if (arrayList.size() > 0) {
                i = Math.max(((Id4) arrayList.get(0)).b, Math.min(i, ((Id4) arrayList.get(arrayList.size() - 1)).b));
            }
            x(i, xVelocity, true, true);
            z = t();
            if (i == i3 && z) {
                if (AbstractC2185Qv0.a(this.N) != 0.0f) {
                    this.N.onAbsorb(-xVelocity);
                } else if (AbstractC2185Qv0.a(this.M) != 0.0f) {
                    this.M.onAbsorb(xVelocity);
                }
            }
        }
        if (z) {
            WeakHashMap weakHashMap = Ec4.a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean t() {
        this.G = -1;
        this.w = false;
        this.x = false;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
        this.M.onRelease();
        this.N.onRelease();
        return (this.M.isFinished() && this.N.isFinished()) ? false : true;
    }

    public final boolean q(float f, float f2) {
        float b;
        boolean z;
        float f3 = this.C - f;
        this.C = f;
        float height = f2 / getHeight();
        float width = f3 / getWidth();
        if (AbstractC2185Qv0.a(this.M) != 0.0f) {
            b = -AbstractC2185Qv0.b(this.M, -width, 1.0f - height);
        } else {
            b = AbstractC2185Qv0.a(this.N) != 0.0f ? AbstractC2185Qv0.b(this.N, width, height) : 0.0f;
        }
        float width2 = b * getWidth();
        float f4 = f3 - width2;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = width2 != 0.0f;
        if (Math.abs(f4) < 1.0E-4f) {
            return z4;
        }
        float scrollX = getScrollX() + f4;
        float i = i();
        float f5 = this.q * i;
        float f6 = this.r * i;
        ArrayList arrayList = this.g;
        Id4 id4 = (Id4) arrayList.get(0);
        Id4 id42 = (Id4) arrayList.get(arrayList.size() - 1);
        if (id4.b != 0) {
            f5 = id4.e * i;
            z = false;
        } else {
            z = true;
        }
        if (id42.b != this.j.f() - 1) {
            f6 = id42.e * i;
        } else {
            z3 = true;
        }
        if (scrollX < f5) {
            if (z) {
                AbstractC2185Qv0.b(this.M, (f5 - scrollX) / i, 1.0f - (f2 / getHeight()));
            } else {
                z2 = z4;
            }
            z4 = z2;
            scrollX = f5;
        } else if (scrollX > f6) {
            if (z3) {
                AbstractC2185Qv0.b(this.N, (scrollX - f6) / i, f2 / getHeight());
            } else {
                z2 = z4;
            }
            z4 = z2;
            scrollX = f6;
        }
        int i2 = (int) scrollX;
        this.C = (scrollX - i2) + this.C;
        scrollTo(i2, getScrollY());
        p(i2);
        return z4;
    }

    public final Id4 k() {
        Id4 id4;
        int i;
        int i2 = i();
        float f = 0.0f;
        float scrollX = i2 > 0 ? getScrollX() / i2 : 0.0f;
        float f2 = i2 > 0 ? 0 / i2 : 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z = true;
        Id4 id42 = null;
        float f3 = 0.0f;
        while (true) {
            ArrayList arrayList = this.g;
            if (i4 >= arrayList.size()) {
                return id42;
            }
            Id4 id43 = (Id4) arrayList.get(i4);
            if (z || id43.b == (i = i3 + 1)) {
                id4 = id43;
            } else {
                float f4 = f + f3 + f2;
                id4 = this.h;
                id4.e = f4;
                id4.b = i;
                this.j.getClass();
                id4.d = 1.0f;
                i4--;
            }
            f = id4.e;
            float f5 = id4.d + f + f2;
            if (!z && scrollX < f) {
                return id42;
            }
            if (scrollX < f5 || i4 == arrayList.size() - 1) {
                break;
            }
            i3 = id4.b;
            i4++;
            z = false;
            id42 = id4;
            f3 = id4.d;
        }
        return id4;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC3965bi2 abstractC3965bi2;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC3965bi2 = this.j) != null && abstractC3965bi2.f() > 1)) {
            if (!this.M.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.q * width);
                this.M.setSize(height, width);
                z = false | this.M.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.N.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.r + 1.0f)) * width2);
                this.N.setSize(height2, width2);
                z |= this.N.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.M.finish();
            this.N.finish();
        }
        if (z) {
            WeakHashMap weakHashMap = Ec4.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            int i = actionIndex == 0 ? 1 : 0;
            this.C = motionEvent.getX(i);
            this.G = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void z(boolean z) {
        if (this.t != z) {
            this.t = z;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.j == null) {
            return false;
        }
        int i2 = i();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) i2) * this.q)) : i > 0 && scrollX < ((int) (((float) i2) * this.r));
    }

    public static boolean d(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L66
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L61
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L61
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.c(r4)
            goto L62
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L61
            boolean r6 = r5.c(r1)
            goto L62
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.o()
            goto L62
        L41:
            r6 = 66
            boolean r6 = r5.c(r6)
            goto L62
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L5a
            int r6 = r5.k
            if (r6 <= 0) goto L61
            int r6 = r6 - r1
            r5.u = r2
            r5.x(r6, r2, r1, r2)
            r6 = r1
            goto L62
        L5a:
            r6 = 17
            boolean r6 = r5.c(r6)
            goto L62
        L61:
            r6 = r2
        L62:
            if (r6 == 0) goto L65
            goto L66
        L65:
            r1 = r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 1
            r2 = 0
            if (r0 != r7) goto L9
            goto L63
        L9:
            if (r0 == 0) goto L64
            android.view.ViewParent r3 = r0.getParent()
        Lf:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L1c
            if (r3 != r7) goto L17
            r3 = r1
            goto L1d
        L17:
            android.view.ViewParent r3 = r3.getParent()
            goto Lf
        L1c:
            r3 = r2
        L1d:
            if (r3 != 0) goto L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L33:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L4c
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L33
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "ViewPager"
            android.util.Log.e(r3, r0)
        L63:
            r0 = 0
        L64:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r7, r0, r8)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb5
            if (r3 == r0) goto Lb5
            android.graphics.Rect r6 = r7.i
            if (r8 != r5) goto L99
            android.graphics.Rect r4 = r7.h(r6, r3)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.h(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L93
            if (r4 < r5) goto L93
            int r0 = r7.k
            if (r0 <= 0) goto Lcf
            int r0 = r0 - r1
            r7.u = r2
            r7.x(r0, r2, r1, r2)
            goto Ld0
        L93:
            boolean r0 = r3.requestFocus()
        L97:
            r2 = r0
            goto Ld1
        L99:
            if (r8 != r4) goto Ld1
            android.graphics.Rect r1 = r7.h(r6, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r7.h(r6, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lb0
            if (r1 > r2) goto Lb0
            boolean r0 = r7.o()
            goto L97
        Lb0:
            boolean r0 = r3.requestFocus()
            goto L97
        Lb5:
            if (r8 == r5) goto Lc4
            if (r8 != r1) goto Lba
            goto Lc4
        Lba:
            if (r8 == r4) goto Lbf
            r0 = 2
            if (r8 != r0) goto Ld1
        Lbf:
            boolean r2 = r7.o()
            goto Ld1
        Lc4:
            int r0 = r7.k
            if (r0 <= 0) goto Lcf
            int r0 = r0 - r1
            r7.u = r2
            r7.x(r0, r2, r1, r2)
            goto Ld0
        Lcf:
            r1 = r2
        Ld0:
            r2 = r1
        Ld1:
            if (r2 == 0) goto Lda
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Lda:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final boolean o() {
        AbstractC3965bi2 abstractC3965bi2 = this.j;
        if (abstractC3965bi2 == null || this.k >= abstractC3965bi2.f() - 1) {
            return false;
        }
        int i = this.k + 1;
        this.u = false;
        x(i, 0, true, false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        Id4 j;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (j = j(childAt)) != null && j.b == this.k) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        Id4 j;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (j = j(childAt)) != null && j.b == this.k) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        Id4 j;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (j = j(childAt)) != null && j.b == this.k && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Id4 j;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (j = j(childAt)) != null && j.b == this.k && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new Jd4();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof Jd4) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new Jd4(getContext(), attributeSet);
    }
}
