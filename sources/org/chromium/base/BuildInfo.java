package org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.android.chrome.R;
import defpackage.AbstractC6205iD;
import defpackage.AbstractC6547jD;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BuildInfo {
    public static ApplicationInfo m = null;
    public static String n = "";
    public final String a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;

    public static String[] getAll() {
        BuildInfo buildInfo = AbstractC6547jD.a;
        String packageName = V60.a.getPackageName();
        String[] strArr = new String[27];
        strArr[0] = Build.BRAND;
        strArr[1] = Build.DEVICE;
        strArr[2] = Build.ID;
        strArr[3] = Build.MANUFACTURER;
        strArr[4] = Build.MODEL;
        strArr[5] = String.valueOf(Build.VERSION.SDK_INT);
        strArr[6] = Build.TYPE;
        strArr[7] = Build.BOARD;
        strArr[8] = packageName;
        strArr[9] = String.valueOf(buildInfo.b);
        strArr[10] = buildInfo.a;
        strArr[11] = buildInfo.c;
        strArr[12] = String.valueOf(buildInfo.d);
        strArr[13] = buildInfo.e;
        strArr[14] = buildInfo.i;
        strArr[15] = buildInfo.g;
        strArr[16] = buildInfo.f;
        strArr[17] = buildInfo.h;
        strArr[18] = n;
        strArr[19] = buildInfo.j;
        strArr[20] = buildInfo.k;
        strArr[21] = String.valueOf(V60.a.getApplicationInfo().targetSdkVersion);
        strArr[22] = a() ? "1" : "0";
        strArr[23] = buildInfo.l ? "1" : "0";
        strArr[24] = Build.VERSION.INCREMENTAL;
        strArr[25] = Build.HARDWARE;
        strArr[26] = AbstractC6205iD.a() ? "1" : "0";
        return strArr;
    }

    public static boolean b() {
        int i = V60.a.getApplicationInfo().targetSdkVersion;
        return i >= 33 || (AbstractC6205iD.a() && i == 10000);
    }

    public BuildInfo() {
        long j;
        PackageInfo packageInfo;
        String str;
        String str2;
        long j2;
        try {
            Context context = V60.a;
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo2.getLongVersionCode();
            } else {
                j = packageInfo2.versionCode;
            }
            this.b = j;
            this.c = packageName;
            this.d = j;
            String str3 = packageInfo2.versionName;
            String str4 = "";
            this.e = str3 == null ? "" : str3.toString();
            m = context.getApplicationInfo();
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo2.applicationInfo);
            this.a = applicationLabel == null ? "" : applicationLabel.toString();
            String installerPackageName = packageManager.getInstallerPackageName(packageName);
            if (installerPackageName != null) {
                str4 = installerPackageName.toString();
            }
            this.f = str4;
            try {
                packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    j2 = packageInfo.getLongVersionCode();
                } else {
                    j2 = packageInfo.versionCode;
                }
                str = String.valueOf(j2);
            } else {
                str = "gms versionCode not available.";
            }
            this.g = str;
            String str5 = "true";
            try {
                packageManager.getPackageInfo("projekt.substratum", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str5 = "false";
            }
            this.j = str5;
            try {
                str2 = V60.a.getString(R.string.f83750_resource_name_obfuscated_res_0x7f140908);
            } catch (Exception unused3) {
                str2 = "Not found";
            }
            this.k = str2;
            this.h = TextUtils.join(", ", Build.SUPPORTED_ABIS);
            String str6 = Build.FINGERPRINT;
            this.i = str6.substring(0, Math.min(str6.length(), 128));
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                z = true;
            }
            this.l = z;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean a() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
