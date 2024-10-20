package com.google.vr.vrcore.base.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import defpackage.AbstractC7235lD;
import defpackage.AbstractC9072qa3;
import defpackage.C6029hi4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class VrCoreUtils {
    public static int getVrCoreClientApiVersion(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (applicationInfo.enabled) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle.getInt("com.google.vr.vrcore.ClientApiVersion", 0);
                }
                return 0;
            }
            throw new C6029hi4(2);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C6029hi4(a(context));
        }
    }

    public static String b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (applicationInfo == null) {
                throw new C6029hi4(8);
            }
            if (!applicationInfo.enabled) {
                throw new C6029hi4(2);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                throw new C6029hi4(4);
            }
            String string = bundle.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
            if (string.isEmpty()) {
                throw new C6029hi4(4);
            }
            return string.substring(1);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C6029hi4(a(context));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r4) {
        /*
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r1 = "com.google.vr.vrcore"
            boolean r0 = r1.equals(r0)
            r2 = 0
            if (r0 == 0) goto Lf
            goto L83
        Lf:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            boolean r0 = r0.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            if (r0 != 0) goto L1d
            r2 = 2
            goto L83
        L1d:
            boolean r4 = c(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            if (r4 != 0) goto L83
            r2 = 9
            goto L83
        L26:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: java.lang.RuntimeException -> L33
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch: java.lang.RuntimeException -> L33
            java.util.List r0 = r0.getAllSessions()     // Catch: java.lang.RuntimeException -> L33
            goto L55
        L33:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            int r2 = r2 + 45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failure querying package installer sessions: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "VrCoreUtils"
            android.util.Log.w(r2, r0)
            r0 = 0
        L55:
            r2 = 3
            if (r0 == 0) goto L73
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r0.next()
            android.content.pm.PackageInstaller$SessionInfo r3 = (android.content.pm.PackageInstaller.SessionInfo) r3
            java.lang.String r3 = r3.getAppPackageName()
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L5c
            goto L83
        L73:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r0 = 8192(0x2000, float:1.148E-41)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            boolean r4 = r4.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            if (r4 == 0) goto L82
            goto L83
        L82:
            r2 = 1
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.vrcore.base.api.VrCoreUtils.a(android.content.Context):int");
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.vr.vrcore", 64);
        if (AbstractC9072qa3.b(packageInfo, AbstractC9072qa3.a)) {
            return true;
        }
        if (AbstractC7235lD.a != null) {
            booleanValue = AbstractC7235lD.a.booleanValue();
        } else {
            synchronized (AbstractC7235lD.class) {
                if (AbstractC7235lD.a == null) {
                    try {
                        AbstractC7235lD.a = Boolean.valueOf(AbstractC9072qa3.b(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), AbstractC9072qa3.c, AbstractC9072qa3.d, AbstractC9072qa3.b));
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new IllegalStateException("Unable to find self package info", e);
                    }
                }
                booleanValue = AbstractC7235lD.a.booleanValue();
            }
        }
        if (booleanValue) {
            return AbstractC9072qa3.b(packageInfo, AbstractC9072qa3.b);
        }
        return false;
    }
}
