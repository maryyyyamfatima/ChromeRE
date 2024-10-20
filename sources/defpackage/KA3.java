package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KA3 extends Handler {
    public final /* synthetic */ LA3 a;

    public KA3(LA3 la3) {
        this.a = la3;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        MA3 ma3;
        boolean z;
        if (message != null && message.what == 1 && (z = (ma3 = this.a.g).k) && z) {
            ma3.k = false;
            ma3.u();
        }
    }
}
