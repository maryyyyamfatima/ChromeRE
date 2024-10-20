package defpackage;

import com.google.common.util.concurrent.w;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SY1 extends QY1 implements InterfaceScheduledExecutorServiceC4493dE1 {
    public final ScheduledExecutorService g;

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC9399rX3 runnableFutureC9399rX3 = new RunnableFutureC9399rX3(callable);
        return new RY1(runnableFutureC9399rX3, this.g.schedule(runnableFutureC9399rX3, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final RY1 schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC9399rX3 runnableFutureC9399rX3 = new RunnableFutureC9399rX3(Executors.callable(runnable, null));
        return new RY1(runnableFutureC9399rX3, this.g.schedule(runnableFutureC9399rX3, j, timeUnit));
    }

    public SY1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.g = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        w wVar = new w(runnable);
        return new RY1(wVar, this.g.scheduleAtFixedRate(wVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        w wVar = new w(runnable);
        return new RY1(wVar, this.g.scheduleWithFixedDelay(wVar, j, j2, timeUnit));
    }
}
