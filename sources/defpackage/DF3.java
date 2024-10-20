package defpackage;

import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class DF3 implements TaskInfo.TimingInfo {
    public final long a;

    public DF3(CF3 cf3) {
        this.a = cf3.a;
    }

    @Override // org.chromium.components.background_task_scheduler.TaskInfo.TimingInfo
    public final void a(IF3 if3) {
        if3.b(this);
    }

    public final String toString() {
        return "{triggerAtMs: " + this.a + "}";
    }
}
