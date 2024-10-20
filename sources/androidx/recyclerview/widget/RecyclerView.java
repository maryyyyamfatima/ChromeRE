package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import defpackage.A6;
import defpackage.AK2;
import defpackage.AbstractC0087Ar1;
import defpackage.AbstractC10705vK2;
import defpackage.AbstractC12077zK2;
import defpackage.AbstractC2185Qv0;
import defpackage.AbstractC2348Sb3;
import defpackage.AbstractC2368Sf3;
import defpackage.AbstractC2373Sg3;
import defpackage.AbstractC8305oK2;
import defpackage.AbstractC8522ox2;
import defpackage.B6;
import defpackage.BK2;
import defpackage.C10019tK2;
import defpackage.C10362uK2;
import defpackage.C10425uX0;
import defpackage.C1439Lb3;
import defpackage.C3165Yj0;
import defpackage.C3937bd4;
import defpackage.C4280cd4;
import defpackage.C7273lK2;
import defpackage.C7617mK2;
import defpackage.C7961nK2;
import defpackage.C8865px2;
import defpackage.C8893q22;
import defpackage.CK2;
import defpackage.DJ;
import defpackage.DK2;
import defpackage.Ec4;
import defpackage.F13;
import defpackage.FK2;
import defpackage.GK2;
import defpackage.HK2;
import defpackage.IK2;
import defpackage.InterfaceC8550p22;
import defpackage.InterfaceC9333rK2;
import defpackage.InterpolatorC6929kK2;
import defpackage.JG2;
import defpackage.Jc4;
import defpackage.LK2;
import defpackage.MK2;
import defpackage.NH0;
import defpackage.OK2;
import defpackage.OT3;
import defpackage.RunnableC6243iK2;
import defpackage.RunnableC6585jK2;
import defpackage.VB1;
import defpackage.X5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC8550p22 {
    public static final int[] H0 = {R.attr.nestedScrollingEnabled};
    public static final float I0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean J0 = true;
    public static final boolean K0 = true;
    public static final boolean L0 = true;
    public static final Class[] M0;
    public static final InterpolatorC6929kK2 N0;
    public static final MK2 O0;
    public boolean A;
    public final int[] A0;
    public int B;
    public final ArrayList B0;
    public boolean C;
    public final RunnableC6585jK2 C0;
    public boolean D;
    public boolean D0;
    public boolean E;
    public int E0;
    public int F;
    public int F0;
    public boolean G;
    public final C7273lK2 G0;
    public final AccessibilityManager H;
    public ArrayList I;

    /* renamed from: J */
    public boolean f11489J;
    public boolean K;
    public int L;
    public int M;
    public final MK2 N;
    public EdgeEffect O;
    public EdgeEffect P;
    public EdgeEffect Q;
    public EdgeEffect R;
    public AbstractC2348Sb3 S;
    public int T;
    public int U;
    public VelocityTracker V;
    public int W;
    public final float a;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public AbstractC2368Sf3 e0;
    public final int f0;
    public final HK2 g;
    public final int g0;
    public final b h;
    public final float h0;
    public SavedState i;
    public final float i0;
    public B6 j;
    public final boolean j0;
    public DJ k;
    public final c k0;
    public final C4280cd4 l;
    public a l0;
    public boolean m;
    public final C10425uX0 m0;
    public final RunnableC6243iK2 n;
    public final LK2 n0;
    public final Rect o;
    public DK2 o0;
    public final Rect p;
    public ArrayList p0;
    public final RectF q;
    public boolean q0;
    public AbstractC8305oK2 r;
    public boolean r0;
    public AbstractC12077zK2 s;
    public final C10362uK2 s0;
    public GK2 t;
    public boolean t0;
    public final ArrayList u;
    public OK2 u0;
    public final ArrayList v;
    public InterfaceC9333rK2 v0;
    public final ArrayList w;
    public final int[] w0;
    public CK2 x;
    public C8893q22 x0;
    public boolean y;
    public final int[] y0;
    public boolean z;
    public final int[] z0;

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new IK2();
        public Parcelable h;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.h, 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.h = parcel.readParcelable(classLoader == null ? AbstractC12077zK2.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static {
        Class cls = Integer.TYPE;
        M0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        N0 = new InterpolatorC6929kK2();
        O0 = new MK2();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f0503c7);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float a;
        float a2;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.g = new HK2(this);
        this.h = new b(this);
        this.l = new C4280cd4();
        this.n = new RunnableC6243iK2(this);
        this.o = new Rect();
        this.p = new Rect();
        this.q = new RectF();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.B = 0;
        this.f11489J = false;
        this.K = false;
        this.L = 0;
        this.M = 0;
        this.N = O0;
        this.S = new C3165Yj0();
        this.T = 0;
        this.U = -1;
        this.h0 = Float.MIN_VALUE;
        this.i0 = Float.MIN_VALUE;
        this.j0 = true;
        this.k0 = new c(this);
        this.m0 = L0 ? new C10425uX0() : null;
        this.n0 = new LK2();
        this.q0 = false;
        this.r0 = false;
        C10362uK2 c10362uK2 = new C10362uK2(this);
        this.s0 = c10362uK2;
        this.t0 = false;
        char c = 2;
        this.w0 = new int[2];
        this.y0 = new int[2];
        this.z0 = new int[2];
        this.A0 = new int[2];
        this.B0 = new ArrayList();
        this.C0 = new RunnableC6585jK2(this);
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = new C7273lK2(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.d0 = viewConfiguration.getScaledTouchSlop();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            a = Jc4.a(viewConfiguration, context);
        } else {
            Method method = Jc4.a;
            a = viewConfiguration.getScaledHorizontalScrollFactor();
        }
        this.h0 = a;
        if (i2 < 26) {
            a2 = Jc4.a(viewConfiguration, context);
        } else {
            a2 = viewConfiguration.getScaledVerticalScrollFactor();
        }
        this.i0 = a2;
        this.f0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.g0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.S.a = c10362uK2;
        this.j = new B6(new C7961nK2(this));
        this.k = new DJ(new C7617mK2(this));
        WeakHashMap weakHashMap = Ec4.a;
        if ((i2 >= 26 ? getImportantForAutofill() : 0) == 0 && i2 >= 26) {
            setImportantForAutofill(8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.H = (AccessibilityManager) getContext().getSystemService("accessibility");
        OK2 ok2 = new OK2(this);
        this.u0 = ok2;
        Ec4.m(this, ok2);
        int[] iArr = JG2.G0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        Ec4.l(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.m = obtainStyledAttributes.getBoolean(1, true);
        int i3 = 4;
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + z());
            }
            Resources resources = getContext().getResources();
            new NH0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f08021d), resources.getDimensionPixelSize(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f08021f), resources.getDimensionPixelOffset(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f08021e));
            i3 = 4;
            c = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(AbstractC12077zK2.class);
                    try {
                        constructor = asSubclass.getConstructor(M0);
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    q0((AbstractC12077zK2) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr2 = H0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        Ec4.l(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(com.android.chrome.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public final String z() {
        return " " + super.toString() + ", adapter:" + this.r + ", layout:" + this.s + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.m) {
            this.R = null;
            this.P = null;
            this.Q = null;
            this.O = null;
        }
        this.m = z;
        super.setClipToPadding(z);
        if (this.A) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.m;
    }

    @Override // android.view.View
    public final int getBaseline() {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null) {
            abstractC12077zK2.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    public final void h(BK2 bk2) {
        if (this.I == null) {
            this.I = new ArrayList();
        }
        this.I.add(bk2);
    }

    public final void q0(AbstractC12077zK2 abstractC12077zK2) {
        C7617mK2 c7617mK2;
        RecyclerView recyclerView;
        VB1 vb1;
        if (abstractC12077zK2 == this.s) {
            return;
        }
        int i = 0;
        r0(0);
        c cVar = this.k0;
        cVar.l.removeCallbacks(cVar);
        cVar.h.abortAnimation();
        AbstractC12077zK2 abstractC12077zK22 = this.s;
        if (abstractC12077zK22 != null && (vb1 = abstractC12077zK22.e) != null) {
            vb1.j();
        }
        AbstractC12077zK2 abstractC12077zK23 = this.s;
        b bVar = this.h;
        if (abstractC12077zK23 != null) {
            AbstractC2348Sb3 abstractC2348Sb3 = this.S;
            if (abstractC2348Sb3 != null) {
                abstractC2348Sb3.j();
            }
            this.s.m0(bVar);
            this.s.n0(bVar);
            bVar.a.clear();
            bVar.f();
            if (this.y) {
                AbstractC12077zK2 abstractC12077zK24 = this.s;
                abstractC12077zK24.g = false;
                abstractC12077zK24.V(this);
            }
            this.s.z0(null);
            this.s = null;
        } else {
            bVar.a.clear();
            bVar.f();
        }
        DJ dj = this.k;
        dj.b.g();
        ArrayList arrayList = dj.c;
        int size = arrayList.size();
        while (true) {
            size--;
            c7617mK2 = dj.a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            c7617mK2.getClass();
            d L = L(view);
            if (L != null) {
                int i2 = L.u;
                RecyclerView recyclerView2 = c7617mK2.a;
                if (recyclerView2.S()) {
                    L.v = i2;
                    recyclerView2.B0.add(L);
                } else {
                    WeakHashMap weakHashMap = Ec4.a;
                    L.a.setImportantForAccessibility(i2);
                }
                L.u = 0;
            }
            arrayList.remove(size);
        }
        int a = c7617mK2.a();
        while (true) {
            recyclerView = c7617mK2.a;
            if (i >= a) {
                break;
            }
            View childAt = recyclerView.getChildAt(i);
            recyclerView.q(childAt);
            childAt.clearAnimation();
            i++;
        }
        recyclerView.removeAllViews();
        this.s = abstractC12077zK2;
        if (abstractC12077zK2 != null) {
            if (abstractC12077zK2.b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC12077zK2 + " is already attached to a RecyclerView:" + abstractC12077zK2.b.z());
            }
            abstractC12077zK2.z0(this);
            if (this.y) {
                this.s.g = true;
            }
        }
        bVar.m();
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.i;
        if (savedState2 == null) {
            AbstractC12077zK2 abstractC12077zK2 = this.s;
            if (abstractC12077zK2 != null) {
                savedState.h = abstractC12077zK2.j0();
            } else {
                savedState.h = null;
            }
        } else {
            savedState.h = savedState2.h;
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
        this.i = savedState;
        super.onRestoreInstanceState(savedState.a);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void f(d dVar) {
        View view = dVar.a;
        boolean z = view.getParent() == this;
        this.h.l(K(view));
        if (dVar.p()) {
            this.k.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.k.a(view, -1, true);
            return;
        }
        DJ dj = this.k;
        int indexOfChild = dj.a.a.indexOfChild(view);
        if (indexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        dj.b.h(indexOfChild);
        dj.i(view);
    }

    public final void A(LK2 lk2) {
        if (this.T == 2) {
            OverScroller overScroller = this.k0.h;
            overScroller.getFinalX();
            overScroller.getCurrX();
            lk2.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        lk2.getClass();
    }

    public final void r0(int i) {
        VB1 vb1;
        if (i == this.T) {
            return;
        }
        this.T = i;
        if (i != 2) {
            c cVar = this.k0;
            cVar.l.removeCallbacks(cVar);
            cVar.h.abortAnimation();
            AbstractC12077zK2 abstractC12077zK2 = this.s;
            if (abstractC12077zK2 != null && (vb1 = abstractC12077zK2.e) != null) {
                vb1.j();
            }
        }
        AbstractC12077zK2 abstractC12077zK22 = this.s;
        if (abstractC12077zK22 != null) {
            abstractC12077zK22.k0(i);
        }
        DK2 dk2 = this.o0;
        if (dk2 != null) {
            dk2.r(i, this);
        }
        ArrayList arrayList = this.p0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((DK2) this.p0.get(size)).r(i, this);
            }
        }
    }

    public final void g(AbstractC10705vK2 abstractC10705vK2) {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null) {
            abstractC12077zK2.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC10705vK2);
        U();
        requestLayout();
    }

    public final void f0(AbstractC10705vK2 abstractC10705vK2) {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null) {
            abstractC12077zK2.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.v;
        arrayList.remove(abstractC10705vK2);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        U();
        requestLayout();
    }

    public final void o0(F13 f13) {
        if (f13 == this.v0) {
            return;
        }
        this.v0 = f13;
        setChildrenDrawingOrderEnabled(f13 != null);
    }

    public final void i(DK2 dk2) {
        if (this.p0 == null) {
            this.p0 = new ArrayList();
        }
        this.p0.add(dk2);
    }

    public final void h0(DK2 dk2) {
        ArrayList arrayList = this.p0;
        if (arrayList != null) {
            arrayList.remove(dk2);
        }
    }

    public final void m0(int i) {
        VB1 vb1;
        if (this.D) {
            return;
        }
        r0(0);
        c cVar = this.k0;
        cVar.l.removeCallbacks(cVar);
        cVar.h.abortAnimation();
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null && (vb1 = abstractC12077zK2.e) != null) {
            vb1.j();
        }
        AbstractC12077zK2 abstractC12077zK22 = this.s;
        if (abstractC12077zK22 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC12077zK22.t0(i);
            awakenScrollBars();
        }
    }

    public final void T(int i) {
        if (this.s == null) {
            return;
        }
        r0(2);
        this.s.t0(i);
        awakenScrollBars();
    }

    public final void u0(int i) {
        if (this.D) {
            return;
        }
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC12077zK2.D0(this, i);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.D) {
            return;
        }
        boolean e = abstractC12077zK2.e();
        boolean f = this.s.f();
        if (e || f) {
            if (!e) {
                i = 0;
            }
            if (!f) {
                i2 = 0;
            }
            k0(i, i2, null, 0);
        }
    }

    public final void l0(int i, int i2, int[] iArr) {
        d dVar;
        v0();
        W();
        int i3 = OT3.a;
        Trace.beginSection("RV Scroll");
        LK2 lk2 = this.n0;
        A(lk2);
        b bVar = this.h;
        int s0 = i != 0 ? this.s.s0(i, bVar, lk2) : 0;
        int u0 = i2 != 0 ? this.s.u0(i2, bVar, lk2) : 0;
        Trace.endSection();
        int e = this.k.e();
        for (int i4 = 0; i4 < e; i4++) {
            View d = this.k.d(i4);
            d K = K(d);
            if (K != null && (dVar = K.n) != null) {
                int left = d.getLeft();
                int top = d.getTop();
                View view = dVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        X(true);
        w0(false);
        if (iArr != null) {
            iArr[0] = s0;
            iArr[1] = u0;
        }
    }

    public final void o() {
        if (!this.A || this.f11489J) {
            int i = OT3.a;
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        if (this.j.g()) {
            B6 b6 = this.j;
            int i2 = b6.f;
            boolean z = false;
            if ((4 & i2) != 0) {
                if (!((i2 & 11) != 0)) {
                    int i3 = OT3.a;
                    Trace.beginSection("RV PartialInvalidate");
                    v0();
                    W();
                    this.j.j();
                    if (!this.C) {
                        int e = this.k.e();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= e) {
                                break;
                            }
                            d L = L(this.k.d(i4));
                            if (L != null && !L.t()) {
                                if ((L.o & 2) != 0) {
                                    z = true;
                                    break;
                                }
                            }
                            i4++;
                        }
                        if (z) {
                            r();
                        } else {
                            this.j.b();
                        }
                    }
                    w0(true);
                    X(true);
                    Trace.endSection();
                    return;
                }
            }
            if (b6.g()) {
                int i5 = OT3.a;
                Trace.beginSection("RV FullInvalidate");
                r();
                Trace.endSection();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k0(int r20, int r21, android.view.MotionEvent r22, int r23) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.k0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final int d0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.O;
        float f2 = 0.0f;
        if (edgeEffect != null && AbstractC2185Qv0.a(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.O.onRelease();
            } else {
                float f3 = -AbstractC2185Qv0.b(this.O, -width, 1.0f - height);
                if (AbstractC2185Qv0.a(this.O) == 0.0f) {
                    this.O.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.Q;
            if (edgeEffect2 != null && AbstractC2185Qv0.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.Q.onRelease();
                } else {
                    float b = AbstractC2185Qv0.b(this.Q, width, height);
                    if (AbstractC2185Qv0.a(this.Q) == 0.0f) {
                        this.Q.onRelease();
                    }
                    f2 = b;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    private int e0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.P;
        float f2 = 0.0f;
        if (edgeEffect != null && AbstractC2185Qv0.a(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.P.onRelease();
            } else {
                float f3 = -AbstractC2185Qv0.b(this.P, -height, width);
                if (AbstractC2185Qv0.a(this.P) == 0.0f) {
                    this.P.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.R;
            if (edgeEffect2 != null && AbstractC2185Qv0.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.R.onRelease();
                } else {
                    float b = AbstractC2185Qv0.b(this.R, height, 1.0f - width);
                    if (AbstractC2185Qv0.a(this.R) == 0.0f) {
                        this.R.onRelease();
                    }
                    f2 = b;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null && abstractC12077zK2.e()) {
            return this.s.l(this.n0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null && abstractC12077zK2.e()) {
            return this.s.k(this.n0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null && abstractC12077zK2.e()) {
            return this.s.m(this.n0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null && abstractC12077zK2.f()) {
            return this.s.o(this.n0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null && abstractC12077zK2.f()) {
            return this.s.n(this.n0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null && abstractC12077zK2.f()) {
            return this.s.p(this.n0);
        }
        return 0;
    }

    public final void v0() {
        int i = this.B + 1;
        this.B = i;
        if (i != 1 || this.D) {
            return;
        }
        this.C = false;
    }

    public final void w0(boolean z) {
        if (this.B < 1) {
            this.B = 1;
        }
        if (!z && !this.D) {
            this.C = false;
        }
        if (this.B == 1) {
            if (z && this.C && !this.D && this.s != null && this.r != null) {
                r();
            }
            if (!this.D) {
                this.C = false;
            }
        }
        this.B--;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        VB1 vb1;
        if (z != this.D) {
            j("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.D = false;
                if (this.C && this.s != null && this.r != null) {
                    requestLayout();
                }
                this.C = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.D = true;
            this.E = true;
            r0(0);
            c cVar = this.k0;
            cVar.l.removeCallbacks(cVar);
            cVar.h.abortAnimation();
            AbstractC12077zK2 abstractC12077zK2 = this.s;
            if (abstractC12077zK2 == null || (vb1 = abstractC12077zK2.e) == null) {
                return;
            }
            vb1.j();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.D;
    }

    public void n0(AbstractC8305oK2 abstractC8305oK2) {
        suppressLayout(false);
        AbstractC8305oK2 abstractC8305oK22 = this.r;
        HK2 hk2 = this.g;
        if (abstractC8305oK22 != null) {
            abstractC8305oK22.L(hk2);
            this.r.F(this);
        }
        AbstractC2348Sb3 abstractC2348Sb3 = this.S;
        if (abstractC2348Sb3 != null) {
            abstractC2348Sb3.j();
        }
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        b bVar = this.h;
        if (abstractC12077zK2 != null) {
            abstractC12077zK2.m0(bVar);
            this.s.n0(bVar);
        }
        bVar.a.clear();
        bVar.f();
        B6 b6 = this.j;
        b6.l(b6.b);
        b6.l(b6.c);
        b6.f = 0;
        AbstractC8305oK2 abstractC8305oK23 = this.r;
        this.r = abstractC8305oK2;
        if (abstractC8305oK2 != null) {
            abstractC8305oK2.J(hk2);
            abstractC8305oK2.A(this);
        }
        AbstractC12077zK2 abstractC12077zK22 = this.s;
        if (abstractC12077zK22 != null) {
            abstractC12077zK22.U();
        }
        AbstractC8305oK2 abstractC8305oK24 = this.r;
        bVar.a.clear();
        bVar.f();
        bVar.e(abstractC8305oK23, true);
        FK2 c = bVar.c();
        if (abstractC8305oK23 != null) {
            c.b--;
        }
        if (c.b == 0) {
            c.a();
        }
        if (abstractC8305oK24 != null) {
            c.b++;
        }
        bVar.d();
        this.n0.f = true;
        b0(false);
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public final void t0(int i, int i2, boolean z) {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.D) {
            return;
        }
        if (!abstractC12077zK2.e()) {
            i = 0;
        }
        if (!this.s.f()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            P().f(i3, 1);
        }
        this.k0.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final boolean s0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float a = AbstractC2185Qv0.a(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f = this.a * 0.015f;
        double log = Math.log(abs / f);
        double d = I0;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < a;
    }

    public static int n(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC2185Qv0.a(edgeEffect) != 0.0f) {
            int round = Math.round(AbstractC2185Qv0.b(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC2185Qv0.a(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int round2 = Math.round(AbstractC2185Qv0.b(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public final void m(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.O;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.O.onRelease();
            z = this.O.isFinished();
        }
        EdgeEffect edgeEffect2 = this.Q;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.Q.onRelease();
            z |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect3 = this.P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.P.onRelease();
            z |= this.P.isFinished();
        }
        EdgeEffect edgeEffect4 = this.R;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.R.onRelease();
            z |= this.R.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = Ec4.a;
            postInvalidateOnAnimation();
        }
    }

    public final void w() {
        if (this.O != null) {
            return;
        }
        this.N.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.O = edgeEffect;
        if (this.m) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.Q != null) {
            return;
        }
        this.N.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Q = edgeEffect;
        if (this.m) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void y() {
        if (this.P != null) {
            return;
        }
        this.N.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.P = edgeEffect;
        if (this.m) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.R != null) {
            return;
        }
        this.N.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.R = edgeEffect;
        if (this.m) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017e, code lost:            if (r3 < 0) goto L705;     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0186, code lost:            if ((r3 * r2) <= 0) goto L704;     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018e, code lost:            if ((r3 * r2) >= 0) goto L704;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015a, code lost:            if (r4 > 0) goto L705;     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0178, code lost:            if (r3 > 0) goto L705;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017b, code lost:            if (r4 < 0) goto L705;     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        VB1 vb1 = this.s.e;
        boolean z = true;
        if (!(vb1 != null && vb1.e) && !S()) {
            z = false;
        }
        if (!z && view2 != null) {
            i0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final void i0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.o;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof AK2) {
            AK2 ak2 = (AK2) layoutParams;
            if (!ak2.h) {
                int i = rect.left;
                Rect rect2 = ak2.g;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.s.q0(this, view, this.o, !this.A, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.s.q0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null) {
            abstractC12077zK2.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (S()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:            if (r1 >= 30.0f) goto L126;     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.L = r0
            r1 = 1
            r5.y = r1
            boolean r2 = r5.A
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.A = r2
            androidx.recyclerview.widget.b r2 = r5.h
            r2.d()
            zK2 r2 = r5.s
            if (r2 == 0) goto L23
            r2.g = r1
        L23:
            r5.t0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.L0
            if (r0 == 0) goto L6a
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.a.j
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.a r1 = (androidx.recyclerview.widget.a) r1
            r5.l0 = r1
            if (r1 != 0) goto L63
            androidx.recyclerview.widget.a r1 = new androidx.recyclerview.widget.a
            r1.<init>()
            r5.l0 = r1
            java.util.WeakHashMap r1 = defpackage.Ec4.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L55
            if (r1 == 0) goto L55
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L55
            goto L57
        L55:
            r1 = 1114636288(0x42700000, float:60.0)
        L57:
            androidx.recyclerview.widget.a r2 = r5.l0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.h = r3
            r0.set(r2)
        L63:
            androidx.recyclerview.widget.a r0 = r5.l0
            java.util.ArrayList r0 = r0.a
            r0.add(r5)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        b bVar;
        a aVar;
        VB1 vb1;
        super.onDetachedFromWindow();
        AbstractC2348Sb3 abstractC2348Sb3 = this.S;
        if (abstractC2348Sb3 != null) {
            abstractC2348Sb3.j();
        }
        r0(0);
        c cVar = this.k0;
        cVar.l.removeCallbacks(cVar);
        cVar.h.abortAnimation();
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null && (vb1 = abstractC12077zK2.e) != null) {
            vb1.j();
        }
        this.y = false;
        AbstractC12077zK2 abstractC12077zK22 = this.s;
        if (abstractC12077zK22 != null) {
            abstractC12077zK22.g = false;
            abstractC12077zK22.V(this);
        }
        this.B0.clear();
        removeCallbacks(this.C0);
        this.l.getClass();
        do {
        } while (C3937bd4.d.b() != null);
        int i = 0;
        while (true) {
            bVar = this.h;
            ArrayList arrayList = bVar.c;
            if (i >= arrayList.size()) {
                break;
            }
            AbstractC8522ox2.a(((d) arrayList.get(i)).a);
            i++;
        }
        bVar.e(bVar.h.r, false);
        int i2 = 0;
        while (true) {
            if (i2 < getChildCount()) {
                int i3 = i2 + 1;
                View childAt = getChildAt(i2);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                C8865px2 c8865px2 = (C8865px2) childAt.getTag(com.android.chrome.R.id.pooling_container_listener_holder_tag);
                if (c8865px2 == null) {
                    c8865px2 = new C8865px2();
                    childAt.setTag(com.android.chrome.R.id.pooling_container_listener_holder_tag, c8865px2);
                }
                ArrayList arrayList2 = c8865px2.a;
                AbstractC0087Ar1.e(arrayList2, "<this>");
                int size = arrayList2.size() - 1;
                if (-1 < size) {
                    X5.a(arrayList2.get(size));
                    throw null;
                }
                i2 = i3;
            } else {
                if (!L0 || (aVar = this.l0) == null) {
                    return;
                }
                aVar.a.remove(this);
                this.l0 = null;
                return;
            }
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.y;
    }

    public final void j(String str) {
        if (S()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + z());
            }
            throw new IllegalStateException(str);
        }
        if (this.M > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + z()));
        }
    }

    public final void g0(CK2 ck2) {
        this.w.remove(ck2);
        if (this.x == ck2) {
            this.x = null;
        }
    }

    public final boolean D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            CK2 ck2 = (CK2) arrayList.get(i);
            if (ck2.c(this, motionEvent) && action != 3) {
                this.x = ck2;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.D) {
            return false;
        }
        this.x = null;
        if (!D(motionEvent)) {
            AbstractC12077zK2 abstractC12077zK2 = this.s;
            if (abstractC12077zK2 == null) {
                return false;
            }
            boolean e = abstractC12077zK2.e();
            boolean f = this.s.f();
            if (this.V == null) {
                this.V = VelocityTracker.obtain();
            }
            this.V.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                if (this.E) {
                    this.E = false;
                }
                this.U = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.b0 = x;
                this.W = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.c0 = y;
                this.a0 = y;
                EdgeEffect edgeEffect = this.O;
                if (edgeEffect == null || AbstractC2185Qv0.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                    z = false;
                } else {
                    AbstractC2185Qv0.b(this.O, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                    z = true;
                }
                EdgeEffect edgeEffect2 = this.Q;
                boolean z3 = z;
                if (edgeEffect2 != null) {
                    z3 = z;
                    if (AbstractC2185Qv0.a(edgeEffect2) != 0.0f) {
                        z3 = z;
                        if (!canScrollHorizontally(1)) {
                            AbstractC2185Qv0.b(this.Q, 0.0f, motionEvent.getY() / getHeight());
                            z3 = true;
                        }
                    }
                }
                EdgeEffect edgeEffect3 = this.P;
                boolean z4 = z3;
                if (edgeEffect3 != null) {
                    z4 = z3;
                    if (AbstractC2185Qv0.a(edgeEffect3) != 0.0f) {
                        z4 = z3;
                        if (!canScrollVertically(-1)) {
                            AbstractC2185Qv0.b(this.P, 0.0f, motionEvent.getX() / getWidth());
                            z4 = true;
                        }
                    }
                }
                EdgeEffect edgeEffect4 = this.R;
                boolean z5 = z4;
                if (edgeEffect4 != null) {
                    z5 = z4;
                    if (AbstractC2185Qv0.a(edgeEffect4) != 0.0f) {
                        z5 = z4;
                        if (!canScrollVertically(1)) {
                            AbstractC2185Qv0.b(this.R, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                            z5 = true;
                        }
                    }
                }
                if (z5 || this.T == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    r0(1);
                    P().g(1);
                }
                int[] iArr = this.z0;
                iArr[1] = 0;
                iArr[0] = 0;
                int i = e;
                if (f) {
                    i = (e ? 1 : 0) | 2;
                }
                P().f(i, 0);
            } else if (actionMasked == 1) {
                this.V.clear();
                P().g(0);
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.U);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.U + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                if (this.T != 1) {
                    int i2 = x2 - this.W;
                    int i3 = y2 - this.a0;
                    if (e == 0 || Math.abs(i2) <= this.d0) {
                        z2 = false;
                    } else {
                        this.b0 = x2;
                        z2 = true;
                    }
                    if (f && Math.abs(i3) > this.d0) {
                        this.c0 = y2;
                        z2 = true;
                    }
                    if (z2) {
                        r0(1);
                    }
                }
            } else if (actionMasked == 3) {
                j0();
                r0(0);
            } else if (actionMasked == 5) {
                this.U = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.b0 = x3;
                this.W = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.c0 = y3;
                this.a0 = y3;
            } else if (actionMasked == 6) {
                Y(motionEvent);
            }
            return this.T == 1;
        }
        j0();
        r0(0);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((CK2) arrayList.get(i)).e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0331, code lost:            if (r5 != false) goto L1090;     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02b4, code lost:            if (r5 == 0) goto L1087;     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0309, code lost:            if (r2 == false) goto L1082;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void j0() {
        VelocityTracker velocityTracker = this.V;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        P().g(0);
        EdgeEffect edgeEffect = this.O;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.O.isFinished();
        }
        EdgeEffect edgeEffect2 = this.P;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.P.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect4 = this.R;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.R.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = Ec4.a;
            postInvalidateOnAnimation();
        }
    }

    public final void Y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.U) {
            int i = actionIndex == 0 ? 1 : 0;
            this.U = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.b0 = x;
            this.W = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.c0 = y;
            this.a0 = y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 == null) {
            p(i, i2);
            return;
        }
        boolean P = abstractC12077zK2.P();
        boolean z = false;
        LK2 lk2 = this.n0;
        if (P) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.s.b.p(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.D0 = z;
            if (z || this.r == null) {
                return;
            }
            if (lk2.d == 1) {
                s();
            }
            this.s.w0(i, i2);
            lk2.i = true;
            t();
            this.s.y0(i, i2);
            if (this.s.B0()) {
                this.s.w0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                lk2.i = true;
                t();
                this.s.y0(i, i2);
            }
            this.E0 = getMeasuredWidth();
            this.F0 = getMeasuredHeight();
            return;
        }
        if (this.z) {
            this.s.b.p(i, i2);
            return;
        }
        if (this.G) {
            v0();
            W();
            a0();
            X(true);
            if (lk2.k) {
                lk2.g = true;
            } else {
                this.j.c();
                lk2.g = false;
            }
            this.G = false;
            w0(false);
        } else if (lk2.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC8305oK2 abstractC8305oK2 = this.r;
        if (abstractC8305oK2 != null) {
            lk2.e = abstractC8305oK2.q();
        } else {
            lk2.e = 0;
        }
        v0();
        this.s.b.p(i, i2);
        w0(false);
        lk2.g = false;
    }

    public final void p(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = Ec4.a;
        setMeasuredDimension(AbstractC12077zK2.h(i, paddingRight, getMinimumWidth()), AbstractC12077zK2.h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.R = null;
        this.P = null;
        this.Q = null;
        this.O = null;
    }

    public final void p0(AbstractC2348Sb3 abstractC2348Sb3) {
        AbstractC2348Sb3 abstractC2348Sb32 = this.S;
        if (abstractC2348Sb32 != null) {
            abstractC2348Sb32.j();
            this.S.a = null;
        }
        this.S = abstractC2348Sb3;
        if (abstractC2348Sb3 != null) {
            abstractC2348Sb3.a = this.s0;
        }
    }

    public final void W() {
        this.L++;
    }

    public final void X(boolean z) {
        int i;
        int i2 = this.L - 1;
        this.L = i2;
        if (i2 < 1) {
            this.L = 0;
            if (z) {
                int i3 = this.F;
                this.F = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.H;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.B0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    d dVar = (d) arrayList.get(size);
                    if (dVar.a.getParent() == this && !dVar.t() && (i = dVar.v) != -1) {
                        WeakHashMap weakHashMap = Ec4.a;
                        dVar.a.setImportantForAccessibility(i);
                        dVar.v = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final boolean S() {
        return this.L > 0;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (S()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.F |= contentChangeTypes != 0 ? contentChangeTypes : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void Z() {
        if (this.t0 || !this.y) {
            return;
        }
        WeakHashMap weakHashMap = Ec4.a;
        postOnAnimation(this.C0);
        this.t0 = true;
    }

    public final void a0() {
        boolean z;
        boolean z2 = false;
        if (this.f11489J) {
            B6 b6 = this.j;
            b6.l(b6.b);
            b6.l(b6.c);
            b6.f = 0;
            if (this.K) {
                this.s.c0();
            }
        }
        if (this.S != null && this.s.F0()) {
            this.j.j();
        } else {
            this.j.c();
        }
        boolean z3 = this.q0 || this.r0;
        boolean z4 = this.A && this.S != null && ((z = this.f11489J) || z3 || this.s.f) && (!z || this.r.g);
        LK2 lk2 = this.n0;
        lk2.j = z4;
        if (z4 && z3 && !this.f11489J) {
            if (this.S != null && this.s.F0()) {
                z2 = true;
            }
        }
        lk2.k = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x032c, code lost:            if (r17.k.j(getFocusedChild()) == false) goto L1257;     */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r():void");
    }

    public final void s() {
        int f;
        View C;
        LK2 lk2 = this.n0;
        lk2.a(1);
        A(lk2);
        lk2.i = false;
        v0();
        C4280cd4 c4280cd4 = this.l;
        c4280cd4.a.clear();
        c4280cd4.b.b();
        W();
        a0();
        d dVar = null;
        View focusedChild = (this.j0 && hasFocus() && this.r != null) ? getFocusedChild() : null;
        if (focusedChild != null && (C = C(focusedChild)) != null) {
            dVar = K(C);
        }
        if (dVar != null) {
            lk2.m = this.r.g ? dVar.j : -1L;
            if (this.f11489J) {
                f = -1;
            } else {
                f = dVar.n() ? dVar.i : dVar.f();
            }
            lk2.l = f;
            View view = dVar.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            lk2.n = id;
        } else {
            lk2.m = -1L;
            lk2.l = -1;
            lk2.n = -1;
        }
        lk2.h = lk2.j && this.r0;
        this.r0 = false;
        this.q0 = false;
        lk2.g = lk2.k;
        lk2.e = this.r.q();
        E(this.w0);
        boolean z = lk2.j;
        C1439Lb3 c1439Lb3 = c4280cd4.a;
        if (z) {
            int e = this.k.e();
            for (int i = 0; i < e; i++) {
                d L = L(this.k.d(i));
                if (!L.t() && (!L.l() || this.r.g)) {
                    AbstractC2348Sb3 abstractC2348Sb3 = this.S;
                    AbstractC2348Sb3.f(L);
                    L.i();
                    abstractC2348Sb3.getClass();
                    C10019tK2 c10019tK2 = new C10019tK2();
                    c10019tK2.a(L);
                    C3937bd4 c3937bd4 = (C3937bd4) c1439Lb3.get(L);
                    if (c3937bd4 == null) {
                        c3937bd4 = C3937bd4.a();
                        c1439Lb3.put(L, c3937bd4);
                    }
                    c3937bd4.b = c10019tK2;
                    c3937bd4.a |= 4;
                    if (lk2.h) {
                        if (((L.o & 2) != 0) && !L.n() && !L.t() && !L.l()) {
                            c4280cd4.b.i(I(L), L);
                        }
                    }
                }
            }
        }
        if (!lk2.k) {
            l();
        } else {
            int h = this.k.h();
            for (int i2 = 0; i2 < h; i2++) {
                d L2 = L(this.k.g(i2));
                if (!L2.t() && L2.i == -1) {
                    L2.i = L2.h;
                }
            }
            boolean z2 = lk2.f;
            lk2.f = false;
            this.s.g0(this.h, lk2);
            lk2.f = z2;
            for (int i3 = 0; i3 < this.k.e(); i3++) {
                d L3 = L(this.k.d(i3));
                if (!L3.t()) {
                    C3937bd4 c3937bd42 = (C3937bd4) c1439Lb3.get(L3);
                    if (!((c3937bd42 == null || (c3937bd42.a & 4) == 0) ? false : true)) {
                        AbstractC2348Sb3.f(L3);
                        boolean z3 = (L3.o & 8192) != 0;
                        AbstractC2348Sb3 abstractC2348Sb32 = this.S;
                        L3.i();
                        abstractC2348Sb32.getClass();
                        C10019tK2 c10019tK22 = new C10019tK2();
                        c10019tK22.a(L3);
                        if (!z3) {
                            C3937bd4 c3937bd43 = (C3937bd4) c1439Lb3.get(L3);
                            if (c3937bd43 == null) {
                                c3937bd43 = C3937bd4.a();
                                c1439Lb3.put(L3, c3937bd43);
                            }
                            c3937bd43.a |= 2;
                            c3937bd43.b = c10019tK22;
                        } else {
                            c0(L3, c10019tK22);
                        }
                    }
                }
            }
            l();
        }
        X(true);
        w0(false);
        lk2.d = 2;
    }

    public final void t() {
        v0();
        W();
        LK2 lk2 = this.n0;
        lk2.a(6);
        this.j.c();
        lk2.e = this.r.q();
        lk2.c = 0;
        if (this.i != null) {
            AbstractC8305oK2 abstractC8305oK2 = this.r;
            int b = AbstractC2373Sg3.b(abstractC8305oK2.h);
            if (b == 1 ? abstractC8305oK2.q() > 0 : b != 2) {
                Parcelable parcelable = this.i.h;
                if (parcelable != null) {
                    this.s.i0(parcelable);
                }
                this.i = null;
            }
        }
        lk2.g = false;
        this.s.g0(this.h, lk2);
        lk2.f = false;
        lk2.j = lk2.j && this.S != null;
        lk2.d = 4;
        X(true);
        w0(false);
    }

    public final void E(int[] iArr) {
        int e = this.k.e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            d L = L(this.k.d(i3));
            if (!L.t()) {
                int h = L.h();
                if (h < i) {
                    i = h;
                }
                if (h > i2) {
                    i2 = h;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        d L = L(view);
        if (L != null) {
            if (!L.p()) {
                if (!L.t()) {
                    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + L + z());
                }
            } else {
                L.o &= -257;
            }
        }
        view.clearAnimation();
        q(view);
        super.removeDetachedView(view, z);
    }

    public final long I(d dVar) {
        if (!this.r.g) {
            return dVar.h;
        }
        return dVar.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = OT3.a;
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.A = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.B == 0 && !this.D) {
            super.requestLayout();
        } else {
            this.C = true;
        }
    }

    public final void U() {
        int h = this.k.h();
        for (int i = 0; i < h; i++) {
            ((AK2) this.k.g(i).getLayoutParams()).h = true;
        }
        ArrayList arrayList = this.h.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AK2 ak2 = (AK2) ((d) arrayList.get(i2)).a.getLayoutParams();
            if (ak2 != null) {
                ak2.h = true;
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC10705vK2) arrayList.get(i)).i(canvas, this);
        }
        EdgeEffect edgeEffect = this.O;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.m ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.O;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.m) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.P;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.Q;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.m ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.Q;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.R;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.m) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.R;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.S == null || arrayList.size() <= 0 || !this.S.k()) ? z : true) {
            WeakHashMap weakHashMap = Ec4.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC10705vK2) arrayList.get(i)).h(canvas, this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof AK2) && this.s.g((AK2) layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
        }
        return abstractC12077zK2.s();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
        }
        return abstractC12077zK2.t(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
        }
        return abstractC12077zK2.u(layoutParams);
    }

    public final void l() {
        int h = this.k.h();
        for (int i = 0; i < h; i++) {
            d L = L(this.k.g(i));
            if (!L.t()) {
                L.i = -1;
                L.l = -1;
            }
        }
        b bVar = this.h;
        ArrayList arrayList = bVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            dVar.i = -1;
            dVar.l = -1;
        }
        ArrayList arrayList2 = bVar.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            d dVar2 = (d) arrayList2.get(i3);
            dVar2.i = -1;
            dVar2.l = -1;
        }
        ArrayList arrayList3 = bVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                d dVar3 = (d) bVar.b.get(i4);
                dVar3.i = -1;
                dVar3.l = -1;
            }
        }
    }

    public final void V(int i, int i2, boolean z) {
        int i3 = i + i2;
        int h = this.k.h();
        for (int i4 = 0; i4 < h; i4++) {
            d L = L(this.k.g(i4));
            if (L != null && !L.t()) {
                int i5 = L.h;
                LK2 lk2 = this.n0;
                if (i5 >= i3) {
                    L.q(-i2, z);
                    lk2.f = true;
                } else if (i5 >= i) {
                    L.d(8);
                    L.q(-i2, z);
                    L.h = i - 1;
                    lk2.f = true;
                }
            }
        }
        b bVar = this.h;
        ArrayList arrayList = bVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            d dVar = (d) arrayList.get(size);
            if (dVar != null) {
                int i6 = dVar.h;
                if (i6 >= i3) {
                    dVar.q(-i2, z);
                } else if (i6 >= i) {
                    dVar.d(8);
                    bVar.g(size);
                }
            }
        }
    }

    public final void b0(boolean z) {
        this.K = z | this.K;
        this.f11489J = true;
        int h = this.k.h();
        for (int i = 0; i < h; i++) {
            d L = L(this.k.g(i));
            if (L != null && !L.t()) {
                L.d(6);
            }
        }
        U();
        b bVar = this.h;
        ArrayList arrayList = bVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar != null) {
                dVar.d(6);
                dVar.c(null);
            }
        }
        AbstractC8305oK2 abstractC8305oK2 = bVar.h.r;
        if (abstractC8305oK2 == null || !abstractC8305oK2.g) {
            bVar.f();
        }
    }

    public final void R() {
        if (this.v.size() == 0) {
            return;
        }
        AbstractC12077zK2 abstractC12077zK2 = this.s;
        if (abstractC12077zK2 != null) {
            abstractC12077zK2.c("Cannot invalidate item decorations during a scroll or layout");
        }
        U();
        requestLayout();
    }

    public final d K(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return L(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:            return r3;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View C(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C(android.view.View):android.view.View");
    }

    public static d L(View view) {
        if (view == null) {
            return null;
        }
        return ((AK2) view.getLayoutParams()).a;
    }

    public static int J(View view) {
        d L = L(view);
        if (L != null) {
            return L.f();
        }
        return -1;
    }

    public final d G(int i) {
        d dVar = null;
        if (this.f11489J) {
            return null;
        }
        int h = this.k.h();
        for (int i2 = 0; i2 < h; i2++) {
            d L = L(this.k.g(i2));
            if (L != null && !L.n() && H(L) == i) {
                if (!this.k.j(L.a)) {
                    return L;
                }
                dVar = L;
            }
        }
        return dVar;
    }

    public final View B(float f, float f2) {
        for (int e = this.k.e() - 1; e >= 0; e--) {
            View d = this.k.d(e);
            float translationX = d.getTranslationX();
            float translationY = d.getTranslationY();
            if (f >= d.getLeft() + translationX && f <= d.getRight() + translationX && f2 >= d.getTop() + translationY && f2 <= d.getBottom() + translationY) {
                return d;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public static void M(Rect rect, View view) {
        AK2 ak2 = (AK2) view.getLayoutParams();
        Rect rect2 = ak2.g;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) ak2).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) ak2).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) ak2).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) ak2).bottomMargin);
    }

    public final Rect N(View view) {
        AK2 ak2 = (AK2) view.getLayoutParams();
        boolean z = ak2.h;
        Rect rect = ak2.g;
        if (!z) {
            return rect;
        }
        LK2 lk2 = this.n0;
        if (lk2.g && (ak2.d() || ak2.a.l())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.o;
            rect2.set(0, 0, 0, 0);
            ((AbstractC10705vK2) arrayList.get(i)).g(rect2, view, this, lk2);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        ak2.h = false;
        return rect;
    }

    public final void u(int i, int i2) {
        this.M++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        DK2 dk2 = this.o0;
        if (dk2 != null) {
            dk2.s(this, i, i2);
        }
        ArrayList arrayList = this.p0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((DK2) this.p0.get(size)).s(this, i, i2);
                }
            }
        }
        this.M--;
    }

    public final boolean Q() {
        return !this.A || this.f11489J || this.j.g();
    }

    public static RecyclerView F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView F = F(viewGroup.getChildAt(i));
            if (F != null) {
                return F;
            }
        }
        return null;
    }

    public static void k(d dVar) {
        WeakReference weakReference = dVar.g;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == dVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            dVar.g = null;
        }
    }

    public static long O() {
        if (L0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public final void q(View view) {
        L(view);
        AbstractC8305oK2 abstractC8305oK2 = this.r;
        ArrayList arrayList = this.I;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((BK2) this.I.get(size)).b(view);
            }
        }
    }

    public final int H(d dVar) {
        if (!((dVar.o & 524) != 0) && dVar.k()) {
            B6 b6 = this.j;
            int i = dVar.h;
            ArrayList arrayList = b6.b;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                A6 a6 = (A6) arrayList.get(i2);
                int i3 = a6.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = a6.b;
                        if (i4 <= i) {
                            int i5 = a6.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = a6.b;
                        if (i6 == i) {
                            i = a6.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (a6.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (a6.b <= i) {
                    i += a6.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final void c0(d dVar, C10019tK2 c10019tK2) {
        int i = (dVar.o & (-8193)) | 0;
        dVar.o = i;
        boolean z = this.n0.h;
        C4280cd4 c4280cd4 = this.l;
        if (z) {
            if (((i & 2) != 0) && !dVar.n() && !dVar.t()) {
                c4280cd4.b.i(I(dVar), dVar);
            }
        }
        C1439Lb3 c1439Lb3 = c4280cd4.a;
        C3937bd4 c3937bd4 = (C3937bd4) c1439Lb3.get(dVar);
        if (c3937bd4 == null) {
            c3937bd4 = C3937bd4.a();
            c1439Lb3.put(dVar, c3937bd4);
        }
        c3937bd4.b = c10019tK2;
        c3937bd4.a |= 4;
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        C8893q22 P = P();
        if (P.d) {
            WeakHashMap weakHashMap = Ec4.a;
            P.c.stopNestedScroll();
        }
        P.d = z;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return P().d;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return P().f(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        P().g(0);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return P().e(0) != null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return P().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return P().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return P().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return P().b(f, f2);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        InterfaceC9333rK2 interfaceC9333rK2 = this.v0;
        if (interfaceC9333rK2 == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        ((F13) interfaceC9333rK2).getClass();
        return (i - 1) - i2;
    }

    public final C8893q22 P() {
        if (this.x0 == null) {
            this.x0 = new C8893q22(this);
        }
        return this.x0;
    }
}
