package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L11 extends HandlerC10413uU3 {
    public final /* synthetic */ N11 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L11(N11 n11, Looper looper) {
        super(looper);
        this.a = n11;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Lock lock;
        int i = message.what;
        N11 n11 = this.a;
        if (i == 1) {
            lock = n11.b;
            lock.lock();
            try {
                if (n11.r()) {
                    n11.c.j = true;
                    n11.d.connect();
                }
                return;
            } finally {
                lock.unlock();
            }
        }
        if (i != 2) {
            Log.w("GoogleApiClientImpl", "Unknown message id: " + i);
        } else {
            n11.b.lock();
            try {
                if (n11.i) {
                    n11.c.j = true;
                    n11.d.connect();
                }
            } finally {
                lock = n11.b;
            }
        }
    }
}
