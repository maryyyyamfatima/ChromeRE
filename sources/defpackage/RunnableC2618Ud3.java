package defpackage;

import android.content.IntentFilter;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ud3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2618Ud3 implements Runnable {
    public final /* synthetic */ C3138Yd3 a;

    public RunnableC2618Ud3(C3138Yd3 c3138Yd3) {
        this.a = c3138Yd3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3138Yd3 c3138Yd3 = this.a;
        c3138Yd3.d = c3138Yd3.c();
        try {
            C3138Yd3 c3138Yd32 = this.a;
            c3138Yd32.a.registerReceiver(c3138Yd32.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.a.e = true;
        } catch (SecurityException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e);
            }
            this.a.e = false;
        }
    }
}
