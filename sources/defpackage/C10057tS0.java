package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10057tS0 extends RQ0 {
    public final RD1 j;

    public C10057tS0(RD1 rd1) {
        this.j = rd1;
    }

    @Override // com.google.common.util.concurrent.n, defpackage.RD1
    public final void f(Runnable runnable, Executor executor) {
        this.j.f(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.j.cancel(z);
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.j.isCancelled();
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final boolean isDone() {
        return this.j.isDone();
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final Object get() {
        return this.j.get();
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.j.get(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.n
    public final String toString() {
        return this.j.toString();
    }
}
