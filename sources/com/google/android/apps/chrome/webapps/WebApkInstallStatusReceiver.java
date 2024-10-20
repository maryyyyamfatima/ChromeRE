package com.google.android.apps.chrome.webapps;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.C1537Lv2;
import org.chromium.chrome.browser.AppHooks;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class WebApkInstallStatusReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("package_name");
        int intExtra = intent.getIntExtra("package_event", -1);
        int intExtra2 = intent.getIntExtra("error_code", 0);
        C1537Lv2 v = AppHooks.get().v();
        if (v != null) {
            if (intExtra == 2 || intExtra == 3 || intExtra == 5 || intExtra == 6) {
                v.d(intExtra, intExtra2, stringExtra);
            }
        }
    }
}
