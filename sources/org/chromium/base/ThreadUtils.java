package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import defpackage.PT3;
import defpackage.RT3;
import defpackage.WT3;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ThreadUtils {
    public static final Object a = new Object();
    public static Handler b;

    public static Handler b() {
        boolean z;
        synchronized (a) {
            if (b == null) {
                b = new Handler(Looper.getMainLooper());
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            TraceEvent.i.set(true);
            RT3 rt3 = TraceEvent.k;
            if (rt3 != null) {
                rt3.j.set(true);
                if (!h()) {
                    d(new PT3(rt3));
                } else {
                    if (!rt3.n) {
                        Looper.myQueue().addIdleHandler(rt3);
                        rt3.n = true;
                    }
                    rt3.b();
                }
            }
            if (TraceEvent.g) {
                WT3.b();
            }
        }
        return b;
    }

    public static void f(Runnable runnable) {
        if (h()) {
            runnable.run();
            return;
        }
        FutureTask futureTask = new FutureTask(runnable, null);
        b().post(futureTask);
        try {
            futureTask.get();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while waiting for runnable", e);
        }
    }

    public static Object g(Callable callable) {
        try {
            FutureTask futureTask = new FutureTask(callable);
            if (h()) {
                futureTask.run();
            } else {
                b().post(futureTask);
            }
            try {
                return futureTask.get();
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted waiting for callable", e);
            }
        } catch (ExecutionException e2) {
            throw new RuntimeException("Error occurred waiting for callable", e2);
        }
    }

    public static void e(Runnable runnable) {
        if (h()) {
            runnable.run();
        } else {
            b().post(runnable);
        }
    }

    public static void d(Runnable runnable) {
        b().post(runnable);
    }

    public static void a() {
        if (!h()) {
            throw new IllegalStateException("Must be called on the UI thread.");
        }
    }

    public static boolean h() {
        return b().getLooper() == Looper.myLooper();
    }

    public static Looper c() {
        return b().getLooper();
    }

    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }

    public static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }
}
