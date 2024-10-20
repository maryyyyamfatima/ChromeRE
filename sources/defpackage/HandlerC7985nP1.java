package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC7985nP1 extends Handler {
    public final /* synthetic */ DialogC9357rP1 a;

    public HandlerC7985nP1(DialogC9357rP1 dialogC9357rP1) {
        this.a = dialogC9357rP1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        List list = (List) message.obj;
        DialogC9357rP1 dialogC9357rP1 = this.a;
        dialogC9357rP1.getClass();
        dialogC9357rP1.r = SystemClock.uptimeMillis();
        dialogC9357rP1.n.clear();
        dialogC9357rP1.n.addAll(list);
        dialogC9357rP1.o.notifyDataSetChanged();
    }
}
