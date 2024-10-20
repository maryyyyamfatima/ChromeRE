package org.chromium.chrome.browser.privacy.settings;

import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.InterfaceC9213qy2;
import defpackage.L53;
import defpackage.R44;
import org.chromium.chrome.browser.privacy.settings.DoNotTrackSettings;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DoNotTrackSettings extends AbstractC0123Ay2 {
    public static final /* synthetic */ int j0 = 0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180012);
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f14040a);
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("do_not_track_switch");
        final PrefService a = R44.a(Profile.d());
        chromeSwitchPreference.W(a.a("enable_do_not_track"));
        chromeSwitchPreference.j = new InterfaceC9213qy2() { // from class: xq0
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                int i = DoNotTrackSettings.j0;
                PrefService.this.e("enable_do_not_track", ((Boolean) obj).booleanValue());
                return true;
            }
        };
    }
}
