package org.chromium.chrome.browser.tracing.settings;

import android.os.Bundle;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.L53;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class DeveloperSettings extends AbstractC0123Ay2 {
    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle("Developer options");
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180011);
        N0().b0(M0("beta_stable_hint"));
    }
}
