package com.google.common.util.concurrent;

import defpackage.RQ0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class s extends RQ0 implements i {
    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final Object get() {
        return super.get();
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return super.get(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // com.google.common.util.concurrent.n, defpackage.RD1
    public final void f(Runnable runnable, Executor executor) {
        super.f(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }
}
