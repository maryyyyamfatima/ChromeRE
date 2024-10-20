package org.chromium.chrome.browser.policy;

import defpackage.AbstractC8357oV;
import defpackage.C8700pV;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CloudManagementAndroidConnection {
    public final C8700pV a = new C8700pV();

    public static CloudManagementAndroidConnection getInstance() {
        return AbstractC8357oV.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getClientId() {
        /*
            r7 = this;
            Q83 r0 = defpackage.O83.a
            java.lang.String r1 = "Chrome.Policy.CloudManagementClientId"
            java.lang.String r2 = ""
            java.lang.String r3 = r0.i(r1, r2)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L11
            return r3
        L11:
            pV r3 = r7.a
            r3.getClass()
            android.content.Context r3 = defpackage.V60.a
            if (r3 != 0) goto L1b
            goto L2b
        L1b:
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r4 = "android_id"
            long r3 = defpackage.AbstractC7192l51.e(r3, r4)
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L2d
        L2b:
            r3 = 0
            goto L31
        L2d:
            java.lang.String r3 = java.lang.Long.toHexString(r3)
        L31:
            if (r3 != 0) goto L34
            goto L35
        L34:
            r2 = r3
        L35:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L43
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
        L43:
            r0.t(r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.policy.CloudManagementAndroidConnection.getClientId():java.lang.String");
    }
}
