package defpackage;

import com.google.common.util.concurrent.s;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rN3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9349rN3 extends s {
    public RD1 j;
    public ScheduledFuture k;

    public C9349rN3(RQ0 rq0) {
        this.j = rq0;
    }

    @Override // com.google.common.util.concurrent.n
    public final String r() {
        RD1 rd1 = this.j;
        ScheduledFuture scheduledFuture = this.k;
        if (rd1 == null) {
            return null;
        }
        String str = "inputFuture=[" + rd1 + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.common.util.concurrent.n
    public final void k() {
        q(this.j);
        ScheduledFuture scheduledFuture = this.k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.j = null;
        this.k = null;
    }
}
