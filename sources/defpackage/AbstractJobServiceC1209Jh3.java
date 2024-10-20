package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractJobServiceC1209Jh3 extends JobService {
    public final String a;
    public final String g;
    public AbstractC1079Ih3 h;

    public AbstractJobServiceC1209Jh3() {
        this.a = "V62";
    }

    public AbstractJobServiceC1209Jh3(int i) {
        this.a = "pW2";
        this.g = "chime";
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context b;
        String str = this.g;
        if (str != null && BundleUtils.d(context, str)) {
            b = BundleUtils.a(context, str);
        } else {
            b = AbstractApplicationC9799sh3.b(context);
        }
        AbstractC1079Ih3 abstractC1079Ih3 = (AbstractC1079Ih3) BundleUtils.e(b, this.a);
        this.h = abstractC1079Ih3;
        abstractC1079Ih3.getClass();
        super.attachBaseContext(b);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        this.h.a(jobParameters);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.h.b();
        return false;
    }
}
