package org.chromium.chrome.browser.webapps;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import defpackage.AbstractC3641al4;
import defpackage.InterfaceC4322ck4;
import defpackage.RR;
import defpackage.V60;
import org.chromium.chrome.browser.webapps.WebApkHandlerDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebApkHandlerDelegate {
    public long a;

    public WebApkHandlerDelegate(long j) {
        this.a = j;
    }

    public static WebApkHandlerDelegate create(long j) {
        return new WebApkHandlerDelegate(j);
    }

    public void reset() {
        this.a = 0L;
    }

    public void retrieveWebApks() {
        if (this.a == 0) {
            return;
        }
        Context context = V60.a;
        for (final PackageInfo packageInfo : context.getPackageManager().getInstalledPackages(0)) {
            if (AbstractC3641al4.c(context, packageInfo.packageName) != 0) {
                RR.a(packageInfo.packageName, new InterfaceC4322ck4() { // from class: Yj4
                    @Override // defpackage.InterfaceC4322ck4
                    public final void a(String str, boolean z) {
                        boolean z2;
                        String str2;
                        long j;
                        long j2;
                        String str3;
                        WebApkHandlerDelegate webApkHandlerDelegate = WebApkHandlerDelegate.this;
                        if (webApkHandlerDelegate.a == 0) {
                            return;
                        }
                        Intent intent = new Intent();
                        PackageInfo packageInfo2 = packageInfo;
                        Kn4 c = Kn4.c(AbstractC7071kk4.b(intent, packageInfo2.packageName, "", 0, false, false, null, null));
                        if (c == null) {
                            return;
                        }
                        C12237zn4 c2 = Wn4.a.c(c.i());
                        String str4 = "Not updatable";
                        if (c2 != null) {
                            SharedPreferences sharedPreferences = c2.b;
                            long j3 = sharedPreferences.getLong("last_check_web_manifest_update_time", 0L);
                            long j4 = sharedPreferences.getLong("last_update_request_complete_time", 0L);
                            boolean z3 = sharedPreferences.getBoolean("relax_updates", false);
                            String string = sharedPreferences.getString("webapk_package_name", null);
                            if (!((string == null || string.startsWith("org.chromium.webapk")) ? false : true)) {
                                if (sharedPreferences.getBoolean("update_scheduled", false)) {
                                    str3 = "Scheduled";
                                } else if (sharedPreferences.getBoolean("should_force_update", false)) {
                                    str3 = "Pending";
                                } else {
                                    str3 = sharedPreferences.getLong("last_update_request_complete_time", 0L) != 0 ? sharedPreferences.getBoolean("did_last_update_request_succeed", false) : true ? "Succeeded" : "Failed";
                                }
                                str4 = str3;
                            }
                            str2 = str4;
                            j = j3;
                            j2 = j4;
                            z2 = z3;
                        } else {
                            z2 = false;
                            str2 = "Not updatable";
                            j = 0;
                            j2 = 0;
                        }
                        N.MXibFIFs(webApkHandlerDelegate.a, c.n(), c.p(), c.t(), c.i(), c.e().d, packageInfo2.versionCode, c.s(), c.o(), c.m(), c.e().f, c.d(), c.f().h, c.r(), c.b(), j, j2, z2, str, z, str2);
                    }
                });
            }
        }
    }
}
