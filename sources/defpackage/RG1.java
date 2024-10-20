package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Build;
import android.os.UserManager;
import android.provider.Settings;
import org.chromium.base.ThreadUtils;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class RG1 {
    public static SB2 a;
    public static RG1 b;

    public boolean a() {
        return false;
    }

    public static RG1 b() {
        Object obj = ThreadUtils.a;
        if (b == null) {
            SB2 sb2 = a;
            if (sb2 == null) {
                b = new RG1();
            } else {
                b = new TG1(sb2.a.f);
            }
        }
        return b;
    }

    public boolean d() {
        boolean isLocationEnabled;
        Context context = V60.a;
        if (((UserManager) context.getSystemService("user")).hasUserRestriction("no_share_location")) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        isLocationEnabled = locationManager.isLocationEnabled();
        return isLocationEnabled;
    }

    public void e(int i, WindowAndroid windowAndroid, NG1 ng1) {
        ng1.onResult(3);
    }

    public Intent c() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        return intent;
    }
}
