package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4774e31 {
    public static boolean a;

    public static boolean a(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            C7928nE c7928nE = UN.a;
            boolean z = true;
            if (N.M09VlOh_("CacheDeprecatedSystemLocationSetting")) {
                if (a) {
                    return true;
                }
                boolean z2 = E44.a(context) == 1;
                a = z2;
                if (!z2 && (!AbstractC3017Xf2.b(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536).isEmpty())) {
                    z = false;
                }
                return z;
            }
            if (E44.a(context) != 1 && (!AbstractC3017Xf2.b(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536).isEmpty())) {
                z = false;
            }
            return z;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }
}
