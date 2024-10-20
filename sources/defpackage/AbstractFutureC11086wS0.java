package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractFutureC11086wS0 extends CS0 implements RD1, Future {
    @Override // defpackage.RD1
    public final void f(Runnable runnable, Executor executor) {
        ((RY1) this).a.f(runnable, executor);
    }

    public final boolean b(boolean z) {
        return ((RY1) this).a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final boolean isCancelled() {
        return ((RY1) this).a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final boolean isDone() {
        return ((RY1) this).a.isDone();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object get() {
        return ((RY1) this).a.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object get(long j, TimeUnit timeUnit) {
        return ((RY1) this).a.get(j, timeUnit);
    }
}
