package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nv4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8169nv4 implements Iv4 {
    public final Executor a;
    public final Object b = new Object();
    public final InterfaceC2742Vc2 c;

    public C8169nv4(ExecutorC7487lw4 executorC7487lw4, InterfaceC2742Vc2 interfaceC2742Vc2) {
        this.a = executorC7487lw4;
        this.c = interfaceC2742Vc2;
    }

    @Override // defpackage.Iv4
    public final void a(ow4 ow4Var) {
        boolean z;
        synchronized (ow4Var.a) {
            z = ow4Var.c && ow4Var.e == null;
        }
        if (z) {
            return;
        }
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new RunnableC4731dv4(this, ow4Var));
        }
    }
}
