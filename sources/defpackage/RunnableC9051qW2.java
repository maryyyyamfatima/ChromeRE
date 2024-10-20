package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qW2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC9051qW2 implements InterfaceC6416iq0, Runnable {
    public final Runnable a;
    public final AbstractC10079tW2 g;
    public Thread h;

    public RunnableC9051qW2(Runnable runnable, AbstractC10079tW2 abstractC10079tW2) {
        this.a = runnable;
        this.g = abstractC10079tW2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h = Thread.currentThread();
        try {
            this.a.run();
        } finally {
            dispose();
            this.h = null;
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.h == Thread.currentThread()) {
            AbstractC10079tW2 abstractC10079tW2 = this.g;
            if (abstractC10079tW2 instanceof C3407a42) {
                C3407a42 c3407a42 = (C3407a42) abstractC10079tW2;
                if (c3407a42.g) {
                    return;
                }
                c3407a42.g = true;
                c3407a42.a.shutdown();
                return;
            }
        }
        this.g.dispose();
    }
}
