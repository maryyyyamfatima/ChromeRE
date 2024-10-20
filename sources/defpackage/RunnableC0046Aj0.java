package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Aj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0046Aj0 extends AbstractC8268oD0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC0046Aj0 l;
    public static final long m;

    @Override // defpackage.AbstractC8611pD0
    public final Thread M() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // defpackage.AbstractC8268oD0
    public final void V(Runnable runnable) {
        if (!(debugStatus == 4)) {
            super.V(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void h0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            g0();
            notifyAll();
        }
    }

    @Override // defpackage.AbstractC8268oD0, defpackage.AbstractC8611pD0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    static {
        Long l2;
        RunnableC0046Aj0 runnableC0046Aj0 = new RunnableC0046Aj0();
        l = runnableC0046Aj0;
        runnableC0046Aj0.O(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        m = timeUnit.toNanos(l2.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        AbstractC10706vK3.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    z = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z = true;
                }
            }
            if (!z) {
                _thread = null;
                h0();
                if (a0()) {
                    return;
                }
                M();
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long c0 = c0();
                if (c0 == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = m + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        h0();
                        if (a0()) {
                            return;
                        }
                        M();
                        return;
                    }
                    if (c0 > j2) {
                        c0 = j2;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (c0 > 0) {
                    int i2 = debugStatus;
                    if (i2 == 2 || i2 == 3) {
                        _thread = null;
                        h0();
                        if (a0()) {
                            return;
                        }
                        M();
                        return;
                    }
                    LockSupport.parkNanos(this, c0);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            h0();
            if (!a0()) {
                M();
            }
            throw th;
        }
    }
}
