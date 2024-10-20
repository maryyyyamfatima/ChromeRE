package org.chromium.chrome.browser.night_mode.settings;

import J.N;
import android.os.Build;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC8540p04;
import defpackage.C7928nE;
import defpackage.EI2;
import defpackage.InterfaceC9213qy2;
import defpackage.L53;
import defpackage.LU3;
import defpackage.O83;
import defpackage.Q83;
import defpackage.UN;
import org.chromium.chrome.browser.night_mode.settings.RadioButtonGroupThemePreference;
import org.chromium.chrome.browser.night_mode.settings.ThemeSettingsFragment;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ThemeSettingsFragment extends AbstractC0123Ay2 {
    public static final /* synthetic */ int k0 = 0;
    public boolean j0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        L53.a(this, R.xml.f114310_resource_name_obfuscated_res_0x7f18003e);
        getActivity().setTitle(R.string.f89020_resource_name_obfuscated_res_0x7f140b2a);
        final Q83 q83 = O83.a;
        final RadioButtonGroupThemePreference radioButtonGroupThemePreference = (RadioButtonGroupThemePreference) M0("ui_theme_pref");
        this.j0 = N.MJSt3Ocq(Profile.d(), 73);
        int f = q83.f(-1, "ui_theme_setting");
        if (f == -1) {
            f = Build.VERSION.SDK_INT < 29 ? 1 : 0;
        }
        boolean z = this.j0;
        radioButtonGroupThemePreference.T = f;
        radioButtonGroupThemePreference.Y = z;
        radioButtonGroupThemePreference.j = new InterfaceC9213qy2() { // from class: ZJ3
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                int i = ThemeSettingsFragment.k0;
                ThemeSettingsFragment themeSettingsFragment = ThemeSettingsFragment.this;
                themeSettingsFragment.getClass();
                C7928nE c7928nE = UN.a;
                if (N.M09VlOh_("DarkenWebsitesCheckboxInThemesSetting")) {
                    RadioButtonGroupThemePreference radioButtonGroupThemePreference2 = radioButtonGroupThemePreference;
                    if (radioButtonGroupThemePreference2.Z.isChecked() != themeSettingsFragment.j0) {
                        themeSettingsFragment.j0 = radioButtonGroupThemePreference2.Z.isChecked();
                        Profile d = Profile.d();
                        boolean z2 = themeSettingsFragment.j0;
                        N.MM1KTgoi(d, 73, z2);
                        AbstractC0065An.a(0, z2);
                    }
                }
                q83.q(((Integer) obj).intValue(), "ui_theme_setting");
                return true;
            }
        };
        if (bundle == null) {
            EI2.h(this.l.getInt("theme_settings_entry"), 3, "Android.DarkTheme.ThemeSettingsEntry");
        }
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("DarkenWebsitesCheckboxInThemesSetting")) {
            LU3.a(Profile.d()).notifyEvent("auto_dark_settings_opened");
        }
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        this.f11484J = true;
        if (Build.VERSION.SDK_INT == 27) {
            AbstractC8540p04.j(getActivity().getWindow().getDecorView(), N().getBoolean(R.bool.f15620_resource_name_obfuscated_res_0x7f06001a));
        }
        P0(null);
    }
}
