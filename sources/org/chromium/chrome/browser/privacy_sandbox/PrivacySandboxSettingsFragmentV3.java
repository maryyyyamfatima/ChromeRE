package org.chromium.chrome.browser.privacy_sandbox;

import J.N;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C7928nE;
import defpackage.EI2;
import defpackage.FI2;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC9213qy2;
import defpackage.L53;
import defpackage.UN;
import org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsFragmentV3;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PrivacySandboxSettingsFragmentV3 extends PrivacySandboxSettingsBaseFragment implements InterfaceC9213qy2 {
    public static final /* synthetic */ int k0 = 0;

    @Override // org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsBaseFragment, defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        F0();
        getActivity().setTitle(R.string.f81930_resource_name_obfuscated_res_0x7f140851);
        L53.a(this, R.xml.f114170_resource_name_obfuscated_res_0x7f180030);
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("privacy_sandbox_toggle");
        chromeSwitchPreference.j = this;
        chromeSwitchPreference.b0(new InterfaceC4184cL1() { // from class: TA2
            @Override // defpackage.InterfaceC4184cL1
            public final /* synthetic */ boolean a(Preference preference) {
                return false;
            }

            @Override // defpackage.InterfaceC4184cL1
            public final /* synthetic */ boolean b(Preference preference) {
                return AbstractC3841bL1.a(this, preference);
            }

            @Override // defpackage.InterfaceC4184cL1
            public final /* synthetic */ boolean c() {
                return AbstractC9008qO.a();
            }

            @Override // defpackage.InterfaceC4184cL1
            public final boolean d(Preference preference) {
                int i = PrivacySandboxSettingsFragmentV3.k0;
                if ("privacy_sandbox_toggle".equals(preference.q)) {
                    return N.MNmYFihT();
                }
                return false;
            }
        });
        chromeSwitchPreference.W(N.MhaiireD());
        ChromeBasePreference chromeBasePreference = (ChromeBasePreference) M0("privacy_sandbox_learn_more");
        SpannableString spannableString = new SpannableString(N().getString(R.string.f82960_resource_name_obfuscated_res_0x7f1408b9));
        spannableString.setSpan(new ForegroundColorSpan(K().getColor(R.color.f18110_resource_name_obfuscated_res_0x7f070143)), 0, spannableString.length(), 17);
        chromeBasePreference.P(spannableString);
        int i = this.l.getInt("privacy-sandbox-referrer");
        EI2.h(i, 3, "Settings.PrivacySandbox.PrivacySandboxReferrer");
        if (i == 0) {
            FI2.a("Settings.PrivacySandbox.OpenedFromSettingsParent");
        } else if (i == 1) {
            FI2.a("Settings.PrivacySandbox.OpenedFromCookiesPageToast");
        }
    }

    public static void S0(Context context, SettingsLauncher settingsLauncher, int i) {
        Class cls;
        Bundle bundle = new Bundle();
        bundle.putInt("privacy-sandbox-referrer", i);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("PrivacySandboxSettings3")) {
            cls = PrivacySandboxSettingsFragmentV3.class;
        } else {
            cls = PrivacySandboxSettingsFragment.class;
        }
        settingsLauncher.b(context, cls, bundle);
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        if (!"privacy_sandbox_toggle".equals(preference.q)) {
            return true;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        FI2.a(booleanValue ? "Settings.PrivacySandbox.ApisEnabled" : "Settings.PrivacySandbox.ApisDisabled");
        N.Mx0_lgx5(booleanValue);
        return true;
    }
}
