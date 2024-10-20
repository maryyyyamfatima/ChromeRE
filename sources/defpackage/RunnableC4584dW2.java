package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dW2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4584dW2 extends AbstractC10248u implements Runnable {
    public RunnableC4584dW2(K92 k92) {
        super(k92);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g = Thread.currentThread();
        try {
            this.a.run();
            this.g = null;
        } catch (Throwable th) {
            this.g = null;
            lazySet(AbstractC10248u.h);
            MR2.b(th);
        }
    }
}
