package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kd2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7027kd2 implements InterfaceC6219iF3 {
    public final Executor a;
    public final Object b = new Object();
    public InterfaceC7371ld2 c;

    public C7027kd2(Executor executor, InterfaceC7371ld2 interfaceC7371ld2) {
        this.a = executor;
        this.c = interfaceC7371ld2;
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void b(AF3 af3) {
        if (af3.l()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new RunnableC6683jd2(this, af3));
            }
        }
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void cancel() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
