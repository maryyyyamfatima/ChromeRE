package kotlinx.coroutines.scheduling;

import defpackage.AbstractRunnableC4843eF3;
import defpackage.Iq4;
import defpackage.XG2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class a extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");
    public final Iq4 a;
    public int g;
    public long h;
    public long i;
    private volatile int indexInArray;
    public int j;
    public boolean k;
    public final /* synthetic */ b l;
    private volatile Object nextParkedWorker;
    volatile /* synthetic */ int workerCtl;

    public final int b() {
        return this.indexInArray;
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.l.i);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public a(b bVar, int i) {
        this.l = bVar;
        this.l = bVar;
        setDaemon(true);
        this.a = new Iq4();
        this.g = 4;
        this.workerCtl = 0;
        this.nextParkedWorker = b.p;
        this.j = XG2.a.a();
        f(i);
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractRunnableC4843eF3 a(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.g
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L7
            goto L2e
        L7:
            kotlinx.coroutines.scheduling.b r0 = r9.l
        L9:
            long r5 = r0.controlState
            r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r3 = r3 & r5
            r7 = 42
            long r3 = r3 >> r7
            int r3 = (int) r3
            if (r3 != 0) goto L19
            r0 = r2
            goto L2a
        L19:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r7 = r5 - r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.b.n
            r4 = r0
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto L9
            r0 = r1
        L2a:
            if (r0 == 0) goto L30
            r9.g = r1
        L2e:
            r0 = r1
            goto L31
        L30:
            r0 = r2
        L31:
            r3 = 0
            if (r0 == 0) goto L77
            if (r10 == 0) goto L6c
            kotlinx.coroutines.scheduling.b r10 = r9.l
            int r10 = r10.a
            int r10 = r10 * 2
            int r10 = r9.d(r10)
            if (r10 != 0) goto L43
            goto L44
        L43:
            r1 = r2
        L44:
            if (r1 == 0) goto L4c
            eF3 r10 = r9.e()
            if (r10 != 0) goto L76
        L4c:
            Iq4 r10 = r9.a
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.Iq4.b
            java.lang.Object r0 = r0.getAndSet(r10, r3)
            eF3 r0 = (defpackage.AbstractRunnableC4843eF3) r0
            if (r0 != 0) goto L60
            eF3 r10 = r10.d()
            goto L61
        L60:
            r10 = r0
        L61:
            if (r10 != 0) goto L76
            if (r1 != 0) goto L72
            eF3 r10 = r9.e()
            if (r10 != 0) goto L76
            goto L72
        L6c:
            eF3 r10 = r9.e()
            if (r10 != 0) goto L76
        L72:
            eF3 r10 = r9.i(r2)
        L76:
            return r10
        L77:
            if (r10 == 0) goto L9a
            Iq4 r10 = r9.a
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.Iq4.b
            java.lang.Object r0 = r0.getAndSet(r10, r3)
            eF3 r0 = (defpackage.AbstractRunnableC4843eF3) r0
            if (r0 != 0) goto L8c
            eF3 r0 = r10.d()
        L8c:
            if (r0 != 0) goto La5
            kotlinx.coroutines.scheduling.b r10 = r9.l
            p01 r10 = r10.k
            java.lang.Object r10 = r10.d()
            r0 = r10
            eF3 r0 = (defpackage.AbstractRunnableC4843eF3) r0
            goto La5
        L9a:
            kotlinx.coroutines.scheduling.b r10 = r9.l
            p01 r10 = r10.k
            java.lang.Object r10 = r10.d()
            r0 = r10
            eF3 r0 = (defpackage.AbstractRunnableC4843eF3) r0
        La5:
            if (r0 != 0) goto Lab
            eF3 r0 = r9.i(r1)
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.a(boolean):eF3");
    }

    public final boolean h(int i) {
        int i2 = this.g;
        boolean z = i2 == 1;
        if (z) {
            b.n.addAndGet(this.l, 4398046511104L);
        }
        if (i2 != i) {
            this.g = i;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0002 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.run():void");
    }

    public final int d(int i) {
        int i2 = this.j;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.j = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final AbstractRunnableC4843eF3 e() {
        int d = d(2);
        b bVar = this.l;
        if (d == 0) {
            AbstractRunnableC4843eF3 abstractRunnableC4843eF3 = (AbstractRunnableC4843eF3) bVar.j.d();
            return abstractRunnableC4843eF3 == null ? (AbstractRunnableC4843eF3) bVar.k.d() : abstractRunnableC4843eF3;
        }
        AbstractRunnableC4843eF3 abstractRunnableC4843eF32 = (AbstractRunnableC4843eF3) bVar.k.d();
        return abstractRunnableC4843eF32 == null ? (AbstractRunnableC4843eF3) bVar.j.d() : abstractRunnableC4843eF32;
    }

    public final AbstractRunnableC4843eF3 i(boolean z) {
        long f;
        int i = (int) (this.l.controlState & 2097151);
        if (i < 2) {
            return null;
        }
        int d = d(i);
        b bVar = this.l;
        int i2 = 0;
        long j = Long.MAX_VALUE;
        while (i2 < i) {
            i2++;
            d++;
            if (d > i) {
                d = 1;
            }
            a aVar = (a) bVar.l.b(d);
            if (aVar != null && aVar != this) {
                if (z) {
                    f = this.a.e(aVar.a);
                } else {
                    Iq4 iq4 = this.a;
                    Iq4 iq42 = aVar.a;
                    iq4.getClass();
                    AbstractRunnableC4843eF3 d2 = iq42.d();
                    if (d2 != null) {
                        iq4.a(d2, false);
                        f = -1;
                    } else {
                        f = iq4.f(iq42, false);
                    }
                }
                if (f == -1) {
                    Iq4 iq43 = this.a;
                    iq43.getClass();
                    AbstractRunnableC4843eF3 abstractRunnableC4843eF3 = (AbstractRunnableC4843eF3) Iq4.b.getAndSet(iq43, null);
                    return abstractRunnableC4843eF3 == null ? iq43.d() : abstractRunnableC4843eF3;
                }
                if (f > 0) {
                    j = Math.min(j, f);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.i = j;
        return null;
    }
}
