package com.google.vr.ndk.base;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import android.view.Window;
import com.android.chrome.R;
import defpackage.G9;
import defpackage.H9;
import defpackage.J9;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class AndroidCompat {
    private AndroidCompat() {
    }

    public static boolean setVrModeEnabled(Activity activity, boolean z) {
        boolean z2;
        char c;
        int i = J9.a;
        boolean z3 = true;
        if ((Build.VERSION.SDK_INT >= 24) && activity.getPackageManager().hasSystemFeature("android.software.vr.mode")) {
            try {
                activity.setVrModeEnabled(z, new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService"));
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("No VR service component: ");
                sb.append(valueOf);
                Log.w("J9", sb.toString());
                if ((Build.VERSION.SDK_INT >= 24) && activity.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                    Iterator<ApplicationInfo> it = activity.getPackageManager().getInstalledApplications(0).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        }
                        if (it.next().packageName.equals("com.google.vr.vrcore")) {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                        String string = Settings.Secure.getString(activity.getContentResolver(), "enabled_vr_listeners");
                        c = (string == null || !string.contains(new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService").flattenToString())) ? (char) 65534 : (char) 0;
                    } else {
                        c = 65535;
                    }
                    String str = Build.HARDWARE;
                    if (!("goldfish".equals(str) || "ranchu".equals(str))) {
                        if (c == 65535) {
                            J9.a(activity, R.string.f72180_resource_name_obfuscated_res_0x7f1403ff, R.string.f74170_resource_name_obfuscated_res_0x7f1404d9, new G9(activity));
                        } else if (c == 65534) {
                            J9.a(activity, R.string.f72170_resource_name_obfuscated_res_0x7f1403fe, R.string.f74180_resource_name_obfuscated_res_0x7f1404da, new H9(activity));
                        }
                        z3 = false;
                    }
                    if (z3) {
                        Log.w("J9", "Failed to handle missing VrCore package.");
                    }
                }
            } catch (UnsupportedOperationException e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 23);
                sb2.append("Failed to set VR mode: ");
                sb2.append(valueOf2);
                Log.w("J9", sb2.toString());
            }
        }
        return false;
    }

    public static void setSustainedPerformanceMode(Activity activity, boolean z) {
        boolean isSustainedPerformanceModeSupported;
        int i = J9.a;
        if (Build.VERSION.SDK_INT >= 24) {
            isSustainedPerformanceModeSupported = ((PowerManager) activity.getSystemService("power")).isSustainedPerformanceModeSupported();
            if (isSustainedPerformanceModeSupported) {
                Window window = activity.getWindow();
                if (window == null) {
                    Log.e("J9", "Activity does not have a window");
                } else {
                    window.setSustainedPerformanceMode(z);
                }
            }
        }
    }
}
