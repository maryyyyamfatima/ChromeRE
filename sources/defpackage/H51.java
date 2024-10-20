package defpackage;

import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H51 implements Runnable, InterfaceC6416iq0 {
    public final Handler a;
    public final Runnable g;

    public H51(Handler handler, Runnable runnable) {
        this.a = handler;
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.g.run();
        } catch (Throwable th) {
            MR2.b(th);
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.a.removeCallbacks(this);
    }
}
