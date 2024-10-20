package org.chromium.chrome.browser.customtabs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.FI2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CustomTabsShareBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        FI2.a("MobileTopToolbarShareButton");
        String dataString = intent.getDataString();
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", dataString);
        Intent createChooser = Intent.createChooser(intent2, null);
        createChooser.setFlags(268435456);
        context.startActivity(createChooser);
    }
}
