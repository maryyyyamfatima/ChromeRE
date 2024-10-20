package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ef3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549Ef3 implements Handler.Callback {
    public final /* synthetic */ C1199Jf3 a;

    public C0549Ef3(C1199Jf3 c1199Jf3) {
        this.a = c1199Jf3;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C1199Jf3 c1199Jf3 = this.a;
        C0939Hf3 c0939Hf3 = (C0939Hf3) message.obj;
        synchronized (c1199Jf3.a) {
            if (c1199Jf3.c == c0939Hf3 || c1199Jf3.d == c0939Hf3) {
                c1199Jf3.a(c0939Hf3, 2);
            }
        }
        return true;
    }
}
