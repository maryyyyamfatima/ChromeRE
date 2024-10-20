package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public abstract class LZ3 {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final Thread b = Looper.getMainLooper().getThread();

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != b) {
            a.post(runnable);
        } else {
            runnable.run();
        }
    }
}
