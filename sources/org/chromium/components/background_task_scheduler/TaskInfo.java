package org.chromium.components.background_task_scheduler;

import android.os.Bundle;
import defpackage.BF3;
import defpackage.EF3;
import defpackage.FF3;
import defpackage.IF3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class TaskInfo {
    public final int a;
    public final Bundle b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final TimingInfo g;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public interface TimingInfo {
        void a(IF3 if3);
    }

    public static BF3 a(int i, long j, long j2) {
        EF3 ef3 = new EF3();
        ef3.a = j;
        ef3.c = true;
        ef3.b = j2;
        FF3 ff3 = new FF3(ef3);
        BF3 bf3 = new BF3(i);
        bf3.g = ff3;
        return bf3;
    }

    public TaskInfo(BF3 bf3) {
        this.a = bf3.a;
        Bundle bundle = bf3.b;
        this.b = bundle == null ? new Bundle() : bundle;
        this.c = bf3.c;
        this.d = bf3.d;
        this.e = bf3.e;
        this.f = bf3.f;
        this.g = bf3.g;
    }

    public final String toString() {
        return "{taskId: " + this.a + ", extras: " + this.b + ", requiredNetworkType: " + this.c + ", requiresCharging: " + this.d + ", isPersisted: " + this.e + ", updateCurrent: " + this.f + ", timingInfo: " + this.g + "}";
    }
}
