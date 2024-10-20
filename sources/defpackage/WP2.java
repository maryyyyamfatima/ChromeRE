package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WP2 {
    public final Handler a = new Handler();
    public Runnable b;
    public Runnable c;
    public long d;

    public WP2() {
        Thread.currentThread();
    }

    public final void a() {
        if (this.c == null || this.b != null) {
            return;
        }
        long max = Math.max(this.d - SystemClock.elapsedRealtime(), 0L);
        VP2 vp2 = new VP2(this);
        this.b = vp2;
        this.a.postDelayed(vp2, max);
    }
}
