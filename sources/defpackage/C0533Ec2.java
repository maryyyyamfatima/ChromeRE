package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ec2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533Ec2 implements InterfaceC6219iF3 {
    public final Executor a;
    public final Object b = new Object();
    public InterfaceC0663Fc2 c;

    public C0533Ec2(ExecutorC9652sF3 executorC9652sF3, InterfaceC0663Fc2 interfaceC0663Fc2) {
        this.a = executorC9652sF3;
        this.c = interfaceC0663Fc2;
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void cancel() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void b(AF3 af3) {
        if (af3.d) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new RunnableC0403Dc2(this));
            }
        }
    }
}
