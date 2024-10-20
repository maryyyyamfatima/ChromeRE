package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.WebPaymentData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Jj4 extends Hj4 {
    public final InterfaceC8851pv a;

    public Jj4(InterfaceC8851pv interfaceC8851pv) {
        this.a = interfaceC8851pv;
    }

    @Override // defpackage.Hj4, defpackage.InterfaceC3146Yf1
    public final void o0(Status status, WebPaymentData webPaymentData) {
        this.a.a(new OE1(status, webPaymentData));
    }
}
