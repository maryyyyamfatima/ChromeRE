package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g43, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC5470g43 implements Executor {
    public final ArrayDeque a = new ArrayDeque();
    public Runnable g;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.a.offer(new RunnableC5126f43(this, runnable));
        if (this.g == null) {
            a();
        }
    }

    public final synchronized void a() {
        Runnable runnable = (Runnable) this.a.poll();
        this.g = runnable;
        if (runnable != null) {
            AbstractC0185Bl.e.execute(runnable);
        }
    }
}
