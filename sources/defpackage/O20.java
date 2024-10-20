package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O20 extends AbstractC10422uW2 implements BW2 {
    public static final M20 c;
    public static final OR2 d;
    public static final int e;
    public static final N20 f;
    public final AtomicReference b;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        e = availableProcessors;
        N20 n20 = new N20(new OR2("RxComputationShutdown"));
        f = n20;
        n20.dispose();
        OR2 or2 = new OR2("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        d = or2;
        M20 m20 = new M20(0, or2);
        c = m20;
        for (N20 n202 : m20.b) {
            n202.dispose();
        }
    }

    public O20() {
        int i;
        boolean z;
        M20 m20 = c;
        this.b = new AtomicReference(m20);
        M20 m202 = new M20(e, d);
        while (true) {
            AtomicReference atomicReference = this.b;
            if (!atomicReference.compareAndSet(m20, m202)) {
                if (atomicReference.get() != m20) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        for (N20 n20 : m202.b) {
            n20.dispose();
        }
    }

    @Override // defpackage.AbstractC10422uW2
    public final AbstractC10079tW2 b() {
        return new L20(((M20) this.b.get()).b());
    }

    @Override // defpackage.BW2
    public final void a(int i, C1343Ki2 c1343Ki2) {
        Q82.b(i, "number > 0 required");
        ((M20) this.b.get()).a(i, c1343Ki2);
    }

    @Override // defpackage.AbstractC10422uW2
    public final InterfaceC6416iq0 d(Runnable runnable, long j, TimeUnit timeUnit) {
        Future schedule;
        N20 b = ((M20) this.b.get()).b();
        b.getClass();
        MR2.c(runnable);
        CallableC4927eW2 callableC4927eW2 = new CallableC4927eW2(runnable);
        ScheduledExecutorService scheduledExecutorService = b.a;
        try {
            if (j <= 0) {
                schedule = scheduledExecutorService.submit(callableC4927eW2);
            } else {
                schedule = scheduledExecutorService.schedule(callableC4927eW2, j, timeUnit);
            }
            callableC4927eW2.a(schedule);
            return callableC4927eW2;
        } catch (RejectedExecutionException e2) {
            MR2.b(e2);
            return EnumC7565mA0.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC10422uW2
    public final InterfaceC6416iq0 e(K92 k92, long j, long j2, TimeUnit timeUnit) {
        Future schedule;
        N20 b = ((M20) this.b.get()).b();
        b.getClass();
        EnumC7565mA0 enumC7565mA0 = EnumC7565mA0.INSTANCE;
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = b.a;
            CallableC11897yo1 callableC11897yo1 = new CallableC11897yo1(k92, scheduledExecutorService);
            try {
                if (j <= 0) {
                    schedule = scheduledExecutorService.submit(callableC11897yo1);
                } else {
                    schedule = scheduledExecutorService.schedule(callableC11897yo1, j, timeUnit);
                }
                callableC11897yo1.a(schedule);
                return callableC11897yo1;
            } catch (RejectedExecutionException e2) {
                MR2.b(e2);
                return enumC7565mA0;
            }
        }
        RunnableC4584dW2 runnableC4584dW2 = new RunnableC4584dW2(k92);
        try {
            runnableC4584dW2.a(b.a.scheduleAtFixedRate(runnableC4584dW2, j, j2, timeUnit));
            return runnableC4584dW2;
        } catch (RejectedExecutionException e3) {
            MR2.b(e3);
            return enumC7565mA0;
        }
    }
}
