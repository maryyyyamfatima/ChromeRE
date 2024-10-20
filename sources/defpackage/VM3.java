package defpackage;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.device.time_zone_monitor.TimeZoneMonitor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VM3 extends BroadcastReceiver {
    public final /* synthetic */ TimeZoneMonitor a;

    public VM3(TimeZoneMonitor timeZoneMonitor) {
        this.a = timeZoneMonitor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.TIMEZONE_CHANGED")) {
            TimeZoneMonitor timeZoneMonitor = this.a;
            N.MjxIGcDd(timeZoneMonitor.b, timeZoneMonitor);
        } else {
            AbstractC4851eH1.a("TimeZoneMonitor", "unexpected intent", new Object[0]);
        }
    }
}
