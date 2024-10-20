package defpackage;

import com.google.android.gms.gcm.PeriodicTask;
import com.google.android.gms.gcm.Task;
import org.chromium.components.background_task_scheduler.internal.BackgroundTaskGcmTaskService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ar2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088Ar2 extends AbstractC4500dF3 {
    public long j = -1;
    public long k = -1;

    public C0088Ar2() {
        this.e = true;
    }

    @Override // defpackage.AbstractC4500dF3
    public final AbstractC4500dF3 f() {
        this.b = BackgroundTaskGcmTaskService.class.getName();
        return this;
    }

    @Override // defpackage.AbstractC4500dF3
    public final AbstractC4500dF3 d(int i) {
        this.a = i;
        return this;
    }

    @Override // defpackage.AbstractC4500dF3
    public final AbstractC4500dF3 e(boolean z) {
        this.f = z;
        return this;
    }

    @Override // defpackage.AbstractC4500dF3
    public final AbstractC4500dF3 g(String str) {
        this.c = str;
        return this;
    }

    @Override // defpackage.AbstractC4500dF3
    public final AbstractC4500dF3 c(boolean z) {
        this.e = z;
        return this;
    }

    @Override // defpackage.AbstractC4500dF3
    public final AbstractC4500dF3 h(boolean z) {
        this.d = z;
        return this;
    }

    @Override // defpackage.AbstractC4500dF3
    public final Task a() {
        super.b();
        long j = this.j;
        if (j == -1) {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        }
        if (j <= 0) {
            throw new IllegalArgumentException(Pd4.a("Period set cannot be less than or equal to 0: ", this.j));
        }
        long j2 = this.k;
        if (j2 == -1) {
            this.k = ((float) j) * 0.1f;
        } else if (j2 > j) {
            this.k = j;
        }
        return new PeriodicTask(this);
    }
}
