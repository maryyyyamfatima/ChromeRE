package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fW0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5269fW0 implements Runnable {
    public final Future a;
    public final InterfaceC4582dW0 g;

    public RunnableC5269fW0(Future future, InterfaceC4582dW0 interfaceC4582dW0) {
        this.a = future;
        this.g = interfaceC4582dW0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable a;
        Future future = this.a;
        boolean z = future instanceof AbstractC8823pq1;
        InterfaceC4582dW0 interfaceC4582dW0 = this.g;
        if (z && (a = ((AbstractC8823pq1) future).a()) != null) {
            interfaceC4582dW0.b(a);
            return;
        }
        try {
            interfaceC4582dW0.a(AbstractC5957hW0.b(future));
        } catch (Error e) {
            e = e;
            interfaceC4582dW0.b(e);
        } catch (RuntimeException e2) {
            e = e2;
            interfaceC4582dW0.b(e);
        } catch (ExecutionException e3) {
            interfaceC4582dW0.b(e3.getCause());
        }
    }

    public final String toString() {
        UY1 a = VY1.a(this);
        TY1 ty1 = new TY1();
        a.c.c = ty1;
        a.c = ty1;
        ty1.b = this.g;
        return a.toString();
    }
}
