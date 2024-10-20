package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Ru4 {
    public static final String[] a;

    static {
        Uri.parse("https://play.google.com/store/apps/details");
        a = new String[]{"com.google.android.youtube", "com.google.android.youtube.tv", "com.google.android.youtube.googletv", "com.google.android.gms"};
    }

    public static String a(Context context) {
        ServiceInfo serviceInfo;
        String str;
        PackageManager packageManager = context.getPackageManager();
        for (String str2 : a) {
            ResolveInfo resolveService = packageManager.resolveService(new Intent("com.google.android.youtube.api.service.START").setPackage(str2), 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null && (str = serviceInfo.packageName) != null) {
                return str;
            }
        }
        return !packageManager.hasSystemFeature("android.software.leanback") ? !packageManager.hasSystemFeature("com.google.android.tv") ? "com.google.android.youtube" : "com.google.android.youtube.googletv" : "com.google.android.youtube.tv";
    }
}
