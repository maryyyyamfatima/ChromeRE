package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import defpackage.AbstractC12077zK2;
import defpackage.AbstractC2348Sb3;
import defpackage.AbstractC8305oK2;
import defpackage.AbstractC8522ox2;
import defpackage.C10425uX0;
import defpackage.EK2;
import defpackage.Ec4;
import defpackage.FK2;
import defpackage.GK2;
import defpackage.NK2;
import defpackage.O0;
import defpackage.OK2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public FK2 g;
    public final /* synthetic */ RecyclerView h;

    public b(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void m() {
        AbstractC12077zK2 abstractC12077zK2 = this.h.s;
        this.f = this.e + (abstractC12077zK2 != null ? abstractC12077zK2.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            g(size);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.n0.b()) {
            return !recyclerView.n0.g ? i : recyclerView.j.f(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.n0.b() + recyclerView.z());
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x03ec, code lost:            if (r8.l() == false) goto L233;     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x052a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.d k(long r19, int r21) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.b.k(long, int):androidx.recyclerview.widget.d");
    }

    public final void h(View view) {
        d L = RecyclerView.L(view);
        boolean p = L.p();
        RecyclerView recyclerView = this.h;
        if (p) {
            recyclerView.removeDetachedView(view, false);
        }
        if (!L.o()) {
            if (L.u()) {
                L.o &= -33;
            }
        } else {
            L.s.l(L);
        }
        i(L);
        if (recyclerView.S == null || L.m()) {
            return;
        }
        recyclerView.S.i(L);
    }

    public final void f() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.L0) {
            C10425uX0 c10425uX0 = this.h.m0;
            int[] iArr = c10425uX0.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c10425uX0.d = 0;
        }
    }

    public final void g(int i) {
        ArrayList arrayList = this.c;
        a((d) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x008d, code lost:            if (r7 == false) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008f, code lost:            r6 = r6 - 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0091, code lost:            if (r6 < 0) goto L88;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0093, code lost:            r7 = ((androidx.recyclerview.widget.d) r5.get(r6)).h;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009d, code lost:            if (r8.c == null) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009f, code lost:            r9 = r8.d * 2;        r10 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a4, code lost:            if (r10 >= r9) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00aa, code lost:            if (r8.c[r10] != r7) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ae, code lost:            r10 = r10 + 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:            r7 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b2, code lost:            if (r7 != false) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b4, code lost:            r6 = r6 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b1, code lost:            r7 = false;     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(androidx.recyclerview.widget.d r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.b.i(androidx.recyclerview.widget.d):void");
    }

    public final void a(d dVar, boolean z) {
        RecyclerView.k(dVar);
        RecyclerView recyclerView = this.h;
        OK2 ok2 = recyclerView.u0;
        View view = dVar.a;
        if (ok2 != null) {
            O0 j = ok2.j();
            Ec4.m(view, j instanceof NK2 ? (O0) ((NK2) j).e.remove(view) : null);
        }
        if (z) {
            GK2 gk2 = recyclerView.t;
            if (gk2 != null) {
                gk2.a(dVar);
            }
            ArrayList arrayList = recyclerView.u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((GK2) arrayList.get(i)).a(dVar);
            }
            AbstractC8305oK2 abstractC8305oK2 = recyclerView.r;
            if (abstractC8305oK2 != null) {
                abstractC8305oK2.I(dVar);
            }
            if (recyclerView.n0 != null) {
                recyclerView.l.d(dVar);
            }
        }
        dVar.x = null;
        dVar.w = null;
        FK2 c = c();
        c.getClass();
        int i2 = dVar.k;
        ArrayList arrayList2 = c.c(i2).a;
        if (((EK2) c.a.get(i2)).b <= arrayList2.size()) {
            AbstractC8522ox2.a(view);
        } else {
            dVar.r();
            arrayList2.add(dVar);
        }
    }

    public final void j(View view) {
        d L = RecyclerView.L(view);
        int i = L.o;
        boolean z = (i & 12) != 0;
        RecyclerView recyclerView = this.h;
        if (!z) {
            if ((i & 2) != 0) {
                AbstractC2348Sb3 abstractC2348Sb3 = recyclerView.S;
                if (!(abstractC2348Sb3 == null || abstractC2348Sb3.g(L, L.i()))) {
                    if (this.b == null) {
                        this.b = new ArrayList();
                    }
                    L.s = this;
                    L.t = true;
                    this.b.add(L);
                    return;
                }
            }
        }
        if (L.l() && !L.n() && !recyclerView.r.g) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.z());
        }
        L.s = this;
        L.t = false;
        this.a.add(L);
    }

    public final void l(d dVar) {
        if (dVar.t) {
            this.b.remove(dVar);
        } else {
            this.a.remove(dVar);
        }
        dVar.s = null;
        dVar.t = false;
        dVar.o &= -33;
    }

    public final void d() {
        if (this.g != null) {
            RecyclerView recyclerView = this.h;
            if (recyclerView.r == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            FK2 fk2 = this.g;
            fk2.c.add(recyclerView.r);
        }
    }

    public final void e(AbstractC8305oK2 abstractC8305oK2, boolean z) {
        FK2 fk2 = this.g;
        if (fk2 == null) {
            return;
        }
        Set set = fk2.c;
        set.remove(abstractC8305oK2);
        if (set.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = fk2.a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((EK2) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                AbstractC8522ox2.a(((d) arrayList.get(i2)).a);
            }
            i++;
        }
    }

    public final FK2 c() {
        if (this.g == null) {
            this.g = new FK2();
            d();
        }
        return this.g;
    }
}
