package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TN2 implements Runnable {
    public final Callable a;
    public final InterfaceC11989z40 g;
    public final Handler h;

    public TN2(Handler handler, VR0 vr0, WR0 wr0) {
        this.a = vr0;
        this.g = wr0;
        this.h = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.a.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.h.post(new SN2(this.g, obj));
    }
}
