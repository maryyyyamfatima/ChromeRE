package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10044tP2 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((JO2) message.obj).b();
        return true;
    }
}
