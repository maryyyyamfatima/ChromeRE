package defpackage;

import com.google.common.util.concurrent.n;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RY1 extends AbstractFutureC11086wS0 implements ScheduledFuture {
    public final RD1 a;
    public final ScheduledFuture g;

    @Override // defpackage.CS0
    public final Object a() {
        return this.a;
    }

    public RY1(n nVar, ScheduledFuture scheduledFuture) {
        this.a = nVar;
        this.g = scheduledFuture;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.g.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean b = b(z);
        if (b) {
            this.g.cancel(z);
        }
        return b;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.g.getDelay(timeUnit);
    }
}
