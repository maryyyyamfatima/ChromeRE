package org.chromium.components.browser_ui.site_settings;

import J.N;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AX;
import defpackage.C7034ke3;
import defpackage.C7928nE;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import defpackage.N50;
import defpackage.R44;
import defpackage.RG1;
import defpackage.UN;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SiteSettings extends SiteSettingsPreferenceFragment implements InterfaceC9555ry2 {
    public final void R0() {
        boolean MJSt3Ocq;
        int M7ddkyN4;
        Integer num;
        Profile profile = this.j0.b;
        for (int i = 0; i < 26; i++) {
            Preference M0 = M0(C7034ke3.m(i));
            int b = C7034ke3.b(i);
            if (M0 != null && b >= 0) {
                boolean z = b == 15;
                if (i == 9) {
                    MJSt3Ocq = N.MJSt3Ocq(profile, 4) && RG1.b().d();
                } else if (!z) {
                    MJSt3Ocq = N.MJSt3Ocq(profile, b);
                } else {
                    M7ddkyN4 = N.M7ddkyN4(profile, b);
                    MJSt3Ocq = false;
                    M0.Q(N50.c(b).b);
                    M0.k = this;
                    if ((6 != i || 12 == i || 14 == i || 2 == i) && C7034ke3.c(this.j0.b, i).n(K())) {
                        M0.O(N50.b(N50.c(b).d.intValue()));
                    } else if (8 == i && MJSt3Ocq && R44.a(profile).b("profile.cookie_controls_mode") == 1) {
                        M0.O(R.string.0_resource_name_obfuscated_res_0x7f140bff);
                    } else if (9 == i && MJSt3Ocq && N.M__mL5j3(profile)) {
                        M0.O(R.string.0_resource_name_obfuscated_res_0x7f140bfe);
                    } else if (7 == i && !MJSt3Ocq) {
                        M0.O(R.string.0_resource_name_obfuscated_res_0x7f140c0d);
                    } else if (1 == i && !MJSt3Ocq) {
                        M0.O(R.string.0_resource_name_obfuscated_res_0x7f140bfd);
                    } else if (18 == i && !MJSt3Ocq) {
                        M0.O(R.string.0_resource_name_obfuscated_res_0x7f140c32);
                    } else if (24 == i) {
                        M0.O(MJSt3Ocq ? R.string.0_resource_name_obfuscated_res_0x7f140c17 : R.string.0_resource_name_obfuscated_res_0x7f140c19);
                    } else if (23 == i) {
                        M0.O(MJSt3Ocq ? R.string.0_resource_name_obfuscated_res_0x7f140b27 : R.string.0_resource_name_obfuscated_res_0x7f140b26);
                    } else if (z) {
                        M0.O(N50.b(M7ddkyN4));
                    } else {
                        if (MJSt3Ocq) {
                            num = N50.c(b).c;
                        } else {
                            num = N50.c(b).d;
                        }
                        M0.O(N50.b(num.intValue()));
                    }
                    M0.J(L53.c(K(), N50.c(b).a));
                }
                M7ddkyN4 = 0;
                M0.Q(N50.c(b).b);
                M0.k = this;
                if (6 != i) {
                }
                M0.O(N50.b(N50.c(b).d.intValue()));
                M0.J(L53.c(K(), N50.c(b).a));
            }
        }
        Preference M02 = M0(C7034ke3.m(0));
        if (M02 != null) {
            M02.k = this;
        }
        Preference M03 = M0(C7034ke3.m(22));
        if (M03 != null) {
            M03.k = this;
        }
    }

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f18003a);
        getActivity().setTitle(K().getString(R.string.0_resource_name_obfuscated_res_0x7f14085e));
        for (int i = 0; i < 26; i++) {
            this.j0.getClass();
            boolean z = true;
            if (i == 1) {
                z = N.MK7GTxrW("SubresourceFilter");
            } else if (i == 5) {
                z = AX.e().g("enable-experimental-web-platform-features");
            } else if (i == 13) {
                z = N.Mudil8Bg("WebNFC");
            } else if (i == 20) {
                z = N.Mudil8Bg("WebBluetoothNewPermissionsBackend");
            } else if (i == 23) {
                C7928nE c7928nE = UN.a;
                z = N.M09VlOh_("DarkenWebsitesCheckboxInThemesSetting");
            } else if (i == 25) {
                z = N.Mudil8Bg("FedCm");
            }
            if (!z) {
                N0().b0(M0(C7034ke3.m(i)));
            }
        }
        R0();
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        preference.l().putString("category", preference.q);
        preference.l().putString("title", preference.m.toString());
        return false;
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        this.f11484J = true;
        P0(null);
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        R0();
    }
}
