package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC4204cP1 extends Handler {
    public final /* synthetic */ C4548dP1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4204cP1(C4548dP1 c4548dP1) {
        super(Looper.getMainLooper());
        this.a = c4548dP1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        int i2 = message.arg1;
        Object obj = message.obj;
        Bundle peekData = message.peekData();
        C4548dP1 c4548dP1 = this.a;
        C8996qL2 c8996qL2 = (C8996qL2) c4548dP1.j.get(i2);
        if (c8996qL2 == null) {
            Log.w("MR2Provider", "Pending callback not found for control request.");
            return;
        }
        c4548dP1.j.remove(i2);
        if (i == 3) {
            c8996qL2.a((Bundle) obj);
        } else {
            if (i != 4) {
                return;
            }
            if (peekData != null) {
                peekData.getString("error");
            }
            Objects.toString((Bundle) obj);
        }
    }
}
