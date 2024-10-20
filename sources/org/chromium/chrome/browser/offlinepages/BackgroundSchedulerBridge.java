package org.chromium.chrome.browser.offlinepages;

import android.content.Intent;
import android.content.IntentFilter;
import defpackage.AbstractC1779Ns;
import defpackage.AbstractC7808mt;
import defpackage.C1226Jl0;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BackgroundSchedulerBridge {
    public static void unschedule() {
        AbstractC7808mt.b().a(V60.a, 77);
    }

    public static void schedule(TriggerConditions triggerConditions) {
        AbstractC1779Ns.a(triggerConditions, 0L, true);
    }

    public static void backupSchedule(TriggerConditions triggerConditions, long j) {
        AbstractC1779Ns.a(triggerConditions, j * 1000, false);
    }

    public static int getBatteryConditions() {
        int intExtra;
        Intent registerReceiver = V60.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null || (intExtra = registerReceiver.getIntExtra("scale", -1)) == 0) {
            return 0;
        }
        return Math.round((registerReceiver.getIntExtra("level", -1) * 100) / intExtra);
    }

    public static int getNetworkConditions() {
        return C1226Jl0.b(V60.a);
    }

    public static boolean getPowerConditions() {
        Intent registerReceiver = V60.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public static TriggerConditions createTriggerConditions(boolean z, int i, boolean z2) {
        return new TriggerConditions(i, z, z2);
    }
}
