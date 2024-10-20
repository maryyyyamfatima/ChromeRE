package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.AK2;
import defpackage.AbstractC0933He2;
import defpackage.AbstractC12077zK2;
import defpackage.C0902Gy1;
import defpackage.C10425uX0;
import defpackage.C1084Ii3;
import defpackage.C11734yK2;
import defpackage.C1214Ji3;
import defpackage.C1344Ki3;
import defpackage.C1474Li3;
import defpackage.Ec4;
import defpackage.KK2;
import defpackage.LK2;
import defpackage.PY2;
import defpackage.RunnableC0954Hi3;
import defpackage.VB1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC12077zK2 implements KK2 {
    public final f B;
    public final int C;
    public boolean D;
    public boolean E;
    public SavedState F;
    public final Rect G;
    public final C1084Ii3 H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f11490J;
    public final RunnableC0954Hi3 K;
    public int p;
    public C1474Li3[] q;
    public AbstractC0933He2 r;
    public AbstractC0933He2 s;
    public int t;
    public int u;
    public final C0902Gy1 v;
    public boolean w;
    public BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        f fVar = new f();
        this.B = fVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new C1084Ii3(this);
        this.I = true;
        this.K = new RunnableC0954Hi3(this);
        C11734yK2 K = AbstractC12077zK2.K(context, attributeSet, i, i2);
        int i3 = K.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            AbstractC0933He2 abstractC0933He2 = this.r;
            this.r = this.s;
            this.s = abstractC0933He2;
            r0();
        }
        int i4 = K.b;
        c(null);
        if (i4 != this.p) {
            fVar.a();
            r0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new C1474Li3[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new C1474Li3(this, i5);
            }
            r0();
        }
        boolean z = K.c;
        c(null);
        SavedState savedState = this.F;
        if (savedState != null && savedState.m != z) {
            savedState.m = z;
        }
        this.w = z;
        r0();
        this.v = new C0902Gy1();
        this.r = AbstractC0933He2.a(this, this.t);
        this.s = AbstractC0933He2.a(this, 1 - this.t);
    }

    @Override // defpackage.AbstractC12077zK2
    public final boolean P() {
        return this.C != 0;
    }

    public final boolean H0() {
        int Q0;
        if (x() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                Q0 = R0();
                Q0();
            } else {
                Q0 = Q0();
                R0();
            }
            if (Q0 == 0 && V0() != null) {
                this.B.a();
                this.f = true;
                r0();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC12077zK2
    public final void k0(int i) {
        if (i == 0) {
            H0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:            if (r10 == r11) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:            r10 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:            r10 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e3, code lost:            if (r10 == r11) goto L51;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View V0() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.V0():android.view.View");
    }

    @Override // defpackage.AbstractC12077zK2
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.F != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.j(str);
    }

    public final void e1() {
        if (this.t == 1 || !W0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    public final boolean W0() {
        return D() == 1;
    }

    @Override // defpackage.AbstractC12077zK2
    public final void x0(Rect rect, int i, int i2) {
        int h;
        int h2;
        int H = H() + G();
        int F = F() + I();
        if (this.t == 1) {
            int height = rect.height() + F;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = Ec4.a;
            h2 = AbstractC12077zK2.h(i2, height, recyclerView.getMinimumHeight());
            h = AbstractC12077zK2.h(i, (this.u * this.p) + H, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + H;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = Ec4.a;
            h = AbstractC12077zK2.h(i, width, recyclerView2.getMinimumWidth());
            h2 = AbstractC12077zK2.h(i2, (this.u * this.p) + F, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(h, h2);
    }

    @Override // defpackage.AbstractC12077zK2
    public final void g0(b bVar, LK2 lk2) {
        Y0(bVar, lk2, true);
    }

    @Override // defpackage.AbstractC12077zK2
    public final void U() {
        this.B.a();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0408, code lost:            if (H0() != false) goto L254;     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y0(androidx.recyclerview.widget.b r17, defpackage.LK2 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y0(androidx.recyclerview.widget.b, LK2, boolean):void");
    }

    @Override // defpackage.AbstractC12077zK2
    public final void h0(LK2 lk2) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.AbstractC12077zK2
    public final boolean F0() {
        return this.F == null;
    }

    @Override // defpackage.AbstractC12077zK2
    public final int l(LK2 lk2) {
        return J0(lk2);
    }

    public final int J0(LK2 lk2) {
        if (x() == 0) {
            return 0;
        }
        AbstractC0933He2 abstractC0933He2 = this.r;
        boolean z = this.I;
        return PY2.b(lk2, abstractC0933He2, N0(!z), M0(!z), this, this.I, this.x);
    }

    @Override // defpackage.AbstractC12077zK2
    public final int o(LK2 lk2) {
        return J0(lk2);
    }

    @Override // defpackage.AbstractC12077zK2
    public final int k(LK2 lk2) {
        return I0(lk2);
    }

    public final int I0(LK2 lk2) {
        if (x() == 0) {
            return 0;
        }
        AbstractC0933He2 abstractC0933He2 = this.r;
        boolean z = this.I;
        return PY2.a(lk2, abstractC0933He2, N0(!z), M0(!z), this, this.I);
    }

    @Override // defpackage.AbstractC12077zK2
    public final int n(LK2 lk2) {
        return I0(lk2);
    }

    @Override // defpackage.AbstractC12077zK2
    public final int m(LK2 lk2) {
        return K0(lk2);
    }

    public final int K0(LK2 lk2) {
        if (x() == 0) {
            return 0;
        }
        AbstractC0933He2 abstractC0933He2 = this.r;
        boolean z = this.I;
        return PY2.c(lk2, abstractC0933He2, N0(!z), M0(!z), this, this.I);
    }

    @Override // defpackage.AbstractC12077zK2
    public final int p(LK2 lk2) {
        return K0(lk2);
    }

    public final void X0(View view, int i, int i2, boolean z) {
        Rect rect = this.G;
        d(rect, view);
        C1214Ji3 c1214Ji3 = (C1214Ji3) view.getLayoutParams();
        int j1 = j1(i, ((ViewGroup.MarginLayoutParams) c1214Ji3).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1214Ji3).rightMargin + rect.right);
        int j12 = j1(i2, ((ViewGroup.MarginLayoutParams) c1214Ji3).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1214Ji3).bottomMargin + rect.bottom);
        if (A0(view, j1, j12, c1214Ji3)) {
            view.measure(j1, j12);
        }
    }

    public static int j1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.AbstractC12077zK2
    public final void i0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.F = savedState;
            if (this.z != -1) {
                savedState.i = null;
                savedState.h = 0;
                savedState.a = -1;
                savedState.g = -1;
                savedState.i = null;
                savedState.h = 0;
                savedState.j = 0;
                savedState.k = null;
                savedState.l = null;
            }
            r0();
        }
    }

    @Override // defpackage.AbstractC12077zK2
    public final Parcelable j0() {
        int i;
        int k;
        int[] iArr;
        SavedState savedState = this.F;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.m = this.w;
        savedState2.n = this.D;
        savedState2.o = this.E;
        f fVar = this.B;
        if (fVar != null && (iArr = fVar.a) != null) {
            savedState2.k = iArr;
            savedState2.j = iArr.length;
            savedState2.l = fVar.b;
        } else {
            savedState2.j = 0;
        }
        if (x() > 0) {
            savedState2.a = this.D ? R0() : Q0();
            View M0 = this.x ? M0(true) : N0(true);
            savedState2.g = M0 != null ? AbstractC12077zK2.J(M0) : -1;
            int i2 = this.p;
            savedState2.h = i2;
            savedState2.i = new int[i2];
            for (int i3 = 0; i3 < this.p; i3++) {
                if (this.D) {
                    i = this.q[i3].f(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        k = this.r.g();
                        i -= k;
                        savedState2.i[i3] = i;
                    } else {
                        savedState2.i[i3] = i;
                    }
                } else {
                    i = this.q[i3].i(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        k = this.r.k();
                        i -= k;
                        savedState2.i[i3] = i;
                    } else {
                        savedState2.i[i3] = i;
                    }
                }
            }
        } else {
            savedState2.a = -1;
            savedState2.g = -1;
            savedState2.h = 0;
        }
        return savedState2;
    }

    @Override // defpackage.AbstractC12077zK2
    public final void X(AccessibilityEvent accessibilityEvent) {
        super.X(accessibilityEvent);
        if (x() > 0) {
            View N0 = N0(false);
            View M0 = M0(false);
            if (N0 == null || M0 == null) {
                return;
            }
            int J2 = AbstractC12077zK2.J(N0);
            int J3 = AbstractC12077zK2.J(M0);
            if (J2 < J3) {
                accessibilityEvent.setFromIndex(J2);
                accessibilityEvent.setToIndex(J3);
            } else {
                accessibilityEvent.setFromIndex(J3);
                accessibilityEvent.setToIndex(J2);
            }
        }
    }

    public final View N0(boolean z) {
        int k = this.r.k();
        int g = this.r.g();
        int x = x();
        View view = null;
        for (int i = 0; i < x; i++) {
            View w = w(i);
            int e = this.r.e(w);
            if (this.r.b(w) > k && e < g) {
                if (e >= k || !z) {
                    return w;
                }
                if (view == null) {
                    view = w;
                }
            }
        }
        return view;
    }

    public final View M0(boolean z) {
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        for (int x = x() - 1; x >= 0; x--) {
            View w = w(x);
            int e = this.r.e(w);
            int b = this.r.b(w);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return w;
                }
                if (view == null) {
                    view = w;
                }
            }
        }
        return view;
    }

    public final void O0(b bVar, LK2 lk2, boolean z) {
        int g;
        int S0 = S0(Integer.MIN_VALUE);
        if (S0 != Integer.MIN_VALUE && (g = this.r.g() - S0) > 0) {
            int i = g - (-f1(-g, bVar, lk2));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    public final void P0(b bVar, LK2 lk2, boolean z) {
        int k;
        int T0 = T0(Integer.MAX_VALUE);
        if (T0 != Integer.MAX_VALUE && (k = T0 - this.r.k()) > 0) {
            int f1 = k - f1(k, bVar, lk2);
            if (!z || f1 <= 0) {
                return;
            }
            this.r.o(-f1);
        }
    }

    public final void h1(int i, LK2 lk2) {
        int i2;
        int i3;
        int i4;
        C0902Gy1 c0902Gy1 = this.v;
        boolean z = false;
        c0902Gy1.b = 0;
        c0902Gy1.c = i;
        VB1 vb1 = this.e;
        if (!(vb1 != null && vb1.e) || (i4 = lk2.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.x == (i4 < i)) {
                i2 = this.r.l();
                i3 = 0;
            } else {
                i3 = this.r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.m) {
            c0902Gy1.f = this.r.k() - i3;
            c0902Gy1.g = this.r.g() + i2;
        } else {
            c0902Gy1.g = this.r.f() + i2;
            c0902Gy1.f = -i3;
        }
        c0902Gy1.h = false;
        c0902Gy1.a = true;
        if (this.r.i() == 0 && this.r.f() == 0) {
            z = true;
        }
        c0902Gy1.i = z;
    }

    public final void g1(int i) {
        C0902Gy1 c0902Gy1 = this.v;
        c0902Gy1.e = i;
        c0902Gy1.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.AbstractC12077zK2
    public final void S(int i) {
        super.S(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            C1474Li3 c1474Li3 = this.q[i2];
            int i3 = c1474Li3.b;
            if (i3 != Integer.MIN_VALUE) {
                c1474Li3.b = i3 + i;
            }
            int i4 = c1474Li3.c;
            if (i4 != Integer.MIN_VALUE) {
                c1474Li3.c = i4 + i;
            }
        }
    }

    @Override // defpackage.AbstractC12077zK2
    public final void T(int i) {
        super.T(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            C1474Li3 c1474Li3 = this.q[i2];
            int i3 = c1474Li3.b;
            if (i3 != Integer.MIN_VALUE) {
                c1474Li3.b = i3 + i;
            }
            int i4 = c1474Li3.c;
            if (i4 != Integer.MIN_VALUE) {
                c1474Li3.c = i4 + i;
            }
        }
    }

    @Override // defpackage.AbstractC12077zK2
    public final void e0(int i, int i2) {
        U0(i, i2, 2);
    }

    @Override // defpackage.AbstractC12077zK2
    public final void b0(int i, int i2) {
        U0(i, i2, 1);
    }

    @Override // defpackage.AbstractC12077zK2
    public final void c0() {
        this.B.a();
        r0();
    }

    @Override // defpackage.AbstractC12077zK2
    public final void d0(int i, int i2) {
        U0(i, i2, 8);
    }

    @Override // defpackage.AbstractC12077zK2
    public final void f0(int i, int i2) {
        U0(i, i2, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.x
            if (r0 == 0) goto L9
            int r0 = r7.R0()
            goto Ld
        L9:
            int r0 = r7.Q0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            androidx.recyclerview.widget.f r4 = r7.B
            r4.c(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.e(r8, r5)
            r4.d(r9, r5)
            goto L39
        L32:
            r4.e(r8, r9)
            goto L39
        L36:
            r4.d(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.x
            if (r8 == 0) goto L45
            int r8 = r7.Q0()
            goto L49
        L45:
            int r8 = r7.R0()
        L49:
            if (r3 > r8) goto L4e
            r7.r0()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U0(int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v19 */
    public final int L0(b bVar, C0902Gy1 c0902Gy1, LK2 lk2) {
        int i;
        int k;
        int S0;
        C1474Li3 c1474Li3;
        ?? r8;
        int i2;
        int c;
        int k2;
        int c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 1;
        this.y.set(0, this.p, true);
        C0902Gy1 c0902Gy12 = this.v;
        if (c0902Gy12.i) {
            i = c0902Gy1.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (c0902Gy1.e == 1) {
            i = c0902Gy1.g + c0902Gy1.b;
        } else {
            i = c0902Gy1.f - c0902Gy1.b;
        }
        int i9 = c0902Gy1.e;
        for (int i10 = 0; i10 < this.p; i10++) {
            if (!this.q[i10].a.isEmpty()) {
                i1(this.q[i10], i9, i);
            }
        }
        if (this.x) {
            k = this.r.g();
        } else {
            k = this.r.k();
        }
        boolean z = false;
        while (true) {
            int i11 = c0902Gy1.c;
            if (((i11 < 0 || i11 >= lk2.b()) ? i7 : i8) == 0 || (!c0902Gy12.i && this.y.isEmpty())) {
                break;
            }
            View view = bVar.k(Long.MAX_VALUE, c0902Gy1.c).a;
            c0902Gy1.c += c0902Gy1.d;
            C1214Ji3 c1214Ji3 = (C1214Ji3) view.getLayoutParams();
            int c3 = c1214Ji3.c();
            f fVar = this.B;
            int[] iArr = fVar.a;
            int i12 = (iArr == null || c3 >= iArr.length) ? -1 : iArr[c3];
            if ((i12 == -1 ? i8 : i7) == 0) {
                c1474Li3 = this.q[i12];
            } else {
                if (Z0(c0902Gy1.e)) {
                    i6 = this.p - i8;
                    i5 = -1;
                    i4 = -1;
                } else {
                    i4 = i8;
                    i5 = this.p;
                    i6 = i7;
                }
                C1474Li3 c1474Li32 = null;
                if (c0902Gy1.e == i8) {
                    int k3 = this.r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i6 != i5) {
                        C1474Li3 c1474Li33 = this.q[i6];
                        int f = c1474Li33.f(k3);
                        if (f < i13) {
                            i13 = f;
                            c1474Li32 = c1474Li33;
                        }
                        i6 += i4;
                    }
                } else {
                    int g = this.r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i6 != i5) {
                        C1474Li3 c1474Li34 = this.q[i6];
                        int i15 = c1474Li34.i(g);
                        if (i15 > i14) {
                            c1474Li32 = c1474Li34;
                            i14 = i15;
                        }
                        i6 += i4;
                    }
                }
                c1474Li3 = c1474Li32;
                fVar.b(c3);
                fVar.a[c3] = c1474Li3.e;
            }
            c1214Ji3.j = c1474Li3;
            if (c0902Gy1.e == 1) {
                r8 = 0;
                b(view, -1, false);
            } else {
                r8 = 0;
                b(view, 0, false);
            }
            if (this.t == 1) {
                X0(view, AbstractC12077zK2.y(r8, this.u, this.l, r8, ((ViewGroup.MarginLayoutParams) c1214Ji3).width), AbstractC12077zK2.y(true, this.o, this.m, F() + I(), ((ViewGroup.MarginLayoutParams) c1214Ji3).height), r8);
            } else {
                X0(view, AbstractC12077zK2.y(true, this.n, this.l, H() + G(), ((ViewGroup.MarginLayoutParams) c1214Ji3).width), AbstractC12077zK2.y(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) c1214Ji3).height), false);
            }
            if (c0902Gy1.e == 1) {
                c = c1474Li3.f(k);
                i2 = this.r.c(view) + c;
            } else {
                i2 = c1474Li3.i(k);
                c = i2 - this.r.c(view);
            }
            if (c0902Gy1.e == 1) {
                C1474Li3 c1474Li35 = c1214Ji3.j;
                c1474Li35.getClass();
                C1214Ji3 c1214Ji32 = (C1214Ji3) view.getLayoutParams();
                c1214Ji32.j = c1474Li35;
                ArrayList arrayList = c1474Li35.a;
                arrayList.add(view);
                c1474Li35.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c1474Li35.b = Integer.MIN_VALUE;
                }
                if (c1214Ji32.e() || c1214Ji32.d()) {
                    c1474Li35.d = c1474Li35.f.r.c(view) + c1474Li35.d;
                }
            } else {
                C1474Li3 c1474Li36 = c1214Ji3.j;
                c1474Li36.getClass();
                C1214Ji3 c1214Ji33 = (C1214Ji3) view.getLayoutParams();
                c1214Ji33.j = c1474Li36;
                ArrayList arrayList2 = c1474Li36.a;
                arrayList2.add(0, view);
                c1474Li36.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c1474Li36.c = Integer.MIN_VALUE;
                }
                if (c1214Ji33.e() || c1214Ji33.d()) {
                    c1474Li36.d = c1474Li36.f.r.c(view) + c1474Li36.d;
                }
            }
            if (W0() && this.t == 1) {
                c2 = this.s.g() - (((this.p - 1) - c1474Li3.e) * this.u);
                k2 = c2 - this.s.c(view);
            } else {
                k2 = this.s.k() + (c1474Li3.e * this.u);
                c2 = this.s.c(view) + k2;
            }
            if (this.t == 1) {
                AbstractC12077zK2.R(view, k2, c, c2, i2);
            } else {
                AbstractC12077zK2.R(view, c, k2, i2, c2);
            }
            i1(c1474Li3, c0902Gy12.e, i);
            b1(bVar, c0902Gy12);
            if (c0902Gy12.h && view.hasFocusable()) {
                i3 = 0;
                this.y.set(c1474Li3.e, false);
            } else {
                i3 = 0;
            }
            i7 = i3;
            i8 = 1;
            z = true;
        }
        int i16 = i7;
        if (!z) {
            b1(bVar, c0902Gy12);
        }
        if (c0902Gy12.e == -1) {
            S0 = this.r.k() - T0(this.r.k());
        } else {
            S0 = S0(this.r.g()) - this.r.g();
        }
        return S0 > 0 ? Math.min(c0902Gy1.b, S0) : i16;
    }

    public final void b1(b bVar, C0902Gy1 c0902Gy1) {
        int min;
        int min2;
        if (!c0902Gy1.a || c0902Gy1.i) {
            return;
        }
        if (c0902Gy1.b == 0) {
            if (c0902Gy1.e == -1) {
                c1(c0902Gy1.g, bVar);
                return;
            } else {
                d1(c0902Gy1.f, bVar);
                return;
            }
        }
        int i = 1;
        if (c0902Gy1.e == -1) {
            int i2 = c0902Gy1.f;
            int i3 = this.q[0].i(i2);
            while (i < this.p) {
                int i4 = this.q[i].i(i2);
                if (i4 > i3) {
                    i3 = i4;
                }
                i++;
            }
            int i5 = i2 - i3;
            if (i5 < 0) {
                min2 = c0902Gy1.g;
            } else {
                min2 = c0902Gy1.g - Math.min(i5, c0902Gy1.b);
            }
            c1(min2, bVar);
            return;
        }
        int i6 = c0902Gy1.g;
        int f = this.q[0].f(i6);
        while (i < this.p) {
            int f2 = this.q[i].f(i6);
            if (f2 < f) {
                f = f2;
            }
            i++;
        }
        int i7 = f - c0902Gy1.g;
        if (i7 < 0) {
            min = c0902Gy1.f;
        } else {
            min = Math.min(i7, c0902Gy1.b) + c0902Gy1.f;
        }
        d1(min, bVar);
    }

    public final int T0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public final int S0(int i) {
        int f = this.q[0].f(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int f2 = this.q[i2].f(i);
            if (f2 > f) {
                f = f2;
            }
        }
        return f;
    }

    public final void d1(int i, b bVar) {
        while (x() > 0) {
            View w = w(0);
            if (this.r.b(w) > i || this.r.m(w) > i) {
                return;
            }
            C1214Ji3 c1214Ji3 = (C1214Ji3) w.getLayoutParams();
            c1214Ji3.getClass();
            if (c1214Ji3.j.a.size() == 1) {
                return;
            }
            C1474Li3 c1474Li3 = c1214Ji3.j;
            ArrayList arrayList = c1474Li3.a;
            View view = (View) arrayList.remove(0);
            C1214Ji3 h = C1474Li3.h(view);
            h.j = null;
            if (arrayList.size() == 0) {
                c1474Li3.c = Integer.MIN_VALUE;
            }
            if (h.e() || h.d()) {
                c1474Li3.d -= c1474Li3.f.r.c(view);
            }
            c1474Li3.b = Integer.MIN_VALUE;
            o0(w);
            bVar.h(w);
        }
    }

    public final void c1(int i, b bVar) {
        for (int x = x() - 1; x >= 0; x--) {
            View w = w(x);
            if (this.r.e(w) < i || this.r.n(w) < i) {
                return;
            }
            C1214Ji3 c1214Ji3 = (C1214Ji3) w.getLayoutParams();
            c1214Ji3.getClass();
            if (c1214Ji3.j.a.size() == 1) {
                return;
            }
            C1474Li3 c1474Li3 = c1214Ji3.j;
            ArrayList arrayList = c1474Li3.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C1214Ji3 h = C1474Li3.h(view);
            h.j = null;
            if (h.e() || h.d()) {
                c1474Li3.d -= c1474Li3.f.r.c(view);
            }
            if (size == 1) {
                c1474Li3.b = Integer.MIN_VALUE;
            }
            c1474Li3.c = Integer.MIN_VALUE;
            o0(w);
            bVar.h(w);
        }
    }

    public final boolean Z0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == W0();
    }

    @Override // defpackage.AbstractC12077zK2
    public final boolean f() {
        return this.t == 1;
    }

    @Override // defpackage.AbstractC12077zK2
    public final boolean e() {
        return this.t == 0;
    }

    @Override // defpackage.AbstractC12077zK2
    public final int s0(int i, b bVar, LK2 lk2) {
        return f1(i, bVar, lk2);
    }

    @Override // defpackage.AbstractC12077zK2
    public final int u0(int i, b bVar, LK2 lk2) {
        return f1(i, bVar, lk2);
    }

    public final int G0(int i) {
        if (x() == 0) {
            return this.x ? 1 : -1;
        }
        return (i < Q0()) != this.x ? -1 : 1;
    }

    @Override // defpackage.KK2
    public final PointF a(int i) {
        int G0 = G0(i);
        PointF pointF = new PointF();
        if (G0 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = G0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = G0;
        }
        return pointF;
    }

    @Override // defpackage.AbstractC12077zK2
    public final void D0(RecyclerView recyclerView, int i) {
        VB1 vb1 = new VB1(recyclerView.getContext());
        vb1.a = i;
        E0(vb1);
    }

    @Override // defpackage.AbstractC12077zK2
    public final void t0(int i) {
        SavedState savedState = this.F;
        if (savedState != null && savedState.a != i) {
            savedState.i = null;
            savedState.h = 0;
            savedState.a = -1;
            savedState.g = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        r0();
    }

    @Override // defpackage.AbstractC12077zK2
    public final void i(int i, int i2, LK2 lk2, C10425uX0 c10425uX0) {
        C0902Gy1 c0902Gy1;
        int f;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (x() == 0 || i == 0) {
            return;
        }
        a1(i, lk2);
        int[] iArr = this.f11490J;
        if (iArr == null || iArr.length < this.p) {
            this.f11490J = new int[this.p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.p;
            c0902Gy1 = this.v;
            if (i4 >= i6) {
                break;
            }
            if (c0902Gy1.d == -1) {
                f = c0902Gy1.f;
                i3 = this.q[i4].i(f);
            } else {
                f = this.q[i4].f(c0902Gy1.g);
                i3 = c0902Gy1.g;
            }
            int i7 = f - i3;
            if (i7 >= 0) {
                this.f11490J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f11490J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0902Gy1.c;
            if (!(i9 >= 0 && i9 < lk2.b())) {
                return;
            }
            c10425uX0.a(c0902Gy1.c, this.f11490J[i8]);
            c0902Gy1.c += c0902Gy1.d;
        }
    }

    public final void a1(int i, LK2 lk2) {
        int Q0;
        int i2;
        if (i > 0) {
            Q0 = R0();
            i2 = 1;
        } else {
            Q0 = Q0();
            i2 = -1;
        }
        C0902Gy1 c0902Gy1 = this.v;
        c0902Gy1.a = true;
        h1(Q0, lk2);
        g1(i2);
        c0902Gy1.c = Q0 + c0902Gy1.d;
        c0902Gy1.b = Math.abs(i);
    }

    public final int f1(int i, b bVar, LK2 lk2) {
        if (x() == 0 || i == 0) {
            return 0;
        }
        a1(i, lk2);
        C0902Gy1 c0902Gy1 = this.v;
        int L0 = L0(bVar, c0902Gy1, lk2);
        if (c0902Gy1.b >= L0) {
            i = i < 0 ? -L0 : L0;
        }
        this.r.o(-i);
        this.D = this.x;
        c0902Gy1.b = 0;
        b1(bVar, c0902Gy1);
        return i;
    }

    public final int R0() {
        int x = x();
        if (x == 0) {
            return 0;
        }
        return AbstractC12077zK2.J(w(x - 1));
    }

    public final int Q0() {
        if (x() == 0) {
            return 0;
        }
        return AbstractC12077zK2.J(w(0));
    }

    @Override // defpackage.AbstractC12077zK2
    public final AK2 s() {
        if (this.t == 0) {
            return new C1214Ji3(-2, -1);
        }
        return new C1214Ji3(-1, -2);
    }

    @Override // defpackage.AbstractC12077zK2
    public final AK2 t(Context context, AttributeSet attributeSet) {
        return new C1214Ji3(context, attributeSet);
    }

    @Override // defpackage.AbstractC12077zK2
    public final AK2 u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1214Ji3((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1214Ji3(layoutParams);
    }

    @Override // defpackage.AbstractC12077zK2
    public final boolean g(AK2 ak2) {
        return ak2 instanceof C1214Ji3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004a, code lost:            if (r8.t == 1) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x004f, code lost:            if (r8.t == 0) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005d, code lost:            if (W0() == false) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0069, code lost:            if (W0() == false) goto L54;     */
    @Override // defpackage.AbstractC12077zK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View W(android.view.View r9, int r10, androidx.recyclerview.widget.b r11, defpackage.LK2 r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.W(android.view.View, int, androidx.recyclerview.widget.b, LK2):android.view.View");
    }

    public final void i1(C1474Li3 c1474Li3, int i, int i2) {
        int i3 = c1474Li3.d;
        int i4 = c1474Li3.e;
        if (i == -1) {
            int i5 = c1474Li3.b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) c1474Li3.a.get(0);
                C1214Ji3 h = C1474Li3.h(view);
                c1474Li3.b = c1474Li3.f.r.e(view);
                h.getClass();
                i5 = c1474Li3.b;
            }
            if (i5 + i3 <= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c1474Li3.c;
        if (i6 == Integer.MIN_VALUE) {
            c1474Li3.a();
            i6 = c1474Li3.c;
        }
        if (i6 - i3 >= i2) {
            this.y.set(i4, false);
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C1344Ki3();
        public int a;
        public int g;
        public int h;
        public int[] i;
        public int j;
        public int[] k;
        public List l;
        public boolean m;
        public boolean n;
        public boolean o;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.g = parcel.readInt();
            int readInt = parcel.readInt();
            this.h = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.i = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.j = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.k = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.m = parcel.readInt() == 1;
            this.n = parcel.readInt() == 1;
            this.o = parcel.readInt() == 1;
            this.l = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.h = savedState.h;
            this.a = savedState.a;
            this.g = savedState.g;
            this.i = savedState.i;
            this.j = savedState.j;
            this.k = savedState.k;
            this.m = savedState.m;
            this.n = savedState.n;
            this.o = savedState.o;
            this.l = savedState.l;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            if (this.h > 0) {
                parcel.writeIntArray(this.i);
            }
            parcel.writeInt(this.j);
            if (this.j > 0) {
                parcel.writeIntArray(this.k);
            }
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeList(this.l);
        }
    }

    @Override // defpackage.AbstractC12077zK2
    public final void V(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }
}
