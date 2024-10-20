package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DW0 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.apps.now.account_update_broadcast".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("account_name");
            EI2.h(1, 2, "Search.GsaAccountChangeNotificationSource");
            NW0.c(context.getApplicationContext()).f(stringExtra);
        }
    }
}
