package org.chromium.chrome.browser.background_sync;

import android.os.Bundle;
import defpackage.AbstractC7808mt;
import defpackage.BF3;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.EF3;
import defpackage.FF3;
import defpackage.V60;
import defpackage.X5;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BackgroundSyncBackgroundTaskScheduler {
    public static BackgroundSyncBackgroundTaskScheduler b;
    public final C12157za2 a = new C12157za2();

    public void cancelOneOffTask(int i) {
        AbstractC7808mt.b().a(V60.a, i != 0 ? i != 1 ? -1 : 105 : 102);
        C11814ya2 c11814ya2 = (C11814ya2) this.a.iterator();
        if (c11814ya2.hasNext()) {
            X5.a(c11814ya2.next());
            throw null;
        }
    }

    public static BackgroundSyncBackgroundTaskScheduler getInstance() {
        if (b == null) {
            b = new BackgroundSyncBackgroundTaskScheduler();
        }
        return b;
    }

    public boolean scheduleOneOffTask(int i, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("SoonestWakeupTime", System.currentTimeMillis() + j);
        EF3 ef3 = new EF3();
        ef3.a = j;
        ef3.c = true;
        ef3.b = Long.MAX_VALUE;
        ef3.d = true;
        FF3 ff3 = new FF3(ef3);
        BF3 bf3 = new BF3(i != 0 ? i != 1 ? -1 : 105 : 102);
        bf3.g = ff3;
        bf3.c = 1;
        bf3.f = true;
        bf3.e = true;
        bf3.b = bundle;
        boolean b2 = AbstractC7808mt.b().b(V60.a, new TaskInfo(bf3));
        C11814ya2 c11814ya2 = (C11814ya2) this.a.iterator();
        if (!c11814ya2.hasNext()) {
            return b2;
        }
        X5.a(c11814ya2.next());
        throw null;
    }
}
