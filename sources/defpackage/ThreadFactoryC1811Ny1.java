package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ny1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1811Ny1 implements ThreadFactory {
    public static final AtomicInteger i = new AtomicInteger(1);
    public final AtomicInteger a = new AtomicInteger(1);
    public final int g = 5;
    public final int h = i.getAndIncrement();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new RunnableC1681My1(this, runnable), "ComponentLayoutThread" + this.h + "-" + this.a.getAndIncrement());
        thread.setPriority(10);
        return thread;
    }
}
