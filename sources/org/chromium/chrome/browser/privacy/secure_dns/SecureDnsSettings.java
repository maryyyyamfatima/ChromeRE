package org.chromium.chrome.browser.privacy.secure_dns;

import J.N;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC9213qy2;
import defpackage.J13;
import defpackage.L53;
import org.chromium.chrome.browser.privacy.secure_dns.SecureDnsSettings;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SecureDnsSettings extends AbstractC0123Ay2 {
    public static final /* synthetic */ int l0 = 0;
    public ChromeSwitchPreference j0;
    public SecureDnsProviderPreference k0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        int MPUFHf86;
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140a14);
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180038);
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("secure_dns_switch");
        this.j0 = chromeSwitchPreference;
        chromeSwitchPreference.b0(new InterfaceC4184cL1() { // from class: K13
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
                int i = SecureDnsSettings.l0;
                return N.M_qct0Io();
            }
        });
        this.j0.j = new InterfaceC9213qy2() { // from class: org.chromium.chrome.browser.privacy.secure_dns.d
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                int i = SecureDnsSettings.l0;
                SecureDnsSettings secureDnsSettings = SecureDnsSettings.this;
                secureDnsSettings.getClass();
                SecureDnsSettings.S0(((Boolean) obj).booleanValue(), secureDnsSettings.k0.e0);
                secureDnsSettings.R0();
                return true;
            }
        };
        if (!N.M_qct0Io() && (MPUFHf86 = N.MPUFHf86()) != 0) {
            this.j0.G(false);
            boolean z = MPUFHf86 == 2;
            ChromeSwitchPreference chromeSwitchPreference2 = this.j0;
            chromeSwitchPreference2.X(chromeSwitchPreference2.a.getString(z ? R.string.0_resource_name_obfuscated_res_0x7f140a13 : R.string.0_resource_name_obfuscated_res_0x7f140a12));
        }
        SecureDnsProviderPreference secureDnsProviderPreference = (SecureDnsProviderPreference) M0("secure_dns_provider");
        this.k0 = secureDnsProviderPreference;
        secureDnsProviderPreference.j = new InterfaceC9213qy2() { // from class: org.chromium.chrome.browser.privacy.secure_dns.e
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                int i = SecureDnsSettings.l0;
                SecureDnsSettings secureDnsSettings = SecureDnsSettings.this;
                secureDnsSettings.getClass();
                J13 j13 = (J13) obj;
                boolean S0 = SecureDnsSettings.S0(secureDnsSettings.j0.T, j13);
                if (S0 == j13.c) {
                    return true;
                }
                SecureDnsProviderPreference secureDnsProviderPreference2 = secureDnsSettings.k0;
                J13 j132 = new J13(j13.b, j13.a, S0);
                if (!j132.equals(secureDnsProviderPreference2.e0)) {
                    secureDnsProviderPreference2.e0 = j132;
                    secureDnsProviderPreference2.X();
                }
                return false;
            }
        };
        R0();
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        R0();
    }

    public final void R0() {
        int MvJZm_HK = N.MvJZm_HK();
        boolean z = MvJZm_HK != 0;
        boolean z2 = N.M_qct0Io() || N.MPUFHf86() != 0;
        this.j0.W(z);
        this.k0.G(z && !z2);
        boolean z3 = MvJZm_HK == 2;
        String MBuwU61d = N.MBuwU61d();
        SecureDnsProviderPreference secureDnsProviderPreference = this.k0;
        J13 j13 = new J13(MBuwU61d, z3, true);
        if (j13.equals(secureDnsProviderPreference.e0)) {
            return;
        }
        secureDnsProviderPreference.e0 = j13;
        secureDnsProviderPreference.X();
    }

    public static boolean S0(boolean z, J13 j13) {
        if (z) {
            if (j13.a) {
                String str = j13.b;
                if (str.isEmpty() || !N.MPV_PP8Y(str)) {
                    return false;
                }
                N.M7D0A6Nn(2);
            } else {
                N.M7D0A6Nn(1);
                N.MPV_PP8Y("");
            }
        } else {
            N.M7D0A6Nn(0);
            N.MPV_PP8Y("");
        }
        return true;
    }
}
