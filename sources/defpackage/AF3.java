package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AF3 {
    public final Object a = new Object();
    public final C6561jF3 b = new C6561jF3();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.d && this.f == null;
        }
        return z;
    }

    public final Object k() {
        Object obj;
        synchronized (this.a) {
            try {
                if (!this.d) {
                    if (this.f != null) {
                        throw new JR2(this.f);
                    }
                    obj = this.e;
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final Exception j() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final void e(InterfaceC7371ld2 interfaceC7371ld2) {
        f(AbstractC10681vF3.a, interfaceC7371ld2);
    }

    public final void f(Executor executor, InterfaceC7371ld2 interfaceC7371ld2) {
        this.b.a(new C7027kd2(executor, interfaceC7371ld2));
        i();
    }

    public final void c(InterfaceC2872Wc2 interfaceC2872Wc2) {
        d(AbstractC10681vF3.a, interfaceC2872Wc2);
    }

    public final void d(Executor executor, InterfaceC2872Wc2 interfaceC2872Wc2) {
        this.b.a(new C2612Uc2(executor, interfaceC2872Wc2));
        i();
    }

    public final void a(InterfaceC1702Nc2 interfaceC1702Nc2) {
        b(AbstractC10681vF3.a, interfaceC1702Nc2);
    }

    public final void b(Executor executor, InterfaceC1702Nc2 interfaceC1702Nc2) {
        this.b.a(new C1443Lc2(executor, interfaceC1702Nc2));
        i();
    }

    public final AF3 h(Executor executor, InterfaceC9269r80 interfaceC9269r80) {
        AF3 af3 = new AF3();
        this.b.a(new C10984w80(executor, interfaceC9269r80, af3));
        i();
        return af3;
    }

    public final void n(Object obj) {
        synchronized (this.a) {
            g();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }

    public final void m(Exception exc) {
        synchronized (this.a) {
            g();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void g() {
        boolean z;
        String str;
        if (this.c) {
            int i = C2570Tu0.a;
            synchronized (this.a) {
                z = this.c;
            }
            if (z) {
                Exception j = j();
                if (j != null) {
                    str = "failure";
                } else if (l()) {
                    str = "result ".concat(String.valueOf(k()));
                } else {
                    str = this.d ? "cancellation" : "unknown issue";
                }
                throw new C2570Tu0(AbstractC4809e90.a("Complete with: ", str), j);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void i() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }
}
