package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6653jY0 implements Runnable {
    public final /* synthetic */ C6997kY0 a;

    public RunnableC6653jY0(C6997kY0 c6997kY0) {
        this.a = c6997kY0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6997kY0 c6997kY0 = this.a;
        try {
            c6997kY0.a.removeUpdates(c6997kY0);
        } catch (Exception e) {
            if (!c6997kY0.d) {
                throw e;
            }
        }
        AbstractC7341lY0.a = null;
    }
}
