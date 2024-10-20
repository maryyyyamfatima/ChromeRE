package org.chromium.chrome.browser.feed.settings;

import J.N;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AT0;
import defpackage.AbstractC0123Ay2;
import defpackage.InterfaceC9213qy2;
import defpackage.L53;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FeedAutoplaySettingsFragment extends AbstractC0123Ay2 implements AT0, InterfaceC9213qy2 {
    @Override // defpackage.AT0
    public final void f(SettingsLauncher settingsLauncher) {
    }

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180016);
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f14049b);
        RadioButtonGroupVideoPreviewsPreference radioButtonGroupVideoPreviewsPreference = (RadioButtonGroupVideoPreviewsPreference) M0("video_previews_pref");
        radioButtonGroupVideoPreviewsPreference.j = this;
        radioButtonGroupVideoPreviewsPreference.T = N.MC3MPpYa();
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        N.MEA3kwB5(((Integer) obj).intValue());
        return true;
    }
}
