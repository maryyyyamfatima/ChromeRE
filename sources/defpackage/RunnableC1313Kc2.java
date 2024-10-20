package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kc2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1313Kc2 implements Runnable {
    public final /* synthetic */ AF3 a;
    public final /* synthetic */ C1443Lc2 g;

    public RunnableC1313Kc2(C1443Lc2 c1443Lc2, AF3 af3) {
        this.g = c1443Lc2;
        this.a = af3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.g.b) {
            InterfaceC1702Nc2 interfaceC1702Nc2 = this.g.c;
            if (interfaceC1702Nc2 != null) {
                interfaceC1702Nc2.b(this.a);
            }
        }
    }
}
