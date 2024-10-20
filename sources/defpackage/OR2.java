package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OR2 extends AtomicLong implements ThreadFactory {
    public final String a;
    public final int g;
    public final boolean h;

    public OR2(String str) {
        this(str, 5, false);
    }

    public OR2(String str, int i, boolean z) {
        this.a = str;
        this.g = i;
        this.h = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread nr2 = this.h ? new NR2(runnable, str) : new Thread(runnable, str);
        nr2.setPriority(this.g);
        nr2.setDaemon(true);
        return nr2;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return Y5.a(new StringBuilder("RxThreadFactory["), this.a, "]");
    }
}
