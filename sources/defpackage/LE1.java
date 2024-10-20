package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class LE1 extends Handler {
    public final /* synthetic */ ME1 a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ME1 me1 = this.a;
        float f = me1.c + 0.1f;
        me1.c = f;
        me1.c = Math.min(1.0f, f);
        me1.a.l(KE1.b, me1.c);
        if (JM1.a(me1.c, 1.0f)) {
            me1.a.m(KE1.a, 1);
        } else {
            sendEmptyMessageDelayed(1, 10L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LE1(ME1 me1, Looper looper) {
        super(looper);
        this.a = me1;
    }
}
