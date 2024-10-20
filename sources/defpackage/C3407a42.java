package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a42, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3407a42 extends AbstractC10079tW2 {
    public final ScheduledExecutorService a;
    public volatile boolean g;

    public C3407a42(ThreadFactory threadFactory) {
        boolean z = DW2.a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (DW2.a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            DW2.d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.a = newScheduledThreadPool;
    }

    @Override // defpackage.AbstractC10079tW2
    public final InterfaceC6416iq0 b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // defpackage.AbstractC10079tW2
    public final InterfaceC6416iq0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.g) {
            return EnumC7565mA0.INSTANCE;
        }
        return e(runnable, j, timeUnit, null);
    }

    public final RunnableC5271fW2 e(Runnable runnable, long j, TimeUnit timeUnit, InterfaceC7103kq0 interfaceC7103kq0) {
        Future schedule;
        MR2.c(runnable);
        RunnableC5271fW2 runnableC5271fW2 = new RunnableC5271fW2(runnable, interfaceC7103kq0);
        if (interfaceC7103kq0 != null && !interfaceC7103kq0.a(runnableC5271fW2)) {
            return runnableC5271fW2;
        }
        ScheduledExecutorService scheduledExecutorService = this.a;
        try {
            if (j <= 0) {
                schedule = scheduledExecutorService.submit((Callable) runnableC5271fW2);
            } else {
                schedule = scheduledExecutorService.schedule((Callable) runnableC5271fW2, j, timeUnit);
            }
            runnableC5271fW2.a(schedule);
        } catch (RejectedExecutionException e) {
            if (interfaceC7103kq0 != null) {
                interfaceC7103kq0.b(runnableC5271fW2);
            }
            MR2.b(e);
        }
        return runnableC5271fW2;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.a.shutdownNow();
    }
}
