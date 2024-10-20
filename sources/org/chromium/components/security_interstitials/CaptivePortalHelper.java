package org.chromium.components.security_interstitials;

import android.net.ConnectivityManager;
import android.net.Network;
import defpackage.V60;
import java.lang.reflect.InvocationTargetException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CaptivePortalHelper {
    public static String getCaptivePortalServerUrl() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) V60.a.getSystemService("connectivity");
            return (String) connectivityManager.getClass().getMethod("getCaptivePortalServerUrl", new Class[0]).invoke(connectivityManager, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return "http://connectivitycheck.gstatic.com/generate_204";
        }
    }

    public static void reportNetworkConnectivity() {
        ConnectivityManager connectivityManager = (ConnectivityManager) V60.a.getSystemService("connectivity");
        for (Network network : connectivityManager.getAllNetworks()) {
            connectivityManager.reportNetworkConnectivity(network, true);
            connectivityManager.reportNetworkConnectivity(network, false);
        }
    }
}
