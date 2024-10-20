package defpackage;

import com.google.common.util.concurrent.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class E0 extends s implements Runnable {
    public static final /* synthetic */ int l = 0;
    public RD1 j;
    public Object k;

    public abstract Object y(Object obj, Object obj2);

    public abstract void z(Object obj);

    public E0(RD1 rd1, Object obj) {
        this.j = rd1;
        this.k = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RD1 rd1 = this.j;
        Object obj = this.k;
        if ((isCancelled() | (rd1 == null)) || (obj == null)) {
            return;
        }
        this.j = null;
        if (rd1.isCancelled()) {
            v(rd1);
            return;
        }
        try {
            rd1.isDone();
            try {
                Object y = y(obj, AbstractC7515m14.a(rd1));
                this.k = null;
                z(y);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    u(th);
                } finally {
                    this.k = null;
                }
            }
        } catch (Error e) {
            u(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            u(e2);
        } catch (ExecutionException e3) {
            u(e3.getCause());
        }
    }

    @Override // com.google.common.util.concurrent.n
    public final void k() {
        q(this.j);
        this.j = null;
        this.k = null;
    }

    @Override // com.google.common.util.concurrent.n
    public final String r() {
        String str;
        RD1 rd1 = this.j;
        Object obj = this.k;
        String r = super.r();
        if (rd1 != null) {
            str = "inputFuture=[" + rd1 + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (r != null) {
                return AbstractC7848n0.a(str, r);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }
}
