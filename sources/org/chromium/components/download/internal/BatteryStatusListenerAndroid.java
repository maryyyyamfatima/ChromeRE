package org.chromium.components.download.internal;

import android.content.Intent;
import android.content.IntentFilter;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BatteryStatusListenerAndroid {
    public static int getBatteryPercentage() {
        int intExtra;
        Intent registerReceiver = V60.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null || (intExtra = registerReceiver.getIntExtra("scale", -1)) == 0) {
            return 0;
        }
        return (int) Math.round((registerReceiver.getIntExtra("level", -1) * 100.0d) / intExtra);
    }
}
