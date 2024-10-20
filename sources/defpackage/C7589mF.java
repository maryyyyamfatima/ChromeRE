package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7589mF implements RD1 {
    public final WeakReference a;
    public final C7245lF g = new C7245lF(this);

    public C7589mF(C6215iF c6215iF) {
        this.a = new WeakReference(c6215iF);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C6215iF c6215iF = (C6215iF) this.a.get();
        boolean cancel = this.g.cancel(z);
        if (cancel && c6215iF != null) {
            c6215iF.a = null;
            c6215iF.b = null;
            c6215iF.c.g(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.g.a instanceof C8878q0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.g.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.g.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.g.get(j, timeUnit);
    }

    @Override // defpackage.RD1
    public final void f(Runnable runnable, Executor executor) {
        this.g.f(runnable, executor);
    }

    public final String toString() {
        return this.g.toString();
    }
}
