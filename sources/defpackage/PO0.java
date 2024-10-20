package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.WebPaymentDataRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PO0 extends AbstractC8508ov {
    public final /* synthetic */ WebPaymentDataRequest q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PO0(AbstractC10600v11 abstractC10600v11, WebPaymentDataRequest webPaymentDataRequest) {
        super(Gj4.a, abstractC10600v11);
        this.q = webPaymentDataRequest;
    }

    @Override // defpackage.AbstractC8508ov
    public final void m(InterfaceC3129Yc interfaceC3129Yc) {
        Kj4 kj4 = (Kj4) interfaceC3129Yc;
        WebPaymentDataRequest webPaymentDataRequest = this.q;
        Bundle y = kj4.y();
        Jj4 jj4 = new Jj4(this);
        try {
            C10465ue1 c10465ue1 = (C10465ue1) ((InterfaceC11151we1) kj4.m());
            Parcel a = c10465ue1.a();
            AbstractC11786yV.b(a, webPaymentDataRequest);
            AbstractC11786yV.b(a, y);
            AbstractC11786yV.c(a, jj4);
            c10465ue1.M0(17, a);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting web payment data", e);
            Status status = Status.m;
            Bundle bundle = Bundle.EMPTY;
            jj4.o0(status, null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final QP2 e(Status status) {
        return new OE1(status, WebPaymentData.r1().a);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, defpackage.InterfaceC8851pv
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a((QP2) obj);
    }
}
