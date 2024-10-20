package org.chromium.chrome.browser.privacy_sandbox;

import J.N;
import android.os.Bundle;
import com.android.chrome.R;
import defpackage.L53;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SpamFraudFragment extends PrivacySandboxSettingsBaseFragment {
    @Override // org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsBaseFragment, defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        F0();
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f1408fb);
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f18003b);
        M0("spam_fraud_description").O(N.MhaiireD() ? R.string.0_resource_name_obfuscated_res_0x7f1408f9 : R.string.0_resource_name_obfuscated_res_0x7f1408f8);
    }
}
