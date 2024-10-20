package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nZ0 */
/* loaded from: classes.dex */
public final class C8034nZ0 implements Handler.Callback {
    public final /* synthetic */ C8378oZ0 a;

    public C8034nZ0(C8378oZ0 c8378oZ0) {
        this.a = c8378oZ0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        C8378oZ0 c8378oZ0 = this.a;
        if (i == 1) {
            c8378oZ0.b((C7346lZ0) message.obj);
            return true;
        }
        if (i != 2) {
            return false;
        }
        c8378oZ0.d.n((C7346lZ0) message.obj);
        return false;
    }
}
