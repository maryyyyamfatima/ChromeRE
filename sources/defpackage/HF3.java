package defpackage;

import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class HF3 implements TaskInfo.TimingInfo {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public HF3(GF3 gf3) {
        this.a = gf3.a;
        this.b = gf3.b;
        this.c = gf3.c;
        this.d = gf3.d;
    }

    @Override // org.chromium.components.background_task_scheduler.TaskInfo.TimingInfo
    public final void a(IF3 if3) {
        if3.c(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{intervalMs: ");
        sb.append(this.a);
        sb.append(", ");
        if (this.c) {
            sb.append(", flexMs: ");
            sb.append(this.b);
            sb.append(", ");
        }
        sb.append("expiresAfterWindowEndTime (+flex): ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
