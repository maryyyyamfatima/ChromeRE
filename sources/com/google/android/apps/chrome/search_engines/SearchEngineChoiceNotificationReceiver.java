package com.google.android.apps.chrome.search_engines;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.O83;
import defpackage.Q83;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SearchEngineChoiceNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.finsky.compliance.flow.search.engine.installed".equals(intent.getAction())) {
            Q83 q83 = O83.a;
            if (q83.c("search_engine_choice_requested_timestamp")) {
                return;
            }
            q83.s(System.currentTimeMillis(), "search_engine_choice_requested_timestamp");
        }
    }
}
