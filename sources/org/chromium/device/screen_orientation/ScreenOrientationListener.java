package org.chromium.device.screen_orientation;

import android.provider.Settings;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ScreenOrientationListener {
    public static boolean isAutoRotateEnabledByUser() {
        return Settings.System.getInt(V60.a.getContentResolver(), "accelerometer_rotation", 0) == 1;
    }
}
