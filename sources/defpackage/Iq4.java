package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Iq4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(Iq4.class, Object.class, "lastScheduledTask");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(Iq4.class, "producerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(Iq4.class, "consumerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(Iq4.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final AbstractRunnableC4843eF3 a(AbstractRunnableC4843eF3 abstractRunnableC4843eF3, boolean z) {
        if (z) {
            return b(abstractRunnableC4843eF3);
        }
        AbstractRunnableC4843eF3 abstractRunnableC4843eF32 = (AbstractRunnableC4843eF3) b.getAndSet(this, abstractRunnableC4843eF3);
        if (abstractRunnableC4843eF32 == null) {
            return null;
        }
        return b(abstractRunnableC4843eF32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0047, code lost:            return f(r9, true);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(defpackage.Iq4 r9) {
        /*
            r8 = this;
            int r0 = r9.consumerIndex
            int r1 = r9.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r9.a
        L6:
            r3 = 1
            if (r0 == r1) goto L43
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.blockingTasksInBuffer
            if (r5 != 0) goto L10
            goto L43
        L10:
            java.lang.Object r5 = r2.get(r4)
            eF3 r5 = (defpackage.AbstractRunnableC4843eF3) r5
            if (r5 == 0) goto L40
            lF3 r6 = r5.g
            int r6 = r6.a
            r7 = 0
            if (r6 != r3) goto L21
            r6 = r3
            goto L22
        L21:
            r6 = r7
        L22:
            if (r6 == 0) goto L40
        L24:
            r6 = 0
            boolean r6 = r2.compareAndSet(r4, r5, r6)
            if (r6 == 0) goto L2c
            goto L33
        L2c:
            java.lang.Object r6 = r2.get(r4)
            if (r6 == r5) goto L24
            r3 = r7
        L33:
            if (r3 == 0) goto L40
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.Iq4.e
            r0.decrementAndGet(r9)
            r8.a(r5, r7)
            r0 = -1
            return r0
        L40:
            int r0 = r0 + 1
            goto L6
        L43:
            long r0 = r8.f(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Iq4.e(Iq4):long");
    }

    public final long f(Iq4 iq4, boolean z) {
        AbstractRunnableC4843eF3 abstractRunnableC4843eF3;
        boolean z2;
        do {
            abstractRunnableC4843eF3 = (AbstractRunnableC4843eF3) iq4.lastScheduledTask;
            if (abstractRunnableC4843eF3 != null) {
                z2 = true;
                if (z) {
                    if (!(abstractRunnableC4843eF3.g.a == 1)) {
                        return -2L;
                    }
                }
                VF3.e.getClass();
                long nanoTime = System.nanoTime() - abstractRunnableC4843eF3.a;
                long j = VF3.a;
                if (nanoTime >= j) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(iq4, abstractRunnableC4843eF3, null)) {
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(iq4) != abstractRunnableC4843eF3) {
                            z2 = false;
                            break;
                        }
                    }
                } else {
                    return j - nanoTime;
                }
            } else {
                return -2L;
            }
        } while (!z2);
        a(abstractRunnableC4843eF3, false);
        return -1L;
    }

    public final AbstractRunnableC4843eF3 d() {
        AbstractRunnableC4843eF3 abstractRunnableC4843eF3;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (d.compareAndSet(this, i, i + 1) && (abstractRunnableC4843eF3 = (AbstractRunnableC4843eF3) this.a.getAndSet(i2, null)) != null) {
                if (abstractRunnableC4843eF3.g.a == 1) {
                    e.decrementAndGet(this);
                }
                return abstractRunnableC4843eF3;
            }
        }
    }

    public final AbstractRunnableC4843eF3 b(AbstractRunnableC4843eF3 abstractRunnableC4843eF3) {
        if (abstractRunnableC4843eF3.g.a == 1) {
            e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return abstractRunnableC4843eF3;
        }
        int i = this.producerIndex & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, abstractRunnableC4843eF3);
        c.incrementAndGet(this);
        return null;
    }
}
