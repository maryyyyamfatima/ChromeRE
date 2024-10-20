package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC8323oO0 implements InterfaceC1702Nc2, Executor {
    public final AbstractC7856n11 a;
    public final HandlerC10413uU3 g;
    public final ArrayDeque h = new ArrayDeque();
    public int i = 0;

    public ExecutorC8323oO0(C6603jO0 c6603jO0) {
        this.a = c6603jO0;
        this.g = new HandlerC10413uU3(c6603jO0.f);
    }

    @Override // defpackage.InterfaceC1702Nc2
    public final void b(AF3 af3) {
        C7979nO0 c7979nO0;
        synchronized (this.h) {
            c7979nO0 = this.i == 2 ? (C7979nO0) this.h.peek() : null;
            this.i = 0;
        }
        if (c7979nO0 != null) {
            c7979nO0.a();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.g.post(runnable);
    }
}
