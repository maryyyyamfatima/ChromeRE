package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IZ0 implements ThreadFactory {
    public final ThreadFactory a;
    public final String g;
    public final KZ0 h;
    public final boolean i;
    public final AtomicInteger j;

    public IZ0(GZ0 gz0, String str, boolean z) {
        JZ0 jz0 = KZ0.a;
        this.j = new AtomicInteger();
        this.a = gz0;
        this.g = str;
        this.h = jz0;
        this.i = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(new HZ0(this, runnable));
        newThread.setName("glide-" + this.g + "-thread-" + this.j.getAndIncrement());
        return newThread;
    }
}
