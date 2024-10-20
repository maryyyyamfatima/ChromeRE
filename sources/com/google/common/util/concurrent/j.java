package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class j extends n implements i {
    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final Object get() {
        return super.get();
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return super.get(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public boolean isDone() {
        return super.isDone();
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // com.google.common.util.concurrent.n, defpackage.RD1
    public void f(Runnable runnable, Executor executor) {
        super.f(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }
}
