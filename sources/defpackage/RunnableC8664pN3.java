package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pN3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8664pN3 implements Runnable {
    public C9349rN3 a;

    public RunnableC8664pN3(C9349rN3 c9349rN3) {
        this.a = c9349rN3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RD1 rd1;
        C9349rN3 c9349rN3 = this.a;
        if (c9349rN3 == null || (rd1 = c9349rN3.j) == null) {
            return;
        }
        this.a = null;
        if (!rd1.isDone()) {
            try {
                ScheduledFuture scheduledFuture = c9349rN3.k;
                c9349rN3.k = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    try {
                        long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (abs > 10) {
                            str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                        }
                    } catch (Throwable th) {
                        c9349rN3.u(new C9007qN3(str));
                        throw th;
                    }
                }
                c9349rN3.u(new C9007qN3(str + ": " + rd1));
                return;
            } finally {
                rd1.cancel(true);
            }
        }
        c9349rN3.v(rd1);
    }
}
