package org.chromium.chrome.browser.webapps;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebappLauncherActivity extends Activity {
    public static final /* synthetic */ int a = 0;

    public static Intent a(Intent intent, String str, String str2) {
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
        intent2.setPackage(str);
        intent2.setFlags(268959744);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        return intent2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0126, code lost:            if (defpackage.AbstractC2281Ro1.h(r14) == false) goto L506;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:            if (defpackage.AbstractC3641al4.a(r5, r8.d, r10) != false) goto L507;     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.webapps.WebappLauncherActivity.onCreate(android.os.Bundle):void");
    }
}
