package defpackage;

import android.os.Bundle;
import org.chromium.chrome.browser.offlinepages.TriggerConditions;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ns */
/* loaded from: classes.dex */
public abstract class AbstractC1779Ns {
    public static void a(TriggerConditions triggerConditions, long j, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putLong("ScheduleTime", System.currentTimeMillis());
        bundle.putBoolean("PowerConnected", triggerConditions.a);
        bundle.putInt("BatteryPercentage", triggerConditions.b);
        boolean z2 = triggerConditions.c;
        bundle.putBoolean("UnmeteredNetwork", z2);
        BF3 a = TaskInfo.a(77, j, 604800000L);
        a.c = z2 ? 2 : 1;
        a.f = z;
        a.e = true;
        a.b = bundle;
        a.d = triggerConditions.a;
        AbstractC7808mt.b().b(V60.a, new TaskInfo(a));
    }
}
