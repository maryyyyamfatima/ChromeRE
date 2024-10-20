package org.chromium.chrome.browser.signin.services;

import defpackage.AX;
import defpackage.O83;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FREMobileIdentityConsistencyFieldTrial {
    public static final Object a = new Object();

    public static boolean isEnabled() {
        if (AX.e().g("force-disable-signin-fre")) {
            return false;
        }
        return AX.e().g("force-enable-signin-fre") || getFirstRunTrialGroup().startsWith("Enabled");
    }

    public static String getFirstRunTrialGroup() {
        String i;
        synchronized (a) {
            i = O83.a.i("Chrome.FirstRun.FieldTrialEnabled", "Default");
        }
        return i;
    }

    public static String getFirstRunVariationsTrialGroup() {
        int a2 = a();
        return a2 != 0 ? a2 != 1 ? a2 != 2 ? a2 != 3 ? a2 != 4 ? a2 != 5 ? "Default" : "MakeChromeYourOwn" : "MostOutOfChrome" : "WelcomeToChrome_EasierAcrossDevices" : "WelcomeToChrome_StrongestSecurity" : "WelcomeToChrome_MostOutOfChrome" : "Control";
    }

    public static int a() {
        int f;
        synchronized (a) {
            f = O83.a.f(-1, "Chrome.FirstRun.VariationFieldTrialGroup");
        }
        return f;
    }
}
