package org.chromium.chrome.browser.ui.fast_checkout;

import defpackage.EH0;
import defpackage.UB;
import org.chromium.chrome.browser.ui.fast_checkout.data.FastCheckoutAutofillProfile;
import org.chromium.chrome.browser.ui.fast_checkout.data.FastCheckoutCreditCard;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class FastCheckoutBridge {
    public final EH0 a = new EH0();

    public final void destroy() {
    }

    public FastCheckoutBridge(WindowAndroid windowAndroid) {
    }

    public static FastCheckoutBridge create(long j, WindowAndroid windowAndroid) {
        if (UB.a(windowAndroid) == null) {
            return null;
        }
        return new FastCheckoutBridge(windowAndroid);
    }

    public final void showBottomSheet(FastCheckoutAutofillProfile[] fastCheckoutAutofillProfileArr, FastCheckoutCreditCard[] fastCheckoutCreditCardArr) {
        this.a.getClass();
    }

    public static void setAutofillProfile(FastCheckoutAutofillProfile[] fastCheckoutAutofillProfileArr, int i, FastCheckoutAutofillProfile fastCheckoutAutofillProfile) {
        fastCheckoutAutofillProfileArr[i] = fastCheckoutAutofillProfile;
    }

    public static void setCreditCard(FastCheckoutCreditCard[] fastCheckoutCreditCardArr, int i, FastCheckoutCreditCard fastCheckoutCreditCard) {
        fastCheckoutCreditCardArr[i] = fastCheckoutCreditCard;
    }

    public static FastCheckoutAutofillProfile[] createAutofillProfilesArray(int i) {
        return new FastCheckoutAutofillProfile[i];
    }

    public static FastCheckoutCreditCard[] createCreditCardsArray(int i) {
        return new FastCheckoutCreditCard[i];
    }
}
