package org.chromium.components.background_task_scheduler.internal;

import defpackage.AbstractC7808mt;
import defpackage.V60;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NativeTaskScheduler {
    public static void cancel(int i) {
        AbstractC7808mt.b().a(V60.a, i);
    }

    public static boolean schedule(TaskInfo taskInfo) {
        return AbstractC7808mt.b().b(V60.a, taskInfo);
    }
}
