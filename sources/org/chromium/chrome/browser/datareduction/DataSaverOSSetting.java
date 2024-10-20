package org.chromium.chrome.browser.datareduction;

import android.net.ConnectivityManager;
import android.os.Build;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DataSaverOSSetting {
    public static boolean isDataSaverEnabled() {
        int restrictBackgroundStatus;
        ConnectivityManager connectivityManager = (ConnectivityManager) V60.a.getSystemService("connectivity");
        if (!connectivityManager.isActiveNetworkMetered() || Build.VERSION.SDK_INT < 24) {
            return false;
        }
        restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
        return restrictBackgroundStatus == 3;
    }
}
