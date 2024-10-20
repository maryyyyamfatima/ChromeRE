package defpackage;

import com.google.firebase.appindexing.internal.MutateRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nO0 */
/* loaded from: classes.dex */
public final class C7979nO0 {
    public final MutateRequest a;
    public final C6905kF3 b = new C6905kF3();
    public final /* synthetic */ ExecutorC8323oO0 c;

    public C7979nO0(ExecutorC8323oO0 executorC8323oO0, MutateRequest mutateRequest) {
        this.c = executorC8323oO0;
        this.a = mutateRequest;
    }

    public final void a() {
        ExecutorC8323oO0 executorC8323oO0;
        synchronized (this.c.h) {
            executorC8323oO0 = this.c;
            int i = executorC8323oO0.i;
            executorC8323oO0.i = 1;
        }
        executorC8323oO0.a.b(1, new C7635mO0(this)).d(this.c, new InterfaceC2872Wc2() { // from class: kO0
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                C7979nO0 c7979nO0;
                C7979nO0 c7979nO02 = C7979nO0.this;
                synchronized (c7979nO02.c.h) {
                    if (c7979nO02.c.h.peek() == c7979nO02) {
                        c7979nO02.c.h.remove();
                        ExecutorC8323oO0 executorC8323oO02 = c7979nO02.c;
                        executorC8323oO02.i = 0;
                        c7979nO0 = (C7979nO0) executorC8323oO02.h.peek();
                    } else {
                        c7979nO0 = null;
                    }
                }
                c7979nO02.b.c(exc);
                if (c7979nO0 != null) {
                    c7979nO0.a();
                }
            }
        });
    }
}
