package org.chromium.chrome.browser.background_sync;

import defpackage.AbstractC4851eH1;
import defpackage.C4502dG0;
import defpackage.EI2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GooglePlayServicesChecker {
    public static boolean shouldDisableBackgroundSync() {
        boolean z;
        C4502dG0.b.getClass();
        if (C4502dG0.b()) {
            z = true;
        } else {
            z = false;
            AbstractC4851eH1.d("PlayServicesChecker", "Disabling Background Sync because Play Services is not up to date.", new Object[0]);
        }
        EI2.b("BackgroundSync.LaunchTask.PlayServicesAvailable", z);
        return !z;
    }
}
