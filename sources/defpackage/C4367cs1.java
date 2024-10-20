package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cs1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4367cs1 extends AbstractC10422uW2 {
    public static final OR2 c;
    public static final OR2 d;
    public static final C4024bs1 g;
    public static final RunnableC3336Zr1 h;
    public final AtomicReference b;
    public static final TimeUnit f = TimeUnit.SECONDS;
    public static final long e = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        C4024bs1 c4024bs1 = new C4024bs1(new OR2("RxCachedThreadSchedulerShutdown"));
        g = c4024bs1;
        c4024bs1.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        OR2 or2 = new OR2("RxCachedThreadScheduler", max, false);
        c = or2;
        d = new OR2("RxCachedWorkerPoolEvictor", max, false);
        RunnableC3336Zr1 runnableC3336Zr1 = new RunnableC3336Zr1(0L, null, or2);
        h = runnableC3336Zr1;
        runnableC3336Zr1.h.dispose();
        ScheduledFuture scheduledFuture = runnableC3336Zr1.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = runnableC3336Zr1.i;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C4367cs1() {
        boolean z;
        RunnableC3336Zr1 runnableC3336Zr1 = h;
        this.b = new AtomicReference(runnableC3336Zr1);
        RunnableC3336Zr1 runnableC3336Zr12 = new RunnableC3336Zr1(e, f, c);
        while (true) {
            AtomicReference atomicReference = this.b;
            if (atomicReference.compareAndSet(runnableC3336Zr1, runnableC3336Zr12)) {
                z = true;
                break;
            } else if (atomicReference.get() != runnableC3336Zr1) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        runnableC3336Zr12.h.dispose();
        ScheduledFuture scheduledFuture = runnableC3336Zr12.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = runnableC3336Zr12.i;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // defpackage.AbstractC10422uW2
    public final AbstractC10079tW2 b() {
        return new C3680as1((RunnableC3336Zr1) this.b.get());
    }
}
