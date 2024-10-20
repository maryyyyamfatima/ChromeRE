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
import defpackage.AbstractC9076qb1;
import defpackage.C10425uX0;
import defpackage.C11734yK2;
import defpackage.KK2;
import defpackage.LK2;
import defpackage.PY2;
import defpackage.QB1;
import defpackage.RB1;
import defpackage.SB1;
import defpackage.TB1;
import defpackage.VB1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC12077zK2 implements KK2 {
    public final QB1 A;
    public final RB1 B;
    public final int C;
    public final int[] D;
    public int p;
    public SB1 q;
    public AbstractC0933He2 r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public SavedState z;

    @Override // defpackage.AbstractC12077zK2
    public boolean P() {
        return true;
    }

    @Override // defpackage.AbstractC12077zK2
    public final void V(RecyclerView recyclerView) {
    }

    public void d1(b bVar, LK2 lk2, QB1 qb1, int i) {
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    public LinearLayoutManager(int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new QB1();
        this.B = new RB1();
        this.C = 2;
        this.D = new int[2];
        j1(i);
        c(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        r0();
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new QB1();
        this.B = new RB1();
        this.C = 2;
        this.D = new int[2];
        C11734yK2 K = AbstractC12077zK2.K(context, attributeSet, i, i2);
        j1(K.a);
        boolean z = K.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            r0();
        }
        k1(K.d);
    }

    @Override // defpackage.AbstractC12077zK2
    public AK2 s() {
        return new AK2(-2, -2);
    }

    @Override // defpackage.AbstractC12077zK2
    public final void X(AccessibilityEvent accessibilityEvent) {
        super.X(accessibilityEvent);
        if (x() > 0) {
            accessibilityEvent.setFromIndex(R0());
            accessibilityEvent.setToIndex(T0());
        }
    }

    @Override // defpackage.AbstractC12077zK2
    public Parcelable j0() {
        SavedState savedState = this.z;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (x() > 0) {
            M0();
            boolean z = this.s ^ this.u;
            savedState2.h = z;
            if (z) {
                View Z0 = Z0();
                savedState2.g = this.r.g() - this.r.b(Z0);
                savedState2.a = AbstractC12077zK2.J(Z0);
            } else {
                View a1 = a1();
                savedState2.a = AbstractC12077zK2.J(a1);
                savedState2.g = this.r.e(a1) - this.r.k();
            }
        } else {
            savedState2.a = -1;
        }
        return savedState2;
    }

    @Override // defpackage.AbstractC12077zK2
    public void i0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.z = savedState;
            if (this.x != -1) {
                savedState.a = -1;
            }
            r0();
        }
    }

    @Override // defpackage.AbstractC12077zK2
    public final boolean e() {
        return this.p == 0;
    }

    @Override // defpackage.AbstractC12077zK2
    public final boolean f() {
        return this.p == 1;
    }

    public void k1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        r0();
    }

    public final void j1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("invalid orientation:", i));
        }
        c(null);
        if (i != this.p || this.r == null) {
            AbstractC0933He2 a = AbstractC0933He2.a(this, i);
            this.r = a;
            this.A.a = a;
            this.p = i;
            r0();
        }
    }

    public final void g1() {
        if (this.p == 1 || !b1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    @Override // defpackage.AbstractC12077zK2
    public final View r(int i) {
        int x = x();
        if (x == 0) {
            return null;
        }
        int J2 = i - AbstractC12077zK2.J(w(0));
        if (J2 >= 0 && J2 < x) {
            View w = w(J2);
            if (AbstractC12077zK2.J(w) == i) {
                return w;
            }
        }
        return super.r(i);
    }

    @Override // defpackage.AbstractC12077zK2
    public final void D0(RecyclerView recyclerView, int i) {
        VB1 vb1 = new VB1(recyclerView.getContext());
        vb1.a = i;
        E0(vb1);
    }

    @Override // defpackage.KK2
    public final PointF a(int i) {
        if (x() == 0) {
            return null;
        }
        int i2 = (i < AbstractC12077zK2.J(w(0))) != this.u ? -1 : 1;
        if (this.p == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0212  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // defpackage.AbstractC12077zK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g0(androidx.recyclerview.widget.b r18, defpackage.LK2 r19) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.g0(androidx.recyclerview.widget.b, LK2):void");
    }

    @Override // defpackage.AbstractC12077zK2
    public void h0(LK2 lk2) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final int X0(int i, b bVar, LK2 lk2, boolean z) {
        int g;
        int g2 = this.r.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -h1(-g2, bVar, lk2);
        int i3 = i + i2;
        if (!z || (g = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(g);
        return g + i2;
    }

    public final int Y0(int i, b bVar, LK2 lk2, boolean z) {
        int k;
        int k2 = i - this.r.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -h1(k2, bVar, lk2);
        int i3 = i + i2;
        if (!z || (k = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.o(-k);
        return i2 - k;
    }

    public final void m1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        SB1 sb1 = this.q;
        sb1.e = this.u ? -1 : 1;
        sb1.d = i;
        sb1.f = 1;
        sb1.b = i2;
        sb1.g = Integer.MIN_VALUE;
    }

    public final void n1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        SB1 sb1 = this.q;
        sb1.d = i;
        sb1.e = this.u ? 1 : -1;
        sb1.f = -1;
        sb1.b = i2;
        sb1.g = Integer.MIN_VALUE;
    }

    public final boolean b1() {
        return D() == 1;
    }

    public final void M0() {
        if (this.q == null) {
            this.q = new SB1();
        }
    }

    @Override // defpackage.AbstractC12077zK2
    public final void t0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        SavedState savedState = this.z;
        if (savedState != null) {
            savedState.a = -1;
        }
        r0();
    }

    public final void i1(int i, int i2) {
        this.x = i;
        this.y = i2;
        SavedState savedState = this.z;
        if (savedState != null) {
            savedState.a = -1;
        }
        r0();
    }

    @Override // defpackage.AbstractC12077zK2
    public int s0(int i, b bVar, LK2 lk2) {
        if (this.p == 1) {
            return 0;
        }
        return h1(i, bVar, lk2);
    }

    @Override // defpackage.AbstractC12077zK2
    public int u0(int i, b bVar, LK2 lk2) {
        if (this.p == 0) {
            return 0;
        }
        return h1(i, bVar, lk2);
    }

    @Override // defpackage.AbstractC12077zK2
    public int l(LK2 lk2) {
        return J0(lk2);
    }

    @Override // defpackage.AbstractC12077zK2
    public int o(LK2 lk2) {
        return J0(lk2);
    }

    @Override // defpackage.AbstractC12077zK2
    public final int k(LK2 lk2) {
        return I0(lk2);
    }

    @Override // defpackage.AbstractC12077zK2
    public int n(LK2 lk2) {
        return I0(lk2);
    }

    @Override // defpackage.AbstractC12077zK2
    public int m(LK2 lk2) {
        return K0(lk2);
    }

    @Override // defpackage.AbstractC12077zK2
    public int p(LK2 lk2) {
        return K0(lk2);
    }

    public final int J0(LK2 lk2) {
        if (x() == 0) {
            return 0;
        }
        M0();
        return PY2.b(lk2, this.r, Q0(!this.w), P0(!this.w), this, this.w, this.u);
    }

    public final int I0(LK2 lk2) {
        if (x() == 0) {
            return 0;
        }
        M0();
        return PY2.a(lk2, this.r, Q0(!this.w), P0(!this.w), this, this.w);
    }

    public final int K0(LK2 lk2) {
        if (x() == 0) {
            return 0;
        }
        M0();
        return PY2.c(lk2, this.r, Q0(!this.w), P0(!this.w), this, this.w);
    }

    public final void l1(int i, int i2, boolean z, LK2 lk2) {
        int k;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        G0(lk2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        SB1 sb1 = this.q;
        int i3 = z2 ? max2 : max;
        sb1.h = i3;
        if (!z2) {
            max = max2;
        }
        sb1.i = max;
        if (z2) {
            sb1.h = this.r.h() + i3;
            View Z0 = Z0();
            SB1 sb12 = this.q;
            sb12.e = this.u ? -1 : 1;
            int J2 = AbstractC12077zK2.J(Z0);
            SB1 sb13 = this.q;
            sb12.d = J2 + sb13.e;
            sb13.b = this.r.b(Z0);
            k = this.r.b(Z0) - this.r.g();
        } else {
            View a1 = a1();
            SB1 sb14 = this.q;
            sb14.h = this.r.k() + sb14.h;
            SB1 sb15 = this.q;
            sb15.e = this.u ? 1 : -1;
            int J3 = AbstractC12077zK2.J(a1);
            SB1 sb16 = this.q;
            sb15.d = J3 + sb16.e;
            sb16.b = this.r.e(a1);
            k = (-this.r.e(a1)) + this.r.k();
        }
        SB1 sb17 = this.q;
        sb17.c = i2;
        if (z) {
            sb17.c = i2 - k;
        }
        sb17.g = k;
    }

    public void H0(LK2 lk2, SB1 sb1, C10425uX0 c10425uX0) {
        int i = sb1.d;
        if (i < 0 || i >= lk2.b()) {
            return;
        }
        c10425uX0.a(i, Math.max(0, sb1.g));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.AbstractC12077zK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r7, defpackage.C10425uX0 r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r6.z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.a
            if (r4 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r3
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.h
            goto L22
        L13:
            r6.g1()
            boolean r0 = r6.u
            int r4 = r6.x
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = r3
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            r0 = r3
        L26:
            int r2 = r6.C
            if (r0 >= r2) goto L35
            if (r4 < 0) goto L35
            if (r4 >= r7) goto L35
            r8.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.j(int, uX0):void");
    }

    @Override // defpackage.AbstractC12077zK2
    public final void i(int i, int i2, LK2 lk2, C10425uX0 c10425uX0) {
        if (this.p != 0) {
            i = i2;
        }
        if (x() == 0 || i == 0) {
            return;
        }
        M0();
        l1(i > 0 ? 1 : -1, Math.abs(i), true, lk2);
        H0(lk2, this.q, c10425uX0);
    }

    public final int h1(int i, b bVar, LK2 lk2) {
        if (x() == 0 || i == 0) {
            return 0;
        }
        M0();
        this.q.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        l1(i2, abs, true, lk2);
        SB1 sb1 = this.q;
        int N0 = N0(bVar, sb1, lk2, false) + sb1.g;
        if (N0 < 0) {
            return 0;
        }
        if (abs > N0) {
            i = i2 * N0;
        }
        this.r.o(-i);
        this.q.j = i;
        return i;
    }

    @Override // defpackage.AbstractC12077zK2
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.z != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.j(str);
    }

    public final void e1(b bVar, SB1 sb1) {
        if (!sb1.a || sb1.l) {
            return;
        }
        int i = sb1.g;
        int i2 = sb1.i;
        if (sb1.f == -1) {
            int x = x();
            if (i < 0) {
                return;
            }
            int f = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < x; i3++) {
                    View w = w(i3);
                    if (this.r.e(w) < f || this.r.n(w) < f) {
                        f1(bVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = x - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View w2 = w(i5);
                if (this.r.e(w2) < f || this.r.n(w2) < f) {
                    f1(bVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int x2 = x();
        if (!this.u) {
            for (int i7 = 0; i7 < x2; i7++) {
                View w3 = w(i7);
                if (this.r.b(w3) > i6 || this.r.m(w3) > i6) {
                    f1(bVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = x2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View w4 = w(i9);
            if (this.r.b(w4) > i6 || this.r.m(w4) > i6) {
                f1(bVar, i8, i9);
                return;
            }
        }
    }

    public final int N0(b bVar, SB1 sb1, LK2 lk2, boolean z) {
        int i = sb1.c;
        int i2 = sb1.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                sb1.g = i2 + i;
            }
            e1(bVar, sb1);
        }
        int i3 = sb1.c + sb1.h;
        while (true) {
            if (!sb1.l && i3 <= 0) {
                break;
            }
            int i4 = sb1.d;
            if (!(i4 >= 0 && i4 < lk2.b())) {
                break;
            }
            RB1 rb1 = this.B;
            rb1.a = 0;
            rb1.b = false;
            rb1.c = false;
            rb1.d = false;
            c1(bVar, lk2, sb1, rb1);
            if (!rb1.b) {
                int i5 = sb1.b;
                int i6 = rb1.a;
                sb1.b = (sb1.f * i6) + i5;
                if (!rb1.c || sb1.k != null || !lk2.g) {
                    sb1.c -= i6;
                    i3 -= i6;
                }
                int i7 = sb1.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    sb1.g = i8;
                    int i9 = sb1.c;
                    if (i9 < 0) {
                        sb1.g = i8 + i9;
                    }
                    e1(bVar, sb1);
                }
                if (z && rb1.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - sb1.c;
    }

    public void c1(b bVar, LK2 lk2, SB1 sb1, RB1 rb1) {
        int i;
        int i2;
        int i3;
        int i4;
        View b = sb1.b(bVar);
        if (b == null) {
            rb1.b = true;
            return;
        }
        AK2 ak2 = (AK2) b.getLayoutParams();
        if (sb1.k == null) {
            if (this.u == (sb1.f == -1)) {
                b(b, -1, false);
            } else {
                b(b, 0, false);
            }
        } else {
            if (this.u == (sb1.f == -1)) {
                b(b, -1, true);
            } else {
                b(b, 0, true);
            }
        }
        AK2 ak22 = (AK2) b.getLayoutParams();
        Rect N = this.b.N(b);
        int i5 = N.left + N.right + 0;
        int i6 = N.top + N.bottom + 0;
        int y = AbstractC12077zK2.y(e(), this.n, this.l, H() + G() + ((ViewGroup.MarginLayoutParams) ak22).leftMargin + ((ViewGroup.MarginLayoutParams) ak22).rightMargin + i5, ((ViewGroup.MarginLayoutParams) ak22).width);
        int y2 = AbstractC12077zK2.y(f(), this.o, this.m, F() + I() + ((ViewGroup.MarginLayoutParams) ak22).topMargin + ((ViewGroup.MarginLayoutParams) ak22).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) ak22).height);
        if (A0(b, y, y2, ak22)) {
            b.measure(y, y2);
        }
        rb1.a = this.r.c(b);
        if (this.p == 1) {
            if (b1()) {
                i4 = this.n - H();
                i = i4 - this.r.d(b);
            } else {
                i = G();
                i4 = this.r.d(b) + i;
            }
            if (sb1.f == -1) {
                i2 = sb1.b;
                i3 = i2 - rb1.a;
            } else {
                i3 = sb1.b;
                i2 = rb1.a + i3;
            }
        } else {
            int I = I();
            int d = this.r.d(b) + I;
            if (sb1.f == -1) {
                int i7 = sb1.b;
                int i8 = i7 - rb1.a;
                i4 = i7;
                i2 = d;
                i = i8;
                i3 = I;
            } else {
                int i9 = sb1.b;
                int i10 = rb1.a + i9;
                i = i9;
                i2 = d;
                i3 = I;
                i4 = i10;
            }
        }
        AbstractC12077zK2.R(b, i, i3, i4, i2);
        if (ak2.e() || ak2.d()) {
            rb1.c = true;
        }
        rb1.d = b.hasFocusable();
    }

    public final int L0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && b1()) ? -1 : 1 : (this.p != 1 && b1()) ? 1 : -1;
    }

    public final View a1() {
        return w(this.u ? x() - 1 : 0);
    }

    public final View Z0() {
        return w(this.u ? 0 : x() - 1);
    }

    public final View Q0(boolean z) {
        if (this.u) {
            return V0(x() - 1, -1, z, true);
        }
        return V0(0, x(), z, true);
    }

    public final View P0(boolean z) {
        if (this.u) {
            return V0(0, x(), z, true);
        }
        return V0(x() - 1, -1, z, true);
    }

    public View W0(b bVar, LK2 lk2, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        M0();
        int x = x();
        if (z2) {
            i2 = x() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = x;
            i2 = 0;
            i3 = 1;
        }
        int b = lk2.b();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View w = w(i2);
            int J2 = AbstractC12077zK2.J(w);
            int e = this.r.e(w);
            int b2 = this.r.b(w);
            if (J2 >= 0 && J2 < b) {
                if (!((AK2) w.getLayoutParams()).e()) {
                    boolean z3 = b2 <= k && e < k;
                    boolean z4 = e >= g && b2 > g;
                    if (!z3 && !z4) {
                        return w;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = w;
                        }
                        view2 = w;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = w;
                        }
                        view2 = w;
                    }
                } else if (view3 == null) {
                    view3 = w;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int R0() {
        View V0 = V0(0, x(), false, true);
        if (V0 == null) {
            return -1;
        }
        return AbstractC12077zK2.J(V0);
    }

    public final int O0() {
        View V0 = V0(0, x(), true, false);
        if (V0 == null) {
            return -1;
        }
        return AbstractC12077zK2.J(V0);
    }

    public final int T0() {
        View V0 = V0(x() - 1, -1, false, true);
        if (V0 == null) {
            return -1;
        }
        return AbstractC12077zK2.J(V0);
    }

    public final int S0() {
        View V0 = V0(x() - 1, -1, true, false);
        if (V0 == null) {
            return -1;
        }
        return AbstractC12077zK2.J(V0);
    }

    public final View V0(int i, int i2, boolean z, boolean z2) {
        M0();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.p == 0) {
            return this.c.a(i, i2, i3, i4);
        }
        return this.d.a(i, i2, i3, i4);
    }

    public final View U0(int i, int i2) {
        int i3;
        int i4;
        M0();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return w(i);
        }
        if (this.r.e(w(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.p == 0) {
            return this.c.a(i, i2, i3, i4);
        }
        return this.d.a(i, i2, i3, i4);
    }

    @Override // defpackage.AbstractC12077zK2
    public View W(View view, int i, b bVar, LK2 lk2) {
        int L0;
        View Z0;
        g1();
        if (x() == 0 || (L0 = L0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        M0();
        l1(L0, (int) (this.r.l() * 0.33333334f), false, lk2);
        SB1 sb1 = this.q;
        sb1.g = Integer.MIN_VALUE;
        sb1.a = false;
        N0(bVar, sb1, lk2, true);
        View U0 = L0 == -1 ? this.u ? U0(x() - 1, -1) : U0(0, x()) : this.u ? U0(0, x()) : U0(x() - 1, -1);
        if (L0 == -1) {
            Z0 = a1();
        } else {
            Z0 = Z0();
        }
        if (!Z0.hasFocusable()) {
            return U0;
        }
        if (U0 == null) {
            return null;
        }
        return Z0;
    }

    @Override // defpackage.AbstractC12077zK2
    public boolean F0() {
        return this.z == null && this.s == this.v;
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new TB1();
        public int a;
        public int g;
        public boolean h;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.g = savedState.g;
            this.h = savedState.h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    public final void f1(b bVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View w = w(i);
                p0(i);
                bVar.h(w);
                i--;
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            View w2 = w(i2);
            p0(i2);
            bVar.h(w2);
        }
    }

    @Override // defpackage.AbstractC12077zK2
    public final boolean B0() {
        boolean z;
        if (this.m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int x = x();
        int i = 0;
        while (true) {
            if (i >= x) {
                z = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = w(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z = true;
                break;
            }
            i++;
        }
        return z;
    }

    public void G0(LK2 lk2, int[] iArr) {
        int i;
        int l = lk2.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }
}
