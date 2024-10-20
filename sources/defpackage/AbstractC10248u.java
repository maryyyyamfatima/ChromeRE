package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10248u extends AtomicReference implements InterfaceC6416iq0 {
    public static final FutureTask h;
    public static final FutureTask i;
    public final Runnable a;
    public Thread g;

    static {
        OV0 ov0 = TV0.b;
        h = new FutureTask(ov0, null);
        i = new FutureTask(ov0, null);
    }

    public AbstractC10248u(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == h || future == (futureTask = i) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.g != Thread.currentThread());
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == h) {
                return;
            }
            if (future2 == i) {
                future.cancel(this.g != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.valueOf(this.a);
    }
}
