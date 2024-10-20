package defpackage;

import com.google.common.util.concurrent.n;
import com.google.common.util.concurrent.s;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OY1 implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ n g;

    public OY1(Executor executor, s sVar) {
        this.a = executor;
        this.g = sVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.g.u(e);
        }
    }
}
