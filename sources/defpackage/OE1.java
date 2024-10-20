package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.WebPaymentData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OE1 implements QP2 {
    public final Status a;
    public final WebPaymentData g;

    public OE1(Status status, WebPaymentData webPaymentData) {
        this.a = status;
        this.g = webPaymentData;
    }

    @Override // defpackage.QP2
    public final Status S0() {
        return this.a;
    }
}
