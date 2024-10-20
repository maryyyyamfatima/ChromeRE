package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D01 {
    public static final Object g = new Object();
    public static D01 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile HandlerC10413uU3 c;
    public final S30 d;
    public final long e;
    public final long f;

    public D01(Context context, Looper looper) {
        C01 c01 = new C01(this);
        this.b = context.getApplicationContext();
        this.c = new HandlerC10413uU3(looper, c01);
        this.d = S30.c();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static D01 b(Context context) {
        synchronized (g) {
            if (h == null) {
                h = new D01(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return h;
    }

    public final boolean a(A01 a01, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean z;
        synchronized (this.a) {
            B01 b01 = (B01) this.a.get(a01);
            if (b01 == null) {
                b01 = new B01(this, a01);
                b01.a.put(serviceConnection, serviceConnection);
                b01.a(str, executor);
                this.a.put(a01, b01);
            } else {
                this.c.removeMessages(0, a01);
                if (b01.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(String.valueOf(a01)));
                }
                b01.a.put(serviceConnection, serviceConnection);
                int i2 = b01.g;
                if (i2 == 1) {
                    serviceConnection.onServiceConnected(b01.k, b01.i);
                } else if (i2 == 2) {
                    b01.a(str, executor);
                }
            }
            z = b01.h;
        }
        return z;
    }

    public final void c(A01 a01, ServiceConnection serviceConnection) {
        synchronized (this.a) {
            B01 b01 = (B01) this.a.get(a01);
            if (b01 == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: ".concat(String.valueOf(a01)));
            }
            if (!b01.a.containsKey(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(String.valueOf(a01)));
            }
            b01.a.remove(serviceConnection);
            if (b01.a.isEmpty()) {
                this.c.sendMessageDelayed(this.c.obtainMessage(0, a01), this.e);
            }
        }
    }
}
