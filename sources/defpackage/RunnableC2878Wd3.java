package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wd3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2878Wd3 implements Runnable {
    public final /* synthetic */ C3138Yd3 a;

    public RunnableC2878Wd3(C3138Yd3 c3138Yd3) {
        this.a = c3138Yd3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.a.d;
        C3138Yd3 c3138Yd3 = this.a;
        c3138Yd3.d = c3138Yd3.c();
        if (z != this.a.d) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                boolean z2 = this.a.d;
            }
            C3138Yd3 c3138Yd32 = this.a;
            boolean z3 = c3138Yd32.d;
            c3138Yd32.getClass();
            AbstractC10296u74.h(new RunnableC3008Xd3(c3138Yd32, z3));
        }
    }
}
