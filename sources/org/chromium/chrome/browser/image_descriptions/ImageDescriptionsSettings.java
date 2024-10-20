package org.chromium.chrome.browser.image_descriptions;

import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.C2111Qg1;
import defpackage.InterfaceC9213qy2;
import defpackage.L53;
import defpackage.R44;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ImageDescriptionsSettings extends AbstractC0123Ay2 implements InterfaceC9213qy2 {
    public RadioButtonGroupAccessibilityPreference j0;
    public C2111Qg1 k0;
    public boolean l0;
    public boolean m0;
    public Profile n0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f18001c);
        this.n0 = Profile.d();
        Bundle bundle2 = this.l;
        if (bundle2 != null) {
            this.l0 = bundle2.getBoolean("image_descriptions_switch");
            this.m0 = bundle2.getBoolean("image_descriptions_data_policy");
        }
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("image_descriptions_switch");
        chromeSwitchPreference.j = this;
        chromeSwitchPreference.W(this.l0);
        RadioButtonGroupAccessibilityPreference radioButtonGroupAccessibilityPreference = (RadioButtonGroupAccessibilityPreference) M0("image_descriptions_data_policy");
        this.j0 = radioButtonGroupAccessibilityPreference;
        radioButtonGroupAccessibilityPreference.j = this;
        radioButtonGroupAccessibilityPreference.G(this.l0);
        this.j0.V = this.m0;
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        if (preference.q.equals("image_descriptions_switch")) {
            if (((Boolean) obj).booleanValue()) {
                C2111Qg1 c2111Qg1 = this.k0;
                Profile profile = this.n0;
                c2111Qg1.a.getClass();
                R44.a(profile).e("settings.a11y.enable_accessibility_image_labels_android", true);
                C2111Qg1 c2111Qg12 = this.k0;
                boolean z = this.j0.V;
                Profile profile2 = this.n0;
                c2111Qg12.a.getClass();
                R44.a(profile2).e("settings.a11y.enable_accessibility_image_labels_only_on_wifi", z);
                this.j0.G(true);
            } else {
                C2111Qg1 c2111Qg13 = this.k0;
                Profile profile3 = this.n0;
                c2111Qg13.a.getClass();
                R44.a(profile3).e("settings.a11y.enable_accessibility_image_labels_android", false);
                this.j0.G(false);
            }
        } else if (preference.q.equals("image_descriptions_data_policy")) {
            C2111Qg1 c2111Qg14 = this.k0;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Profile profile4 = this.n0;
            c2111Qg14.a.getClass();
            R44.a(profile4).e("settings.a11y.enable_accessibility_image_labels_only_on_wifi", booleanValue);
        }
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        this.f11484J = true;
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140517);
        P0(null);
    }
}
