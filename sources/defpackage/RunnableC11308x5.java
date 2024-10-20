package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11308x5 implements Runnable {
    public final /* synthetic */ C11994z5 a;

    public RunnableC11308x5(C11994z5 c11994z5) {
        this.a = c11994z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11994z5 c11994z5 = this.a;
        c11994z5.getClass();
        while (true) {
            try {
                c11994z5.b((C11651y5) c11994z5.c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
