package org.chromium.chrome.browser.notifications.channels;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.QF3;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.notifications.channels.LocaleChangedBroadcastReceiver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LocaleChangedBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            PostTask.c(QF3.h, new Runnable() { // from class: oF1
                @Override // java.lang.Runnable
                public final void run() {
                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                    int i = LocaleChangedBroadcastReceiver.a;
                    Object obj = VI.e;
                    VI vi = UI.a;
                    vi.getClass();
                    synchronized (VI.e) {
                        if (vi.c) {
                            vi.a.c(V60.a.getResources());
                        }
                    }
                    pendingResult.finish();
                }
            });
        }
    }
}
