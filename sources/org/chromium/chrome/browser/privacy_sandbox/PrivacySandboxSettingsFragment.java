package org.chromium.chrome.browser.privacy_sandbox;

import J.N;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC9108qg3;
import defpackage.C11997z52;
import defpackage.C8765pg3;
import defpackage.EI2;
import defpackage.FI2;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC9213qy2;
import defpackage.L53;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsFragment;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.ui.widget.ChromeBulletSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PrivacySandboxSettingsFragment extends PrivacySandboxSettingsBaseFragment implements InterfaceC9213qy2 {
    public static final /* synthetic */ int l0 = 0;
    public int k0;

    @Override // org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsBaseFragment, defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140851);
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f18002f);
        N0().b0(M0("privacy_sandbox_title"));
        S0();
        M0("privacy_sandbox_description").P(AbstractC9108qg3.a(K().getString(R.string.0_resource_name_obfuscated_res_0x7f1408d4), new C8765pg3(new C11997z52(K(), new Callback() { // from class: RA2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i = PrivacySandboxSettingsFragment.l0;
                PrivacySandboxSettingsFragment.this.R0();
            }
        }), "<link>", "</link>")));
        M0("privacy_sandbox_toggle_description").P(AbstractC9108qg3.a(K().getString(R.string.0_resource_name_obfuscated_res_0x7f1408ff), new C8765pg3(new ChromeBulletSpan(K()), "<li1>", "</li1>"), new C8765pg3(new ChromeBulletSpan(K()), "<li2>", "</li2>")));
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("privacy_sandbox_toggle");
        chromeSwitchPreference.j = this;
        chromeSwitchPreference.b0(new InterfaceC4184cL1() { // from class: SA2
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
                int i = PrivacySandboxSettingsFragment.l0;
                if ("privacy_sandbox_toggle".equals(preference.q)) {
                    return N.MNmYFihT();
                }
                return false;
            }
        });
        chromeSwitchPreference.W(N.MhaiireD());
        if (bundle != null && bundle.containsKey("privacy-sandbox-referrer")) {
            this.k0 = bundle.getInt("privacy-sandbox-referrer");
        } else {
            this.k0 = this.l.getInt("privacy-sandbox-referrer");
        }
        EI2.h(this.k0, 3, "Settings.PrivacySandbox.PrivacySandboxReferrer");
        int i = this.k0;
        if (i == 0) {
            FI2.a("Settings.PrivacySandbox.OpenedFromSettingsParent");
        } else if (i == 1) {
            FI2.a("Settings.PrivacySandbox.OpenedFromCookiesPageToast");
        }
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        bundle.putInt("privacy-sandbox-referrer", this.k0);
    }

    public final void S0() {
        Preference M0 = M0("floc_page");
        if (M0 != null) {
            M0.G(N.MhaiireD());
            M0.P(N.MWBejMEu());
        }
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        if (!"privacy_sandbox_toggle".equals(preference.q)) {
            return true;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        FI2.a(booleanValue ? "Settings.PrivacySandbox.ApisEnabled" : "Settings.PrivacySandbox.ApisDisabled");
        N.Mx0_lgx5(booleanValue);
        S0();
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        S0();
    }
}
