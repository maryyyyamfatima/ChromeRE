package org.chromium.chrome.browser.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.AbstractIntentServiceC0949Hh3;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NotificationService extends AbstractIntentServiceC0949Hh3 {
    public NotificationService() {
        super("J72", "NotificationService");
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class Receiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ((BroadcastReceiver) BundleUtils.e(context, "org.chromium.chrome.browser.notifications.NotificationServiceImpl$Receiver")).onReceive(context, intent);
        }
    }
}
