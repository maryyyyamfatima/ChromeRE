package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3336Zr1 implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue g;
    public final H10 h;
    public final ScheduledExecutorService i;
    public final ScheduledFuture j;
    public final ThreadFactory k;

    public RunnableC3336Zr1(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledFuture<?> scheduledFuture;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.a = nanos;
        this.g = new ConcurrentLinkedQueue();
        this.h = new H10();
        this.k = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, C4367cs1.d);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.i = scheduledExecutorService;
        this.j = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.g;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long nanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            C4024bs1 c4024bs1 = (C4024bs1) it.next();
            if (c4024bs1.h > nanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(c4024bs1)) {
                this.h.b(c4024bs1);
            }
        }
    }
}
