package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class H11 implements Runnable {
    public final /* synthetic */ I11 a;

    public abstract void a();

    public H11(I11 i11) {
        this.a = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [I11] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.locks.Lock] */
    @Override // java.lang.Runnable
    public final void run() {
        I11 i11 = this.a;
        i11.b.lock();
        try {
            try {
            } catch (RuntimeException e) {
                Q11 q11 = i11.a.j;
                q11.sendMessage(q11.obtainMessage(2, e));
            }
            if (Thread.interrupted()) {
                return;
            }
            a();
        } finally {
            i11.b.unlock();
        }
    }
}
