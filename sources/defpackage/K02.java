package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K02 implements ThreadFactory {
    public final String a;
    public final ThreadFactory g = Executors.defaultThreadFactory();

    public K02(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.g.newThread(new RunnableC8255oA2(0, runnable));
        newThread.setName(this.a);
        return newThread;
    }
}
