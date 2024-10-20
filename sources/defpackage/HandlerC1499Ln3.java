package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ln3 */
/* loaded from: classes.dex */
public final class HandlerC1499Ln3 extends Handler {
    public final /* synthetic */ C1758Nn3 a;

    public HandlerC1499Ln3(C1758Nn3 c1758Nn3) {
        this.a = c1758Nn3;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        C1758Nn3 c1758Nn3 = this.a;
        if (i == 1) {
            c1758Nn3.e(true, false);
            ((C9897sy1) c1758Nn3.a).N(null);
        } else {
            if (i != 2) {
                return;
            }
            ((C9897sy1) c1758Nn3.a).N(null);
        }
    }
}
