package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: si1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9803si1 implements RD1 {
    public static final C9803si1 g = new C9803si1(null);
    public final Object a;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public C9803si1(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.RD1
    public final void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            Level level = Level.SEVERE;
            Objects.toString(runnable);
            Objects.toString(executor);
            throw null;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.a + "]]";
    }
}
