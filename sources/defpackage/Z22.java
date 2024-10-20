package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Z22 {
    public static final Object a = new Object();
    public static volatile ThreadPoolExecutor b;

    public static Executor a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new ThreadPoolExecutor(1, 3, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Y22());
                    b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return b;
    }
}
