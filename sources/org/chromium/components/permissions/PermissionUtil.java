package org.chromium.components.permissions;

import J.N;
import android.os.Build;
import defpackage.AbstractC6205iD;
import defpackage.C6861k72;
import defpackage.V60;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PermissionUtil {
    public static final String[] a = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] b = {"android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] c = {"android.permission.ACCESS_FINE_LOCATION"};
    public static final String[] d = {"android.permission.CAMERA"};
    public static final String[] e = {"android.permission.RECORD_AUDIO"};
    public static final String[] f = {"android.permission.POST_NOTIFICATIONS"};
    public static final String[] g = new String[0];

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean doesAppLevelSettingsAllowSiteNotifications() {
        /*
            Y60 r0 = defpackage.Y60.a
            r1 = 0
            if (r0 == 0) goto L42
            s72 r0 = defpackage.Y60.a()
            r2 = 1
            if (r0 != 0) goto Ld
            goto L3c
        Ld:
            android.content.Context r3 = defpackage.V60.a
            k72 r4 = new k72
            r4.<init>(r3)
            boolean r3 = r4.a()
            boolean r4 = defpackage.AbstractC6205iD.a()
            if (r4 != 0) goto L1f
            goto L3f
        L1f:
            org.chromium.ui.permissions.AndroidPermissionDelegate r0 = r0.a
            java.lang.String r3 = "android.permission.POST_NOTIFICATIONS"
            boolean r4 = r0.hasPermission(r3)
            if (r4 == 0) goto L2a
            goto L3c
        L2a:
            nE r4 = defpackage.UN.a
            java.lang.String r4 = "NotificationPermissionVariant"
            java.lang.String r5 = "permission_request_allow_site_notification_requests"
            boolean r4 = J.N.M6bsIDpc(r4, r5, r2)
            boolean r0 = r0.canRequestPermission(r3)
            if (r4 == 0) goto L3e
            if (r0 == 0) goto L3e
        L3c:
            r3 = r2
            goto L3f
        L3e:
            r3 = r1
        L3f:
            if (r3 == 0) goto L42
            r1 = r2
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.permissions.PermissionUtil.doesAppLevelSettingsAllowSiteNotifications():boolean");
    }

    public static boolean areAppLevelNotificationsEnabled() {
        return new C6861k72(V60.a).a();
    }

    public static String[] getRequiredAndroidPermissionsForContentSetting(int i) {
        if (i == 4) {
            if (Build.VERSION.SDK_INT >= 31 && N.Mvpau744("AndroidApproximateLocationPermissionSupport")) {
                return (String[]) Arrays.copyOf(b, 1);
            }
            return (String[]) Arrays.copyOf(a, 2);
        }
        String[] strArr = g;
        if (i == 5) {
            return AbstractC6205iD.a() ? (String[]) Arrays.copyOf(f, 1) : strArr;
        }
        if (i != 8) {
            return (i == 9 || i == 57) ? (String[]) Arrays.copyOf(d, 1) : strArr;
        }
        return (String[]) Arrays.copyOf(e, 1);
    }

    public static String[] getOptionalAndroidPermissionsForContentSetting(int i) {
        String[] strArr = g;
        if (i != 4) {
            return strArr;
        }
        return Build.VERSION.SDK_INT >= 31 && N.Mvpau744("AndroidApproximateLocationPermissionSupport") ? (String[]) Arrays.copyOf(c, 1) : strArr;
    }
}
