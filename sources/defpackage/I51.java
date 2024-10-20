package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I51 extends AbstractC10422uW2 {
    public final Handler b;

    public I51(Handler handler) {
        this.b = handler;
    }

    @Override // defpackage.AbstractC10422uW2
    public final InterfaceC6416iq0 d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.b;
        H51 h51 = new H51(handler, runnable);
        handler.sendMessageDelayed(Message.obtain(handler, h51), timeUnit.toMillis(j));
        return h51;
    }

    @Override // defpackage.AbstractC10422uW2
    public final AbstractC10079tW2 b() {
        return new G51(this.b, false);
    }
}
