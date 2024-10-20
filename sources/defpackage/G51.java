package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G51 extends AbstractC10079tW2 {
    public final Handler a;
    public final boolean g;
    public volatile boolean h;

    public G51(Handler handler, boolean z) {
        this.a = handler;
        this.g = z;
    }

    @Override // defpackage.AbstractC10079tW2
    public final InterfaceC6416iq0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        boolean z = this.h;
        EnumC7565mA0 enumC7565mA0 = EnumC7565mA0.INSTANCE;
        if (z) {
            return enumC7565mA0;
        }
        Handler handler = this.a;
        H51 h51 = new H51(handler, runnable);
        Message obtain = Message.obtain(handler, h51);
        obtain.obj = this;
        if (this.g) {
            obtain.setAsynchronous(true);
        }
        this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
        if (!this.h) {
            return h51;
        }
        this.a.removeCallbacks(h51);
        return enumC7565mA0;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.h = true;
        this.a.removeCallbacksAndMessages(this);
    }
}
