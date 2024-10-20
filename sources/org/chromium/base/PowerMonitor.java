package org.chromium.base;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import defpackage.C3107Xx2;
import defpackage.C3367Zx2;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PowerMonitor {
    public static PowerMonitor b;
    public boolean a;

    public static void a() {
        PowerManager powerManager;
        Object obj = ThreadUtils.a;
        if (b != null) {
            return;
        }
        Context context = V60.a;
        b = new PowerMonitor();
        Intent d = V60.d(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (d != null) {
            b.a = d.getIntExtra("plugged", 0) == 0;
            N.MCImhGql();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        V60.d(context, new C3107Xx2(), intentFilter);
        if (Build.VERSION.SDK_INT < 29 || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return;
        }
        powerManager.addThermalStatusListener(new C3367Zx2());
    }

    public static boolean isBatteryPower() {
        if (b == null) {
            a();
        }
        return b.a;
    }

    public static int getRemainingBatteryCapacity() {
        if (b == null) {
            a();
        }
        return ((BatteryManager) V60.a.getSystemService("batterymanager")).getIntProperty(1);
    }

    public static int getCurrentThermalStatus() {
        int currentThermalStatus;
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        if (b == null) {
            a();
        }
        PowerManager powerManager = (PowerManager) V60.a.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        currentThermalStatus = powerManager.getCurrentThermalStatus();
        return currentThermalStatus;
    }
}
