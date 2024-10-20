package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oE0 */
/* loaded from: classes.dex */
public final class C8273oE0 {
    public final AtomicReference a = new AtomicReference(C9803si1.g);
    public C7929nE0 b = new C7929nE0();

    public final RD1 a(InterfaceC2909Wk interfaceC2909Wk, Executor executor) {
        final ExecutorC7585mE0 executorC7585mE0 = new ExecutorC7585mE0(executor, this);
        C6897kE0 c6897kE0 = new C6897kE0(executorC7585mE0, interfaceC2909Wk);
        final SettableFuture settableFuture = new SettableFuture();
        final RD1 rd1 = (RD1) this.a.getAndSet(settableFuture);
        final RunnableFutureC9399rX3 runnableFutureC9399rX3 = new RunnableFutureC9399rX3(c6897kE0);
        rd1.f(runnableFutureC9399rX3, executorC7585mE0);
        final RD1 d = AbstractC5957hW0.d(runnableFutureC9399rX3);
        Runnable runnable = new Runnable() { // from class: jE0
            @Override // java.lang.Runnable
            public final void run() {
                RunnableFutureC9399rX3 runnableFutureC9399rX32 = RunnableFutureC9399rX3.this;
                if (runnableFutureC9399rX32.isDone()) {
                    settableFuture.v(rd1);
                    return;
                }
                if (d.isCancelled()) {
                    int i = ExecutorC7585mE0.j;
                    if (executorC7585mE0.compareAndSet(EnumC7241lE0.NOT_RUN, EnumC7241lE0.CANCELLED)) {
                        runnableFutureC9399rX32.cancel(false);
                    }
                }
            }
        };
        EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
        d.f(runnable, enumC6747jo0);
        runnableFutureC9399rX3.f(runnable, enumC6747jo0);
        return d;
    }
}
