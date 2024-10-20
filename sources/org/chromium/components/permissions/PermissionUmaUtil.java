package org.chromium.components.permissions;

import android.content.Intent;
import android.content.IntentFilter;
import defpackage.EI2;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PermissionUmaUtil {
    public static void recordWithBatteryBucket(String str) {
        Intent registerReceiver = V60.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra2 == 0) {
            return;
        }
        EI2.l((int) ((intExtra * 100.0d) / intExtra2), str);
    }
}
