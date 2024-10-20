package org.chromium.chrome.browser.privacy_sandbox;

import J.N;
import android.os.Bundle;
import com.android.chrome.R;
import defpackage.AbstractC9108qg3;
import defpackage.C11997z52;
import defpackage.C8765pg3;
import defpackage.L53;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.privacy_sandbox.AdMeasurementFragment;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AdMeasurementFragment extends PrivacySandboxSettingsBaseFragment {
    public Runnable k0;

    @Override // org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsBaseFragment, defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        F0();
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f1408bd);
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180003);
        ((ChromeBasePreference) M0("ad_measurement_description")).P(AbstractC9108qg3.a(N().getString(N.MhaiireD() ? R.string.0_resource_name_obfuscated_res_0x7f1408bb : R.string.0_resource_name_obfuscated_res_0x7f1408ba), new C8765pg3(new C11997z52(K(), new Callback() { // from class: y6
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                AdMeasurementFragment.this.k0.run();
            }
        }), "<link>", "</link>")));
    }
}
