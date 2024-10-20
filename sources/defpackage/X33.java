package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class X33 implements Executor {
    public final Executor a;
    public final ArrayDeque g = new ArrayDeque();
    public int h = 1;
    public long i = 0;
    public final V33 j = new V33(this);

    public X33(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.g) {
            int i = this.h;
            if (i != 4 && i != 3) {
                long j = this.i;
                U33 u33 = new U33(runnable);
                this.g.add(u33);
                this.h = 2;
                try {
                    this.a.execute(this.j);
                    if (this.h != 2) {
                        return;
                    }
                    synchronized (this.g) {
                        if (this.i == j && this.h == 2) {
                            this.h = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.g) {
                        int i2 = this.h;
                        if ((i2 != 1 && i2 != 2) || !this.g.removeLastOccurrence(u33)) {
                            r0 = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || r0) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.g.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
