package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ad3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3592ad3 extends AbstractC10422uW2 {
    public static final OR2 c;
    public final AtomicReference b;

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        c = new OR2("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C3592ad3() {
        AtomicReference atomicReference = new AtomicReference();
        this.b = atomicReference;
        boolean z = DW2.a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, c);
        if (DW2.a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            DW2.d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    @Override // defpackage.AbstractC10422uW2
    public final AbstractC10079tW2 b() {
        return new C3263Zc3((ScheduledExecutorService) this.b.get());
    }

    @Override // defpackage.AbstractC10422uW2
    public final InterfaceC6416iq0 d(Runnable runnable, long j, TimeUnit timeUnit) {
        Future schedule;
        MR2.c(runnable);
        CallableC4927eW2 callableC4927eW2 = new CallableC4927eW2(runnable);
        AtomicReference atomicReference = this.b;
        try {
            if (j <= 0) {
                schedule = ((ScheduledExecutorService) atomicReference.get()).submit(callableC4927eW2);
            } else {
                schedule = ((ScheduledExecutorService) atomicReference.get()).schedule(callableC4927eW2, j, timeUnit);
            }
            callableC4927eW2.a(schedule);
            return callableC4927eW2;
        } catch (RejectedExecutionException e) {
            MR2.b(e);
            return EnumC7565mA0.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC10422uW2
    public final InterfaceC6416iq0 e(K92 k92, long j, long j2, TimeUnit timeUnit) {
        Future schedule;
        EnumC7565mA0 enumC7565mA0 = EnumC7565mA0.INSTANCE;
        AtomicReference atomicReference = this.b;
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            CallableC11897yo1 callableC11897yo1 = new CallableC11897yo1(k92, scheduledExecutorService);
            try {
                if (j <= 0) {
                    schedule = scheduledExecutorService.submit(callableC11897yo1);
                } else {
                    schedule = scheduledExecutorService.schedule(callableC11897yo1, j, timeUnit);
                }
                callableC11897yo1.a(schedule);
                return callableC11897yo1;
            } catch (RejectedExecutionException e) {
                MR2.b(e);
                return enumC7565mA0;
            }
        }
        RunnableC4584dW2 runnableC4584dW2 = new RunnableC4584dW2(k92);
        try {
            runnableC4584dW2.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(runnableC4584dW2, j, j2, timeUnit));
            return runnableC4584dW2;
        } catch (RejectedExecutionException e2) {
            MR2.b(e2);
            return enumC7565mA0;
        }
    }
}
