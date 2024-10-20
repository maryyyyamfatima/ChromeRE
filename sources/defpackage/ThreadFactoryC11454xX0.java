package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC11454xX0 implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, AbstractC9076qb1.a("gcm-task#", this.a.getAndIncrement()));
        thread.setPriority(4);
        return thread;
    }
}
