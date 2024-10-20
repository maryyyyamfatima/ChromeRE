package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.WebPaymentData;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class L31 implements RP2 {
    public final /* synthetic */ N31 a;

    public L31(N31 n31) {
        this.a = n31;
    }

    @Override // defpackage.RP2
    public final void c(QP2 qp2) {
        OE1 oe1 = (OE1) qp2;
        N31 n31 = this.a;
        n31.v.getClass();
        WebPaymentData webPaymentData = oe1.g;
        String str = webPaymentData != null ? webPaymentData.a : null;
        Status status = oe1.a;
        if (status != null && status.r1()) {
            n31.G(str);
            return;
        }
        if (status != null) {
            PendingIntent pendingIntent = status.i;
            if (pendingIntent != null) {
                WebContents webContents = n31.p;
                WindowAndroid Q0 = (webContents == null || webContents.isDestroyed()) ? null : webContents.Q0();
                if (Q0 == null) {
                    n31.G(null);
                    return;
                } else {
                    Q0.y(pendingIntent, n31, Integer.valueOf(n31.t));
                    return;
                }
            }
        }
        n31.G(null);
    }
}
