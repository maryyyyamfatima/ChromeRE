package defpackage;

import android.os.Bundle;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BF3 {
    public final int a;
    public Bundle b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public TaskInfo.TimingInfo g;

    public BF3(int i) {
        this.a = i;
    }

    public final TaskInfo a() {
        return new TaskInfo(this);
    }
}