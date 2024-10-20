package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC9172qr1 extends AtomicReference implements Runnable {
    public static final RunnableC8829pr1 a = new RunnableC8829pr1();
    public static final RunnableC8829pr1 g = new RunnableC8829pr1();

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !d();
            RunnableC8829pr1 runnableC8829pr1 = a;
            if (z) {
                try {
                    obj = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, runnableC8829pr1)) {
                            g(currentThread);
                        }
                        if (z) {
                            a(th);
                            return;
                        }
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, runnableC8829pr1)) {
                            g(currentThread);
                        }
                        if (z) {
                            b(null);
                        }
                    }
                }
            }
        }
    }

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC8486or1 runnableC8486or1 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof RunnableC8486or1;
            RunnableC8829pr1 runnableC8829pr1 = g;
            if (!z2 && runnable != runnableC8829pr1) {
                break;
            }
            if (z2) {
                runnableC8486or1 = (RunnableC8486or1) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == runnableC8829pr1 || compareAndSet(runnable, runnableC8829pr1)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(runnableC8486or1);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void c() {
        RunnableC8829pr1 runnableC8829pr1 = g;
        RunnableC8829pr1 runnableC8829pr12 = a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC8486or1 runnableC8486or1 = new RunnableC8486or1(this);
            RunnableC8486or1.a(runnableC8486or1, Thread.currentThread());
            if (compareAndSet(runnable, runnableC8486or1)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(runnableC8829pr12)) == runnableC8829pr1) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC8486or1) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder a2 = M41.a(str, ", ");
        a2.append(f());
        return a2.toString();
    }
}
