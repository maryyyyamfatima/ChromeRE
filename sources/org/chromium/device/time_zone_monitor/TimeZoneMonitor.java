package org.chromium.device.time_zone_monitor;

import android.content.IntentFilter;
import defpackage.V60;
import defpackage.VM3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TimeZoneMonitor {
    public final VM3 a;
    public long b;

    public TimeZoneMonitor(long j) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
        VM3 vm3 = new VM3(this);
        this.a = vm3;
        this.b = j;
        V60.d(V60.a, vm3, intentFilter);
    }

    public static TimeZoneMonitor getInstance(long j) {
        return new TimeZoneMonitor(j);
    }

    public void stop() {
        V60.a.unregisterReceiver(this.a);
        this.b = 0L;
    }
}
