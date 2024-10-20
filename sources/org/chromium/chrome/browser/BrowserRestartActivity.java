package org.chromium.chrome.browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import defpackage.AbstractC2281Ro1;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BrowserRestartActivity extends Activity {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Process.killProcess(AbstractC2281Ro1.p(-1, intent, "org.chromium.chrome.browser.BrowserRestartActivity.main_pid"));
        if (AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.BrowserRestartActivity.restart", false)) {
            Context context = V60.a;
            Intent intent2 = new Intent("android.intent.action.MAIN");
            intent2.setPackage(context.getPackageName());
            intent2.setFlags(268435456);
            context.startActivity(intent2);
        }
        finish();
        Process.killProcess(Process.myPid());
    }
}
