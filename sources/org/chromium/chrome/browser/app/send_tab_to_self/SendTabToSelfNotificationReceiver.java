package org.chromium.chrome.browser.app.send_tab_to_self;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.C7629mN;
import defpackage.J33;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SendTabToSelfNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        J33 j33 = new J33(intent);
        C7629mN.a().c(j33);
        C7629mN.a().b(true, j33);
    }

    public static Class getSendTabToSelfNotificationReciever() {
        return SendTabToSelfNotificationReceiver.class;
    }
}
