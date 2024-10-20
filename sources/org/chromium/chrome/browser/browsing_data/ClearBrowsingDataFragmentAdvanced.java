package org.chromium.chrome.browser.browsing_data;

import android.os.Bundle;
import androidx.preference.Preference;
import defpackage.EI2;
import defpackage.FI2;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ClearBrowsingDataFragmentAdvanced extends ClearBrowsingDataFragment {
    @Override // org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment
    public final int T0() {
        return 1;
    }

    @Override // org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment, defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        super.O0(str, bundle);
        Preference M0 = M0("clear_google_data_text");
        if (M0 != null) {
            N0().b0(M0);
        }
        Preference M02 = M0("clear_search_history_non_google_text");
        if (M02 != null) {
            N0().b0(M02);
        }
        M0("sign_out_of_chrome_text");
    }

    @Override // org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment
    public final void Y0() {
        EI2.h(1, 2, "History.ClearBrowsingData.UserDeletedFromTab");
        FI2.a("ClearBrowsingData_AdvancedTab");
    }

    @Override // org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment
    public final List V0() {
        return Arrays.asList(0, 1, 2, 3, 4, 5);
    }
}
