package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tv4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10227tv4 implements Runnable {
    public final /* synthetic */ ow4 a;
    public final /* synthetic */ Av4 g;

    public RunnableC10227tv4(Av4 av4, ow4 ow4Var) {
        this.g = av4;
        this.a = ow4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.g.b) {
            C7146kx1 c7146kx1 = this.g.c;
            if (c7146kx1 != null) {
                ow4 ow4Var = this.a;
                synchronized (ow4Var.a) {
                    if (!ow4Var.c) {
                        throw new IllegalStateException("Task is not yet complete");
                    }
                    Exception exc = ow4Var.e;
                    if (exc != null) {
                        throw new IR2(exc);
                    }
                    obj = ow4Var.d;
                }
                C8178nx1 c8178nx1 = c7146kx1.a;
                c8178nx1.getClass();
                c8178nx1.d = ((Integer) obj).intValue();
            }
        }
    }
}
