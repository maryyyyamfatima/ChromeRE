package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoViewTestHelper;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yE1 */
/* loaded from: classes.dex */
public final class C11703yE1 extends ComponentHost implements InterfaceC10392uQ2, InterfaceC1305Kb {
    public static final int[] U = new int[2];
    public ComponentTree D;
    public final C12151zZ1 E;
    public final C7849n00 F;
    public boolean G;
    public final Rect H;
    public boolean I;

    /* renamed from: J */
    public boolean f11551J;
    public boolean K;
    public int L;
    public int M;
    public GJ2 N;
    public final AccessibilityManager O;
    public final C11017wE1 P;
    public ComponentTree Q;
    public int R;
    public boolean S;
    public HashMap T;

    public C11703yE1(Context context) {
        this(new C7849n00(context, (String) null, (C5524gE1) null, (C5277fX3) null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11703yE1(C7849n00 c7849n00) {
        super(c7849n00);
        boolean z = B10.a;
        this.H = new Rect();
        this.f11551J = false;
        this.K = false;
        this.L = -1;
        this.M = -1;
        new Rect();
        this.N = null;
        this.P = new C11017wE1(this);
        this.F = c7849n00;
        this.E = new C12151zZ1(this);
        this.O = (AccessibilityManager) c7849n00.a.getSystemService("accessibility");
    }

    public static void E(ComponentHost componentHost) {
        int childCount = componentHost.getChildCount();
        if (childCount == 0) {
            return;
        }
        View[] viewArr = new View[childCount];
        for (int i = 0; i < childCount; i++) {
            viewArr[i] = componentHost.getChildAt(i);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = viewArr[i2];
            if (view.getParent() == componentHost) {
                if (view.isLayoutRequested()) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
                    view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
                if (view instanceof ComponentHost) {
                    E((ComponentHost) view);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        A();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        z();
    }

    public final void z() {
        ComponentTree componentTree;
        if (this.G) {
            return;
        }
        this.G = true;
        ComponentTree componentTree2 = this.D;
        if (componentTree2 != null) {
            componentTree2.a();
        }
        n(J1.a((AccessibilityManager) getContext().getSystemService("accessibility")));
        C11017wE1 c11017wE1 = this.P;
        if (c11017wE1 != null) {
            this.O.addAccessibilityStateChangeListener(new V0(c11017wE1));
        }
        if (u() || v()) {
            return;
        }
        C12151zZ1 c12151zZ1 = this.E;
        c12151zZ1.getClass();
        LK3.a();
        if (c12151zZ1.g || (componentTree = this.D) == null || componentTree.t) {
            return;
        }
        F(new Rect(0, 0, getWidth(), getHeight()));
    }

    public final void A() {
        ComponentTree componentTree;
        if (this.G) {
            this.G = false;
            if (!u() && (componentTree = this.D) != null && !componentTree.t) {
                F(new Rect());
            }
            C12151zZ1 c12151zZ1 = this.E;
            c12151zZ1.getClass();
            LK3.a();
            LK3.a();
            long[] jArr = c12151zZ1.d;
            if (jArr != null) {
                int length = jArr.length;
                for (int i = 0; i < length; i++) {
                    C11122wZ1 o = c12151zZ1.o(i);
                    if (o != null && o.c) {
                        c12151zZ1.A(o, o.d.b.j.i, o.a);
                    }
                }
                C3471aG0 c3471aG0 = c12151zZ1.w;
                C9788sf4.c(c3471aG0);
                if (c12151zZ1.v != null) {
                    C9788sf4.c(c3471aG0);
                }
                if (c12151zZ1.B != null) {
                    c12151zZ1.C.d();
                }
            }
            ComponentTree componentTree2 = this.D;
            if (componentTree2 != null) {
                componentTree2.g();
            }
            C11017wE1 c11017wE1 = this.P;
            if (c11017wE1 == null) {
                return;
            }
            this.O.removeAccessibilityStateChangeListener(new V0(c11017wE1));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        B(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b9, code lost:            if (r11 == false) goto L694;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0191, code lost:            if (r11 == false) goto L679;     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11703yE1.B(int, int):void");
    }

    @Override // com.facebook.litho.ComponentHost
    public final void m(boolean z, int i, int i2, int i3, int i4) {
        D(i, i2, i3, i4);
    }

    public final void D(int i, int i2, int i3, int i4) {
        boolean z;
        ComponentTree componentTree;
        ComponentTree componentTree2 = this.D;
        if (componentTree2 != null) {
            synchronized (componentTree2) {
                z = componentTree2.b;
            }
            if (z) {
                throw new IllegalStateException("Trying to layout a LithoView holding onto a released ComponentTree");
            }
            if (this.S || this.D.V == null) {
                this.D.m(View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - i) - getPaddingRight()) - getPaddingLeft()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i4 - i2) - getPaddingTop()) - getPaddingBottom()), 1073741824), U, false);
                this.K = false;
                this.S = false;
            }
            ComponentTree componentTree3 = this.D;
            componentTree3.getClass();
            LK3.a();
            boolean o = componentTree3.o();
            if (o && !u() && (componentTree = this.D) != null && !componentTree.t) {
                F(new Rect(0, 0, getWidth(), getHeight()));
            }
            if (!o) {
                x();
            }
            if (o) {
                return;
            }
            E(this);
        }
    }

    @Override // com.facebook.litho.ComponentHost
    public final boolean p() {
        ComponentTree componentTree = this.D;
        if (componentTree == null || !componentTree.r) {
            return !this.r;
        }
        return false;
    }

    public final void H(ComponentTree componentTree) {
        boolean z;
        String str;
        HashMap hashMap;
        LK3.a();
        if (this.f11551J) {
            throw new RuntimeException("Cannot update ComponentTree while in the middle of measure");
        }
        this.Q = null;
        ComponentTree componentTree2 = this.D;
        if (componentTree2 == componentTree) {
            if (this.G) {
                G();
                return;
            }
            return;
        }
        this.K = componentTree2 == null || componentTree == null || componentTree2.Z != componentTree.Z;
        J();
        if (this.D != null) {
            boolean z2 = B10.a;
            C9788sf4.c(this.E.w);
            C12151zZ1 c12151zZ1 = this.E;
            if (c12151zZ1.B != null) {
                ((EW3) c12151zZ1.C.b).d = -1;
            }
            c12151zZ1.p = -1;
            if (this.T != null) {
                this.D.i();
            }
            if (componentTree != null && componentTree.getLithoView() != null && (hashMap = this.T) != null && hashMap.containsKey("LithoView:SetAlreadyAttachedComponentTree")) {
                X5.a(this.T.get("LithoView:SetAlreadyAttachedComponentTree"));
                throw null;
            }
            if (this.G) {
                this.D.g();
            }
            ComponentTree componentTree3 = this.D;
            componentTree3.getClass();
            LK3.a();
            if (componentTree3.x) {
                throw new IllegalStateException("Clearing the LithoView while the ComponentTree is attached");
            }
            componentTree3.z = null;
        }
        if (componentTree != null) {
            this.E.D = componentTree.h;
        }
        this.D = componentTree;
        if (componentTree != null) {
            synchronized (componentTree) {
                z = componentTree.b;
            }
            if (z) {
                ComponentTree componentTree4 = this.D;
                synchronized (componentTree4) {
                    str = componentTree4.c;
                }
                throw new IllegalStateException(AbstractC4809e90.a("Setting a released ComponentTree to a LithoView, released component was: ", str));
            }
            ComponentTree componentTree5 = this.D;
            componentTree5.getClass();
            LK3.a();
            C11703yE1 c11703yE1 = componentTree5.z;
            if (c11703yE1 != this) {
                if (c11703yE1 != null) {
                    c11703yE1.H(null);
                } else if (componentTree5.x) {
                    componentTree5.g();
                }
                C7849n00 c7849n00 = componentTree5.p;
                Context context = c7849n00.a;
                if (context != context.getApplicationContext()) {
                    if (!(W60.a(getContext()) == W60.a(c7849n00.a))) {
                        throw new IllegalArgumentException(IR0.a("Base view context differs, view context is: ", String.valueOf(getContext()), ", ComponentTree context is: ", String.valueOf(c7849n00.a)));
                    }
                }
                componentTree5.z = this;
            }
            if (this.G) {
                this.D.a();
            } else {
                requestLayout();
            }
        }
    }

    public final void G() {
        this.E.x();
    }

    @Override // android.view.View
    public final void setHasTransientState(boolean z) {
        super.setHasTransientState(z);
        if (z) {
            if (this.R == 0 && this.D != null) {
                y(new Rect(0, 0, getWidth(), getHeight()), false);
            }
            this.R++;
            return;
        }
        int i = this.R - 1;
        this.R = i;
        if (i == 0 && this.D != null) {
            x();
        }
        if (this.R < 0) {
            this.R = 0;
        }
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        C();
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        C();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        if (f == getTranslationX()) {
            return;
        }
        super.setTranslationX(f);
        C();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (f == getTranslationY()) {
            return;
        }
        super.setTranslationY(f);
        C();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        t(canvas);
    }

    public final void t(Canvas canvas) {
        try {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            super.draw(canvas);
            GJ2 gj2 = this.N;
            if (gj2 != null) {
                HJ2 hj2 = gj2.b;
                hj2.i.U.getClass();
                C11703yE1 c11703yE1 = gj2.a;
                int J2 = RecyclerView.J(c11703yE1);
                if (J2 != -1) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    KJ2 kj2 = hj2.i;
                    O00 o00 = (O00) kj2.a.get(J2);
                    C6206iD0 a = o00.f().a();
                    if (a != null) {
                        AtomicInteger atomicInteger = o00.g;
                        if (atomicInteger.get() == 0) {
                            RecyclerView recyclerView = kj2.U;
                            JJ2 jj2 = new JJ2(a, uptimeMillis);
                            WeakHashMap weakHashMap = Ec4.a;
                            recyclerView.postOnAnimation(jj2);
                            atomicInteger.set(2);
                        }
                    }
                    c11703yE1.N = null;
                }
            }
        } catch (Throwable th) {
            throw new C7586mE1(null, this.D, th);
        }
    }

    public final void C() {
        if (this.D == null || !(getParent() instanceof View)) {
            return;
        }
        int width = ((View) getParent()).getWidth();
        int height = ((View) getParent()).getHeight();
        int translationX = (int) getTranslationX();
        int translationY = (int) getTranslationY();
        int top = getTop() + translationY;
        int bottom = getBottom() + translationY;
        int left = getLeft() + translationX;
        int right = getRight() + translationX;
        if (left >= 0 && top >= 0 && right <= width && bottom <= height) {
            Rect rect = this.H;
            if (rect.left >= 0 && rect.top >= 0 && rect.right <= width && rect.bottom <= height && rect.width() == getWidth() && rect.height() == getHeight()) {
                return;
            }
        }
        Rect rect2 = new Rect();
        if (getLocalVisibleRect(rect2)) {
            y(rect2, true);
        }
    }

    public final void y(Rect rect, boolean z) {
        boolean z2;
        ComponentTree componentTree = this.D;
        if (componentTree != null) {
            if (componentTree.V != null) {
                z2 = true;
            } else {
                if (componentTree.t && !isLayoutRequested()) {
                    throw new RuntimeException("Trying to incrementally mount a component with a null main thread LayoutState on a LithoView that hasn't requested layout!");
                }
                z2 = false;
            }
            if (z2) {
                ComponentTree componentTree2 = this.D;
                if (componentTree2.t) {
                    componentTree2.n(rect, z);
                } else if (z) {
                    F(rect);
                }
            }
        }
    }

    public final void x() {
        ComponentTree componentTree = this.D;
        if (componentTree == null || componentTree.V == null) {
            return;
        }
        if (componentTree.t) {
            componentTree.j();
            return;
        }
        Rect rect = new Rect();
        if (!getLocalVisibleRect(rect)) {
            rect.setEmpty();
        }
        F(rect);
    }

    public final boolean u() {
        ComponentTree componentTree = this.D;
        return componentTree != null && componentTree.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0331 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0343 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b3  */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v7, types: [wZ1] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r8v15, types: [com.facebook.litho.ComponentHost] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(defpackage.C0772Fy1 r29, android.graphics.Rect r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11703yE1.w(Fy1, android.graphics.Rect, boolean):void");
    }

    public final void F(Rect rect) {
        ComponentTree componentTree = this.D;
        if (componentTree == null || !componentTree.v) {
            return;
        }
        if (componentTree.V == null) {
            Log.w("yE1", "Main Thread Layout state is not found");
            return;
        }
        boolean v = v();
        C12151zZ1 c12151zZ1 = this.E;
        C3471aG0 c3471aG0 = c12151zZ1.w;
        boolean z = false;
        C9788sf4 c9788sf4 = c12151zZ1.v;
        if (v) {
            c9788sf4.getClass();
            J91 j91 = ((C9445rf4) c3471aG0.b).f;
            if (j91 == null) {
                j91 = c3471aG0.b();
            }
            if (j91 != null && j91.hasTransientState()) {
                z = true;
            }
            if (!z) {
                C9445rf4 c9445rf4 = (C9445rf4) c3471aG0.b;
                Rect rect2 = c9445rf4.e;
                C9788sf4.e(c3471aG0, rect2, true);
                if (rect2 != null) {
                    c9445rf4.b.set(rect2);
                }
            }
        } else {
            c9788sf4.getClass();
            J91 j912 = ((C9445rf4) c3471aG0.b).f;
            if (j912 == null) {
                j912 = c3471aG0.b();
            }
            boolean z2 = !(j912 != null && j912.hasTransientState());
            C9445rf4 c9445rf42 = (C9445rf4) c3471aG0.b;
            J91 j913 = c9445rf42.f;
            if (j913 == null) {
                j913 = c3471aG0.b();
            }
            if (j913 != null) {
                j913.hasTransientState();
            }
            if (z2) {
                C9788sf4.e(c3471aG0, rect, false);
                c9445rf42.b.set(rect);
            }
        }
        this.H.set(rect);
    }

    public final void K() {
        C12151zZ1 c12151zZ1 = this.E;
        c12151zZ1.getClass();
        LK3.a();
        long[] jArr = c12151zZ1.d;
        if (jArr != null) {
            for (int length = jArr.length - 1; length >= 0; length--) {
                c12151zZ1.B(length, c12151zZ1.h);
            }
            c12151zZ1.k.setEmpty();
            c12151zZ1.g = true;
            C10093tZ1 c10093tZ1 = c12151zZ1.z;
            if (c10093tZ1 != null) {
                c10093tZ1.f();
            }
            C3471aG0 c3471aG0 = c12151zZ1.w;
            C9788sf4 c9788sf4 = c12151zZ1.v;
            if (c9788sf4 != null) {
                c9788sf4.d(c3471aG0);
            }
            C3471aG0 c3471aG02 = c12151zZ1.C;
            FW3 fw3 = c12151zZ1.B;
            if (fw3 != null) {
                fw3.i(c3471aG02);
            }
            if (fw3 != null) {
                ((EW3) c3471aG02.b).d = -1;
            }
            c12151zZ1.p = -1;
            C9788sf4.c(c3471aG0);
        }
        this.H.setEmpty();
    }

    public final void J() {
        C12151zZ1 c12151zZ1 = this.E;
        c12151zZ1.getClass();
        LK3.a();
        c12151zZ1.e = true;
        c12151zZ1.k.setEmpty();
        this.H.setEmpty();
    }

    public final boolean v() {
        C12151zZ1 c12151zZ1 = this.E;
        c12151zZ1.getClass();
        LK3.a();
        return c12151zZ1.e;
    }

    public final void I(List list) {
        if (list == null) {
            this.T = null;
            return;
        }
        this.T = new HashMap();
        if (list.size() <= 0) {
            return;
        }
        X5.a(list.get(0));
        throw null;
    }

    @Override // android.view.View
    public final String toString() {
        return AbstractC7848n0.a(super.toString(), LithoViewTestHelper.viewToString(this, true));
    }

    @Override // com.facebook.litho.ComponentHost
    public final HashMap i(int i, int i2) {
        WZ wz;
        WZ wz2;
        HashMap i3 = super.i(i, i2);
        ComponentTree componentTree = this.D;
        if (componentTree == null) {
            i3.put("lithoView", null);
            return i3;
        }
        HashMap hashMap = new HashMap();
        i3.put("lithoView", hashMap);
        synchronized (componentTree) {
            wz = componentTree.N;
        }
        if (wz == null) {
            hashMap.put("root", null);
            return i3;
        }
        synchronized (componentTree) {
            wz2 = componentTree.N;
        }
        hashMap.put("root", wz2.c0());
        hashMap.put("tree", M00.a(componentTree.p));
        return i3;
    }

    public Deque findTestItems(String str) {
        HashMap hashMap = this.E.c;
        if (hashMap == null) {
            throw new UnsupportedOperationException("Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false.");
        }
        Deque deque = (Deque) hashMap.get(str);
        return deque == null ? new LinkedList() : deque;
    }
}
