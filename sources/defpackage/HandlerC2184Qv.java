package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC2184Qv extends HandlerC10413uU3 {
    public HandlerC2184Qv(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((BasePendingResult) message.obj).f(Status.n);
                return;
            } else {
                Log.wtf("BasePendingResult", AbstractC9076qb1.a("Don't know how to handle message: ", i), new Exception());
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        try {
            ((RP2) pair.first).c((QP2) pair.second);
        } catch (RuntimeException e) {
            C2054Pv c2054Pv = BasePendingResult.n;
            throw e;
        }
    }
}
