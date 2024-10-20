package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tc2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2482Tc2 implements Runnable {
    public final /* synthetic */ AF3 a;
    public final /* synthetic */ C2612Uc2 g;

    public RunnableC2482Tc2(C2612Uc2 c2612Uc2, AF3 af3) {
        this.g = c2612Uc2;
        this.a = af3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.g.b) {
            InterfaceC2872Wc2 interfaceC2872Wc2 = this.g.c;
            if (interfaceC2872Wc2 != null) {
                interfaceC2872Wc2.c(this.a.j());
            }
        }
    }
}
