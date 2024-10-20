package defpackage;

import android.app.ActivityManager;
import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8687pS1 implements InterfaceC0079Ap3 {
    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        int i;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            EI2.f((int) Math.min((SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) / 1000, 2147483647L), 1, 1000000, 50, "Android.MemoryPressureMonitor.GetMyMemoryState.Succeeded.Time");
            int i2 = runningAppProcessInfo.lastTrimLevel;
            if (i2 < 80 && i2 != 15) {
                if (i2 < 40) {
                    return null;
                }
                i = 1;
                return i;
            }
            i = 2;
            return i;
        } catch (Exception unused) {
            EI2.f((int) Math.min((SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) / 1000, 2147483647L), 1, 1000000, 50, "Android.MemoryPressureMonitor.GetMyMemoryState.Failed.Time");
            return null;
        }
    }
}
