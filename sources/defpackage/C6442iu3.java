package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iu3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6442iu3 {
    public static long a() {
        if (AbstractC6100hu3.a) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
