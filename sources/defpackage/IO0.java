package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IO0 implements Runnable {
    public final /* synthetic */ JO0 a;

    public IO0(JO0 jo0) {
        this.a = jo0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isLoggable = Log.isLoggable("FirstFrameAndTrim", 2);
        JO0 jo0 = this.a;
        if (isLoggable) {
            boolean z = jo0.g.g;
        }
        if (jo0.g.g) {
            O51 o51 = jo0.a;
            o51.getClass();
            AbstractC10296u74.a();
            o51.f.set(true);
        }
    }
}
