package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PN3 implements Runnable {
    public final RD1 a;
    public final MF g;

    public PN3(SettableFuture settableFuture, NF nf) {
        this.a = settableFuture;
        this.g = nf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RD1 rd1 = this.a;
        boolean isCancelled = rd1.isCancelled();
        MF mf = this.g;
        if (isCancelled) {
            ((NF) mf).i(null);
            return;
        }
        try {
            ((NF) mf).d(AbstractC7515m14.a(rd1));
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            AbstractC0087Ar1.b(cause);
            ((NF) mf).d(SP2.a(cause));
        }
    }
}
