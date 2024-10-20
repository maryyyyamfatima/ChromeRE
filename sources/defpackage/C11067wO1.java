package defpackage;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11067wO1 {
    public long b;
    public final KM2 c;
    public List d;
    public final SparseIntArray e;
    public C10381uO1 f;
    public final ArrayList g;
    public final ArrayDeque h;
    public final HandlerC10413uU3 i;
    public final C10038tO1 j;
    public BasePendingResult k;
    public BasePendingResult l;
    public final Set m = Collections.synchronizedSet(new HashSet());
    public final C4856eI1 a = new C4856eI1("MediaQueue");

    public C11067wO1(KM2 km2) {
        this.c = km2;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.i = new HandlerC10413uU3(Looper.getMainLooper());
        this.j = new C10038tO1(this);
        km2.i.add(new C10724vO1(this));
        this.f = new C10381uO1(this);
        this.b = d();
        h();
    }

    public final void c() {
        g();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        this.i.removeCallbacks(this.j);
        this.h.clear();
        BasePendingResult basePendingResult = this.l;
        if (basePendingResult != null) {
            basePendingResult.d();
            this.l = null;
        }
        BasePendingResult basePendingResult2 = this.k;
        if (basePendingResult2 != null) {
            basePendingResult2.d();
            this.k = null;
        }
        f();
        e();
    }

    public final void h() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        if (this.b != 0 && (basePendingResult = this.l) == null) {
            if (basePendingResult != null) {
                basePendingResult.d();
                this.l = null;
            }
            BasePendingResult basePendingResult3 = this.k;
            if (basePendingResult3 != null) {
                basePendingResult3.d();
                this.k = null;
            }
            KM2 km2 = this.c;
            if (!km2.h()) {
                basePendingResult2 = KM2.f();
            } else {
                C9343rM2 c9343rM2 = new C9343rM2(km2);
                KM2.b(c9343rM2);
                basePendingResult2 = c9343rM2;
            }
            this.l = basePendingResult2;
            basePendingResult2.l(new RP2() { // from class: sO1
                @Override // defpackage.RP2
                public final void c(QP2 qp2) {
                    C11067wO1 c11067wO1 = C11067wO1.this;
                    c11067wO1.getClass();
                    Status S0 = ((HM2) qp2).S0();
                    int i = S0.g;
                    if (i != 0) {
                        c11067wO1.a.g(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(i), S0.h), new Object[0]);
                    }
                    c11067wO1.l = null;
                    if (c11067wO1.h.isEmpty()) {
                        return;
                    }
                    HandlerC10413uU3 handlerC10413uU3 = c11067wO1.i;
                    C10038tO1 c10038tO1 = c11067wO1.j;
                    handlerC10413uU3.removeCallbacks(c10038tO1);
                    handlerC10413uU3.postDelayed(c10038tO1, 500L);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:            if (r3 != 3) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:            if (r1 != 2) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:            if (r4 == 0) goto L18;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d() {
        /*
            r7 = this;
            KM2 r0 = r7.c
            com.google.android.gms.cast.MediaStatus r0 = r0.e()
            if (r0 == 0) goto L31
            com.google.android.gms.cast.MediaInfo r1 = r0.a
            if (r1 != 0) goto Le
            r1 = -1
            goto L10
        Le:
            int r1 = r1.g
        L10:
            int r2 = r0.j
            int r3 = r0.k
            int r4 = r0.q
            r5 = 0
            r6 = 1
            if (r2 == r6) goto L1b
            goto L2b
        L1b:
            if (r3 == r6) goto L28
            r2 = 2
            if (r3 == r2) goto L24
            r1 = 3
            if (r3 == r1) goto L28
            goto L26
        L24:
            if (r1 == r2) goto L2b
        L26:
            r5 = r6
            goto L2b
        L28:
            if (r4 != 0) goto L2b
            goto L26
        L2b:
            if (r5 == 0) goto L2e
            goto L31
        L2e:
            long r0 = r0.g
            return r0
        L31:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11067wO1.d():long");
    }

    public static void b(C11067wO1 c11067wO1) {
        SparseIntArray sparseIntArray = c11067wO1.e;
        sparseIntArray.clear();
        for (int i = 0; i < c11067wO1.d.size(); i++) {
            sparseIntArray.put(((Integer) c11067wO1.d.get(i)).intValue(), i);
        }
    }

    public final void g() {
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
        }
    }

    public final void e() {
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
        }
    }

    public final void f() {
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
        }
    }

    public static void a(C11067wO1 c11067wO1) {
        synchronized (c11067wO1.m) {
            Iterator it = c11067wO1.m.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
        }
    }
}
