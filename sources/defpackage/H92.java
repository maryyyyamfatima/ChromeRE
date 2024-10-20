package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H92 extends X82 implements Callable {
    public final Callable a;

    public H92(CallableC3731b10 callableC3731b10) {
        this.a = callableC3731b10;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        C3170Yk0 c3170Yk0 = new C3170Yk0(interfaceC11128wa2);
        interfaceC11128wa2.c(c3170Yk0);
        if (c3170Yk0.a()) {
            return;
        }
        try {
            Object call = this.a.call();
            Q82.a(call, "Callable returned null");
            int i = c3170Yk0.get();
            if ((i & 54) != 0) {
                return;
            }
            InterfaceC11128wa2 interfaceC11128wa22 = c3170Yk0.a;
            if (i == 8) {
                c3170Yk0.g = call;
                c3170Yk0.lazySet(16);
                interfaceC11128wa22.d(null);
            } else {
                c3170Yk0.lazySet(2);
                interfaceC11128wa22.d(call);
            }
            if (c3170Yk0.get() != 4) {
                interfaceC11128wa22.b();
            }
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            if (!c3170Yk0.a()) {
                interfaceC11128wa2.onError(th);
            } else {
                MR2.b(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object call = this.a.call();
        Q82.a(call, "The callable returned a null value");
        return call;
    }
}
