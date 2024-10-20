package org.chromium.components.payments;

import defpackage.C4687do2;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public interface PaymentRequestUpdateEventListener {
    boolean a(C4687do2 c4687do2);

    boolean changePaymentMethodFromInvokedApp(String str, String str2);

    boolean changeShippingAddress(ByteBuffer byteBuffer);

    boolean changeShippingOptionFromInvokedApp(String str);
}
