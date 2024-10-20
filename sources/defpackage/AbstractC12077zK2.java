package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zK2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12077zK2 {
    public DJ a;
    public RecyclerView b;
    public final C5305fc4 c;
    public final C5305fc4 d;
    public VB1 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public boolean B0() {
        return false;
    }

    public abstract void D0(RecyclerView recyclerView, int i);

    public abstract boolean F0();

    public int M(b bVar, LK2 lk2) {
        return -1;
    }

    public abstract boolean P();

    public void U() {
    }

    public abstract void V(RecyclerView recyclerView);

    public abstract View W(View view, int i, b bVar, LK2 lk2);

    public void a0(b bVar, LK2 lk2, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void b0(int i, int i2) {
    }

    public abstract void c(String str);

    public void c0() {
    }

    public void d0(int i, int i2) {
    }

    public abstract boolean e();

    public void e0(int i, int i2) {
    }

    public abstract boolean f();

    public void f0(int i, int i2) {
    }

    public boolean g(AK2 ak2) {
        return ak2 != null;
    }

    public abstract void g0(b bVar, LK2 lk2);

    public abstract void h0(LK2 lk2);

    public abstract void i(int i, int i2, LK2 lk2, C10425uX0 c10425uX0);

    public abstract void i0(Parcelable parcelable);

    public void j(int i, C10425uX0 c10425uX0) {
    }

    public abstract Parcelable j0();

    public abstract int k(LK2 lk2);

    public void k0(int i) {
    }

    public abstract int l(LK2 lk2);

    public abstract int m(LK2 lk2);

    public abstract int n(LK2 lk2);

    public abstract int o(LK2 lk2);

    public abstract int p(LK2 lk2);

    public abstract AK2 s();

    public abstract int s0(int i, b bVar, LK2 lk2);

    public abstract void t0(int i);

    public abstract int u0(int i, b bVar, LK2 lk2);

    public int z(b bVar, LK2 lk2) {
        return -1;
    }

    public final void n0(b bVar) {
        ArrayList arrayList;
        int size = bVar.a.size();
        int i = size - 1;
        while (true) {
            arrayList = bVar.a;
            if (i < 0) {
                break;
            }
            View view = ((d) arrayList.get(i)).a;
            d L = RecyclerView.L(view);
            if (!L.t()) {
                L.s(false);
                if (L.p()) {
                    this.b.removeDetachedView(view, false);
                }
                AbstractC2348Sb3 abstractC2348Sb3 = this.b.S;
                if (abstractC2348Sb3 != null) {
                    abstractC2348Sb3.i(L);
                }
                L.s(true);
                d L2 = RecyclerView.L(view);
                L2.s = null;
                L2.t = false;
                L2.o &= -33;
                bVar.i(L2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = bVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public AbstractC12077zK2() {
        C11048wK2 c11048wK2 = new C11048wK2(this);
        C11391xK2 c11391xK2 = new C11391xK2(this);
        this.c = new C5305fc4(c11048wK2);
        this.d = new C5305fc4(c11391xK2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public final void z0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.k;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final void w0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.J0) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.J0) {
            return;
        }
        this.o = 0;
    }

    public final void y0(int i, int i2) {
        int x = x();
        if (x == 0) {
            this.b.p(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < x; i7++) {
            View w = w(i7);
            Rect rect = this.b.o;
            RecyclerView.M(rect, w);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.o.set(i6, i4, i3, i5);
        x0(this.b.o, i, i2);
    }

    public void x0(Rect rect, int i, int i2) {
        int H = H() + G() + rect.width();
        int F = F() + I() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = Ec4.a;
        RecyclerView.e(this.b, h(i, H, recyclerView.getMinimumWidth()), h(i2, F, this.b.getMinimumHeight()));
    }

    public final void r0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public static int h(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public AK2 u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof AK2) {
            return new AK2((AK2) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AK2((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AK2(layoutParams);
    }

    public AK2 t(Context context, AttributeSet attributeSet) {
        return new AK2(context, attributeSet);
    }

    public final void E0(VB1 vb1) {
        VB1 vb12 = this.e;
        if (vb12 != null && vb1 != vb12 && vb12.e) {
            vb12.j();
        }
        this.e = vb1;
        RecyclerView recyclerView = this.b;
        c cVar = recyclerView.k0;
        cVar.l.removeCallbacks(cVar);
        cVar.h.abortAnimation();
        if (vb1.h) {
            Log.w("RecyclerView", "An instance of " + vb1.getClass().getSimpleName() + " was started more than once. Each instance of" + vb1.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        vb1.b = recyclerView;
        vb1.c = this;
        int i = vb1.a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.n0.a = i;
        vb1.e = true;
        vb1.d = true;
        vb1.f = recyclerView.s.r(i);
        vb1.b.k0.b();
        vb1.h = true;
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = Ec4.a;
        return recyclerView.getLayoutDirection();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12077zK2.b(android.view.View, int, boolean):void");
    }

    public final void o0(View view) {
        DJ dj = this.a;
        C7617mK2 c7617mK2 = dj.a;
        int indexOfChild = c7617mK2.a.indexOfChild(view);
        if (indexOfChild < 0) {
            return;
        }
        if (dj.b.f(indexOfChild)) {
            dj.k(view);
        }
        c7617mK2.b(indexOfChild);
    }

    public final void p0(int i) {
        if (w(i) != null) {
            DJ dj = this.a;
            int f = dj.f(i);
            C7617mK2 c7617mK2 = dj.a;
            View childAt = c7617mK2.a.getChildAt(f);
            if (childAt == null) {
                return;
            }
            if (dj.b.f(f)) {
                dj.k(childAt);
            }
            c7617mK2.b(f);
        }
    }

    public static int J(View view) {
        return ((AK2) view.getLayoutParams()).c();
    }

    public View r(int i) {
        int x = x();
        for (int i2 = 0; i2 < x; i2++) {
            View w = w(i2);
            d L = RecyclerView.L(w);
            if (L != null && L.h() == i && !L.t() && (this.b.n0.g || !L.n())) {
                return w;
            }
        }
        return null;
    }

    public final int x() {
        DJ dj = this.a;
        if (dj != null) {
            return dj.e();
        }
        return 0;
    }

    public final View w(int i) {
        DJ dj = this.a;
        if (dj != null) {
            return dj.d(i);
        }
        return null;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int I() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final int H() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final View B() {
        View focusedChild;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.j(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        AbstractC8305oK2 abstractC8305oK2 = recyclerView != null ? recyclerView.r : null;
        if (abstractC8305oK2 != null) {
            return abstractC8305oK2.q();
        }
        return 0;
    }

    public void S(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int e = recyclerView.k.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.k.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void T(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int e = recyclerView.k.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.k.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void q(b bVar) {
        int x = x();
        while (true) {
            x--;
            if (x < 0) {
                return;
            }
            View w = w(x);
            d L = RecyclerView.L(w);
            if (!L.t()) {
                if (!L.l() || L.n() || this.b.r.g) {
                    w(x);
                    this.a.c(x);
                    bVar.j(w);
                    this.b.l.c(L);
                } else {
                    p0(x);
                    bVar.i(L);
                }
            }
        }
    }

    public final boolean C0(View view, int i, int i2, AK2 ak2) {
        return (this.h && Q(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) ak2).width) && Q(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) ak2).height)) ? false : true;
    }

    public final boolean A0(View view, int i, int i2, AK2 ak2) {
        return (!view.isLayoutRequested() && this.h && Q(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) ak2).width) && Q(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) ak2).height)) ? false : true;
    }

    public static boolean Q(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:            if (r6 == 1073741824) goto L14;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int y(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1a
            if (r8 < 0) goto L11
            goto L1c
        L11:
            if (r8 != r1) goto L2f
            if (r6 == r2) goto L20
            if (r6 == 0) goto L2f
            if (r6 == r3) goto L20
            goto L2f
        L1a:
            if (r8 < 0) goto L1e
        L1c:
            r6 = r3
            goto L31
        L1e:
            if (r8 != r1) goto L22
        L20:
            r8 = r5
            goto L31
        L22:
            if (r8 != r0) goto L2f
            if (r6 == r2) goto L2c
            if (r6 != r3) goto L29
            goto L2c
        L29:
            r8 = r5
            r6 = r7
            goto L31
        L2c:
            r8 = r5
            r6 = r2
            goto L31
        L2f:
            r6 = r7
            r8 = r6
        L31:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12077zK2.y(boolean, int, int, int, int):int");
    }

    public static int A(View view) {
        Rect rect = ((AK2) view.getLayoutParams()).g;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static void R(View view, int i, int i2, int i3, int i4) {
        AK2 ak2 = (AK2) view.getLayoutParams();
        Rect rect = ak2.g;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) ak2).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) ak2).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) ak2).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) ak2).bottomMargin);
    }

    public final void O(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((AK2) view.getLayoutParams()).g;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void d(Rect rect, View view) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
    }

    public static int N(View view) {
        return ((AK2) view.getLayoutParams()).g.top;
    }

    public static int v(View view) {
        return ((AK2) view.getLayoutParams()).g.bottom;
    }

    public static int E(View view) {
        return ((AK2) view.getLayoutParams()).g.left;
    }

    public static int L(View view) {
        return ((AK2) view.getLayoutParams()).g.right;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:            if (r10 == false) goto L33;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean q0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.G()
            int r1 = r8.I()
            int r2 = r8.n
            int r3 = r8.H()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.D()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            if (r13 == 0) goto Lab
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L74
            goto La8
        L74:
            int r11 = r8.G()
            int r13 = r8.I()
            int r3 = r8.n
            int r4 = r8.H()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.F()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.o
            androidx.recyclerview.widget.RecyclerView.M(r5, r10)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto La8
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto La8
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto La8
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto La6
            goto La8
        La6:
            r10 = r7
            goto La9
        La8:
            r10 = r0
        La9:
            if (r10 == 0) goto Lb0
        Lab:
            if (r2 != 0) goto Lb1
            if (r1 == 0) goto Lb0
            goto Lb1
        Lb0:
            return r0
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r2, r1)
            goto Lba
        Lb7:
            r9.t0(r2, r1, r0)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12077zK2.q0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void m0(b bVar) {
        int x = x();
        while (true) {
            x--;
            if (x < 0) {
                return;
            }
            if (!RecyclerView.L(w(x)).t()) {
                View w = w(x);
                p0(x);
                bVar.h(w);
            }
        }
    }

    public void Y(b bVar, LK2 lk2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            accessibilityNodeInfoCompat.a(8192);
            accessibilityNodeInfoCompat.q(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            accessibilityNodeInfoCompat.a(4096);
            accessibilityNodeInfoCompat.q(true);
        }
        AccessibilityNodeInfo.CollectionInfo obtain = AccessibilityNodeInfo.CollectionInfo.obtain(M(bVar, lk2), z(bVar, lk2), false, 0);
        accessibilityNodeInfoCompat.getClass();
        accessibilityNodeInfoCompat.a.setCollectionInfo(obtain);
    }

    public void X(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        b bVar = recyclerView.h;
        LK2 lk2 = recyclerView.n0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC8305oK2 abstractC8305oK2 = this.b.r;
        if (abstractC8305oK2 != null) {
            accessibilityEvent.setItemCount(abstractC8305oK2.q());
        }
    }

    public final void Z(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        d L = RecyclerView.L(view);
        if (L == null || L.n() || this.a.j(L.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        a0(recyclerView.h, recyclerView.n0, view, accessibilityNodeInfoCompat);
    }

    public boolean l0(b bVar, LK2 lk2, int i, Bundle bundle) {
        int I;
        int G;
        if (this.b == null) {
            return false;
        }
        int i2 = this.o;
        int i3 = this.n;
        Rect rect = new Rect();
        if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
            i2 = rect.height();
            i3 = rect.width();
        }
        if (i == 4096) {
            I = this.b.canScrollVertically(1) ? (i2 - I()) - F() : 0;
            if (this.b.canScrollHorizontally(1)) {
                G = (i3 - G()) - H();
            }
            G = 0;
        } else if (i != 8192) {
            I = 0;
            G = 0;
        } else {
            I = this.b.canScrollVertically(-1) ? -((i2 - I()) - F()) : 0;
            if (this.b.canScrollHorizontally(-1)) {
                G = -((i3 - G()) - H());
            }
            G = 0;
        }
        if (I == 0 && G == 0) {
            return false;
        }
        this.b.t0(G, I, true);
        return true;
    }

    public static C11734yK2 K(Context context, AttributeSet attributeSet, int i, int i2) {
        C11734yK2 c11734yK2 = new C11734yK2();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.G0, i, i2);
        c11734yK2.a = obtainStyledAttributes.getInt(0, 1);
        c11734yK2.b = obtainStyledAttributes.getInt(10, 1);
        c11734yK2.c = obtainStyledAttributes.getBoolean(9, false);
        c11734yK2.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c11734yK2;
    }

    public final void v0(RecyclerView recyclerView) {
        w0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }
}
