package defpackage;

import android.util.LogPrinter;
import android.util.Pair;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O41 {
    public final boolean a;
    public T41 d;
    public T41 f;
    public T41 h;
    public int[] j;
    public int[] l;
    public K41[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ GridLayout x;
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean g = false;
    public boolean i = false;
    public boolean k = false;
    public boolean m = false;
    public boolean o = false;
    public boolean q = false;
    public boolean s = false;
    public boolean u = true;
    public final S41 v = new S41(0);
    public final S41 w = new S41(-100000);

    public O41(GridLayout gridLayout, boolean z) {
        this.x = gridLayout;
        this.a = z;
    }

    public final int i() {
        if (this.c == Integer.MIN_VALUE) {
            GridLayout gridLayout = this.x;
            int childCount = gridLayout.getChildCount();
            int i = -1;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = gridLayout.getChildAt(i2);
                LogPrinter logPrinter = GridLayout.n;
                R41 r41 = (R41) childAt.getLayoutParams();
                Q41 q41 = (this.a ? r41.b : r41.a).b;
                int max = Math.max(i, q41.a);
                int i3 = q41.b;
                i = Math.max(Math.max(max, i3), i3 - q41.a);
            }
            this.c = Math.max(0, i != -1 ? i : Integer.MIN_VALUE);
        }
        return this.c;
    }

    public final int f() {
        return Math.max(this.b, i());
    }

    public final void n(int i) {
        if (i == Integer.MIN_VALUE || i >= i()) {
            this.b = i;
        } else {
            GridLayout.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final T41 g() {
        int e;
        int i;
        T41 t41 = this.d;
        boolean z = this.a;
        GridLayout gridLayout = this.x;
        if (t41 == null) {
            L41 l41 = new L41(U41.class, P41.class);
            int childCount = gridLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = gridLayout.getChildAt(i2);
                LogPrinter logPrinter = GridLayout.n;
                R41 r41 = (R41) childAt.getLayoutParams();
                U41 u41 = z ? r41.b : r41.a;
                l41.add(Pair.create(u41, u41.a(z).b()));
            }
            this.d = l41.a();
        }
        if (!this.e) {
            for (P41 p41 : (P41[]) this.d.c) {
                p41.c();
            }
            int childCount2 = gridLayout.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = gridLayout.getChildAt(i3);
                LogPrinter logPrinter2 = GridLayout.n;
                R41 r412 = (R41) childAt2.getLayoutParams();
                U41 u412 = z ? r412.b : r412.a;
                if (childAt2.getVisibility() == 8) {
                    e = 0;
                } else {
                    e = gridLayout.e(childAt2, z, false) + gridLayout.e(childAt2, z, true) + (z ? childAt2.getMeasuredWidth() : childAt2.getMeasuredHeight());
                }
                if (u412.d == 0.0f) {
                    i = 0;
                } else {
                    if (this.t == null) {
                        this.t = new int[gridLayout.getChildCount()];
                    }
                    i = this.t[i3];
                }
                int i4 = e + i;
                T41 t412 = this.d;
                P41 p412 = (P41) t412.c[t412.a[i3]];
                p412.c = ((u412.c == GridLayout.u && u412.d == 0.0f) ? 0 : 2) & p412.c;
                int a = u412.a(z).a(childAt2, i4, gridLayout.getLayoutMode());
                p412.b(a, i4 - a);
            }
            this.e = true;
        }
        return this.d;
    }

    public final void b(T41 t41, boolean z) {
        for (S41 s41 : (S41[]) t41.c) {
            s41.a = Integer.MIN_VALUE;
        }
        P41[] p41Arr = (P41[]) g().c;
        for (int i = 0; i < p41Arr.length; i++) {
            int d = p41Arr[i].d(z);
            S41 s412 = (S41) t41.c[t41.a[i]];
            int i2 = s412.a;
            if (!z) {
                d = -d;
            }
            s412.a = Math.max(i2, d);
        }
    }

    public final K41[] q(ArrayList arrayList) {
        N41 n41 = new N41(this, (K41[]) arrayList.toArray(new K41[arrayList.size()]));
        int length = n41.c.length;
        for (int i = 0; i < length; i++) {
            n41.a(i);
        }
        return n41.a;
    }

    public final K41[] e() {
        if (this.n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            T41 t41 = this.f;
            int i = 0;
            while (true) {
                Q41[] q41Arr = (Q41[]) t41.b;
                if (i >= q41Arr.length) {
                    break;
                }
                k(arrayList, q41Arr[i], ((S41[]) t41.c)[i], false);
                i++;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            T41 t412 = this.h;
            int i2 = 0;
            while (true) {
                Q41[] q41Arr2 = (Q41[]) t412.b;
                if (i2 >= q41Arr2.length) {
                    break;
                }
                k(arrayList2, q41Arr2[i2], ((S41[]) t412.c)[i2], false);
                i2++;
            }
            if (this.u) {
                int i3 = 0;
                while (i3 < f()) {
                    int i4 = i3 + 1;
                    k(arrayList, new Q41(i3, i4), new S41(0), true);
                    i3 = i4;
                }
            }
            int f = f();
            k(arrayList, new Q41(0, f), this.v, false);
            k(arrayList2, new Q41(f, 0), this.w, false);
            K41[] q = q(arrayList);
            K41[] q2 = q(arrayList2);
            LogPrinter logPrinter = GridLayout.n;
            Object[] objArr = (Object[]) Array.newInstance(q.getClass().getComponentType(), q.length + q2.length);
            System.arraycopy(q, 0, objArr, 0, q.length);
            System.arraycopy(q2, 0, objArr, q.length, q2.length);
            this.n = (K41[]) objArr;
        }
        if (!this.o) {
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            this.o = true;
        }
        return this.n;
    }

    public final String a(ArrayList arrayList) {
        String str;
        String str2 = this.a ? "x" : "y";
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            K41 k41 = (K41) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            Q41 q41 = k41.a;
            int i = q41.a;
            int i2 = k41.b.a;
            int i3 = q41.b;
            if (i < i3) {
                str = str2 + i3 + "-" + str2 + i + ">=" + i2;
            } else {
                str = str2 + i + "-" + str2 + i3 + "<=" + (-i2);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final boolean p(K41[] k41Arr, int[] iArr, boolean z) {
        boolean z2;
        boolean z3;
        String str = this.a ? "horizontal" : "vertical";
        boolean z4 = true;
        int f = f() + 1;
        boolean[] zArr = null;
        int i = 0;
        while (i < k41Arr.length) {
            Arrays.fill(iArr, 0);
            for (int i2 = 0; i2 < f; i2++) {
                boolean z5 = false;
                for (K41 k41 : k41Arr) {
                    if (k41.c) {
                        Q41 q41 = k41.a;
                        int i3 = iArr[q41.a] + k41.b.a;
                        int i4 = q41.b;
                        if (i3 > iArr[i4]) {
                            iArr[i4] = i3;
                            z3 = z4;
                            z5 |= z3;
                        }
                    }
                    z3 = false;
                    z5 |= z3;
                }
                if (!z5) {
                    if (zArr != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i5 = 0; i5 < k41Arr.length; i5++) {
                            K41 k412 = k41Arr[i5];
                            if (zArr[i5]) {
                                arrayList.add(k412);
                            }
                            if (!k412.c) {
                                arrayList2.add(k412);
                            }
                        }
                        LogPrinter logPrinter = this.x.m;
                        StringBuilder a = M41.a(str, " constraints: ");
                        a.append(a(arrayList));
                        a.append(" are inconsistent; permanently removing: ");
                        a.append(a(arrayList2));
                        a.append(". ");
                        logPrinter.println(a.toString());
                    }
                    return z4;
                }
            }
            if (!z) {
                return false;
            }
            boolean[] zArr2 = new boolean[k41Arr.length];
            for (int i6 = 0; i6 < f; i6++) {
                int length = k41Arr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    boolean z6 = zArr2[i7];
                    K41 k413 = k41Arr[i7];
                    if (k413.c) {
                        Q41 q412 = k413.a;
                        int i8 = iArr[q412.a] + k413.b.a;
                        int i9 = q412.b;
                        if (i8 > iArr[i9]) {
                            iArr[i9] = i8;
                            z2 = true;
                            zArr2[i7] = z6 | z2;
                        }
                    }
                    z2 = false;
                    zArr2[i7] = z6 | z2;
                }
            }
            if (i == 0) {
                zArr = zArr2;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= k41Arr.length) {
                    break;
                }
                if (zArr2[i10]) {
                    K41 k414 = k41Arr[i10];
                    Q41 q413 = k414.a;
                    if (q413.a >= q413.b) {
                        k414.c = false;
                        break;
                    }
                }
                i10++;
            }
            i++;
            z4 = true;
        }
        return z4;
    }

    public final void c(boolean z) {
        int[] iArr = z ? this.j : this.l;
        GridLayout gridLayout = this.x;
        int childCount = gridLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = gridLayout.getChildAt(i);
            if (childAt.getVisibility() != 8) {
                gridLayout.getClass();
                R41 r41 = (R41) childAt.getLayoutParams();
                boolean z2 = this.a;
                Q41 q41 = (z2 ? r41.b : r41.a).b;
                int i2 = z ? q41.a : q41.b;
                iArr[i2] = Math.max(iArr[i2], gridLayout.f(childAt, z2, z));
            }
        }
    }

    public final void o(int i, float f) {
        Arrays.fill(this.t, 0);
        GridLayout gridLayout = this.x;
        int childCount = gridLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = gridLayout.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                gridLayout.getClass();
                R41 r41 = (R41) childAt.getLayoutParams();
                float f2 = (this.a ? r41.b : r41.a).d;
                if (f2 != 0.0f) {
                    int round = Math.round((i * f2) / f);
                    this.t[i2] = round;
                    i -= round;
                    f -= f2;
                }
            }
        }
    }

    public final int[] h() {
        boolean z;
        if (this.p == null) {
            this.p = new int[f() + 1];
        }
        if (!this.q) {
            int[] iArr = this.p;
            boolean z2 = this.s;
            GridLayout gridLayout = this.x;
            float f = 0.0f;
            boolean z3 = this.a;
            if (!z2) {
                int childCount = gridLayout.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        z = false;
                        break;
                    }
                    View childAt = gridLayout.getChildAt(i);
                    if (childAt.getVisibility() != 8) {
                        R41 r41 = (R41) childAt.getLayoutParams();
                        if ((z3 ? r41.b : r41.a).d != 0.0f) {
                            z = true;
                            break;
                        }
                    }
                    i++;
                }
                this.r = z;
                this.s = true;
            }
            if (!this.r) {
                p(e(), iArr, true);
            } else {
                if (this.t == null) {
                    this.t = new int[gridLayout.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(e(), iArr, true);
                int childCount2 = (gridLayout.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = gridLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount3; i2++) {
                        View childAt2 = gridLayout.getChildAt(i2);
                        if (childAt2.getVisibility() != 8) {
                            R41 r412 = (R41) childAt2.getLayoutParams();
                            f += (z3 ? r412.b : r412.a).d;
                        }
                    }
                    int i3 = -1;
                    boolean z4 = true;
                    int i4 = 0;
                    while (i4 < childCount2) {
                        int i5 = (int) ((i4 + childCount2) / 2);
                        m();
                        o(i5, f);
                        boolean p = p(e(), iArr, false);
                        if (p) {
                            i4 = i5 + 1;
                            i3 = i5;
                        } else {
                            childCount2 = i5;
                        }
                        z4 = p;
                    }
                    if (i3 > 0 && !z4) {
                        m();
                        o(i3, f);
                        p(e(), iArr, true);
                    }
                }
            }
            if (!this.u) {
                int i6 = iArr[0];
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    iArr[i7] = iArr[i7] - i6;
                }
            }
            this.q = true;
        }
        return this.p;
    }

    public final int j(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        S41 s41 = this.w;
        S41 s412 = this.v;
        if (mode == Integer.MIN_VALUE) {
            s412.a = 0;
            s41.a = -size;
            this.q = false;
            return h()[f()];
        }
        if (mode == 0) {
            s412.a = 0;
            s41.a = -100000;
            this.q = false;
            return h()[f()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        s412.a = size;
        s41.a = -size;
        this.q = false;
        return h()[f()];
    }

    public final void l() {
        this.c = Integer.MIN_VALUE;
        this.d = null;
        this.f = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.n = null;
        this.p = null;
        this.t = null;
        this.s = false;
        m();
    }

    public final void m() {
        this.e = false;
        this.g = false;
        this.i = false;
        this.k = false;
        this.m = false;
        this.o = false;
        this.q = false;
    }

    public final T41 d(boolean z) {
        Q41 q41;
        L41 l41 = new L41(Q41.class, S41.class);
        U41[] u41Arr = (U41[]) g().b;
        int length = u41Arr.length;
        for (int i = 0; i < length; i++) {
            if (z) {
                q41 = u41Arr[i].b;
            } else {
                Q41 q412 = u41Arr[i].b;
                q41 = new Q41(q412.b, q412.a);
            }
            l41.add(Pair.create(q41, new S41()));
        }
        return l41.a();
    }

    public static void k(ArrayList arrayList, Q41 q41, S41 s41, boolean z) {
        if (q41.b - q41.a == 0) {
            return;
        }
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((K41) it.next()).a.equals(q41)) {
                    return;
                }
            }
        }
        arrayList.add(new K41(q41, s41));
    }
}
