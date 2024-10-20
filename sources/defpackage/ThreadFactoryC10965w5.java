package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC10965w5 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC10622v5(runnable), "glide-active-resources");
    }
}
