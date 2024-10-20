package org.chromium.chrome.browser.incognito;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsSessionToken;
import defpackage.AbstractC2281Ro1;
import defpackage.C1761No1;
import defpackage.C7432ln3;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class IncognitoTabLauncher extends Activity {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent b = C1761No1.b(this, true);
        b.putExtra("org.chromium.chrome.browser.senders_package_name", CustomTabsConnection.g().e(CustomTabsSessionToken.b(getIntent())));
        b.putExtra("org.chromium.chrome.browser.incognito.invoked_from_launch_new_incognito_tab", true);
        C7432ln3 e = C7432ln3.e();
        try {
            startActivity(b);
            e.close();
            finish();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static boolean a(Intent intent) {
        return AbstractC2281Ro1.h(intent) && AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.incognito.invoked_from_launch_new_incognito_tab", false);
    }
}
