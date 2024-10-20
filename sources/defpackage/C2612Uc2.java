package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uc2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2612Uc2 implements InterfaceC6219iF3 {
    public final Executor a;
    public final Object b = new Object();
    public InterfaceC2872Wc2 c;

    public C2612Uc2(Executor executor, InterfaceC2872Wc2 interfaceC2872Wc2) {
        this.a = executor;
        this.c = interfaceC2872Wc2;
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void b(AF3 af3) {
        if (af3.l() || af3.d) {
            return;
        }
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new RunnableC2482Tc2(this, af3));
        }
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void cancel() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
