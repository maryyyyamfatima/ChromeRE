package org.chromium.components.payments;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.AbstractC0333Co2;
import defpackage.BinderC0073Ao2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PaymentDetailsUpdateService extends Service {
    public final BinderC0073Ao2 a = new BinderC0073Ao2();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (AbstractC0333Co2.a("AndroidAppPaymentUpdateEvents")) {
            return this.a;
        }
        return null;
    }
}
