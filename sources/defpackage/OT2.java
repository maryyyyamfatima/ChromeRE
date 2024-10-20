package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OT2 implements Executor {
    public final Executor a;

    public OT2(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new NT2(runnable));
    }
}
