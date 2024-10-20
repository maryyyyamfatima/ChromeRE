package org.chromium.ui.base;

import android.view.InputDevice;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TouchDevice {
    public static boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public static int[] availablePointerAndHoverTypes() {
        InputDevice inputDevice;
        int[] iArr = {0, 0};
        for (int i : InputDevice.getDeviceIds()) {
            try {
                inputDevice = InputDevice.getDevice(i);
            } catch (RuntimeException unused) {
                inputDevice = null;
            }
            if (inputDevice != null) {
                int sources = inputDevice.getSources();
                if (a(sources, 8194) || a(sources, 16386) || a(sources, 1048584) || a(sources, 65540)) {
                    iArr[0] = iArr[0] | 4;
                } else if (a(sources, 4098)) {
                    iArr[0] = iArr[0] | 2;
                }
                if (a(sources, 8194) || a(sources, 1048584) || a(sources, 65540)) {
                    iArr[1] = iArr[1] | 2;
                }
            }
        }
        if (iArr[0] == 0) {
            iArr[0] = 1;
        }
        if (iArr[1] == 0) {
            iArr[1] = 1;
        }
        return iArr;
    }

    public static int maxTouchPoints() {
        if (V60.a.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.jazzhand")) {
            return 5;
        }
        if (V60.a.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct") || V60.a.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch")) {
            return 2;
        }
        return V60.a.getPackageManager().hasSystemFeature("android.hardware.touchscreen") ? 1 : 0;
    }
}
