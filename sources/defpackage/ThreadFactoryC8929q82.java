package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q82, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC8929q82 implements ThreadFactory {
    public final AtomicInteger g = new AtomicInteger();
    public final ThreadFactory h = Executors.defaultThreadFactory();
    public final String a = "GAC_Executor";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.h.newThread(new RunnableC8255oA2(0, runnable));
        newThread.setName(this.a + "[" + this.g.getAndIncrement() + "]");
        return newThread;
    }
}
