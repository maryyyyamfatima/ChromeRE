package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8152nt implements IF3 {
    public AbstractC4500dF3 a;
    public final Bundle b;

    @Override // defpackage.IF3
    public final void a(FF3 ff3) {
        boolean z = ff3.d;
        Bundle bundle = this.b;
        long j = ff3.b;
        if (z) {
            bundle.putLong("_background_task_schedule_time", System.currentTimeMillis());
            bundle.putLong("_background_task_end_time", j);
        }
        C0278Cd2 c0278Cd2 = new C0278Cd2();
        long seconds = ff3.c ? TimeUnit.MILLISECONDS.toSeconds(ff3.a) : 0L;
        if (ff3.d) {
            j += 1000;
        }
        long seconds2 = TimeUnit.MILLISECONDS.toSeconds(j);
        c0278Cd2.j = seconds;
        c0278Cd2.k = seconds2;
        c0278Cd2.i = bundle;
        this.a = c0278Cd2;
    }

    public C8152nt(Bundle bundle) {
        this.b = bundle;
    }

    @Override // defpackage.IF3
    public final void b(DF3 df3) {
        throw new RuntimeException("Exact tasks should not be scheduled with GcmNetworkManager.");
    }

    @Override // defpackage.IF3
    public final void c(HF3 hf3) {
        boolean z = hf3.d;
        Bundle bundle = this.b;
        long j = hf3.b;
        boolean z2 = hf3.c;
        long j2 = hf3.a;
        if (z) {
            bundle.putLong("_background_task_schedule_time", System.currentTimeMillis());
            bundle.putLong("_background_task_interval_time", j2);
            if (z2) {
                bundle.putLong("_background_task_flex_time", j);
            }
        }
        C0088Ar2 c0088Ar2 = new C0088Ar2();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0088Ar2.j = timeUnit.toSeconds(j2);
        if (z2) {
            c0088Ar2.k = timeUnit.toSeconds(j);
        }
        c0088Ar2.i = bundle;
        this.a = c0088Ar2;
    }
}
