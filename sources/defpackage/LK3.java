package defpackage;

import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class LK3 {
    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void a() {
        if (!B10.b && !b()) {
            throw new IllegalStateException(AbstractC4809e90.a("This must run on the main thread; but is running on ", Thread.currentThread().getName()));
        }
    }
}
