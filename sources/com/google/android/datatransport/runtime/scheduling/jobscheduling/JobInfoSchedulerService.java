package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import defpackage.AbstractC7911nA2;
import defpackage.B24;
import defpackage.C1196Jf0;
import defpackage.C2019Po;
import defpackage.C2149Qo;
import defpackage.C4590dX3;
import defpackage.EnumC7223lA2;
import defpackage.J24;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        Context applicationContext = getApplicationContext();
        if (C4590dX3.b == null) {
            synchronized (C4590dX3.class) {
                if (C4590dX3.b == null) {
                    applicationContext.getClass();
                    C4590dX3.b = new C1196Jf0(applicationContext);
                }
            }
        }
        C2019Po c2019Po = new C2019Po();
        c2019Po.c(EnumC7223lA2.DEFAULT);
        c2019Po.b(string);
        c2019Po.c(AbstractC7911nA2.b(i));
        if (string2 != null) {
            c2019Po.b = Base64.decode(string2, 0);
        }
        C1196Jf0 c1196Jf0 = C4590dX3.b;
        if (c1196Jf0 == null) {
            throw new IllegalStateException("Not initialized!");
        }
        J24 j24 = ((C4590dX3) c1196Jf0.j.get()).a;
        C2149Qo a2 = c2019Po.a();
        Runnable runnable = new Runnable() { // from class: zt1
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = JobInfoSchedulerService.a;
                JobInfoSchedulerService.this.jobFinished(jobParameters, false);
            }
        };
        j24.getClass();
        j24.e.execute(new B24(j24, a2, i2, runnable));
        return true;
    }
}
