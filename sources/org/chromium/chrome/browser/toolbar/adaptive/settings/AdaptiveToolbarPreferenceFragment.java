package org.chromium.chrome.browser.toolbar.adaptive.settings;

import android.app.Activity;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.A5;
import defpackage.AbstractC0123Ay2;
import defpackage.EI2;
import defpackage.InterfaceC9213qy2;
import defpackage.KG2;
import defpackage.L53;
import defpackage.O83;
import defpackage.Q83;
import defpackage.S6;
import defpackage.T6;
import defpackage.Wf4;
import java.lang.ref.WeakReference;
import org.chromium.chrome.browser.toolbar.adaptive.settings.AdaptiveToolbarPreferenceFragment;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AdaptiveToolbarPreferenceFragment extends AbstractC0123Ay2 {
    public static final /* synthetic */ int l0 = 0;
    public ChromeSwitchPreference j0;
    public RadioButtonGroupAdaptiveToolbarPreference k0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140b36);
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180006);
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("toolbar_shortcut_switch");
        this.j0 = chromeSwitchPreference;
        Q83 q83 = O83.a;
        chromeSwitchPreference.W(q83.e("Chrome.AdaptiveToolbarCustomization.Enabled", true));
        this.j0.j = new InterfaceC9213qy2() { // from class: N6
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                int i = AdaptiveToolbarPreferenceFragment.l0;
                AdaptiveToolbarPreferenceFragment adaptiveToolbarPreferenceFragment = AdaptiveToolbarPreferenceFragment.this;
                adaptiveToolbarPreferenceFragment.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Q83 q832 = O83.a;
                q832.p("Chrome.AdaptiveToolbarCustomization.Enabled", booleanValue);
                adaptiveToolbarPreferenceFragment.k0.G(booleanValue);
                EI2.b("Android.AdaptiveToolbarButton.SettingsToggle.Changed", q832.e("Chrome.AdaptiveToolbarCustomization.Enabled", true));
                return true;
            }
        };
        RadioButtonGroupAdaptiveToolbarPreference radioButtonGroupAdaptiveToolbarPreference = (RadioButtonGroupAdaptiveToolbarPreference) M0("adaptive_toolbar_radio_group");
        this.k0 = radioButtonGroupAdaptiveToolbarPreference;
        Activity activity = getActivity();
        radioButtonGroupAdaptiveToolbarPreference.a0 = activity == null ? false : Wf4.b(new A5(new WeakReference(activity)));
        radioButtonGroupAdaptiveToolbarPreference.W();
        RadioButtonGroupAdaptiveToolbarPreference radioButtonGroupAdaptiveToolbarPreference2 = this.k0;
        S6 s6 = new S6(new A5(new WeakReference(getActivity())));
        radioButtonGroupAdaptiveToolbarPreference2.Z = s6;
        if (radioButtonGroupAdaptiveToolbarPreference2.T != null) {
            s6.b(new KG2(radioButtonGroupAdaptiveToolbarPreference2));
            radioButtonGroupAdaptiveToolbarPreference2.Z.b(new T6("Android.AdaptiveToolbarButton.Settings.Startup"));
        }
        RadioButtonGroupAdaptiveToolbarPreference radioButtonGroupAdaptiveToolbarPreference3 = this.k0;
        radioButtonGroupAdaptiveToolbarPreference3.j = new InterfaceC9213qy2() { // from class: O6
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                int i = AdaptiveToolbarPreferenceFragment.l0;
                O83.a.q(((Integer) obj).intValue(), "Chrome.AdaptiveToolbarCustomization.Settings");
                return true;
            }
        };
        radioButtonGroupAdaptiveToolbarPreference3.G(q83.e("Chrome.AdaptiveToolbarCustomization.Enabled", true));
        EI2.b("Android.AdaptiveToolbarButton.SettingsToggle.Startup", q83.e("Chrome.AdaptiveToolbarCustomization.Enabled", true));
    }
}
