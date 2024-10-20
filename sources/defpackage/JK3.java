package defpackage;

import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class JK3 {
    public static void a() {
        String a = AbstractC4809e90.a("This must run on the main thread; but is running on ", Thread.currentThread().getName());
        if (AbstractC6944kN2.a) {
            return;
        }
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException(a);
        }
    }
}
