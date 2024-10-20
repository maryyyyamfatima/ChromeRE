package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import defpackage.AK2;
import defpackage.AbstractC12077zK2;
import defpackage.AbstractC4099c51;
import defpackage.AbstractC8207o22;
import defpackage.AbstractC9076qb1;
import defpackage.C10425uX0;
import defpackage.C3412a51;
import defpackage.C3756b51;
import defpackage.Ec4;
import defpackage.LK2;
import defpackage.QB1;
import defpackage.RB1;
import defpackage.SB1;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f11488J;
    public AbstractC4099c51 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.f11488J = new SparseIntArray();
        this.K = new C3412a51();
        this.L = new Rect();
        u1(AbstractC12077zK2.K(context, attributeSet, i, i2).b);
    }

    public GridLayoutManager(int i) {
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.f11488J = new SparseIntArray();
        this.K = new C3412a51();
        this.L = new Rect();
        u1(i);
    }

    public GridLayoutManager(int i, int i2, boolean z) {
        super(i2, z);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.f11488J = new SparseIntArray();
        this.K = new C3412a51();
        this.L = new Rect();
        u1(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void k1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.k1(false);
    }

    @Override // defpackage.AbstractC12077zK2
    public final int M(b bVar, LK2 lk2) {
        if (this.p == 0) {
            return this.F;
        }
        if (lk2.b() < 1) {
            return 0;
        }
        return q1(lk2.b() - 1, bVar, lk2) + 1;
    }

    @Override // defpackage.AbstractC12077zK2
    public final int z(b bVar, LK2 lk2) {
        if (this.p == 1) {
            return this.F;
        }
        if (lk2.b() < 1) {
            return 0;
        }
        return q1(lk2.b() - 1, bVar, lk2) + 1;
    }

    @Override // defpackage.AbstractC12077zK2
    public final void a0(b bVar, LK2 lk2, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C3756b51)) {
            Z(view, accessibilityNodeInfoCompat);
            return;
        }
        C3756b51 c3756b51 = (C3756b51) layoutParams;
        int q1 = q1(c3756b51.c(), bVar, lk2);
        if (this.p == 0) {
            AccessibilityNodeInfo.CollectionItemInfo obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(c3756b51.j, c3756b51.k, q1, 1, false, false);
            accessibilityNodeInfoCompat.getClass();
            accessibilityNodeInfoCompat.a.setCollectionItemInfo(obtain);
        } else {
            AccessibilityNodeInfo.CollectionItemInfo obtain2 = AccessibilityNodeInfo.CollectionItemInfo.obtain(q1, 1, c3756b51.j, c3756b51.k, false, false);
            accessibilityNodeInfoCompat.getClass();
            accessibilityNodeInfoCompat.a.setCollectionItemInfo(obtain2);
        }
    }

    @Override // defpackage.AbstractC12077zK2
    public final void Y(b bVar, LK2 lk2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.Y(bVar, lk2, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.m(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final void h0(LK2 lk2) {
        super.h0(lk2);
        this.E = false;
    }

    @Override // defpackage.AbstractC12077zK2
    public final void b0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // defpackage.AbstractC12077zK2
    public final void c0() {
        this.K.d();
        this.K.b.clear();
    }

    @Override // defpackage.AbstractC12077zK2
    public final void e0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // defpackage.AbstractC12077zK2
    public final void f0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // defpackage.AbstractC12077zK2
    public final void d0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final AK2 s() {
        if (this.p == 0) {
            return new C3756b51(-2, -1);
        }
        return new C3756b51(-1, -2);
    }

    @Override // defpackage.AbstractC12077zK2
    public final AK2 t(Context context, AttributeSet attributeSet) {
        return new C3756b51(context, attributeSet);
    }

    @Override // defpackage.AbstractC12077zK2
    public AK2 u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C3756b51((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C3756b51(layoutParams);
    }

    @Override // defpackage.AbstractC12077zK2
    public final boolean g(AK2 ak2) {
        return ak2 instanceof C3756b51;
    }

    @Override // defpackage.AbstractC12077zK2
    public final void x0(Rect rect, int i, int i2) {
        int h;
        int h2;
        if (this.G == null) {
            super.x0(rect, i, i2);
        }
        int H = H() + G();
        int F = F() + I();
        if (this.p == 1) {
            int height = rect.height() + F;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = Ec4.a;
            h2 = AbstractC12077zK2.h(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            h = AbstractC12077zK2.h(i, iArr[iArr.length - 1] + H, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + H;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = Ec4.a;
            h = AbstractC12077zK2.h(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            h2 = AbstractC12077zK2.h(i2, iArr2[iArr2.length - 1] + F, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(h, h2);
    }

    public final void o1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void v1() {
        int F;
        int I;
        if (this.p == 1) {
            F = this.n - H();
            I = G();
        } else {
            F = this.o - F();
            I = I();
        }
        o1(F - I);
    }

    public final int p1(int i, int i2) {
        if (this.p == 1 && b1()) {
            int[] iArr = this.G;
            int i3 = this.F;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.G;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(b bVar, LK2 lk2, QB1 qb1, int i) {
        v1();
        if (lk2.b() > 0 && !lk2.g) {
            boolean z = i == 1;
            int r1 = r1(qb1.b, bVar, lk2);
            if (z) {
                while (r1 > 0) {
                    int i2 = qb1.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    qb1.b = i3;
                    r1 = r1(i3, bVar, lk2);
                }
            } else {
                int b = lk2.b() - 1;
                int i4 = qb1.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int r12 = r1(i5, bVar, lk2);
                    if (r12 <= r1) {
                        break;
                    }
                    i4 = i5;
                    r1 = r12;
                }
                qb1.b = i4;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final int s0(int i, b bVar, LK2 lk2) {
        v1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.s0(i, bVar, lk2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final int u0(int i, b bVar, LK2 lk2) {
        v1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.u0(i, bVar, lk2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View W0(b bVar, LK2 lk2, boolean z, boolean z2) {
        int i;
        int i2;
        int x = x();
        int i3 = 1;
        if (z2) {
            i2 = x() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = x;
            i2 = 0;
        }
        int b = lk2.b();
        M0();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View w = w(i2);
            int J2 = AbstractC12077zK2.J(w);
            if (J2 >= 0 && J2 < b && r1(J2, bVar, lk2) == 0) {
                if (((AK2) w.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = w;
                    }
                } else {
                    if (this.r.e(w) < g && this.r.b(w) >= k) {
                        return w;
                    }
                    if (view == null) {
                        view = w;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void H0(LK2 lk2, SB1 sb1, C10425uX0 c10425uX0) {
        int i = this.F;
        for (int i2 = 0; i2 < this.F; i2++) {
            int i3 = sb1.d;
            if (!(i3 >= 0 && i3 < lk2.b()) || i <= 0) {
                return;
            }
            int i4 = sb1.d;
            c10425uX0.a(i4, Math.max(0, sb1.g));
            i -= this.K.c(i4);
            sb1.d += sb1.e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(b bVar, LK2 lk2, SB1 sb1, RB1 rb1) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int y;
        int i10;
        boolean z;
        View b;
        int j = this.r.j();
        int i11 = 1;
        boolean z2 = j != 1073741824;
        int i12 = x() > 0 ? this.G[this.F] : 0;
        if (z2) {
            v1();
        }
        boolean z3 = sb1.e == 1;
        int i13 = this.F;
        if (!z3) {
            i13 = r1(sb1.d, bVar, lk2) + s1(sb1.d, bVar, lk2);
        }
        int i14 = 0;
        while (i14 < this.F) {
            int i15 = sb1.d;
            if (!(i15 >= 0 && i15 < lk2.b()) || i13 <= 0) {
                break;
            }
            int i16 = sb1.d;
            int s1 = s1(i16, bVar, lk2);
            if (s1 > this.F) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i16);
                sb.append(" requires ");
                sb.append(s1);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(AbstractC8207o22.a(sb, this.F, " spans."));
            }
            i13 -= s1;
            if (i13 < 0 || (b = sb1.b(bVar)) == null) {
                break;
            }
            this.H[i14] = b;
            i14++;
        }
        if (i14 == 0) {
            rb1.b = true;
            return;
        }
        if (z3) {
            i = 0;
            i2 = i14;
        } else {
            i = i14 - 1;
            i11 = -1;
            i2 = -1;
        }
        int i17 = 0;
        while (i != i2) {
            View view = this.H[i];
            C3756b51 c3756b51 = (C3756b51) view.getLayoutParams();
            int s12 = s1(AbstractC12077zK2.J(view), bVar, lk2);
            c3756b51.k = s12;
            c3756b51.j = i17;
            i17 += s12;
            i += i11;
        }
        float f = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i14; i19++) {
            View view2 = this.H[i19];
            if (sb1.k != null) {
                z = false;
                if (z3) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z3) {
                z = false;
                b(view2, -1, false);
            } else {
                z = false;
                b(view2, 0, false);
            }
            d(this.L, view2);
            t1(view2, j, z);
            int c = this.r.c(view2);
            if (c > i18) {
                i18 = c;
            }
            float d = (this.r.d(view2) * 1.0f) / ((C3756b51) view2.getLayoutParams()).k;
            if (d > f) {
                f = d;
            }
        }
        if (z2) {
            o1(Math.max(Math.round(f * this.F), i12));
            i18 = 0;
            for (int i20 = 0; i20 < i14; i20++) {
                View view3 = this.H[i20];
                t1(view3, 1073741824, true);
                int c2 = this.r.c(view3);
                if (c2 > i18) {
                    i18 = c2;
                }
            }
        }
        for (int i21 = 0; i21 < i14; i21++) {
            View view4 = this.H[i21];
            if (this.r.c(view4) != i18) {
                C3756b51 c3756b512 = (C3756b51) view4.getLayoutParams();
                Rect rect = c3756b512.g;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c3756b512).topMargin + ((ViewGroup.MarginLayoutParams) c3756b512).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c3756b512).leftMargin + ((ViewGroup.MarginLayoutParams) c3756b512).rightMargin;
                int p1 = p1(c3756b512.j, c3756b512.k);
                if (this.p == 1) {
                    i10 = AbstractC12077zK2.y(false, p1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) c3756b512).width);
                    y = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    y = AbstractC12077zK2.y(false, p1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) c3756b512).height);
                    i10 = makeMeasureSpec;
                }
                if (C0(view4, i10, y, (AK2) view4.getLayoutParams())) {
                    view4.measure(i10, y);
                }
            }
        }
        rb1.a = i18;
        if (this.p == 1) {
            if (sb1.f == -1) {
                i9 = sb1.b;
                i8 = i9 - i18;
            } else {
                i8 = sb1.b;
                i9 = i18 + i8;
            }
            i6 = 0;
            i5 = i8;
            i7 = i9;
            i4 = 0;
        } else {
            if (sb1.f == -1) {
                i4 = sb1.b;
                i3 = i4 - i18;
            } else {
                i3 = sb1.b;
                i4 = i18 + i3;
            }
            i5 = 0;
            i6 = i3;
            i7 = 0;
        }
        for (int i24 = 0; i24 < i14; i24++) {
            View view5 = this.H[i24];
            C3756b51 c3756b513 = (C3756b51) view5.getLayoutParams();
            if (this.p == 1) {
                if (b1()) {
                    i4 = G() + this.G[this.F - c3756b513.j];
                    i6 = i4 - this.r.d(view5);
                } else {
                    i6 = this.G[c3756b513.j] + G();
                    i4 = this.r.d(view5) + i6;
                }
            } else {
                int I = I() + this.G[c3756b513.j];
                i5 = I;
                i7 = this.r.d(view5) + I;
            }
            AbstractC12077zK2.R(view5, i6, i5, i4, i7);
            if (c3756b513.e() || c3756b513.d()) {
                rb1.c = true;
            }
            rb1.d = view5.hasFocusable() | rb1.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    public final void t1(View view, int i, boolean z) {
        int i2;
        int i3;
        boolean A0;
        C3756b51 c3756b51 = (C3756b51) view.getLayoutParams();
        Rect rect = c3756b51.g;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c3756b51).topMargin + ((ViewGroup.MarginLayoutParams) c3756b51).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c3756b51).leftMargin + ((ViewGroup.MarginLayoutParams) c3756b51).rightMargin;
        int p1 = p1(c3756b51.j, c3756b51.k);
        if (this.p == 1) {
            i3 = AbstractC12077zK2.y(false, p1, i, i5, ((ViewGroup.MarginLayoutParams) c3756b51).width);
            i2 = AbstractC12077zK2.y(true, this.r.l(), this.m, i4, ((ViewGroup.MarginLayoutParams) c3756b51).height);
        } else {
            int y = AbstractC12077zK2.y(false, p1, i, i4, ((ViewGroup.MarginLayoutParams) c3756b51).height);
            int y2 = AbstractC12077zK2.y(true, this.r.l(), this.l, i5, ((ViewGroup.MarginLayoutParams) c3756b51).width);
            i2 = y;
            i3 = y2;
        }
        AK2 ak2 = (AK2) view.getLayoutParams();
        if (z) {
            A0 = C0(view, i3, i2, ak2);
        } else {
            A0 = A0(view, i3, i2, ak2);
        }
        if (A0) {
            view.measure(i3, i2);
        }
    }

    public final void u1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Span count should be at least 1. Provided ", i));
        }
        this.F = i;
        this.K.d();
        r0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final int l(LK2 lk2) {
        return J0(lk2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final int o(LK2 lk2) {
        return J0(lk2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final int m(LK2 lk2) {
        return K0(lk2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final int p(LK2 lk2) {
        return K0(lk2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public boolean F0() {
        return this.z == null && !this.E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:            if (r13 == (r2 > r15)) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0111, code lost:            if (r13 == (r2 > r9)) goto L84;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x001e, code lost:            if (r22.a.j(r3) != false) goto L5;     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View W(android.view.View r23, int r24, androidx.recyclerview.widget.b r25, defpackage.LK2 r26) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.W(android.view.View, int, androidx.recyclerview.widget.b, LK2):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public void g0(b bVar, LK2 lk2) {
        boolean z = lk2.g;
        SparseIntArray sparseIntArray = this.f11488J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int x = x();
            for (int i = 0; i < x; i++) {
                C3756b51 c3756b51 = (C3756b51) w(i).getLayoutParams();
                int c = c3756b51.c();
                sparseIntArray2.put(c, c3756b51.k);
                sparseIntArray.put(c, c3756b51.j);
            }
        }
        super.g0(bVar, lk2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final int q1(int i, b bVar, LK2 lk2) {
        if (lk2.g) {
            int b = bVar.b(i);
            if (b == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
                return 0;
            }
            return this.K.a(b, this.F);
        }
        return this.K.a(i, this.F);
    }

    public final int r1(int i, b bVar, LK2 lk2) {
        if (lk2.g) {
            int i2 = this.f11488J.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int b = bVar.b(i);
            if (b == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
                return 0;
            }
            return this.K.b(b, this.F);
        }
        return this.K.b(i, this.F);
    }

    public final int s1(int i, b bVar, LK2 lk2) {
        if (!lk2.g) {
            return this.K.c(i);
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = bVar.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.K.c(b);
    }
}
