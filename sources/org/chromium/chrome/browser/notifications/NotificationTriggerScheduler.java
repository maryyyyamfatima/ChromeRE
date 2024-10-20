package org.chromium.chrome.browser.notifications;

import android.os.Bundle;
import defpackage.AbstractC7808mt;
import defpackage.BF3;
import defpackage.CF3;
import defpackage.DF3;
import defpackage.KH;
import defpackage.O83;
import defpackage.Q83;
import defpackage.T72;
import defpackage.V60;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NotificationTriggerScheduler {
    public final KH a;

    public static NotificationTriggerScheduler getInstance() {
        return T72.a;
    }

    public NotificationTriggerScheduler(KH kh) {
        this.a = kh;
    }

    public void schedule(long j) {
        this.a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Q83 q83 = O83.a;
        long g = q83.g(Long.MAX_VALUE, "notification_trigger_scheduler.next_trigger");
        if (j < g) {
            q83.s(j, "notification_trigger_scheduler.next_trigger");
        } else if (g >= currentTimeMillis) {
            return;
        } else {
            j = g;
        }
        Math.max(j - currentTimeMillis, 0L);
        Bundle bundle = new Bundle();
        bundle.putLong("Timestamp", j);
        CF3 cf3 = new CF3();
        cf3.a = j;
        DF3 df3 = new DF3(cf3);
        BF3 bf3 = new BF3(104);
        bf3.g = df3;
        bf3.f = true;
        bf3.e = true;
        bf3.b = bundle;
        AbstractC7808mt.b().b(V60.a, new TaskInfo(bf3));
    }
}
