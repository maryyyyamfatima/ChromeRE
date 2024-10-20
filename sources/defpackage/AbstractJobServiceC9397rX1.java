package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rX1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractJobServiceC9397rX1 extends JobService {
    public static final /* synthetic */ int h = 0;
    public C8712pX1 a;
    public final Object g = new Object();

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C8712pX1 c8712pX1 = new C8712pX1(new KO(((AbstractJobServiceC1339Kh3) this).j.a, jobParameters.getExtras()));
        this.a = c8712pX1;
        C9055qX1 c9055qX1 = new C9055qX1(this, jobParameters);
        Object obj = ThreadUtils.a;
        if (c8712pX1.c != null) {
            throw new RuntimeException("A given minidump upload job instance should never be launched more than once.");
        }
        c8712pX1.c = new Thread(new RunnableC8369oX1(c8712pX1, c9055qX1), "MinidumpUploadJob-WorkerThread");
        c8712pX1.b = false;
        c8712pX1.c.start();
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        AbstractC4851eH1.d("MinidumpJobService", "Canceling pending uploads due to change in networking status.", new Object[0]);
        this.a.b = true;
        return true;
    }
}
