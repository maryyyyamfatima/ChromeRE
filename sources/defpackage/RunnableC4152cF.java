package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4152cF implements InterfaceC3465aF, Runnable {
    public Runnable a;
    public final /* synthetic */ C4496dF g;

    @Override // java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock = this.g.b;
        reentrantLock.lock();
        try {
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public RunnableC4152cF(C4496dF c4496dF, Runnable runnable) {
        this.g = c4496dF;
        this.a = runnable;
    }

    @Override // defpackage.InterfaceC3465aF
    public final void cancel() {
        this.a = null;
    }
}
