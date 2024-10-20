package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0185Bl {
    public static final ExecutorC11534xl e = new ExecutorC11534xl();
    public static final ExecutorC5470g43 f = new ExecutorC5470g43();
    public static final RejectedExecutionHandlerC0055Al g = new RejectedExecutionHandlerC0055Al();
    public volatile int b = 0;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final C12220zl a = new C12220zl(this, new CallableC11877yl(this));

    public abstract Object b();

    public void i() {
    }

    public abstract void k(Object obj);

    public void l() {
    }

    public final void m(final Object obj) {
        if (this instanceof AbstractC1649Ms) {
            this.b = 2;
        } else {
            ThreadUtils.d(new Runnable() { // from class: wl
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0185Bl abstractC0185Bl = AbstractC0185Bl.this;
                    Object obj2 = obj;
                    if (abstractC0185Bl.h()) {
                        abstractC0185Bl.j(obj2);
                    } else {
                        abstractC0185Bl.k(obj2);
                    }
                    abstractC0185Bl.b = 2;
                }
            });
        }
    }

    public final Object f() {
        String str;
        int i = (this.b != 1 || this.d.get()) ? this.b : 0;
        C12220zl c12220zl = this.a;
        if (i != 2 && ThreadUtils.h()) {
            EI2.h(i, 3, "Android.Jank.AsyncTaskGetOnUiThreadStatus");
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                str = stackTrace[1].getClassName() + '.' + stackTrace[1].getMethodName() + '.';
            } else {
                str = "";
            }
            TraceEvent i2 = TraceEvent.i(str + "AsyncTask.get", null);
            try {
                Object obj = c12220zl.get();
                if (i2 == null) {
                    return obj;
                }
                i2.close();
                return obj;
            } catch (Throwable th) {
                if (i2 != null) {
                    try {
                        i2.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        return c12220zl.get();
    }

    public final Object g(long j, TimeUnit timeUnit) {
        String str;
        int i = (this.b != 1 || this.d.get()) ? this.b : 0;
        C12220zl c12220zl = this.a;
        if (i != 2 && ThreadUtils.h()) {
            EI2.h(i, 3, "Android.Jank.AsyncTaskGetOnUiThreadStatus");
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                str = stackTrace[1].getClassName() + '.' + stackTrace[1].getMethodName() + '.';
            } else {
                str = "";
            }
            TraceEvent i2 = TraceEvent.i(str + "AsyncTask.get", null);
            try {
                Object obj = c12220zl.get(j, timeUnit);
                if (i2 == null) {
                    return obj;
                }
                i2.close();
                return obj;
            } catch (Throwable th) {
                if (i2 != null) {
                    try {
                        i2.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        return c12220zl.get(j, timeUnit);
    }

    public void j(Object obj) {
        i();
    }

    public final boolean h() {
        return this.c.get();
    }

    public final boolean a(boolean z) {
        this.c.set(true);
        return this.a.cancel(z);
    }

    public final void e() {
        if (this.b != 0) {
            int i = this.b;
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.b = 1;
        l();
    }

    public final void c(Executor executor) {
        e();
        executor.execute(this.a);
    }

    public final void d(MF3 mf3) {
        e();
        mf3.b(this.a);
    }
}
