package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LW0 extends Handler {
    public final /* synthetic */ MW0 a;

    public LW0(MW0 mw0) {
        this.a = mw0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 3) {
            super.handleMessage(message);
            return;
        }
        MW0 mw0 = this.a;
        if (mw0.g == null) {
            return;
        }
        Bundle bundle = (Bundle) message.obj;
        String c = mw0.d.c(bundle.getByteArray("ssb_service:ssb_state"));
        EI2.h(0, 2, "Search.GsaAccountChangeNotificationSource");
        NW0.c(mw0.e).f(c);
        Callback callback = mw0.f;
        if (callback != null) {
            callback.onResult(bundle);
        }
    }
}
