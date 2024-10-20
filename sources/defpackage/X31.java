package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class X31 {
    public static boolean a = false;
    public static boolean b = false;
    public static final AtomicBoolean c = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static void b(Context context) {
        C9228r11 c9228r11 = C9228r11.b;
        int c2 = c9228r11.c(context, 8400000);
        if (c2 != 0) {
            Intent b2 = c9228r11.b(c2, context, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + c2);
            if (b2 == null) {
                throw new S31();
            }
            throw new T31(c2, b2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.X31.d(android.content.Context, int):int");
    }

    public static void a(Context context) {
        if (c.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException unused) {
        }
    }

    public static boolean e(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return f(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean f(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (!applicationInfo.enabled) {
                return false;
            }
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            return !(applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile")));
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    public static boolean c(Context context) {
        PackageInfo b2;
        C4437d41 a2;
        try {
            if (!b) {
                try {
                    b2 = C4021br4.a(context).b(64, "com.google.android.gms");
                    a2 = C4437d41.a(context);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                }
                if (b2 != null) {
                    a2.getClass();
                    if (!C4437d41.b(b2, false) && C4437d41.b(b2, true)) {
                        a = true;
                        b = true;
                    }
                }
                a = false;
                b = true;
            }
            return a || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            b = true;
            throw th;
        }
    }
}
