package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1735Nj0 extends AbstractC8959qE0 implements Executor {
    public static final ExecutorC1735Nj0 h = new ExecutorC1735Nj0();
    public static final RunnableC11345xB1 i;

    @Override // defpackage.L90
    public final String toString() {
        return "Dispatchers.IO";
    }

    static {
        B14 b14 = B14.h;
        int i2 = AbstractC1144Iu3.a;
        if (64 >= i2) {
            i2 = 64;
        }
        int b = AbstractC1014Hu3.b("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        b14.getClass();
        if (b >= 1) {
            i = new RunnableC11345xB1(b14, b);
            return;
        }
        throw new IllegalArgumentException(AbstractC0087Ar1.g(Integer.valueOf(b), "Expected positive parallelism level, but got ").toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y(C7221lA0.a, runnable);
    }

    @Override // defpackage.L90
    public final void y(E90 e90, Runnable runnable) {
        i.y(e90, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }
}
