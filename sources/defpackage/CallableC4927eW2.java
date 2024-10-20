package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eW2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC4927eW2 extends AbstractC10248u implements Callable {
    public CallableC4927eW2(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = AbstractC10248u.h;
        this.g = Thread.currentThread();
        try {
            this.a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.g = null;
        }
    }
}
