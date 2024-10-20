package defpackage;

import android.os.StrictMode;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HZ0 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ IZ0 g;

    public HZ0(IZ0 iz0, Runnable runnable) {
        this.g = iz0;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IZ0 iz0 = this.g;
        if (iz0.i) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            this.a.run();
        } catch (Throwable th) {
            iz0.h.a(th);
        }
    }
}
