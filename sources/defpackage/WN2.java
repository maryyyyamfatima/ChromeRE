package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WN2 implements InterfaceFutureC4925eW0, InterfaceC4200cO2 {
    public final int a = Integer.MIN_VALUE;
    public final int g = Integer.MIN_VALUE;
    public Object h;
    public GN2 i;
    public boolean j;
    public boolean k;
    public boolean l;
    public EZ0 m;

    @Override // defpackage.GA1
    public final void a() {
    }

    @Override // defpackage.GA1
    public final void b() {
    }

    @Override // defpackage.TE3
    public final void h(InterfaceC11153we3 interfaceC11153we3) {
    }

    @Override // defpackage.TE3
    public final void k(Drawable drawable) {
    }

    @Override // defpackage.TE3
    public final void m(Drawable drawable) {
    }

    @Override // defpackage.GA1
    public final void onDestroy() {
    }

    static {
        new VN2();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.j = true;
            notifyAll();
            GN2 gn2 = null;
            if (z) {
                GN2 gn22 = this.i;
                this.i = null;
                gn2 = gn22;
            }
            if (gn2 != null) {
                gn2.clear();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.j;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.j && !this.k) {
            z = this.l;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return n(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return n(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.TE3
    public final void c(InterfaceC11153we3 interfaceC11153we3) {
        ((C3133Yc3) interfaceC11153we3).m(this.a, this.g);
    }

    @Override // defpackage.TE3
    public final synchronized void e(GN2 gn2) {
        this.i = gn2;
    }

    @Override // defpackage.TE3
    public final synchronized GN2 l() {
        return this.i;
    }

    @Override // defpackage.TE3
    public final synchronized void i(Drawable drawable) {
    }

    @Override // defpackage.TE3
    public final synchronized void d(Object obj, OV3 ov3) {
    }

    public final synchronized Object n(Long l) {
        if (!isDone()) {
            char[] cArr = AbstractC10296u74.a;
            if (!(!(Looper.myLooper() == Looper.getMainLooper()))) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.j) {
            throw new CancellationException();
        }
        if (this.l) {
            throw new ExecutionException(this.m);
        }
        if (this.k) {
            return this.h;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                wait(longValue - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.l) {
            throw new ExecutionException(this.m);
        }
        if (this.j) {
            throw new CancellationException();
        }
        if (!this.k) {
            throw new TimeoutException();
        }
        return this.h;
    }

    @Override // defpackage.InterfaceC4200cO2
    public final synchronized void j(EZ0 ez0) {
        this.l = true;
        this.m = ez0;
        notifyAll();
    }

    @Override // defpackage.InterfaceC4200cO2
    public final synchronized void g(Object obj) {
        this.k = true;
        this.h = obj;
        notifyAll();
    }

    public final String toString() {
        GN2 gn2;
        String str;
        String a = AbstractC7848n0.a(super.toString(), "[status=");
        synchronized (this) {
            gn2 = null;
            if (this.j) {
                str = "CANCELLED";
            } else if (this.l) {
                str = "FAILURE";
            } else if (this.k) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                gn2 = this.i;
            }
        }
        if (gn2 == null) {
            return AbstractC8192o0.a(a, str, "]");
        }
        return a + str + ", request=[" + String.valueOf(gn2) + "]]";
    }
}
