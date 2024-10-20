package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC11897yo1 implements Callable, InterfaceC6416iq0 {
    public static final FutureTask k = new FutureTask(TV0.b, null);
    public final Runnable a;
    public final ExecutorService i;
    public Thread j;
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference g = new AtomicReference();

    public CallableC11897yo1(K92 k92, ScheduledExecutorService scheduledExecutorService) {
        this.a = k92;
        this.i = scheduledExecutorService;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.j = Thread.currentThread();
        try {
            this.a.run();
            Future submit = this.i.submit(this);
            while (true) {
                AtomicReference atomicReference = this.g;
                Future future = (Future) atomicReference.get();
                if (future == k) {
                    submit.cancel(this.j != Thread.currentThread());
                }
                while (true) {
                    if (atomicReference.compareAndSet(future, submit)) {
                        r5 = true;
                        break;
                    }
                    if (atomicReference.get() != future) {
                        break;
                    }
                }
                if (r5) {
                    break;
                }
            }
            this.j = null;
        } catch (Throwable th) {
            this.j = null;
            MR2.b(th);
        }
        return null;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        AtomicReference atomicReference = this.h;
        FutureTask futureTask = k;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.j != Thread.currentThread());
        }
        Future future2 = (Future) this.g.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.j != Thread.currentThread());
    }

    public final void a(Future future) {
        boolean z;
        do {
            AtomicReference atomicReference = this.h;
            Future future2 = (Future) atomicReference.get();
            if (future2 == k) {
                future.cancel(this.j != Thread.currentThread());
                return;
            }
            while (true) {
                if (atomicReference.compareAndSet(future2, future)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != future2) {
                    break;
                }
            }
        } while (!z);
    }
}
