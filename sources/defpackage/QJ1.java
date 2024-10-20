package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QJ1 extends FutureTask {
    public final /* synthetic */ RJ1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QJ1(RJ1 rj1, Callable callable) {
        super(callable);
        this.a = rj1;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        RJ1 rj1 = this.a;
        if (isCancelled()) {
            return;
        }
        try {
            rj1.a((OJ1) get());
        } catch (InterruptedException | ExecutionException e) {
            rj1.a(new OJ1(e));
        }
    }
}
