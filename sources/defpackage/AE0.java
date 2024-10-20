package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AE0 extends AbstractC10422uW2 {
    public static final AbstractC10422uW2 c = NW2.a;
    public final Executor b;

    public AE0(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.AbstractC10422uW2
    public final AbstractC10079tW2 b() {
        return new RunnableC12045zE0(this.b);
    }

    @Override // defpackage.AbstractC10422uW2
    public final InterfaceC6416iq0 c(Runnable runnable) {
        Executor executor = this.b;
        MR2.c(runnable);
        try {
            if (executor instanceof ExecutorService) {
                CallableC4927eW2 callableC4927eW2 = new CallableC4927eW2(runnable);
                callableC4927eW2.a(((ExecutorService) executor).submit(callableC4927eW2));
                return callableC4927eW2;
            }
            RunnableC11016wE0 runnableC11016wE0 = new RunnableC11016wE0(runnable);
            executor.execute(runnableC11016wE0);
            return runnableC11016wE0;
        } catch (RejectedExecutionException e) {
            MR2.b(e);
            return EnumC7565mA0.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC10422uW2
    public final InterfaceC6416iq0 d(Runnable runnable, long j, TimeUnit timeUnit) {
        MR2.c(runnable);
        Executor executor = this.b;
        if (executor instanceof ScheduledExecutorService) {
            try {
                CallableC4927eW2 callableC4927eW2 = new CallableC4927eW2(runnable);
                callableC4927eW2.a(((ScheduledExecutorService) executor).schedule(callableC4927eW2, j, timeUnit));
                return callableC4927eW2;
            } catch (RejectedExecutionException e) {
                MR2.b(e);
                return EnumC7565mA0.INSTANCE;
            }
        }
        RunnableC10673vE0 runnableC10673vE0 = new RunnableC10673vE0(runnable);
        InterfaceC6416iq0 d = c.d(new RunnableC10330uE0(this, runnableC10673vE0), j, timeUnit);
        T33 t33 = runnableC10673vE0.a;
        t33.getClass();
        EnumC7791mq0.c(t33, d);
        return runnableC10673vE0;
    }

    @Override // defpackage.AbstractC10422uW2
    public final InterfaceC6416iq0 e(K92 k92, long j, long j2, TimeUnit timeUnit) {
        Executor executor = this.b;
        if (executor instanceof ScheduledExecutorService) {
            try {
                RunnableC4584dW2 runnableC4584dW2 = new RunnableC4584dW2(k92);
                runnableC4584dW2.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(runnableC4584dW2, j, j2, timeUnit));
                return runnableC4584dW2;
            } catch (RejectedExecutionException e) {
                MR2.b(e);
                return EnumC7565mA0.INSTANCE;
            }
        }
        return super.e(k92, j, j2, timeUnit);
    }
}
