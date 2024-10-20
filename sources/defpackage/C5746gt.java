package defpackage;

import android.app.job.JobParameters;
import android.os.SystemClock;
import org.chromium.base.ThreadUtils;
import org.chromium.components.background_task_scheduler.internal.BackgroundTaskJobService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5746gt implements InterfaceC2559Ts {
    public final BackgroundTaskJobService a;
    public final InterfaceC2689Us b;
    public final JobParameters c;
    public final long d = SystemClock.uptimeMillis();

    public C5746gt(BackgroundTaskJobService backgroundTaskJobService, InterfaceC2689Us interfaceC2689Us, JobParameters jobParameters) {
        this.a = backgroundTaskJobService;
        this.b = interfaceC2689Us;
        this.c = jobParameters;
    }

    @Override // defpackage.InterfaceC2559Ts
    public final void a(boolean z) {
        ThreadUtils.f(new RunnableC5402ft(this, z));
    }
}
