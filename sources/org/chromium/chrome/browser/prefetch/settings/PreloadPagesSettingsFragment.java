package org.chromium.chrome.browser.prefetch.settings;

import J.N;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AT0;
import defpackage.AbstractC3841bL1;
import defpackage.AbstractC4871eL1;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC9213qy2;
import defpackage.MG2;
import org.chromium.chrome.browser.prefetch.settings.PreloadPagesSettingsFragment;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.components.browser_ui.settings.TextMessagePreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PreloadPagesSettingsFragment extends PreloadPagesSettingsFragmentBase implements AT0, MG2, InterfaceC9213qy2 {
    public static final /* synthetic */ int m0 = 0;
    public SettingsLauncher k0;
    public RadioButtonGroupPreloadPagesSettings l0;

    @Override // org.chromium.chrome.browser.prefetch.settings.PreloadPagesSettingsFragmentBase
    public final int R0() {
        return R.xml.0_resource_name_obfuscated_res_0x7f18002d;
    }

    public final void T0(int i) {
        if (i == 2) {
            this.k0.c(getActivity(), ExtendedPreloadingSettingsFragment.class);
        } else if (i == 1) {
            this.k0.c(getActivity(), StandardPreloadingSettingsFragment.class);
        }
    }

    @Override // defpackage.AT0
    public final void f(SettingsLauncher settingsLauncher) {
        this.k0 = settingsLauncher;
    }

    @Override // org.chromium.chrome.browser.prefetch.settings.PreloadPagesSettingsFragmentBase
    public final void S0() {
        InterfaceC4184cL1 interfaceC4184cL1 = new InterfaceC4184cL1() { // from class: Uy2
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
                int i = PreloadPagesSettingsFragment.m0;
                String str = preference.q;
                return N.MBM0bbSB();
            }
        };
        RadioButtonGroupPreloadPagesSettings radioButtonGroupPreloadPagesSettings = (RadioButtonGroupPreloadPagesSettings) M0("preload_pages_radio_button_group");
        this.l0 = radioButtonGroupPreloadPagesSettings;
        radioButtonGroupPreloadPagesSettings.W = N.MaV3tKHW();
        RadioButtonGroupPreloadPagesSettings radioButtonGroupPreloadPagesSettings2 = this.l0;
        radioButtonGroupPreloadPagesSettings2.X = this;
        radioButtonGroupPreloadPagesSettings2.Y = interfaceC4184cL1;
        AbstractC4871eL1.b(interfaceC4184cL1, radioButtonGroupPreloadPagesSettings2);
        this.l0.j = this;
        TextMessagePreference textMessagePreference = (TextMessagePreference) M0("text_managed");
        textMessagePreference.U = interfaceC4184cL1;
        AbstractC4871eL1.b(interfaceC4184cL1, textMessagePreference);
        textMessagePreference.S(AbstractC3841bL1.a(interfaceC4184cL1, this.l0));
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        String str = preference.q;
        int intValue = ((Integer) obj).intValue();
        if (intValue == N.MaV3tKHW()) {
            return true;
        }
        N.MhGHBfeJ(intValue);
        return true;
    }
}
