package org.chromium.chrome.browser.merchant_viewer;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MerchantTrustSignalsEvent {
    public final String a;
    public final long b;

    public MerchantTrustSignalsEvent(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public static List createEventList() {
        return new ArrayList();
    }

    public static MerchantTrustSignalsEvent createEventAndAddToList(List list, String str, long j) {
        MerchantTrustSignalsEvent merchantTrustSignalsEvent = new MerchantTrustSignalsEvent(str, j);
        list.add(merchantTrustSignalsEvent);
        return merchantTrustSignalsEvent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MerchantTrustSignalsEvent)) {
            return false;
        }
        MerchantTrustSignalsEvent merchantTrustSignalsEvent = (MerchantTrustSignalsEvent) obj;
        return this.a.equals(merchantTrustSignalsEvent.a) && this.b == merchantTrustSignalsEvent.b;
    }

    public final int hashCode() {
        String str = this.a;
        return ((527 + (str == null ? 0 : str.hashCode())) * 31) + ((int) this.b);
    }
}
