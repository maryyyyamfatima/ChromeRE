package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C01 implements Handler.Callback {
    public final /* synthetic */ D01 a;

    public C01(D01 d01) {
        this.a = d01;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.a) {
                A01 a01 = (A01) message.obj;
                B01 b01 = (B01) this.a.a.get(a01);
                if (b01 != null && b01.a.isEmpty()) {
                    if (b01.h) {
                        b01.l.c.removeMessages(1, b01.j);
                        D01 d01 = b01.l;
                        d01.d.d(d01.b, b01);
                        b01.h = false;
                        b01.g = 2;
                    }
                    this.a.a.remove(a01);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.a.a) {
            A01 a012 = (A01) message.obj;
            B01 b012 = (B01) this.a.a.get(a012);
            if (b012 != null && b012.g == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(a012)), new Exception());
                ComponentName componentName = b012.k;
                if (componentName == null) {
                    componentName = a012.c;
                }
                if (componentName == null) {
                    componentName = new ComponentName(a012.b, "unknown");
                }
                b012.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
