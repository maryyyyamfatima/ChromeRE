package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4496dF {
    public ArrayList a = new ArrayList();
    public final ReentrantLock b = new ReentrantLock(true);

    public final C3809bF b(Callback callback) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            ArrayList arrayList = this.a;
            if (arrayList != null) {
                C3809bF c3809bF = new C3809bF(this, callback);
                arrayList.add(new WeakReference(c3809bF));
                reentrantLock.unlock();
                return c3809bF;
            }
            throw new IllegalStateException("This CallbackController has already been destroyed.");
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final RunnableC4152cF c(Runnable runnable) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            ArrayList arrayList = this.a;
            if (arrayList != null) {
                RunnableC4152cF runnableC4152cF = new RunnableC4152cF(this, runnable);
                arrayList.add(new WeakReference(runnableC4152cF));
                reentrantLock.unlock();
                return runnableC4152cF;
            }
            throw new IllegalStateException("This CallbackController has already been destroyed.");
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void a() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            ArrayList arrayList = this.a;
            if (arrayList != null) {
                Iterator it = AbstractC9048qW.e(arrayList).iterator();
                while (it.hasNext()) {
                    ((InterfaceC3465aF) it.next()).cancel();
                }
                this.a = null;
                reentrantLock.unlock();
                return;
            }
            throw new IllegalStateException("This CallbackController has already been destroyed.");
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
