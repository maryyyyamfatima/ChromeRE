package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class J21 extends Handler {
    public final /* synthetic */ BlockingQueue a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J21(Looper looper, LinkedBlockingQueue linkedBlockingQueue) {
        super(looper);
        this.a = linkedBlockingQueue;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.a.add((Intent) message.obj);
    }
}
