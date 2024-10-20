package defpackage;

import android.os.Message;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y7 implements View.OnClickListener {
    public final /* synthetic */ C5146f8 a;

    public Y7(C5146f8 c5146f8) {
        this.a = c5146f8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message obtain;
        Message message;
        Message message2;
        Message message3;
        C5146f8 c5146f8 = this.a;
        if (view == c5146f8.k && (message3 = c5146f8.m) != null) {
            obtain = Message.obtain(message3);
        } else if (view == c5146f8.o && (message2 = c5146f8.q) != null) {
            obtain = Message.obtain(message2);
        } else {
            obtain = (view != c5146f8.s || (message = c5146f8.u) == null) ? null : Message.obtain(message);
        }
        if (obtain != null) {
            obtain.sendToTarget();
        }
        c5146f8.L.obtainMessage(1, c5146f8.b).sendToTarget();
    }
}
