package org.chromium.chrome.browser.policy;

import defpackage.O83;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CloudManagementSharedPreferences {
    public static void deleteDmToken() {
        O83.a.m("Chrome.Policy.CloudManagementDMToken");
    }

    public static String readDmToken() {
        return O83.a.i("Chrome.Policy.CloudManagementDMToken", "");
    }

    public static void saveDmToken(String str) {
        O83.a.t("Chrome.Policy.CloudManagementDMToken", str);
    }
}
