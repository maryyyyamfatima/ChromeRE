package org.chromium.chrome.browser.offlinepages.prefetch;

import android.os.Bundle;
import defpackage.AbstractC7808mt;
import defpackage.BF3;
import defpackage.V60;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PrefetchBackgroundTaskScheduler {
    public static void cancelTask() {
        AbstractC7808mt.b().a(V60.a, 78);
    }

    public static void scheduleTask(int i) {
        a(i, false);
    }

    public static void scheduleTaskLimitless(int i) {
        a(i, true);
    }

    public static void a(int i, boolean z) {
        BF3 a = TaskInfo.a(78, ((z ? 20L : 900L) + i) * 1000, 604800000L);
        a.c = 2;
        a.e = true;
        a.f = true;
        if (z) {
            a.c = 1;
            Bundle bundle = new Bundle(1);
            bundle.putBoolean("limitlessPrefetching", true);
            a.b = bundle;
        }
        AbstractC7808mt.b().b(V60.a, a.a());
    }
}
