package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vy2 */
/* loaded from: classes.dex */
public final class C2852Vy2 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        C2982Wy2 c2982Wy2 = (C2982Wy2) message.obj;
        c2982Wy2.i.n(c2982Wy2);
        return true;
    }
}
