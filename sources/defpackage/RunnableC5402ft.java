package defpackage;

import android.app.job.JobParameters;
import android.os.SystemClock;
import java.util.HashMap;
import org.chromium.components.background_task_scheduler.internal.BackgroundTaskJobService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ft, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC5402ft implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C5746gt g;

    @Override // java.lang.Runnable
    public final void run() {
        C5746gt c5746gt = this.g;
        HashMap hashMap = c5746gt.a.g;
        JobParameters jobParameters = c5746gt.c;
        if (hashMap.get(Integer.valueOf(jobParameters.getJobId())) == c5746gt.b) {
            BackgroundTaskJobService backgroundTaskJobService = c5746gt.a;
            backgroundTaskJobService.g.remove(Integer.valueOf(jobParameters.getJobId()));
            backgroundTaskJobService.jobFinished(jobParameters, this.a);
            C0225Bt c = C0225Bt.c();
            int jobId = jobParameters.getJobId();
            long uptimeMillis = SystemClock.uptimeMillis() - c5746gt.d;
            c.getClass();
            C0225Bt.d(jobId, uptimeMillis);
            return;
        }
        AbstractC4851eH1.a("BkgrdTaskJS", "Tried finishing non-current BackgroundTask.", new Object[0]);
    }

    public RunnableC5402ft(C5746gt c5746gt, boolean z) {
        this.g = c5746gt;
        this.a = z;
    }
}
