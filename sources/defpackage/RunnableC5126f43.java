package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f43, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5126f43 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ ExecutorC5470g43 g;

    public RunnableC5126f43(ExecutorC5470g43 executorC5470g43, Runnable runnable) {
        this.g = executorC5470g43;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorC5470g43 executorC5470g43 = this.g;
        try {
            this.a.run();
        } finally {
            executorC5470g43.a();
        }
    }
}
