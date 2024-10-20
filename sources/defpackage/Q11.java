package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Q11 extends HandlerC10413uU3 {
    public final /* synthetic */ R11 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q11(R11 r11, Looper looper) {
        super(looper);
        this.a = r11;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                throw ((RuntimeException) message.obj);
            }
            Log.w("GACStateManager", "Unknown message id: " + i);
            return;
        }
        P11 p11 = (P11) message.obj;
        R11 r11 = this.a;
        p11.getClass();
        r11.a.lock();
        try {
            if (r11.p == p11.a) {
                p11.a();
            }
        } finally {
            r11.a.unlock();
        }
    }
}
