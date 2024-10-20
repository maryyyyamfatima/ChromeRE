package org.chromium.components.background_task_scheduler.internal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC7464lt;
import defpackage.C0225Bt;
import defpackage.C11239wt;
import defpackage.C3339Zs;
import defpackage.InterfaceC2689Us;
import defpackage.KF3;
import defpackage.V60;
import java.util.HashMap;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BackgroundTaskJobService extends JobService {
    public final C3339Zs a = new C3339Zs();
    public final HashMap g = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:            if (r2 >= (r4.getLong("_background_task_end_time") + r5)) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:            if (r10 < r7) goto L28;     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStartJob(android.app.job.JobParameters r14) {
        /*
            r13 = this;
            java.lang.Object r0 = org.chromium.base.ThreadUtils.a
            int r0 = r14.getJobId()
            Us r0 = defpackage.AbstractC7808mt.a(r0)
            r1 = 0
            if (r0 != 0) goto L24
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "BkgrdTaskJS"
            java.lang.String r3 = "Failed to start task. Could not instantiate BackgroundTask class."
            defpackage.AbstractC4851eH1.f(r2, r3, r0)
            rt r0 = defpackage.AbstractC7808mt.b()
            android.content.Context r2 = defpackage.V60.a
            int r14 = r14.getJobId()
            r0.a(r2, r14)
            return r1
        L24:
            Zs r2 = r13.a
            r2.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            android.os.PersistableBundle r4 = r14.getExtras()
            if (r4 == 0) goto L83
            java.lang.String r5 = "_background_task_schedule_time"
            boolean r6 = r4.containsKey(r5)
            if (r6 != 0) goto L3c
            goto L83
        L3c:
            long r5 = r4.getLong(r5)
            java.lang.String r7 = "_background_task_end_time"
            boolean r8 = r4.containsKey(r7)
            r9 = 1
            if (r8 == 0) goto L53
            long r7 = r4.getLong(r7)
            long r7 = r7 + r5
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L83
            goto L84
        L53:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r7 >= r8) goto L5a
            goto L83
        L5a:
            java.lang.String r7 = "_background_task_interval_time"
            long r7 = r4.getLong(r7)
            long r10 = defpackage.AbstractC9867st.a()
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 >= 0) goto L6c
            long r7 = defpackage.AbstractC9867st.a()
        L6c:
            java.lang.String r10 = "_background_task_flex_time"
            long r11 = defpackage.AbstractC10210tt.a()
            long r10 = r4.getLong(r10, r11)
            long r2 = r2 - r5
            long r2 = r2 % r7
            long r4 = r7 - r10
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L83
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 >= 0) goto L83
            goto L84
        L83:
            r9 = r1
        L84:
            if (r9 == 0) goto L9b
            Bt r0 = defpackage.C0225Bt.c()
            int r14 = r14.getJobId()
            r0.getClass()
            java.lang.String r0 = "Android.BackgroundTaskScheduler.TaskExpired"
            int r14 = defpackage.AbstractC7464lt.a(r14)
            defpackage.C0225Bt.b(r14, r0)
            return r1
        L9b:
            java.util.HashMap r1 = r13.g
            int r2 = r14.getJobId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r0)
            KF3 r2 = defpackage.C11239wt.c(r14)
            Bt r3 = defpackage.C0225Bt.c()
            r3.getClass()
            java.lang.String r3 = "Android.BackgroundTaskScheduler.TaskStarted"
            int r4 = r2.a
            int r4 = defpackage.AbstractC7464lt.a(r4)
            defpackage.C0225Bt.b(r4, r3)
            android.content.Context r3 = defpackage.V60.a
            gt r4 = new gt
            r4.<init>(r13, r0, r14)
            boolean r0 = r0.b(r3, r2, r4)
            if (r0 != 0) goto Ld6
            int r14 = r14.getJobId()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r1.remove(r14)
        Ld6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.background_task_scheduler.internal.BackgroundTaskJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        Object obj = ThreadUtils.a;
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(Integer.valueOf(jobParameters.getJobId()))) {
            AbstractC4851eH1.f("BkgrdTaskJS", "Failed to stop job, because job with job id " + jobParameters.getJobId() + " does not exist.", new Object[0]);
            return false;
        }
        InterfaceC2689Us interfaceC2689Us = (InterfaceC2689Us) hashMap.get(Integer.valueOf(jobParameters.getJobId()));
        KF3 c = C11239wt.c(jobParameters);
        C0225Bt.c().getClass();
        C0225Bt.b(AbstractC7464lt.a(c.a), "Android.BackgroundTaskScheduler.TaskStopped");
        boolean c2 = interfaceC2689Us.c(V60.a, c);
        hashMap.remove(Integer.valueOf(jobParameters.getJobId()));
        return c2;
    }
}
