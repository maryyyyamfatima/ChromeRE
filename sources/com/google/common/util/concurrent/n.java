package com.google.common.util.concurrent;

import defpackage.AbstractC2442Su2;
import defpackage.AbstractC7848n0;
import defpackage.AbstractC8192o0;
import defpackage.AbstractC8823pq1;
import defpackage.EnumC6747jo0;
import defpackage.RD1;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class n extends AbstractC8823pq1 implements RD1 {
    static final boolean a;
    private static final Logger g;
    private static final a h;
    private static final Object i;
    private volatile e listeners;
    private volatile Object value;
    private volatile m waiters;

    public void k() {
    }

    public void p() {
    }

    static {
        boolean z;
        a hVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        a = z;
        Object obj = null;
        g = null;
        try {
            try {
                hVar = new l();
            } catch (Error | RuntimeException e) {
                obj = e;
                hVar = new h();
            }
        } catch (Error | RuntimeException unused2) {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(m.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(m.class, m.class, "next"), AtomicReferenceFieldUpdater.newUpdater(n.class, m.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(n.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "value"));
        }
        h = hVar;
        if (obj != null) {
            Logger logger = g;
            Level level = Level.SEVERE;
            logger.getClass();
        }
        i = new Object();
    }

    public final void s(m mVar) {
        mVar.thread = null;
        while (true) {
            m mVar2 = this.waiters;
            if (mVar2 == m.a) {
                return;
            }
            m mVar3 = null;
            while (mVar2 != null) {
                m mVar4 = mVar2.next;
                if (mVar2.thread != null) {
                    mVar3 = mVar2;
                } else if (mVar3 != null) {
                    mVar3.next = mVar4;
                    if (mVar3.thread == null) {
                        break;
                    }
                } else if (!h.c(this, mVar2, mVar4)) {
                    break;
                }
                mVar2 = mVar4;
            }
            return;
        }
    }

    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof g))) {
            return n(obj);
        }
        long j2 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            m mVar = this.waiters;
            if (mVar != m.a) {
                m mVar2 = new m();
                do {
                    h.f(mVar2, mVar);
                    if (h.c(this, mVar, mVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                s(mVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return n(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        s(mVar2);
                        j2 = 0;
                    } else {
                        mVar = this.waiters;
                    }
                } while (mVar != m.a);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return n(obj3);
        }
        while (nanos > j2) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return n(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
            j2 = 0;
        }
        String nVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String a2 = AbstractC7848n0.a(str, " (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
                String str2 = a2 + convert + " " + lowerCase;
                if (z) {
                    str2 = AbstractC7848n0.a(str2, ",");
                }
                a2 = AbstractC7848n0.a(str2, " ");
            }
            if (z) {
                a2 = a2 + nanos2 + " nanoseconds ";
            }
            str = AbstractC7848n0.a(a2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC7848n0.a(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC8192o0.a(str, " for ", nVar));
    }

    public Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof g))) {
            return n(obj2);
        }
        m mVar = this.waiters;
        if (mVar != m.a) {
            m mVar2 = new m();
            do {
                h.f(mVar2, mVar);
                if (h.c(this, mVar, mVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            s(mVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return n(obj);
                }
                mVar = this.waiters;
            } while (mVar != m.a);
        }
        Object obj3 = this.value;
        Objects.requireNonNull(obj3);
        return n(obj3);
    }

    private static Object n(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        }
        if (obj == i) {
            return null;
        }
        return obj;
    }

    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.value != null);
    }

    public boolean isCancelled() {
        return this.value instanceof b;
    }

    public boolean cancel(boolean z) {
        b bVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (a) {
            bVar = new b(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                bVar = b.c;
            } else {
                bVar = b.d;
            }
            Objects.requireNonNull(bVar);
        }
        n nVar = this;
        boolean z2 = false;
        while (true) {
            if (h.b(nVar, obj, bVar)) {
                if (z) {
                    nVar.p();
                }
                m(nVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                RD1 rd1 = ((g) obj).g;
                if (rd1 instanceof i) {
                    nVar = (n) rd1;
                    obj = nVar.value;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    rd1.cancel(z);
                    return true;
                }
            } else {
                obj = nVar.value;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    public final boolean w() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).a;
    }

    public void f(Runnable runnable, Executor executor) {
        e eVar;
        if (!isDone() && (eVar = this.listeners) != e.c) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.next = eVar;
                if (h.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != e.c);
        }
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            Logger logger = g;
            Level level = Level.SEVERE;
            Objects.toString(runnable);
            Objects.toString(executor);
            logger.getClass();
        }
    }

    public boolean t(Object obj) {
        if (obj == null) {
            obj = i;
        }
        if (!h.b(this, null, obj)) {
            return false;
        }
        m(this);
        return true;
    }

    public boolean u(Throwable th) {
        if (!h.b(this, null, new d(th))) {
            return false;
        }
        m(this);
        return true;
    }

    public boolean v(RD1 rd1) {
        d dVar;
        Object obj = this.value;
        if (obj == null) {
            if (rd1.isDone()) {
                if (!h.b(this, null, o(rd1))) {
                    return false;
                }
                m(this);
                return true;
            }
            g gVar = new g(this, rd1);
            if (h.b(this, null, gVar)) {
                try {
                    rd1.f(gVar, EnumC6747jo0.a);
                } catch (Error | RuntimeException e) {
                    try {
                        dVar = new d(e);
                    } catch (Error | RuntimeException unused) {
                        dVar = d.b;
                    }
                    h.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof b) {
            rd1.cancel(((b) obj).a);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object o(RD1 rd1) {
        Object obj;
        Throwable a2;
        if (rd1 instanceof i) {
            Object obj2 = ((n) rd1).value;
            if (obj2 instanceof b) {
                b bVar = (b) obj2;
                if (bVar.a) {
                    obj2 = bVar.b != null ? new b(false, bVar.b) : b.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((rd1 instanceof AbstractC8823pq1) && (a2 = ((AbstractC8823pq1) rd1).a()) != null) {
            return new d(a2);
        }
        boolean isCancelled = rd1.isCancelled();
        boolean z = true;
        if ((!a) && isCancelled) {
            b bVar2 = b.d;
            Objects.requireNonNull(bVar2);
            return bVar2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = rd1.get();
                    break;
                } catch (Error e) {
                    e = e;
                    return new d(e);
                } catch (CancellationException e2) {
                    if (!isCancelled) {
                        return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + rd1, e2));
                    }
                    return new b(false, e2);
                } catch (RuntimeException e3) {
                    e = e3;
                    return new d(e);
                } catch (ExecutionException e4) {
                    if (isCancelled) {
                        return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + rd1, e4));
                    }
                    return new d(e4.getCause());
                }
            } catch (InterruptedException unused) {
                z2 = z;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? i : obj;
        }
        return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + rd1));
    }

    private void j(StringBuilder sb) {
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
        l(obj, sb);
        sb.append("]");
    }

    public static void m(n nVar) {
        e eVar = null;
        while (true) {
            nVar.getClass();
            for (m e = h.e(nVar, m.a); e != null; e = e.next) {
                Thread thread = e.thread;
                if (thread != null) {
                    e.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            nVar.k();
            e eVar2 = eVar;
            e d = h.d(nVar, e.c);
            e eVar3 = eVar2;
            while (d != null) {
                e eVar4 = d.next;
                d.next = eVar3;
                eVar3 = d;
                d = eVar4;
            }
            while (eVar3 != null) {
                eVar = eVar3.next;
                Runnable runnable = eVar3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    nVar = gVar.a;
                    if (nVar.value == gVar) {
                        if (h.b(nVar, gVar, o(gVar.g))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVar3.b;
                    Objects.requireNonNull(executor);
                    try {
                        executor.execute(runnable);
                    } catch (RuntimeException unused) {
                        Logger logger = g;
                        Level level = Level.SEVERE;
                        Objects.toString(runnable);
                        Objects.toString(executor);
                        logger.getClass();
                    }
                }
                eVar3 = eVar;
            }
            return;
        }
    }

    @Override // defpackage.AbstractC8823pq1
    public final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof d) {
            return ((d) obj).a;
        }
        return null;
    }

    public final void q(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(w());
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            j(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.value;
            if (obj instanceof g) {
                sb.append(", setFuture=[");
                RD1 rd1 = ((g) obj).g;
                try {
                    if (rd1 == this) {
                        sb.append("this future");
                    } else {
                        sb.append(rd1);
                    }
                } catch (RuntimeException | StackOverflowError e) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    str = r();
                    if (AbstractC2442Su2.a(str)) {
                        str = null;
                    }
                } catch (RuntimeException | StackOverflowError e2) {
                    str = "Exception thrown from implementation: " + e2.getClass();
                }
                if (str != null) {
                    sb.append(", info=[");
                    sb.append(str);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                j(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String r() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void l(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }
}
