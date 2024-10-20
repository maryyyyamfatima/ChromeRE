package org.chromium.components.location;

import android.os.Process;
import defpackage.AbstractC9771sd;
import defpackage.NG1;
import defpackage.RG1;
import defpackage.V60;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class LocationSettings {
    public static boolean hasAndroidLocationPermission() {
        RG1.b().getClass();
        if (AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return true;
        }
        return AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public static boolean canPromptForAndroidLocationPermission(WindowAndroid windowAndroid) {
        return windowAndroid.canRequestPermission("android.permission.ACCESS_FINE_LOCATION");
    }

    public static boolean isSystemLocationSettingEnabled() {
        return RG1.b().d();
    }

    public static boolean canPromptToEnableSystemLocationSetting() {
        return RG1.b().a();
    }

    public static void promptToEnableSystemLocationSetting(int i, WindowAndroid windowAndroid, long j) {
        RG1.b().e(i, windowAndroid, new NG1(j));
    }
}
