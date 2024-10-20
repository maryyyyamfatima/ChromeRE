package org.chromium.chrome.browser.notifications;

import android.app.Activity;
import android.os.Bundle;
import defpackage.U62;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NotificationIntentInterceptor$TrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getApplicationContext();
        U62.a(getIntent());
        finish();
    }
}
