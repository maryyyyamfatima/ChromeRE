package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FutureC10588uz1 implements Future {
    public final /* synthetic */ BinderC10931vz1 a;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    public FutureC10588uz1(BinderC10931vz1 binderC10931vz1) {
        this.a = binderC10931vz1;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.a.g != null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Integer num;
        synchronized (this) {
            if (this.a.g == null) {
                wait();
            }
            num = this.a.g;
        }
        return num;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Integer num;
        synchronized (this) {
            if (this.a.g == null) {
                wait(timeUnit.toMillis(j));
            }
            num = this.a.g;
        }
        return num;
    }
}
