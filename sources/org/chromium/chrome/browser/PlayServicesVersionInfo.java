package org.chromium.chrome.browser;

import android.content.Context;
import android.content.pm.PackageManager;
import defpackage.C4502dG0;
import defpackage.C8543p11;
import defpackage.U44;
import defpackage.V60;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PlayServicesVersionInfo {
    public static String getGmsInfo() {
        int i;
        String str;
        Context context = V60.a;
        long j = C8543p11.e;
        try {
            i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = 0;
        }
        long j2 = i;
        if (C4502dG0.b.a(new U44())) {
            str = "1p";
        } else {
            str = C4502dG0.b() ? "3p" : "none";
        }
        return String.format(Locale.US, "SDK=%s; Installed=%s; Access=%s", Long.valueOf(j), Long.valueOf(j2), str);
    }
}
