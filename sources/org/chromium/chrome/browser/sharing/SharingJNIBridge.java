package org.chromium.chrome.browser.sharing;

import android.telephony.TelephonyManager;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SharingJNIBridge {
    public static boolean isTelephonySupported() {
        return ((TelephonyManager) V60.a.getSystemService("phone")).getPhoneType() != 0;
    }
}
