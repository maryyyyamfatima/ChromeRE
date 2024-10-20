package org.chromium.components.component_updater;

import defpackage.AbstractC7808mt;
import defpackage.BF3;
import defpackage.InterfaceC2559Ts;
import defpackage.V60;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class UpdateScheduler {
    public static UpdateScheduler d;
    public InterfaceC2559Ts a;
    public long b;
    public long c;

    public static boolean isAvailable() {
        return true;
    }

    public final void cancelTask() {
        AbstractC7808mt.b().a(V60.a, 2);
    }

    public static UpdateScheduler getInstance() {
        if (d == null) {
            d = new UpdateScheduler();
        }
        return d;
    }

    public final void a(long j) {
        if (this.a != null) {
            return;
        }
        BF3 a = TaskInfo.a(2, j, 2147483647L);
        a.f = true;
        a.c = 2;
        a.e = true;
        AbstractC7808mt.b().b(V60.a, a.a());
    }

    public final void schedule(long j, long j2) {
        this.c = j2;
        a(j);
    }

    public final void finishTask(boolean z) {
        this.a.a(false);
        this.a = null;
        if (z) {
            a(this.c);
        }
    }

    public final void setNativeScheduler(long j) {
        this.b = j;
    }
}
