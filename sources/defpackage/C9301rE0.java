package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9301rE0 extends AbstractC8959qE0 implements InterfaceC5355fl0 {
    public final Executor h;

    public C9301rE0(ExecutorService executorService) {
        Method method;
        this.h = executorService;
        Method method2 = P20.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executorService instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executorService : null;
            if (scheduledThreadPoolExecutor != null && (method = P20.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.L90
    public final void y(E90 e90, Runnable runnable) {
        try {
            this.h.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            InterfaceC10555ut1 interfaceC10555ut1 = (InterfaceC10555ut1) e90.b(C10212tt1.a);
            if (interfaceC10555ut1 != null) {
                interfaceC10555ut1.u(cancellationException);
            }
            AbstractC1246Jp0.b.y(e90, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.h;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    @Override // defpackage.L90
    public final String toString() {
        return this.h.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9301rE0) && ((C9301rE0) obj).h == this.h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.h);
    }
}
