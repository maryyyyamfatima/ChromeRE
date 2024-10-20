package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import com.android.chrome.R;
import defpackage.AbstractC3779b90;
import defpackage.C0331Co0;
import defpackage.C1439Lb3;
import defpackage.C5153f90;
import defpackage.C5389fq4;
import defpackage.C5841h90;
import defpackage.C6185i90;
import defpackage.C9893sx2;
import defpackage.C9921t22;
import defpackage.Ec4;
import defpackage.InterfaceC3435a90;
import defpackage.InterfaceC4122c90;
import defpackage.InterfaceC9208qx2;
import defpackage.InterfaceC9235r22;
import defpackage.InterfaceC9578s22;
import defpackage.JG2;
import defpackage.ViewGroupOnHierarchyChangeListenerC4466d90;
import defpackage.ViewTreeObserverOnPreDrawListenerC5497g90;
import defpackage.Xc4;
import defpackage.Z80;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC9235r22, InterfaceC9578s22 {
    public static final C6185i90 A;
    public static final C9893sx2 B;
    public static final String x;
    public static final Class[] y;
    public static final ThreadLocal z;
    public final ArrayList a;
    public final C0331Co0 g;
    public final ArrayList h;
    public final int[] i;
    public final int[] j;
    public boolean k;
    public boolean l;
    public final int[] m;
    public View n;
    public View o;
    public ViewTreeObserverOnPreDrawListenerC5497g90 p;
    public boolean q;
    public C5389fq4 r;
    public boolean s;
    public final Drawable t;
    public ViewGroup.OnHierarchyChangeListener u;
    public Z80 v;
    public final C9921t22 w;

    @Override // defpackage.InterfaceC9235r22
    public final void g(View view, View view2, int i, int i2) {
        C9921t22 c9921t22 = this.w;
        if (i2 == 1) {
            c9921t22.b = i;
        } else {
            c9921t22.a = i;
        }
        this.o = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C5153f90) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C5841h90();
        public SparseArray h;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            SparseArray sparseArray = this.h;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.h.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.h.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.h = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.h.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        C9921t22 c9921t22 = this.w;
        return c9921t22.b | c9921t22.a;
    }

    public final void c(View view) {
        ArrayList arrayList = (ArrayList) this.g.b.get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View view2 = (View) arrayList.get(i);
            AbstractC3779b90 abstractC3779b90 = ((C5153f90) view2.getLayoutParams()).a;
            if (abstractC3779b90 != null) {
                abstractC3779b90.d(this, view2, view);
            }
        }
    }

    @Override // defpackage.InterfaceC9235r22
    public final void h(View view, int i) {
        C9921t22 c9921t22 = this.w;
        if (i == 1) {
            c9921t22.b = 0;
        } else {
            c9921t22.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C5153f90 c5153f90 = (C5153f90) childAt.getLayoutParams();
            if (c5153f90.a(i)) {
                AbstractC3779b90 abstractC3779b90 = c5153f90.a;
                if (abstractC3779b90 != null) {
                    abstractC3779b90.o(this, childAt, view, i);
                }
                if (i == 0) {
                    c5153f90.n = false;
                } else if (i == 1) {
                    c5153f90.o = false;
                }
                c5153f90.p = false;
            }
        }
        this.o = null;
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        x = r0 != null ? r0.getName() : null;
        A = new C6185i90();
        y = new Class[]{Context.class, AttributeSet.class};
        z = new ThreadLocal();
        B = new C9893sx2(12);
    }

    public final List k(View view) {
        C1439Lb3 c1439Lb3 = this.g.b;
        int i = c1439Lb3.h;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c1439Lb3.j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1439Lb3.f(i2));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public static Rect a() {
        Rect rect = (Rect) B.b();
        return rect == null ? new Rect() : rect;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f5800_resource_name_obfuscated_res_0x7f050171);
        this.a = new ArrayList();
        this.g = new C0331Co0();
        this.h = new ArrayList();
        this.i = new int[2];
        this.j = new int[2];
        this.w = new C9921t22();
        int[] iArr = JG2.I;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.f5800_resource_name_obfuscated_res_0x7f050171, 0);
        Ec4.l(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.f5800_resource_name_obfuscated_res_0x7f050171, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.m = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.m[i] = (int) (r2[i] * f);
            }
        }
        this.t = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC4466d90(this));
        WeakHashMap weakHashMap = Ec4.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.u = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        if (this.q) {
            if (this.p == null) {
                this.p = new ViewTreeObserverOnPreDrawListenerC5497g90(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.p);
        }
        if (this.r == null) {
            WeakHashMap weakHashMap = Ec4.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.l = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
        if (this.q && this.p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.p);
        }
        View view = this.o;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.l = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        boolean z2 = false;
        Drawable drawable = this.t;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.t;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        drawable.setVisible(z2, false);
    }

    public final void v() {
        View view = this.n;
        if (view != null) {
            AbstractC3779b90 abstractC3779b90 = ((C5153f90) view.getLayoutParams()).a;
            if (abstractC3779b90 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                abstractC3779b90.p(this, this.n, obtain);
                obtain.recycle();
            }
            this.n = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((C5153f90) getChildAt(i).getLayoutParams()).m = false;
        }
        this.k = false;
    }

    public final boolean u(MotionEvent motionEvent, int i) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.h;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C6185i90 c6185i90 = A;
        if (c6185i90 != null) {
            Collections.sort(arrayList, c6185i90);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            C5153f90 c5153f90 = (C5153f90) view.getLayoutParams();
            AbstractC3779b90 abstractC3779b90 = c5153f90.a;
            if (!(z3 || z4) || actionMasked == 0) {
                if (!z4 && !z3 && abstractC3779b90 != null && (z3 = t(abstractC3779b90, view, motionEvent, i))) {
                    this.n = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = (View) arrayList.get(i4);
                            AbstractC3779b90 abstractC3779b902 = ((C5153f90) view2.getLayoutParams()).a;
                            if (abstractC3779b902 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = MotionEvent.obtain(motionEvent);
                                    motionEvent2.setAction(3);
                                }
                                t(abstractC3779b902, view2, motionEvent2, i);
                            }
                        }
                    }
                }
                if (c5153f90.a == null) {
                    c5153f90.m = false;
                }
                boolean z5 = c5153f90.m;
                if (z5) {
                    z2 = true;
                } else {
                    z2 = z5 | false;
                    c5153f90.m = z2;
                }
                z4 = z2 && !z5;
                if (z2 && !z4) {
                    break;
                }
            } else if (abstractC3779b90 != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = MotionEvent.obtain(motionEvent);
                    motionEvent2.setAction(3);
                }
                t(abstractC3779b90, view, motionEvent2, i);
            }
        }
        arrayList.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z3;
    }

    public final boolean t(AbstractC3779b90 abstractC3779b90, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return abstractC3779b90.f(this, view, motionEvent);
        }
        if (i == 1) {
            return abstractC3779b90.p(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v();
        }
        boolean u = u(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.n = null;
            v();
        }
        return u;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean u;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.n;
        boolean z2 = false;
        if (view == null) {
            u = u(motionEvent, 1);
            if (actionMasked != 0 && u) {
                z2 = true;
            }
        } else {
            AbstractC3779b90 abstractC3779b90 = ((C5153f90) view.getLayoutParams()).a;
            u = abstractC3779b90 != null ? abstractC3779b90.p(this, this.n, motionEvent) : false;
        }
        if (this.n == null || actionMasked == 3) {
            u |= super.onTouchEvent(motionEvent);
        } else if (z2) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            obtain.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.n = null;
            v();
        }
        return u;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.k) {
            return;
        }
        if (this.n == null) {
            int childCount = getChildCount();
            MotionEvent motionEvent = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                AbstractC3779b90 abstractC3779b90 = ((C5153f90) childAt.getLayoutParams()).a;
                if (abstractC3779b90 != null) {
                    if (motionEvent == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    abstractC3779b90.f(this, childAt, motionEvent);
                }
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        v();
        this.k = true;
    }

    public final int n(int i) {
        int[] iArr = this.m;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i < 0 || i >= iArr.length) {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
        return iArr[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C5153f90 o(View view) {
        C5153f90 c5153f90 = (C5153f90) view.getLayoutParams();
        if (!c5153f90.b) {
            if (view instanceof InterfaceC3435a90) {
                AbstractC3779b90 a = ((InterfaceC3435a90) view).a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c5153f90.b(a);
                c5153f90.b = true;
            } else {
                InterfaceC4122c90 interfaceC4122c90 = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC4122c90 = (InterfaceC4122c90) cls.getAnnotation(InterfaceC4122c90.class);
                    if (interfaceC4122c90 != null) {
                        break;
                    }
                }
                if (interfaceC4122c90 != null) {
                    try {
                        c5153f90.b((AbstractC3779b90) interfaceC4122c90.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC4122c90.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                c5153f90.b = true;
            }
        }
        return c5153f90;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0323, code lost:            if (r0.h(r31, r20, r25, r16, r26) == false) goto L186;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014e, code lost:            throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0071, code lost:            if (r12 != false) goto L58;     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r32, int r33) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final void l(Rect rect, View view) {
        ThreadLocal threadLocal = Xc4.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = Xc4.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        Xc4.a(this, view, matrix);
        ThreadLocal threadLocal3 = Xc4.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public final void s(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final void r(View view, int i) {
        Rect a;
        Rect a2;
        C5153f90 c5153f90 = (C5153f90) view.getLayoutParams();
        View view2 = c5153f90.k;
        int i2 = 0;
        if (view2 == null && c5153f90.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C9893sx2 c9893sx2 = B;
        if (view2 != null) {
            a = a();
            a2 = a();
            try {
                l(a, view2);
                C5153f90 c5153f902 = (C5153f90) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i, a, a2, c5153f902, measuredWidth, measuredHeight);
                b(c5153f902, a2, measuredWidth, measuredHeight);
                view.layout(a2.left, a2.top, a2.right, a2.bottom);
                return;
            } finally {
                a.setEmpty();
                c9893sx2.a(a);
                a2.setEmpty();
                c9893sx2.a(a2);
            }
        }
        int i3 = c5153f90.e;
        if (i3 < 0) {
            C5153f90 c5153f903 = (C5153f90) view.getLayoutParams();
            a = a();
            a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c5153f903).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c5153f903).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c5153f903).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c5153f903).bottomMargin);
            if (this.r != null) {
                WeakHashMap weakHashMap = Ec4.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    a.left = this.r.b() + a.left;
                    a.top = this.r.d() + a.top;
                    a.right -= this.r.c();
                    a.bottom -= this.r.a();
                }
            }
            a2 = a();
            int i4 = c5153f903.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
            return;
        }
        C5153f90 c5153f904 = (C5153f90) view.getLayoutParams();
        int i5 = c5153f904.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int n = n(i3) - measuredWidth2;
        if (i6 == 1) {
            n += measuredWidth2 / 2;
        } else if (i6 == 5) {
            n += measuredWidth2;
        }
        if (i7 == 16) {
            i2 = 0 + (measuredHeight2 / 2);
        } else if (i7 == 80) {
            i2 = measuredHeight2 + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c5153f904).leftMargin, Math.min(n, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c5153f904).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c5153f904).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c5153f904).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        AbstractC3779b90 abstractC3779b90;
        WeakHashMap weakHashMap = Ec4.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC3779b90 = ((C5153f90) view.getLayoutParams()).a) == null || !abstractC3779b90.g(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!this.s || (drawable = this.t) == null) {
            return;
        }
        C5389fq4 c5389fq4 = this.r;
        int d = c5389fq4 != null ? c5389fq4.d() : 0;
        if (d > 0) {
            drawable.setBounds(0, 0, getWidth(), d);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        y();
    }

    public final void j(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            l(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public static void m(int i, Rect rect, Rect rect2, C5153f90 c5153f90, int i2, int i3) {
        int width;
        int height;
        int i4 = c5153f90.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c5153f90.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i9 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public final void b(C5153f90 c5153f90, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c5153f90).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c5153f90).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c5153f90).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c5153f90).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC3779b90 abstractC3779b90 = ((C5153f90) view.getLayoutParams()).a;
        if (abstractC3779b90 != null) {
            abstractC3779b90.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    public final void q(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        int i10;
        C5153f90 c5153f90;
        ArrayList arrayList2;
        int i11;
        Rect rect2;
        int i12;
        View view;
        C9893sx2 c9893sx2;
        C5153f90 c5153f902;
        int i13;
        boolean z6;
        AbstractC3779b90 abstractC3779b90;
        WeakHashMap weakHashMap = Ec4.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.a;
        int size = arrayList3.size();
        Rect a = a();
        Rect a2 = a();
        Rect a3 = a();
        int i14 = 0;
        while (true) {
            C9893sx2 c9893sx22 = B;
            if (i14 >= size) {
                Rect rect3 = a3;
                a.setEmpty();
                c9893sx22.a(a);
                a2.setEmpty();
                c9893sx22.a(a2);
                rect3.setEmpty();
                c9893sx22.a(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i14);
            C5153f90 c5153f903 = (C5153f90) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i15 = 0;
                while (i15 < i14) {
                    if (c5153f903.l == ((View) arrayList3.get(i15))) {
                        C5153f90 c5153f904 = (C5153f90) view2.getLayoutParams();
                        if (c5153f904.k != null) {
                            Rect a4 = a();
                            Rect a5 = a();
                            arrayList2 = arrayList3;
                            Rect a6 = a();
                            i10 = i15;
                            l(a4, c5153f904.k);
                            j(view2, a5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            i11 = size;
                            int measuredHeight = view2.getMeasuredHeight();
                            i12 = i14;
                            c5153f90 = c5153f903;
                            view = view2;
                            rect2 = a3;
                            c9893sx2 = c9893sx22;
                            m(layoutDirection, a4, a6, c5153f904, measuredWidth, measuredHeight);
                            if (a6.left == a5.left && a6.top == a5.top) {
                                c5153f902 = c5153f904;
                                i13 = measuredWidth;
                                z6 = false;
                            } else {
                                c5153f902 = c5153f904;
                                i13 = measuredWidth;
                                z6 = true;
                            }
                            b(c5153f902, a6, i13, measuredHeight);
                            int i16 = a6.left - a5.left;
                            int i17 = a6.top - a5.top;
                            if (i16 != 0) {
                                WeakHashMap weakHashMap2 = Ec4.a;
                                view.offsetLeftAndRight(i16);
                            }
                            if (i17 != 0) {
                                WeakHashMap weakHashMap3 = Ec4.a;
                                view.offsetTopAndBottom(i17);
                            }
                            if (z6 && (abstractC3779b90 = c5153f902.a) != null) {
                                abstractC3779b90.d(this, view, c5153f902.k);
                            }
                            a4.setEmpty();
                            c9893sx2.a(a4);
                            a5.setEmpty();
                            c9893sx2.a(a5);
                            a6.setEmpty();
                            c9893sx2.a(a6);
                            i15 = i10 + 1;
                            c9893sx22 = c9893sx2;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i11;
                            i14 = i12;
                            c5153f903 = c5153f90;
                            a3 = rect2;
                        }
                    }
                    i10 = i15;
                    c5153f90 = c5153f903;
                    arrayList2 = arrayList3;
                    i11 = size;
                    rect2 = a3;
                    i12 = i14;
                    view = view2;
                    c9893sx2 = c9893sx22;
                    i15 = i10 + 1;
                    c9893sx22 = c9893sx2;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i11;
                    i14 = i12;
                    c5153f903 = c5153f90;
                    a3 = rect2;
                }
                C5153f90 c5153f905 = c5153f903;
                ArrayList arrayList4 = arrayList3;
                int i18 = size;
                Rect rect4 = a3;
                i2 = i14;
                View view3 = view2;
                InterfaceC9208qx2 interfaceC9208qx2 = c9893sx22;
                j(view3, a2, true);
                if (c5153f905.g != 0 && !a2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c5153f905.g, layoutDirection);
                    int i19 = absoluteGravity & 112;
                    if (i19 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i19 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i20 = absoluteGravity & 7;
                    if (i20 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i20 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (c5153f905.h != 0 && view3.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = Ec4.a;
                    if (view3.isLaidOut() && view3.getWidth() > 0 && view3.getHeight() > 0) {
                        C5153f90 c5153f906 = (C5153f90) view3.getLayoutParams();
                        AbstractC3779b90 abstractC3779b902 = c5153f906.a;
                        Rect a7 = a();
                        Rect a8 = a();
                        a8.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                        if (abstractC3779b902 == null || !abstractC3779b902.a(view3, a7)) {
                            a7.set(a8);
                        } else if (!a8.contains(a7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a7.toShortString() + " | Bounds:" + a8.toShortString());
                        }
                        a8.setEmpty();
                        interfaceC9208qx2.a(a8);
                        if (a7.isEmpty()) {
                            a7.setEmpty();
                            interfaceC9208qx2.a(a7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c5153f906.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (a7.top - ((ViewGroup.MarginLayoutParams) c5153f906).topMargin) - c5153f906.j) >= (i9 = a.top)) {
                                z3 = false;
                            } else {
                                x(view3, i9 - i8);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a7.bottom) - ((ViewGroup.MarginLayoutParams) c5153f906).bottomMargin) + c5153f906.j) < (i7 = a.bottom)) {
                                x(view3, height - i7);
                                z3 = true;
                            }
                            if (!z3) {
                                x(view3, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (a7.left - ((ViewGroup.MarginLayoutParams) c5153f906).leftMargin) - c5153f906.i) >= (i6 = a.left)) {
                                z4 = false;
                            } else {
                                w(view3, i6 - i5);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 5) != 5 || (width = ((getWidth() - a7.right) - ((ViewGroup.MarginLayoutParams) c5153f906).rightMargin) + c5153f906.i) >= (i4 = a.right)) {
                                z5 = z4;
                            } else {
                                w(view3, width - i4);
                                z5 = true;
                            }
                            if (!z5) {
                                w(view3, 0);
                            }
                            a7.setEmpty();
                            interfaceC9208qx2.a(a7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect4;
                    rect.set(((C5153f90) view3.getLayoutParams()).q);
                    if (rect.equals(a2)) {
                        arrayList = arrayList4;
                        i3 = i18;
                    } else {
                        ((C5153f90) view3.getLayoutParams()).q.set(a2);
                    }
                } else {
                    rect = rect4;
                }
                int i21 = i2 + 1;
                i3 = i18;
                while (true) {
                    arrayList = arrayList4;
                    if (i21 >= i3) {
                        break;
                    }
                    View view4 = (View) arrayList.get(i21);
                    C5153f90 c5153f907 = (C5153f90) view4.getLayoutParams();
                    AbstractC3779b90 abstractC3779b903 = c5153f907.a;
                    if (abstractC3779b903 != null && abstractC3779b903.b(view3)) {
                        if (i == 0 && c5153f907.p) {
                            c5153f907.p = false;
                        } else {
                            if (i != 2) {
                                abstractC3779b903.d(this, view4, view3);
                                z2 = false;
                            } else {
                                abstractC3779b903.e(this, view3);
                                z2 = true;
                            }
                            if (i == 1) {
                                c5153f907.p = z2;
                            }
                        }
                    }
                    i21++;
                    arrayList4 = arrayList;
                }
            } else {
                arrayList = arrayList3;
                i3 = size;
                rect = a3;
                i2 = i14;
            }
            i14 = i2 + 1;
            a3 = rect;
            size = i3;
            arrayList3 = arrayList;
        }
    }

    public static void w(View view, int i) {
        C5153f90 c5153f90 = (C5153f90) view.getLayoutParams();
        int i2 = c5153f90.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = Ec4.a;
            view.offsetLeftAndRight(i - i2);
            c5153f90.i = i;
        }
    }

    public static void x(View view, int i) {
        C5153f90 c5153f90 = (C5153f90) view.getLayoutParams();
        int i2 = c5153f90.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = Ec4.a;
            view.offsetTopAndBottom(i - i2);
            c5153f90.j = i;
        }
    }

    public final boolean p(View view, int i, int i2) {
        C9893sx2 c9893sx2 = B;
        Rect a = a();
        l(a, view);
        try {
            return a.contains(i, i2);
        } finally {
            a.setEmpty();
            c9893sx2.a(a);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5153f90(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C5153f90) {
            return new C5153f90((C5153f90) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C5153f90((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C5153f90(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5153f90();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C5153f90) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // defpackage.InterfaceC9235r22
    public final boolean f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C5153f90 c5153f90 = (C5153f90) childAt.getLayoutParams();
                AbstractC3779b90 abstractC3779b90 = c5153f90.a;
                if (abstractC3779b90 != null) {
                    boolean n = abstractC3779b90.n(this, childAt, view, i, i2);
                    z2 |= n;
                    if (i2 == 0) {
                        c5153f90.n = n;
                    } else if (i2 == 1) {
                        c5153f90.o = n;
                    }
                } else if (i2 == 0) {
                    c5153f90.n = false;
                } else if (i2 == 1) {
                    c5153f90.o = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        g(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        e(view, i, i2, i3, i4, 0);
    }

    @Override // defpackage.InterfaceC9235r22
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, 0, this.j);
    }

    @Override // defpackage.InterfaceC9578s22
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC3779b90 abstractC3779b90;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C5153f90 c5153f90 = (C5153f90) childAt.getLayoutParams();
                if (c5153f90.a(i5) && (abstractC3779b90 = c5153f90.a) != null) {
                    int[] iArr2 = this.i;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC3779b90.j(this, childAt, i3, i4, iArr2);
                    if (i3 > 0) {
                        min = Math.max(i6, iArr2[0]);
                    } else {
                        min = Math.min(i6, iArr2[0]);
                    }
                    i6 = min;
                    if (i4 > 0) {
                        min2 = Math.max(i7, iArr2[1]);
                    } else {
                        min2 = Math.min(i7, iArr2[1]);
                    }
                    i7 = min2;
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        i(view, i, i2, iArr, 0);
    }

    @Override // defpackage.InterfaceC9235r22
    public final void i(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC3779b90 abstractC3779b90;
        int min;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C5153f90 c5153f90 = (C5153f90) childAt.getLayoutParams();
                if (c5153f90.a(i3) && (abstractC3779b90 = c5153f90.a) != null) {
                    int[] iArr2 = this.i;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC3779b90.i(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.i;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    if (i2 > 0) {
                        min = Math.max(i5, iArr3[1]);
                    } else {
                        min = Math.min(i5, iArr3[1]);
                    }
                    i5 = min;
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C5153f90 c5153f90 = (C5153f90) childAt.getLayoutParams();
                if (c5153f90.a(0)) {
                    AbstractC3779b90 abstractC3779b90 = c5153f90.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C5153f90 c5153f90 = (C5153f90) childAt.getLayoutParams();
                if (c5153f90.a(0)) {
                    AbstractC3779b90 abstractC3779b90 = c5153f90.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        SparseArray sparseArray = savedState.h;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC3779b90 abstractC3779b90 = o(childAt).a;
            if (id != -1 && abstractC3779b90 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC3779b90.l(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable m;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC3779b90 abstractC3779b90 = ((C5153f90) childAt.getLayoutParams()).a;
            if (id != -1 && abstractC3779b90 != null && (m = abstractC3779b90.m(childAt)) != null) {
                sparseArray.append(id, m);
            }
        }
        savedState.h = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC3779b90 abstractC3779b90 = ((C5153f90) view.getLayoutParams()).a;
        if (abstractC3779b90 == null || !abstractC3779b90.k(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    public final void y() {
        WeakHashMap weakHashMap = Ec4.a;
        if (getFitsSystemWindows()) {
            if (this.v == null) {
                this.v = new Z80(this);
            }
            Ec4.o(this, this.v);
            setSystemUiVisibility(1280);
            return;
        }
        Ec4.o(this, null);
    }
}
