package org.chromium.base.task;

import J.N;
import defpackage.C2390Sk0;
import defpackage.InterfaceC8967qF3;
import defpackage.MR;
import defpackage.N33;
import defpackage.PF3;
import defpackage.QF3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PostTask {
    public static volatile boolean c;
    public static final AtomicReferenceArray e;
    public static final Object a = new Object();
    public static ArrayList b = new ArrayList();
    public static final MR d = new MR();

    static {
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(5);
        atomicReferenceArray.set(0, new C2390Sk0());
        e = atomicReferenceArray;
    }

    public static void c(QF3 qf3, Runnable runnable) {
        b(qf3, runnable, 0L);
    }

    public static void b(QF3 qf3, Runnable runnable, long j) {
        if (!c || qf3.f) {
            ((InterfaceC8967qF3) e.get(qf3.d)).c(qf3, runnable, j);
            return;
        }
        if (!qf3.c) {
            if (!(qf3.d != 0)) {
                QF3 qf32 = new QF3(qf3);
                qf32.c = true;
                qf3 = qf32;
            }
        }
        N.MTILOhAQ(qf3.a, qf3.b, qf3.c, qf3.d, qf3.e, runnable, j, runnable.getClass().getName());
    }

    public static Object e(QF3 qf3, Callable callable) {
        FutureTask futureTask = new FutureTask(callable);
        d(qf3, futureTask);
        try {
            return futureTask.get();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void f(QF3 qf3, Runnable runnable) {
        FutureTask futureTask = new FutureTask(runnable, null);
        d(qf3, futureTask);
        try {
            futureTask.get();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static N33 a(QF3 qf3) {
        return ((InterfaceC8967qF3) e.get(qf3.d)).b(qf3);
    }

    public static void d(QF3 qf3, Runnable runnable) {
        if (!((InterfaceC8967qF3) e.get(qf3.d)).d(qf3)) {
            b(qf3, runnable, 0L);
        } else {
            runnable.run();
        }
    }

    public static void onNativeSchedulerReady() {
        ArrayList arrayList;
        c = true;
        synchronized (a) {
            arrayList = b;
            b = null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((PF3) it.next()).e();
        }
    }

    public static void onNativeSchedulerShutdownForTesting() {
        synchronized (a) {
            b = new ArrayList();
        }
        c = false;
        e.set(0, new C2390Sk0());
        int i = 1;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = e;
            if (i >= atomicReferenceArray.length()) {
                return;
            }
            atomicReferenceArray.set(i, null);
            i++;
        }
    }
}
