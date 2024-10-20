package defpackage;

import android.app.job.JobParameters;
import android.os.Build;
import android.os.SystemClock;
import org.chromium.chrome.browser.crash.ChromeMinidumpUploadJobService;
import org.chromium.chrome.browser.metrics.UmaUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qX1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9055qX1 {
    public final long a = SystemClock.uptimeMillis();
    public final /* synthetic */ JobParameters b;
    public final /* synthetic */ AbstractJobServiceC9397rX1 c;

    public C9055qX1(AbstractJobServiceC9397rX1 abstractJobServiceC9397rX1, JobParameters jobParameters) {
        this.c = abstractJobServiceC9397rX1;
        this.b = jobParameters;
    }

    public final void a(boolean z) {
        if (z) {
            AbstractC4851eH1.d("MinidumpJobService", "Some minidumps remain un-uploaded; rescheduling.", new Object[0]);
        }
        this.c.jobFinished(this.b, z);
        AbstractJobServiceC9397rX1 abstractJobServiceC9397rX1 = this.c;
        long uptimeMillis = SystemClock.uptimeMillis() - this.a;
        ((ChromeMinidumpUploadJobService) abstractJobServiceC9397rX1).getClass();
        EI2.g("Stability.Android.MinidumpUploadingTime", uptimeMillis, 1L, 86400000L, 50);
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        int a = UmaUtils.a(V60.a);
        EI2.g("Stability.Android.MinidumpUploadingTime.".concat(a != 0 ? a != 1 ? a != 2 ? a != 3 ? a != 4 ? a != 5 ? "Unknown" : "Unsupported" : "Restricted" : "Rare" : "Frequent" : "WorkingSet" : "Active"), uptimeMillis, 1L, 86400000L, 50);
    }
}
