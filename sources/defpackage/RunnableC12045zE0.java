package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC12045zE0 extends AbstractC10079tW2 implements Runnable {
    public final Executor g;
    public volatile boolean i;
    public final AtomicInteger j = new AtomicInteger();
    public final H10 k = new H10();
    public final BZ1 h = new BZ1();
    public final boolean a = false;

    public RunnableC12045zE0(Executor executor) {
        this.g = executor;
    }

    @Override // defpackage.AbstractC10079tW2
    public final InterfaceC6416iq0 b(Runnable runnable) {
        InterfaceC6416iq0 runnableC11016wE0;
        boolean z = this.i;
        EnumC7565mA0 enumC7565mA0 = EnumC7565mA0.INSTANCE;
        if (z) {
            return enumC7565mA0;
        }
        MR2.c(runnable);
        if (this.a) {
            runnableC11016wE0 = new RunnableC11359xE0(runnable, this.k);
            this.k.a(runnableC11016wE0);
        } else {
            runnableC11016wE0 = new RunnableC11016wE0(runnable);
        }
        this.h.offer(runnableC11016wE0);
        if (this.j.getAndIncrement() == 0) {
            try {
                this.g.execute(this);
            } catch (RejectedExecutionException e) {
                this.i = true;
                this.h.clear();
                MR2.b(e);
                return enumC7565mA0;
            }
        }
        return runnableC11016wE0;
    }

    @Override // defpackage.AbstractC10079tW2
    public final InterfaceC6416iq0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return b(runnable);
        }
        boolean z = this.i;
        EnumC7565mA0 enumC7565mA0 = EnumC7565mA0.INSTANCE;
        if (z) {
            return enumC7565mA0;
        }
        T33 t33 = new T33();
        T33 t332 = new T33(t33);
        MR2.c(runnable);
        RunnableC5271fW2 runnableC5271fW2 = new RunnableC5271fW2(new RunnableC11702yE0(this, t332, runnable), this.k);
        this.k.a(runnableC5271fW2);
        Executor executor = this.g;
        if (executor instanceof ScheduledExecutorService) {
            try {
                runnableC5271fW2.a(((ScheduledExecutorService) executor).schedule((Callable) runnableC5271fW2, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.i = true;
                MR2.b(e);
                return enumC7565mA0;
            }
        } else {
            runnableC5271fW2.a(new FutureC8479oq0(AE0.c.d(runnableC5271fW2, j, timeUnit)));
        }
        EnumC7791mq0.c(t33, runnableC5271fW2);
        return t332;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.k.dispose();
        if (this.j.getAndIncrement() == 0) {
            this.h.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        BZ1 bz1 = this.h;
        int i = 1;
        while (!this.i) {
            do {
                Runnable runnable = (Runnable) bz1.poll();
                if (runnable != null) {
                    runnable.run();
                } else if (this.i) {
                    bz1.clear();
                    return;
                } else {
                    i = this.j.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            } while (!this.i);
            bz1.clear();
            return;
        }
        bz1.clear();
    }
}
