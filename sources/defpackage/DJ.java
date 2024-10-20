package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DJ {
    public final C7617mK2 a;
    public final CJ b = new CJ();
    public final ArrayList c = new ArrayList();

    public DJ(C7617mK2 c7617mK2) {
        this.a = c7617mK2;
    }

    public final void i(View view) {
        this.c.add(view);
        C7617mK2 c7617mK2 = this.a;
        c7617mK2.getClass();
        d L = RecyclerView.L(view);
        if (L != null) {
            int i = L.v;
            View view2 = L.a;
            if (i != -1) {
                L.u = i;
            } else {
                WeakHashMap weakHashMap = Ec4.a;
                L.u = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c7617mK2.a;
            if (recyclerView.S()) {
                L.v = 4;
                recyclerView.B0.add(L);
            } else {
                WeakHashMap weakHashMap2 = Ec4.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final void k(View view) {
        if (this.c.remove(view)) {
            C7617mK2 c7617mK2 = this.a;
            c7617mK2.getClass();
            d L = RecyclerView.L(view);
            if (L != null) {
                int i = L.u;
                RecyclerView recyclerView = c7617mK2.a;
                if (recyclerView.S()) {
                    L.v = i;
                    recyclerView.B0.add(L);
                } else {
                    WeakHashMap weakHashMap = Ec4.a;
                    L.a.setImportantForAccessibility(i);
                }
                L.u = 0;
            }
        }
    }

    public final void a(View view, int i, boolean z) {
        int f;
        C7617mK2 c7617mK2 = this.a;
        if (i < 0) {
            f = c7617mK2.a();
        } else {
            f = f(i);
        }
        this.b.e(f, z);
        if (z) {
            i(view);
        }
        RecyclerView recyclerView = c7617mK2.a;
        recyclerView.addView(view, f);
        d L = RecyclerView.L(view);
        AbstractC8305oK2 abstractC8305oK2 = recyclerView.r;
        if (abstractC8305oK2 != null && L != null) {
            abstractC8305oK2.H(L);
        }
        ArrayList arrayList = recyclerView.I;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((BK2) recyclerView.I.get(size)).d(view);
            }
        }
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.a.a();
        int i2 = i;
        while (i2 < a) {
            CJ cj = this.b;
            int b = i - (i2 - cj.b(i2));
            if (b == 0) {
                while (cj.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public final View d(int i) {
        return this.a.a.getChildAt(f(i));
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int f;
        C7617mK2 c7617mK2 = this.a;
        if (i < 0) {
            f = c7617mK2.a();
        } else {
            f = f(i);
        }
        this.b.e(f, z);
        if (z) {
            i(view);
        }
        c7617mK2.getClass();
        d L = RecyclerView.L(view);
        RecyclerView recyclerView = c7617mK2.a;
        if (L != null) {
            if (!L.p() && !L.t()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + L + recyclerView.z());
            }
            L.o &= -257;
        }
        recyclerView.attachViewToParent(view, f, layoutParams);
    }

    public final int e() {
        return this.a.a() - this.c.size();
    }

    public final int h() {
        return this.a.a();
    }

    public final void c(int i) {
        d L;
        int f = f(i);
        this.b.f(f);
        C7617mK2 c7617mK2 = this.a;
        View childAt = c7617mK2.a.getChildAt(f);
        RecyclerView recyclerView = c7617mK2.a;
        if (childAt != null && (L = RecyclerView.L(childAt)) != null) {
            if (L.p() && !L.t()) {
                throw new IllegalArgumentException("called detach on an already detached child " + L + recyclerView.z());
            }
            L.d(256);
        }
        recyclerView.detachViewFromParent(f);
    }

    public final boolean j(View view) {
        return this.c.contains(view);
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }

    public final View g(int i) {
        return this.a.a.getChildAt(i);
    }
}
