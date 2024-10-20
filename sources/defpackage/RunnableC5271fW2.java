package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fW2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5271fW2 extends AtomicReferenceArray implements Runnable, Callable, InterfaceC6416iq0 {
    public static final Object g = new Object();
    public static final Object h = new Object();
    public static final Object i = new Object();
    public static final Object j = new Object();
    public final Runnable a;

    public RunnableC5271fW2(Runnable runnable, InterfaceC7103kq0 interfaceC7103kq0) {
        super(3);
        this.a = runnable;
        lazySet(0, interfaceC7103kq0);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean compareAndSet;
        Object obj2;
        Object obj3;
        Object obj4 = i;
        Object obj5 = h;
        Object obj6 = g;
        Object obj7 = j;
        lazySet(2, Thread.currentThread());
        try {
            this.a.run();
        } finally {
            try {
                lazySet(2, null);
                obj2 = get(0);
                if (obj2 != obj6) {
                    ((InterfaceC7103kq0) obj2).c(this);
                }
                do {
                    obj3 = get(1);
                    if (obj3 != obj5) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj3, obj7));
            } catch (Throwable th) {
                do {
                    if (obj == obj5 || obj == obj4) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj2 = get(0);
        if (obj2 != obj6 && compareAndSet(0, obj2, obj7) && obj2 != null) {
            ((InterfaceC7103kq0) obj2).c(this);
        }
        do {
            obj3 = get(1);
            if (obj3 != obj5 || obj3 == obj4) {
                return;
            }
        } while (!compareAndSet(1, obj3, obj7));
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == j) {
                return;
            }
            if (obj == h) {
                future.cancel(false);
                return;
            } else if (obj == i) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = j;
            if (obj6 == obj || obj6 == (obj4 = h) || obj6 == (obj5 = i)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = g) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((InterfaceC7103kq0) obj2).c(this);
    }
}
