package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment$SavedState;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import defpackage.AbstractC12077zK2;
import defpackage.AbstractC8305oK2;
import defpackage.C12060zH0;
import defpackage.C1208Jh2;
import defpackage.C3487aJ1;
import defpackage.C3943be4;
import defpackage.C4286ce4;
import defpackage.C4630de4;
import defpackage.C6313iY2;
import defpackage.C6655jY2;
import defpackage.ET0;
import defpackage.Ec4;
import defpackage.FT0;
import defpackage.IR0;
import defpackage.JG2;
import defpackage.KS0;
import defpackage.LT0;
import defpackage.Pd4;
import defpackage.Qd4;
import defpackage.R10;
import defpackage.Rd4;
import defpackage.RunnableC4973ee4;
import defpackage.Sd4;
import defpackage.Td4;
import defpackage.Wd4;
import defpackage.Xd4;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect a;
    public final Rect g;
    public final R10 h;
    public int i;
    public boolean j;
    public final Qd4 k;
    public Wd4 l;
    public int m;
    public Parcelable n;
    public C4630de4 o;
    public C4286ce4 p;
    public C6655jY2 q;
    public R10 r;
    public C12060zH0 s;
    public boolean t;
    public int u;
    public C3943be4 v;

    public ViewPager2(Context context) {
        super(context);
        this.a = new Rect();
        this.g = new Rect();
        this.h = new R10();
        this.j = false;
        this.k = new Qd4(this);
        this.m = -1;
        this.t = true;
        this.u = -1;
        a(context, null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.g = new Rect();
        this.h = new R10();
        this.j = false;
        this.k = new Qd4(this);
        this.m = -1;
        this.t = true;
        this.u = -1;
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.v = new C3943be4(this);
        C4630de4 c4630de4 = new C4630de4(this, context);
        this.o = c4630de4;
        WeakHashMap weakHashMap = Ec4.a;
        c4630de4.setId(View.generateViewId());
        this.o.setDescendantFocusability(131072);
        Wd4 wd4 = new Wd4(this);
        this.l = wd4;
        this.o.q0(wd4);
        C4630de4 c4630de42 = this.o;
        c4630de42.d0 = ViewConfiguration.get(c4630de42.getContext()).getScaledPagingTouchSlop();
        int[] iArr = JG2.h1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        Ec4.l(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            this.l.j1(obtainStyledAttributes.getInt(0, 0));
            this.v.e();
            obtainStyledAttributes.recycle();
            this.o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.o.h(new Td4());
            C6655jY2 c6655jY2 = new C6655jY2(this);
            this.q = c6655jY2;
            this.s = new C12060zH0(c6655jY2);
            C4286ce4 c4286ce4 = new C4286ce4(this);
            this.p = c4286ce4;
            c4286ce4.a(this.o);
            this.o.i(this.q);
            R10 r10 = new R10();
            this.r = r10;
            this.q.a = r10;
            Rd4 rd4 = new Rd4(this);
            Sd4 sd4 = new Sd4(this);
            r10.a.add(rd4);
            this.r.a.add(sd4);
            this.v.c(this.o);
            this.r.a.add(this.h);
            this.r.a.add(new C1208Jh2(this.l));
            C4630de4 c4630de43 = this.o;
            attachViewToParent(c4630de43, 0, c4630de43.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.v.getClass();
        this.v.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.o.getId();
        int i = this.m;
        if (i == -1) {
            i = this.i;
        }
        savedState.g = i;
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            savedState.h = parcelable;
        } else {
            AbstractC8305oK2 abstractC8305oK2 = this.o.r;
            if (abstractC8305oK2 instanceof LT0) {
                LT0 lt0 = (LT0) abstractC8305oK2;
                lt0.getClass();
                C3487aJ1 c3487aJ1 = lt0.k;
                int k = c3487aJ1.k();
                C3487aJ1 c3487aJ12 = lt0.l;
                Bundle bundle = new Bundle(c3487aJ12.k() + k);
                for (int i2 = 0; i2 < c3487aJ1.k(); i2++) {
                    long h = c3487aJ1.h(i2);
                    c cVar = (c) c3487aJ1.d(h);
                    if (cVar != null && cVar.W()) {
                        String a = Pd4.a("f#", h);
                        h hVar = lt0.j;
                        hVar.getClass();
                        if (cVar.x != hVar) {
                            hVar.a0(new IllegalStateException(KS0.a("Fragment ", cVar, " is not currently in the FragmentManager")));
                            throw null;
                        }
                        bundle.putString(a, cVar.k);
                    }
                }
                for (int i3 = 0; i3 < c3487aJ12.k(); i3++) {
                    long h2 = c3487aJ12.h(i3);
                    if (lt0.N(h2)) {
                        bundle.putParcelable(Pd4.a("s#", h2), (Parcelable) c3487aJ12.d(h2));
                    }
                }
                savedState.h = bundle;
            }
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
        super.onRestoreInstanceState(savedState.getSuperState());
        this.m = savedState.g;
        this.n = savedState.h;
    }

    public final void b() {
        AbstractC8305oK2 abstractC8305oK2;
        c cVar;
        if (this.m == -1 || (abstractC8305oK2 = this.o.r) == null) {
            return;
        }
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            if (abstractC8305oK2 instanceof LT0) {
                LT0 lt0 = (LT0) abstractC8305oK2;
                C3487aJ1 c3487aJ1 = lt0.l;
                if (c3487aJ1.k() == 0) {
                    C3487aJ1 c3487aJ12 = lt0.k;
                    if (c3487aJ12.k() == 0) {
                        Bundle bundle = (Bundle) parcelable;
                        if (bundle.getClassLoader() == null) {
                            bundle.setClassLoader(lt0.getClass().getClassLoader());
                        }
                        for (String str : bundle.keySet()) {
                            if (!(str.startsWith("f#") && str.length() > 2)) {
                                if (!(str.startsWith("s#") && str.length() > 2)) {
                                    throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                                }
                                long parseLong = Long.parseLong(str.substring(2));
                                Fragment$SavedState fragment$SavedState = (Fragment$SavedState) bundle.getParcelable(str);
                                if (lt0.N(parseLong)) {
                                    c3487aJ1.i(parseLong, fragment$SavedState);
                                }
                            } else {
                                long parseLong2 = Long.parseLong(str.substring(2));
                                h hVar = lt0.j;
                                hVar.getClass();
                                String string = bundle.getString(str);
                                if (string == null) {
                                    cVar = null;
                                } else {
                                    c z = hVar.z(string);
                                    if (z == null) {
                                        hVar.a0(new IllegalStateException(IR0.a("Fragment no longer exists for key ", str, ": unique id ", string)));
                                        throw null;
                                    }
                                    cVar = z;
                                }
                                c3487aJ12.i(parseLong2, cVar);
                            }
                        }
                        if (!(c3487aJ12.k() == 0)) {
                            lt0.q = true;
                            lt0.p = true;
                            lt0.P();
                            Handler handler = new Handler(Looper.getMainLooper());
                            ET0 et0 = new ET0(lt0);
                            lt0.i.a(new FT0(handler, et0));
                            handler.postDelayed(et0, 10000L);
                        }
                    }
                }
                throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
            }
            this.n = null;
        }
        int max = Math.max(0, Math.min(this.m, abstractC8305oK2.q() - 1));
        this.i = max;
        this.m = -1;
        this.o.m0(max);
        this.v.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).a;
            sparseArray.put(this.o.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new a();
        public int a;
        public int g;
        public Parcelable h;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readParcelable(classLoader);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readParcelable(null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.g);
            parcel.writeParcelable(this.h, i);
        }
    }

    public final void c(AbstractC8305oK2 abstractC8305oK2) {
        AbstractC8305oK2 abstractC8305oK22 = this.o.r;
        this.v.b(abstractC8305oK22);
        Qd4 qd4 = this.k;
        if (abstractC8305oK22 != null) {
            abstractC8305oK22.L(qd4);
        }
        this.o.n0(abstractC8305oK2);
        this.i = 0;
        b();
        this.v.a(abstractC8305oK2);
        abstractC8305oK2.J(qd4);
    }

    public final void e(int i, boolean z) {
        Xd4 xd4;
        AbstractC8305oK2 abstractC8305oK2 = this.o.r;
        if (abstractC8305oK2 == null) {
            if (this.m != -1) {
                this.m = Math.max(i, 0);
                return;
            }
            return;
        }
        if (abstractC8305oK2.q() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i, 0), abstractC8305oK2.q() - 1);
        int i2 = this.i;
        if (min == i2) {
            if (this.q.k == 0) {
                return;
            }
        }
        if (min == i2 && z) {
            return;
        }
        double d = i2;
        this.i = min;
        this.v.e();
        C6655jY2 c6655jY2 = this.q;
        if (!(c6655jY2.k == 0)) {
            c6655jY2.v();
            C6313iY2 c6313iY2 = c6655jY2.l;
            d = c6313iY2.a + c6313iY2.b;
        }
        C6655jY2 c6655jY22 = this.q;
        c6655jY22.getClass();
        c6655jY22.j = z ? 2 : 3;
        c6655jY22.r = false;
        boolean z2 = c6655jY22.n != min;
        c6655jY22.n = min;
        c6655jY22.t(2);
        if (z2 && (xd4 = c6655jY22.a) != null) {
            xd4.c(min);
        }
        if (!z) {
            this.o.m0(min);
            return;
        }
        double d2 = min;
        if (Math.abs(d2 - d) > 3.0d) {
            this.o.m0(d2 > d ? min - 3 : min + 3);
            C4630de4 c4630de4 = this.o;
            c4630de4.post(new RunnableC4973ee4(min, c4630de4));
            return;
        }
        this.o.u0(min);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.o, i, i2);
        int measuredWidth = this.o.getMeasuredWidth();
        int measuredHeight = this.o.getMeasuredHeight();
        int measuredState = this.o.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.o.getMeasuredWidth();
        int measuredHeight = this.o.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.g;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.o.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.j) {
            f();
        }
    }

    public final void f() {
        C4286ce4 c4286ce4 = this.p;
        if (c4286ce4 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View f = c4286ce4.f(this.l);
        if (f == null) {
            return;
        }
        this.l.getClass();
        int J2 = AbstractC12077zK2.J(f);
        if (J2 != this.i && this.q.k == 0) {
            this.r.c(J2);
        }
        this.j = false;
    }

    public final void d(int i, boolean z) {
        if (this.s.a.r) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        e(i, z);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.o.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.o.canScrollVertically(i);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.v.e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int q;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3943be4 c3943be4 = this.v;
        c3943be4.getClass();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        ViewPager2 viewPager2 = c3943be4.d;
        AbstractC8305oK2 abstractC8305oK2 = viewPager2.o.r;
        if (abstractC8305oK2 != null) {
            if (viewPager2.l.p == 1) {
                i = abstractC8305oK2.q();
                i2 = 1;
            } else {
                i2 = abstractC8305oK2.q();
                i = 1;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        accessibilityNodeInfoCompat.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, 0));
        AbstractC8305oK2 abstractC8305oK22 = viewPager2.o.r;
        if (abstractC8305oK22 == null || (q = abstractC8305oK22.q()) == 0 || !viewPager2.t) {
            return;
        }
        if (viewPager2.i > 0) {
            accessibilityNodeInfoCompat.a(8192);
        }
        if (viewPager2.i < q - 1) {
            accessibilityNodeInfoCompat.a(4096);
        }
        accessibilityNodeInfoCompat.q(true);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.v.getClass();
        if (i == 8192 || i == 4096) {
            C3943be4 c3943be4 = this.v;
            c3943be4.getClass();
            if (!(i == 8192 || i == 4096)) {
                throw new IllegalStateException();
            }
            ViewPager2 viewPager2 = c3943be4.d;
            int i2 = i == 8192 ? viewPager2.i - 1 : viewPager2.i + 1;
            if (viewPager2.t) {
                viewPager2.e(i2, true);
            }
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }
}
