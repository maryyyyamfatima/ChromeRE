package org.chromium.components.background_task_scheduler.internal;

import android.os.Bundle;
import defpackage.BF3;
import defpackage.CF3;
import defpackage.DF3;
import defpackage.EF3;
import defpackage.FF3;
import defpackage.GF3;
import defpackage.HF3;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TaskInfoBridge {
    public static TaskInfo createTaskInfo(int i, TaskInfo.TimingInfo timingInfo, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("serialized_task_extras", str);
        BF3 bf3 = new BF3(i);
        bf3.g = timingInfo;
        bf3.c = 1;
        bf3.d = false;
        bf3.f = true;
        bf3.e = true;
        bf3.b = bundle;
        return new TaskInfo(bf3);
    }

    public static TaskInfo.TimingInfo createOneOffInfo(long j, long j2, boolean z) {
        EF3 ef3 = new EF3();
        ef3.b = j2;
        ef3.d = z;
        if (j > 0) {
            ef3.a = j;
            ef3.c = true;
        }
        return new FF3(ef3);
    }

    public static TaskInfo.TimingInfo createPeriodicInfo(long j, long j2, boolean z) {
        GF3 gf3 = new GF3();
        gf3.a = j;
        gf3.d = z;
        if (j2 > 0) {
            gf3.b = j2;
            gf3.c = true;
        }
        return new HF3(gf3);
    }

    public static TaskInfo.TimingInfo createExactInfo(long j) {
        CF3 cf3 = new CF3();
        cf3.a = j;
        return new DF3(cf3);
    }
}
