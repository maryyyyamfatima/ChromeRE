package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Av4 implements Iv4 {
    public final Executor a;
    public final Object b = new Object();
    public final C7146kx1 c;

    public Av4(ExecutorC7487lw4 executorC7487lw4, C7146kx1 c7146kx1) {
        this.a = executorC7487lw4;
        this.c = c7146kx1;
    }

    @Override // defpackage.Iv4
    public final void a(ow4 ow4Var) {
        boolean z;
        synchronized (ow4Var.a) {
            z = ow4Var.c && ow4Var.e == null;
        }
        if (z) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new RunnableC10227tv4(this, ow4Var));
            }
        }
    }
}
