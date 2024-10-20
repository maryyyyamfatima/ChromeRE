package org.chromium.device.sensors;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.V60;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PlatformSensorProvider {
    public SensorManager a;
    public HandlerThread b;
    public Handler c;
    public final HashSet d = new HashSet();

    public PlatformSensorProvider(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
    }

    public static PlatformSensorProvider create() {
        return new PlatformSensorProvider(V60.a);
    }

    public void setSensorManagerToNullForTesting() {
        this.a = null;
    }

    public boolean hasSensorType(int i) {
        if (this.a == null) {
            return false;
        }
        int i2 = 5;
        if (i != 0) {
            int i3 = 11;
            if (i != 9) {
                if (i != 11) {
                    i3 = 2;
                    if (i == 2) {
                        i2 = 1;
                    } else if (i == 3) {
                        i2 = 10;
                    } else if (i == 4) {
                        i2 = 9;
                    } else if (i == 5) {
                        i2 = 4;
                    } else if (i != 6) {
                        return false;
                    }
                } else {
                    i2 = 15;
                }
            }
            i2 = i3;
        }
        return !r0.getSensorList(i2).isEmpty();
    }
}
