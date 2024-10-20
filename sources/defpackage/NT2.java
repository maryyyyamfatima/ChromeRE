package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NT2 implements Runnable {
    public final Runnable a;

    public NT2(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Exception e) {
            Log.e(AbstractC6574jI1.b("Executor"), "Background execution failure.", e);
        }
    }
}
