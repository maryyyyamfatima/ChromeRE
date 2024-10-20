package org.chromium.components.security_interstitials;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class DateAndTimeSettingsHelper {
    public static void openDateAndTimeSettings() {
        Intent intent = new Intent("android.settings.DATE_SETTINGS");
        try {
            intent.addFlags(268435456);
            V60.a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
