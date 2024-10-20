package defpackage;

import com.google.android.gms.wallet.callback.CallbackOutput;
import com.google.android.gms.wallet.callback.PaymentDataRequestUpdate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1794Nv implements InterfaceC1572Mc2 {
    public final InterfaceC1572Mc2 a;

    @Override // defpackage.InterfaceC1572Mc2
    public final void a(Object obj) {
        PaymentDataRequestUpdate paymentDataRequestUpdate = (PaymentDataRequestUpdate) obj;
        synchronized (this) {
            InterfaceC1572Mc2 interfaceC1572Mc2 = this.a;
            C5527gF r1 = CallbackOutput.r1();
            CallbackOutput callbackOutput = r1.a;
            callbackOutput.a = 2;
            callbackOutput.g = 1;
            byte[] b = ST2.b(paymentDataRequestUpdate);
            CallbackOutput callbackOutput2 = r1.a;
            callbackOutput2.h = b;
            interfaceC1572Mc2.a(callbackOutput2);
        }
    }

    public C1794Nv(C6782ju c6782ju) {
        this.a = c6782ju;
    }
}
