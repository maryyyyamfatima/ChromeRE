package org.chromium.chrome.browser.webapps;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.android.chrome.R;
import defpackage.AbstractC7759mk4;
import defpackage.C4705dr2;
import defpackage.C6861k72;
import defpackage.V60;
import defpackage.ZN3;
import org.chromium.components.webapps.WebappsIconUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebApkInstallService {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r7, java.lang.String r8, java.lang.String r9, android.graphics.Bitmap r10, java.lang.String r11, defpackage.C4705dr2 r12, boolean r13) {
        /*
            android.content.Context r0 = defpackage.V60.a
            r1 = 0
            r2 = 1
            if (r13 == 0) goto L14
            nE r3 = defpackage.UN.a
            java.lang.String r3 = "WebApkInstallCompleteNotification"
            boolean r3 = J.N.M09VlOh_(r3)
            if (r3 == 0) goto L14
            java.lang.String r3 = "twa_disclosure_initial"
            r4 = r2
            goto L17
        L14:
            java.lang.String r3 = "browser"
            r4 = r1
        L17:
            if (r13 == 0) goto L1c
            r13 = 31
            goto L1e
        L1c:
            r13 = 30
        L1e:
            n72 r5 = new n72
            java.lang.String r6 = "webapk_install_notification_tag_prefix."
            java.lang.String r7 = defpackage.AbstractC4809e90.a(r6, r7)
            r6 = -1
            r5.<init>(r13, r7, r6)
            PO r7 = defpackage.X72.a(r3, r5)
            K62 r3 = r7.a
            r3.f(r8)
            K62 r8 = r7.a
            r8.e(r11)
            r8.i(r10)
            r10 = 2131296729(0x7f0901d9, float:1.8211383E38)
            r7.l(r10)
            r7.f(r12)
            r8.k = r4
            long r10 = java.lang.System.currentTimeMillis()
            android.app.Notification r12 = r8.E
            r12.when = r10
            java.lang.String r9 = J.N.MR6Af3ZS(r9, r2)
            r7.n(r9)
            r8.d(r2)
            W72 r7 = r7.d()
            k72 r8 = new k72
            r8.<init>(r0)
            android.app.Notification r9 = r7.a
            if (r9 != 0) goto L6f
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "NotifManagerProxy"
            java.lang.String r10 = "Failed to create notification."
            defpackage.AbstractC4851eH1.a(r8, r10, r7)
            goto L78
        L6f:
            n72 r7 = r7.b
            java.lang.String r10 = r7.b
            int r7 = r7.c
            r8.c(r10, r7, r9)
        L78:
            V72 r7 = defpackage.U72.a
            r7.b(r13, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.webapps.WebApkInstallService.a(java.lang.String, java.lang.String, java.lang.String, android.graphics.Bitmap, java.lang.String, dr2, boolean):void");
    }

    public static void cancelNotification(String str) {
        new C6861k72(V60.a).b(-1, "webapk_install_notification_tag_prefix." + str);
    }

    public static void showInstallInProgressNotification(String str, String str2, String str3, Bitmap bitmap, boolean z) {
        Bitmap bitmap2;
        String string = V60.a.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1406f9, str2);
        if (z) {
            if (Build.VERSION.SDK_INT >= 26) {
                bitmap2 = WebappsIconUtils.generateAdaptiveIconBitmap(bitmap);
                a(str, str2, str3, bitmap2, string, null, false);
                ZN3.c(V60.a, string, 0).d();
            }
        }
        bitmap2 = bitmap;
        a(str, str2, str3, bitmap2, string, null, false);
        ZN3.c(V60.a, string, 0).d();
    }

    public static void showInstalledNotification(String str, String str2, String str3, String str4, Bitmap bitmap, boolean z) {
        Context context = V60.a;
        C4705dr2 a = C4705dr2.a(context, 0, AbstractC7759mk4.a(str, str4, false), 134217728);
        if (z) {
            if (Build.VERSION.SDK_INT >= 26) {
                bitmap = WebappsIconUtils.generateAdaptiveIconBitmap(bitmap);
            }
        }
        a(str2, str3, str4, bitmap, context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1406fa), a, true);
    }
}
