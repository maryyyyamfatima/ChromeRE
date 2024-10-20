package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KR implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable() { // from class: JR
            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(10);
                runnable.run();
            }
        }, "CrAsyncTask #" + this.a.getAndIncrement());
    }
}
