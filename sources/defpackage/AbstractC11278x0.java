package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11278x0 implements RD1 {
    public static final boolean i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final AbstractC8535p0 j;
    public static final Object k;
    public volatile Object a;
    public volatile C9906t0 g;
    public volatile C10935w0 h;

    static {
        AbstractC8535p0 c10592v0;
        try {
            c10592v0 = new C10249u0(AtomicReferenceFieldUpdater.newUpdater(C10935w0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C10935w0.class, C10935w0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11278x0.class, C10935w0.class, "h"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11278x0.class, C9906t0.class, "g"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11278x0.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c10592v0 = new C10592v0();
        }
        j = c10592v0;
        if (th != null) {
            Level level = Level.SEVERE;
            throw null;
        }
        k = new Object();
    }

    public final void e(C10935w0 c10935w0) {
        c10935w0.a = null;
        while (true) {
            C10935w0 c10935w02 = this.h;
            if (c10935w02 == C10935w0.c) {
                return;
            }
            C10935w0 c10935w03 = null;
            while (c10935w02 != null) {
                C10935w0 c10935w04 = c10935w02.b;
                if (c10935w02.a != null) {
                    c10935w03 = c10935w02;
                } else if (c10935w03 != null) {
                    c10935w03.b = c10935w04;
                    if (c10935w03.a == null) {
                        break;
                    }
                } else if (!j.c(this, c10935w02, c10935w04)) {
                    break;
                }
                c10935w02 = c10935w04;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a4 -> B:33:0x00aa). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11278x0.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if ((obj2 != null) & true) {
            return c(obj2);
        }
        C10935w0 c10935w0 = this.h;
        C10935w0 c10935w02 = C10935w0.c;
        if (c10935w0 != c10935w02) {
            C10935w0 c10935w03 = new C10935w0();
            do {
                AbstractC8535p0 abstractC8535p0 = j;
                abstractC8535p0.d(c10935w03, c10935w0);
                if (abstractC8535p0.c(this, c10935w0, c10935w03)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            e(c10935w03);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (!((obj != null) & true));
                    return c(obj);
                }
                c10935w0 = this.h;
            } while (c10935w0 != c10935w02);
        }
        return c(this.a);
    }

    public static Object c(Object obj) {
        if (obj instanceof C8878q0) {
            Throwable th = ((C8878q0) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C9563s0) {
            throw new ExecutionException(((C9563s0) obj).a);
        }
        if (obj == k) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.a != null) & true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof C8878q0;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C8878q0 c8878q0;
        Object obj = this.a;
        if ((obj == null) | false) {
            if (i) {
                c8878q0 = new C8878q0(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                c8878q0 = C8878q0.b;
            } else {
                c8878q0 = C8878q0.c;
            }
            if (j.b(this, obj, c8878q0)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public static void b(AbstractC11278x0 abstractC11278x0) {
        C10935w0 c10935w0;
        C9906t0 c9906t0;
        do {
            c10935w0 = abstractC11278x0.h;
        } while (!j.c(abstractC11278x0, c10935w0, C10935w0.c));
        while (c10935w0 != null) {
            Thread thread = c10935w0.a;
            if (thread != null) {
                c10935w0.a = null;
                LockSupport.unpark(thread);
            }
            c10935w0 = c10935w0.b;
        }
        do {
            c9906t0 = abstractC11278x0.g;
        } while (!j.a(abstractC11278x0, c9906t0, C9906t0.d));
        C9906t0 c9906t02 = null;
        while (c9906t0 != null) {
            C9906t0 c9906t03 = c9906t0.c;
            c9906t0.c = c9906t02;
            c9906t02 = c9906t0;
            c9906t0 = c9906t03;
        }
        while (c9906t02 != null) {
            C9906t0 c9906t04 = c9906t02.c;
            Runnable runnable = c9906t02.a;
            Executor executor = c9906t02.b;
            try {
                executor.execute(runnable);
                c9906t02 = c9906t04;
            } catch (RuntimeException unused) {
                Level level = Level.SEVERE;
                Objects.toString(runnable);
                Objects.toString(executor);
                throw null;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof C8878q0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = d();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String d() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.RD1
    public final void f(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C9906t0 c9906t0 = this.g;
        C9906t0 c9906t02 = C9906t0.d;
        if (c9906t0 != c9906t02) {
            C9906t0 c9906t03 = new C9906t0(runnable, executor);
            do {
                c9906t03.c = c9906t0;
                if (j.a(this, c9906t0, c9906t03)) {
                    return;
                } else {
                    c9906t0 = this.g;
                }
            } while (c9906t0 != c9906t02);
        }
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            Level level = Level.SEVERE;
            Objects.toString(runnable);
            Objects.toString(executor);
            throw null;
        }
    }
}
