package org.chromium.chrome.browser.upgrade;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import defpackage.AbstractC3194Yp;
import defpackage.C7432ln3;
import defpackage.EI2;
import defpackage.QF3;
import org.chromium.base.BundleUtils;
import org.chromium.base.SysUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.upgrade.PackageReplacedBroadcastReceiver;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PackageReplacedBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            VrModuleProvider.e();
            boolean z2 = !BundleUtils.c();
            boolean b = AbstractC3194Yp.b();
            if (SysUtils.c == null) {
                try {
                    C7432ln3 c = C7432ln3.c();
                    try {
                        z = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getTotalBytes() / 1073741824 >= 24;
                        c.close();
                    } catch (Throwable th) {
                        try {
                            c.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (IllegalArgumentException unused2) {
                    z = false;
                }
                SysUtils.c = Boolean.valueOf(z);
            }
            boolean booleanValue = true ^ SysUtils.c.booleanValue();
            if (!z2 && !b && !booleanValue) {
                EI2.h(0, 4, "Android.AutofillAssistant.FeatureModuleInstallation");
                AbstractC3194Yp.a.e();
            }
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            PostTask.c(QF3.h, new Runnable() { // from class: dg2
                @Override // java.lang.Runnable
                public final void run() {
                    int i = PackageReplacedBroadcastReceiver.a;
                    Object obj = VI.e;
                    VI vi = UI.a;
                    boolean z3 = true;
                    if (vi.c && vi.b.f(-1, "channels_version_key") != vi.d) {
                        vi.a();
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 26) {
                        ApplicationInfo applicationInfo = V60.a.getApplicationInfo();
                        if (i2 <= 29 && (applicationInfo.flags & 1) == 0) {
                            z3 = false;
                        }
                        if (!z3) {
                            AbstractC4674dm0.a(Runtime.getRuntime());
                        }
                    }
                    goAsync.finish();
                }
            });
        }
    }
}
