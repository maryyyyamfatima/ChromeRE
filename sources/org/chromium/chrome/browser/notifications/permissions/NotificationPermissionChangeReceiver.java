package org.chromium.chrome.browser.notifications.permissions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.EI2;
import defpackage.U72;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NotificationPermissionChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("android.app.action.APP_BLOCK_STATE_CHANGED") && intent.hasExtra("android.app.extra.BLOCKED_STATE")) {
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            U72.a.getClass();
            EI2.b("Mobile.SystemNotification.Permission.Change", !booleanExtra);
        }
    }
}
