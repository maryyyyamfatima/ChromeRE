package org.chromium.chrome.browser.price_tracking;

import android.os.Bundle;
import defpackage.AbstractC2281Ro1;
import defpackage.C6861k72;
import defpackage.V60;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PriceDropNotificationManagerImpl$DismissNotificationChromeActivity extends ChromeLauncherActivity {
    @Override // org.chromium.chrome.browser.document.ChromeLauncherActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        new C6861k72(V60.a).b(AbstractC2281Ro1.p(0, getIntent(), "org.chromium.chrome.browser.price_tracking.NOTIFICATION_ID"), "price_drop");
        super.onCreate(bundle);
        finish();
    }
}
