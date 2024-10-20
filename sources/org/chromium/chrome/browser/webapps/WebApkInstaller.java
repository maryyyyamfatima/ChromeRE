package org.chromium.chrome.browser.webapps;

import J.N;
import android.graphics.Bitmap;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC4983eg2;
import defpackage.C1537Lv2;
import defpackage.C6041hk4;
import defpackage.C6384ik4;
import defpackage.C6727jk4;
import defpackage.EI2;
import defpackage.V60;
import org.chromium.chrome.browser.AppHooks;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebApkInstaller {
    public long a;
    public final C1537Lv2 b = AppHooks.get().v();
    public final String c = AppHooks.get().z();

    public WebApkInstaller(long j) {
        this.a = j;
    }

    public static WebApkInstaller create(long j) {
        return new WebApkInstaller(j);
    }

    public final void destroy() {
        this.a = 0L;
    }

    public final void installWebApkAsync(String str, int i, String str2, String str3, int i2, Bitmap bitmap) {
        if (AbstractC4983eg2.d(V60.a, str)) {
            a(0);
            return;
        }
        C1537Lv2 c1537Lv2 = this.b;
        if (c1537Lv2 == null) {
            a(3);
            EI2.h(1, 16, "WebApk.Install.GooglePlayInstallResult");
        } else {
            c1537Lv2.c(str, i, str2, str3, new C6041hk4(this, str, i2), true);
        }
    }

    public final void a(int i) {
        long j = this.a;
        if (j != 0) {
            N.MQ3SBZxh(j, this, i);
        }
    }

    public final void updateAsync(String str, int i, String str2, String str3) {
        C1537Lv2 c1537Lv2 = this.b;
        if (c1537Lv2 == null) {
            a(3);
        } else {
            c1537Lv2.c(str, i, str2, str3, new C6384ik4(this), false);
        }
    }

    public final void checkFreeSpace() {
        new C6727jk4(this).c(AbstractC0185Bl.e);
    }

    public final String getWebApkServerUrl() {
        return this.c;
    }
}
