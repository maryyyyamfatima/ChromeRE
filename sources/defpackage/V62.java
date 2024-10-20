package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.SystemClock;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class V62 extends AbstractC1079Ih3 {
    @Override // defpackage.AbstractC1079Ih3
    public final void b() {
    }

    @Override // defpackage.AbstractC1079Ih3
    public final void a(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        extras.putLong("notification_job_started_time_ms", SystemClock.elapsedRealtime());
        if (extras.containsKey("notification_id") && extras.containsKey("notification_info_origin")) {
            Intent intent = new Intent(extras.getString("notification_action"));
            intent.putExtras(new Bundle(extras));
            Object obj = ThreadUtils.a;
            J72.c(intent);
        }
    }
}
