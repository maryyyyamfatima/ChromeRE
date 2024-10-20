package defpackage;

import android.content.pm.FeatureInfo;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class WS2 {
    public static Boolean a;

    public static int a(int i) {
        Boolean bool = a;
        if (bool == null && bool == null) {
            if (!"SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
                a = Boolean.FALSE;
            } else {
                FeatureInfo[] systemAvailableFeatures = V60.a.getPackageManager().getSystemAvailableFeatures();
                int length = systemAvailableFeatures.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if ("com.sec.feature.spen_usp".equalsIgnoreCase(systemAvailableFeatures[i2].name)) {
                            a = Boolean.TRUE;
                            break;
                        }
                        i2++;
                    } else {
                        a = Boolean.FALSE;
                        break;
                    }
                }
            }
        }
        if (!a.booleanValue()) {
            return i;
        }
        switch (i) {
            case 211:
                return 0;
            case 212:
                return 1;
            case 213:
                return 2;
            case 214:
                return 3;
            default:
                return i;
        }
    }
}
