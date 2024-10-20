package com.google.android.apps.chrome.icing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import defpackage.AbstractC4851eH1;
import defpackage.C9791sg1;
import defpackage.RunnableC9448rg1;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AppIndexingUpdateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"com.google.firebase.appindexing.UPDATE_INDEX".equals(intent.getAction())) {
            return;
        }
        AbstractC4851eH1.d("AppIndexingReceiver", "Received broadcast \"%s\"", "com.google.firebase.appindexing.UPDATE_INDEX");
        C9791sg1 c9791sg1 = C9791sg1.g;
        if (c9791sg1 == null) {
            return;
        }
        if ((Build.VERSION.SDK_INT > 27) && c9791sg1.b.compareAndSet(false, true)) {
            c9791sg1.c.schedule(new RunnableC9448rg1(c9791sg1, true), c9791sg1.d, TimeUnit.MILLISECONDS);
        }
    }
}
