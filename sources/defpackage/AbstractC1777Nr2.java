package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nr2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1777Nr2 {
    public static String c(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return str;
        }
        try {
            PermissionInfo permissionInfo = V60.a.getPackageManager().getPermissionInfo(str, 128);
            return !TextUtils.isEmpty(permissionInfo.group) ? permissionInfo.group : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return str;
        }
    }

    public static long a() {
        return T60.a.getLong("AndroidPermissionRequestTimestamp::" + c("android.permission.POST_NOTIFICATIONS"), 0L);
    }

    public static String b(String str) {
        return "HasRequestedAndroidPermission::" + c(str);
    }
}
