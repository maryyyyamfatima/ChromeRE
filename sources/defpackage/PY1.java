package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PY1 extends D {
    public final Object a = new Object();
    public int g = 0;
    public boolean h = false;

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.a) {
            z = this.h;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.a) {
            this.h = true;
            if (this.g == 0) {
                this.a.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.a) {
            z = this.h && this.g == 0;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        synchronized (this.a) {
            while (true) {
                if (this.h && this.g == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long nanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.a, nanos);
                nanos -= System.nanoTime() - nanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            if (this.h) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.g++;
        }
        try {
            runnable.run();
            synchronized (this.a) {
                int i = this.g - 1;
                this.g = i;
                if (i == 0) {
                    this.a.notifyAll();
                }
            }
        } catch (Throwable th) {
            synchronized (this.a) {
                int i2 = this.g - 1;
                this.g = i2;
                if (i2 == 0) {
                    this.a.notifyAll();
                }
                throw th;
            }
        }
    }
}
