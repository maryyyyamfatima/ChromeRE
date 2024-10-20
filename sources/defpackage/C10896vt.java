package defpackage;

import android.app.job.JobInfo;
import android.os.Build;
import android.os.PersistableBundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10896vt implements IF3 {
    public final JobInfo.Builder a;
    public final PersistableBundle b;

    @Override // defpackage.IF3
    public final void a(FF3 ff3) {
        boolean z = ff3.d;
        PersistableBundle persistableBundle = this.b;
        long j = ff3.b;
        if (z) {
            persistableBundle.putLong("_background_task_schedule_time", System.currentTimeMillis());
            persistableBundle.putLong("_background_task_end_time", j);
        }
        JobInfo.Builder builder = this.a;
        builder.setExtras(persistableBundle);
        if (ff3.c) {
            builder.setMinimumLatency(ff3.a);
        }
        if (ff3.d) {
            j += 1000;
        }
        builder.setOverrideDeadline(j);
    }

    public C10896vt(JobInfo.Builder builder, PersistableBundle persistableBundle) {
        this.a = builder;
        this.b = persistableBundle;
    }

    @Override // defpackage.IF3
    public final void b(DF3 df3) {
        throw new RuntimeException("Exact tasks should not be scheduled with JobScheduler.");
    }

    @Override // defpackage.IF3
    public final void c(HF3 hf3) {
        boolean z = hf3.d;
        PersistableBundle persistableBundle = this.b;
        long j = hf3.b;
        boolean z2 = hf3.c;
        long j2 = hf3.a;
        if (z) {
            persistableBundle.putLong("_background_task_schedule_time", System.currentTimeMillis());
            persistableBundle.putLong("_background_task_interval_time", j2);
            if (z2) {
                persistableBundle.putLong("_background_task_flex_time", j);
            }
        }
        JobInfo.Builder builder = this.a;
        builder.setExtras(persistableBundle);
        if (z2 && Build.VERSION.SDK_INT >= 24) {
            builder.setPeriodic(j2, j);
        } else {
            builder.setPeriodic(j2);
        }
    }
}
