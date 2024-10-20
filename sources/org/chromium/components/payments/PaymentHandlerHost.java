package org.chromium.components.payments;

import J.N;
import defpackage.C2287Rp2;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PaymentHandlerHost {
    public long a;

    public PaymentHandlerHost(WebContents webContents, C2287Rp2 c2287Rp2) {
        this.a = N.MNMwlyDN(webContents, c2287Rp2);
    }

    public long getNativeBridge() {
        return this.a;
    }
}
