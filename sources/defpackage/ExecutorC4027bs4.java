package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bs4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC4027bs4 implements Executor {
    public final C6854k61 a = new C6854k61();
    public final Executor g;

    public ExecutorC4027bs4(Executor executor) {
        this.g = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.a) {
            this.a.a(1, runnable);
        }
        this.g.execute(new Runnable() { // from class: as4
            @Override // java.lang.Runnable
            public final void run() {
                boolean remove;
                ExecutorC4027bs4 executorC4027bs4 = ExecutorC4027bs4.this;
                Runnable runnable2 = runnable;
                synchronized (executorC4027bs4.a) {
                    remove = executorC4027bs4.a.remove(runnable2);
                }
                if (remove) {
                    runnable2.run();
                }
            }
        });
    }
}
