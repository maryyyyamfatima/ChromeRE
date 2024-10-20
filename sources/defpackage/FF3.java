package defpackage;

import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FF3 implements TaskInfo.TimingInfo {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public FF3(EF3 ef3) {
        this.a = ef3.a;
        this.b = ef3.b;
        this.c = ef3.c;
        this.d = ef3.d;
    }

    @Override // org.chromium.components.background_task_scheduler.TaskInfo.TimingInfo
    public final void a(IF3 if3) {
        if3.a(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (this.c) {
            sb.append("windowStartTimeMs: ");
            sb.append(this.a);
            sb.append(", ");
        }
        sb.append("windowEndTimeMs: ");
        sb.append(this.b);
        sb.append(", expiresAfterWindowEndTime (+flex): ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
