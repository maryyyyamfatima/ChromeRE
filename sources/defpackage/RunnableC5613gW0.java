package defpackage;

import com.google.common.util.concurrent.n;
import java.util.concurrent.Future;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gW0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5613gW0 implements Runnable {
    public RD1 a;
    public Future g;

    public RunnableC5613gW0(RD1 rd1, n nVar) {
        this.a = rd1;
        this.g = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RD1 rd1 = this.a;
        Future future = this.g;
        if (rd1 instanceof n) {
            ((n) rd1).q(future);
        } else if (rd1 != null && rd1.isCancelled() && future != null) {
            future.cancel(false);
        }
        this.a = null;
        this.g = null;
    }
}
