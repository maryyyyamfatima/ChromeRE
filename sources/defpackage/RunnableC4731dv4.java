package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dv4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4731dv4 implements Runnable {
    public final /* synthetic */ ow4 a;
    public final /* synthetic */ C8169nv4 g;

    public RunnableC4731dv4(C8169nv4 c8169nv4, ow4 ow4Var) {
        this.g = c8169nv4;
        this.a = ow4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        synchronized (this.g.b) {
            try {
                InterfaceC2742Vc2 interfaceC2742Vc2 = this.g.c;
                if (interfaceC2742Vc2 != null) {
                    ow4 ow4Var = this.a;
                    synchronized (ow4Var.a) {
                        exc = ow4Var.e;
                    }
                    interfaceC2742Vc2.c(exc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
