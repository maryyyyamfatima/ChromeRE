package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import defpackage.AbstractC9771sd;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RadioUtils {
    public static Boolean a;
    public static Boolean b;

    public static boolean isSupported() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        if (a == null) {
            a = Boolean.valueOf(AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!a.booleanValue()) {
            return false;
        }
        if (b == null) {
            b = Boolean.valueOf(AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "android.permission.ACCESS_WIFI_STATE") == 0);
        }
        return b.booleanValue();
    }

    public static int getCellDataActivity() {
        TraceEvent i = TraceEvent.i("RadioUtils::getCellDataActivity", null);
        try {
            try {
                int dataActivity = ((TelephonyManager) V60.a.getSystemService("phone")).getDataActivity();
                if (i != null) {
                    i.close();
                }
                return dataActivity;
            } catch (SecurityException unused) {
                if (i == null) {
                    return -1;
                }
                i.close();
                return -1;
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }

    public static int getCellSignalLevel() {
        SignalStrength signalStrength;
        TraceEvent i = TraceEvent.i("RadioUtils::getCellSignalLevel", null);
        try {
            int i2 = -1;
            try {
                signalStrength = ((TelephonyManager) V60.a.getSystemService("phone")).getSignalStrength();
                if (signalStrength != null) {
                    i2 = signalStrength.getLevel();
                }
            } catch (SecurityException unused) {
            }
            if (i != null) {
                i.close();
            }
            return i2;
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean isWifiConnected() {
        TraceEvent i = TraceEvent.i("RadioUtils::isWifiConnected", null);
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) V60.a.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                if (i != null) {
                    i.close();
                }
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                if (i != null) {
                    i.close();
                }
                return false;
            }
            boolean hasTransport = networkCapabilities.hasTransport(1);
            if (i != null) {
                i.close();
            }
            return hasTransport;
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
