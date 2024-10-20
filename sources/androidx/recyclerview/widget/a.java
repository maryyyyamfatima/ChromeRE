package androidx.recyclerview.widget;

import android.os.Trace;
import defpackage.AbstractC12077zK2;
import defpackage.AbstractC2348Sb3;
import defpackage.AbstractC8305oK2;
import defpackage.C10082tX0;
import defpackage.C10425uX0;
import defpackage.C10768vX0;
import defpackage.LK2;
import defpackage.OT3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public static final ThreadLocal j = new ThreadLocal();
    public static final C10082tX0 k = new C10082tX0();
    public long g;
    public long h;
    public final ArrayList a = new ArrayList();
    public final ArrayList i = new ArrayList();

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.g == 0) {
            this.g = RecyclerView.O();
            recyclerView.post(this);
        }
        C10425uX0 c10425uX0 = recyclerView.m0;
        c10425uX0.a = i;
        c10425uX0.b = i2;
    }

    public final void b(long j2) {
        C10768vX0 c10768vX0;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C10768vX0 c10768vX02;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C10425uX0 c10425uX0 = recyclerView3.m0;
                c10425uX0.b(recyclerView3, false);
                i += c10425uX0.d;
            }
        }
        ArrayList arrayList2 = this.i;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C10425uX0 c10425uX02 = recyclerView4.m0;
                int abs = Math.abs(c10425uX02.b) + Math.abs(c10425uX02.a);
                for (int i5 = 0; i5 < c10425uX02.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c10768vX02 = new C10768vX0();
                        arrayList2.add(c10768vX02);
                    } else {
                        c10768vX02 = (C10768vX0) arrayList2.get(i3);
                    }
                    int[] iArr = c10425uX02.c;
                    int i6 = iArr[i5 + 1];
                    c10768vX02.a = i6 <= abs;
                    c10768vX02.b = abs;
                    c10768vX02.c = i6;
                    c10768vX02.d = recyclerView4;
                    c10768vX02.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, k);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c10768vX0 = (C10768vX0) arrayList2.get(i7)).d) != null; i7++) {
            d c = c(recyclerView, c10768vX0.e, c10768vX0.a ? Long.MAX_VALUE : j2);
            if (c != null && c.g != null && c.k() && !c.l() && (recyclerView2 = (RecyclerView) c.g.get()) != null) {
                if (recyclerView2.f11489J && recyclerView2.k.h() != 0) {
                    AbstractC2348Sb3 abstractC2348Sb3 = recyclerView2.S;
                    if (abstractC2348Sb3 != null) {
                        abstractC2348Sb3.j();
                    }
                    AbstractC12077zK2 abstractC12077zK2 = recyclerView2.s;
                    b bVar = recyclerView2.h;
                    if (abstractC12077zK2 != null) {
                        abstractC12077zK2.m0(bVar);
                        recyclerView2.s.n0(bVar);
                    }
                    bVar.a.clear();
                    bVar.f();
                }
                C10425uX0 c10425uX03 = recyclerView2.m0;
                c10425uX03.b(recyclerView2, true);
                if (c10425uX03.d != 0) {
                    try {
                        int i8 = OT3.a;
                        Trace.beginSection("RV Nested Prefetch");
                        LK2 lk2 = recyclerView2.n0;
                        AbstractC8305oK2 abstractC8305oK2 = recyclerView2.r;
                        lk2.d = 1;
                        lk2.e = abstractC8305oK2.q();
                        lk2.g = false;
                        lk2.h = false;
                        lk2.i = false;
                        for (int i9 = 0; i9 < c10425uX03.d * 2; i9 += 2) {
                            c(recyclerView2, c10425uX03.c[i9], j2);
                        }
                        Trace.endSection();
                        c10768vX0.a = false;
                        c10768vX0.b = 0;
                        c10768vX0.c = 0;
                        c10768vX0.d = null;
                        c10768vX0.e = 0;
                    } catch (Throwable th) {
                        int i10 = OT3.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c10768vX0.a = false;
            c10768vX0.b = 0;
            c10768vX0.c = 0;
            c10768vX0.d = null;
            c10768vX0.e = 0;
        }
    }

    public static d c(RecyclerView recyclerView, int i, long j2) {
        boolean z;
        int h = recyclerView.k.h();
        int i2 = 0;
        while (true) {
            if (i2 >= h) {
                z = false;
                break;
            }
            d L = RecyclerView.L(recyclerView.k.g(i2));
            if (L.h == i && !L.l()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        b bVar = recyclerView.h;
        try {
            recyclerView.W();
            d k2 = bVar.k(j2, i);
            if (k2 != null) {
                if (k2.k() && !k2.l()) {
                    bVar.h(k2.a);
                } else {
                    bVar.a(k2, false);
                }
            }
            return k2;
        } finally {
            recyclerView.X(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = OT3.a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.a;
            if (arrayList.isEmpty()) {
                this.g = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.g = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.h);
                this.g = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.g = 0L;
            int i3 = OT3.a;
            Trace.endSection();
            throw th;
        }
    }
}
