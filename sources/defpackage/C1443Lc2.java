package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lc2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1443Lc2 implements InterfaceC6219iF3 {
    public final Executor a;
    public final Object b = new Object();
    public InterfaceC1702Nc2 c;

    public C1443Lc2(Executor executor, InterfaceC1702Nc2 interfaceC1702Nc2) {
        this.a = executor;
        this.c = interfaceC1702Nc2;
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void b(AF3 af3) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new RunnableC1313Kc2(this, af3));
        }
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void cancel() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
