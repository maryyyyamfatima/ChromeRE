package defpackage;

import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.Task;
import org.chromium.components.background_task_scheduler.internal.BackgroundTaskGcmTaskService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cd2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278Cd2 extends AbstractC4500dF3 {
    public long j = -1;
    public long k = -1;

    public C0278Cd2() {
        this.e = false;
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
        if (j != -1) {
            long j2 = this.k;
            if (j2 != -1) {
                if (j >= j2) {
                    throw new IllegalArgumentException("Window start must be shorter than window end.");
                }
                return new OneoffTask(this);
            }
        }
        throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
    }
}
