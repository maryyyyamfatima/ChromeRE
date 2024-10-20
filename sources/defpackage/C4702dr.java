package defpackage;

import androidx.preference.Preference;
import com.android.chrome.R;
import org.chromium.chrome.browser.autofill.settings.AutofillPaymentMethodsFragment;
import org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4702dr implements ServiceWorkerPaymentAppBridge.HasServiceWorkerPaymentAppsCallback {
    public final /* synthetic */ Preference a;
    public final /* synthetic */ AutofillPaymentMethodsFragment b;

    public C4702dr(AutofillPaymentMethodsFragment autofillPaymentMethodsFragment, Preference preference) {
        this.b = autofillPaymentMethodsFragment;
        this.a = preference;
    }

    @Override // org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge.HasServiceWorkerPaymentAppsCallback
    public final void a(boolean z) {
        int i = AutofillPaymentMethodsFragment.j0;
        this.b.getClass();
        Preference preference = this.a;
        if (z) {
            preference.P(null);
            preference.G(true);
        } else {
            preference.O(R.string.f81050_resource_name_obfuscated_res_0x7f1407f5);
            preference.G(false);
        }
    }
}
