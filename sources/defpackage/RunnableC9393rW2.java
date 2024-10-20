package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rW2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC9393rW2 implements InterfaceC6416iq0, Runnable {
    public final Runnable a;
    public final AbstractC10079tW2 g;
    public volatile boolean h;

    public RunnableC9393rW2(K92 k92, AbstractC10079tW2 abstractC10079tW2) {
        this.a = k92;
        this.g = abstractC10079tW2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h) {
            return;
        }
        try {
            this.a.run();
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.g.dispose();
            throw ZD0.a(th);
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.h = true;
        this.g.dispose();
    }
}
