package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nK2 */
/* loaded from: classes.dex */
public final class C7961nK2 {
    public final /* synthetic */ RecyclerView a;

    public C7961nK2(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(A6 a6) {
        int i = a6.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.s.b0(a6.b, a6.d);
            return;
        }
        if (i == 2) {
            recyclerView.s.e0(a6.b, a6.d);
        } else if (i == 4) {
            recyclerView.s.f0(a6.b, a6.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.s.d0(a6.b, a6.d);
        }
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int h = recyclerView.k.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < h; i11++) {
            d L = RecyclerView.L(recyclerView.k.g(i11));
            if (L != null && (i9 = L.h) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    L.q(i2 - i, false);
                } else {
                    L.q(i5, false);
                }
                recyclerView.n0.f = true;
            }
        }
        b bVar = recyclerView.h;
        bVar.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = bVar.c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            d dVar = (d) arrayList.get(i12);
            if (dVar != null && (i8 = dVar.h) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    dVar.q(i2 - i, false);
                } else {
                    dVar.q(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.q0 = true;
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int h = recyclerView.k.h();
        for (int i3 = 0; i3 < h; i3++) {
            d L = RecyclerView.L(recyclerView.k.g(i3));
            if (L != null && !L.t() && L.h >= i) {
                L.q(i2, false);
                recyclerView.n0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.h.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            if (dVar != null && dVar.h >= i) {
                dVar.q(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.q0 = true;
    }

    public final void c(Object obj, int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int h = recyclerView.k.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = recyclerView.k.g(i6);
            d L = RecyclerView.L(g);
            if (L != null && !L.t() && (i4 = L.h) >= i && i4 < i5) {
                L.d(2);
                L.c(obj);
                ((AK2) g.getLayoutParams()).h = true;
            }
        }
        b bVar = recyclerView.h;
        ArrayList arrayList = bVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.r0 = true;
                return;
            }
            d dVar = (d) arrayList.get(size);
            if (dVar != null && (i3 = dVar.h) >= i && i3 < i5) {
                dVar.d(2);
                bVar.g(size);
            }
        }
    }

    public final d b(int i) {
        RecyclerView recyclerView = this.a;
        int h = recyclerView.k.h();
        int i2 = 0;
        d dVar = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            d L = RecyclerView.L(recyclerView.k.g(i2));
            if (L != null && !L.n() && L.h == i) {
                if (!recyclerView.k.j(L.a)) {
                    dVar = L;
                    break;
                }
                dVar = L;
            }
            i2++;
        }
        if (dVar == null || recyclerView.k.j(dVar.a)) {
            return null;
        }
        return dVar;
    }
}
