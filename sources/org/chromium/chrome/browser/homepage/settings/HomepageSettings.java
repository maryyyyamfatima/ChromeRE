package org.chromium.chrome.browser.homepage.settings;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC10615v34;
import defpackage.C10648v91;
import defpackage.C11334x91;
import defpackage.C12020z91;
import defpackage.FI2;
import defpackage.InterfaceC9213qy2;
import defpackage.L53;
import defpackage.LG2;
import defpackage.Q83;
import defpackage.T34;
import org.chromium.chrome.browser.homepage.settings.HomepageSettings;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HomepageSettings extends AbstractC0123Ay2 {
    public static final /* synthetic */ int l0 = 0;
    public C10648v91 j0;
    public RadioButtonGroupHomepagePreference k0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        this.j0 = C10648v91.c();
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140737);
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f18001a);
        C12020z91 c12020z91 = new C12020z91();
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("homepage_switch");
        chromeSwitchPreference.b0(c12020z91);
        this.k0 = (RadioButtonGroupHomepagePreference) M0("homepage_radio_group");
        chromeSwitchPreference.W(C10648v91.d());
        chromeSwitchPreference.j = new InterfaceC9213qy2() { // from class: y91
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                int i = HomepageSettings.l0;
                HomepageSettings homepageSettings = HomepageSettings.this;
                homepageSettings.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C10648v91 c10648v91 = homepageSettings.j0;
                c10648v91.a.p("homepage", booleanValue);
                c10648v91.e();
                homepageSettings.k0.W(homepageSettings.R0());
                return true;
            }
        };
        this.k0.W(R0());
        FI2.a("Settings.Homepage.Opened");
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void u0() {
        super.u0();
        LG2 lg2 = this.k0.Y;
        if (C11334x91.a()) {
            return;
        }
        boolean z = lg2.a == 0;
        String j = AbstractC10615v34.a(lg2.b).j();
        boolean equals = C10648v91.a().equals(j);
        C10648v91 c10648v91 = this.j0;
        boolean e = c10648v91.a.e("Chrome.Homepage.UseNTP", false);
        Q83 q83 = c10648v91.a;
        boolean e2 = q83.e("homepage_partner_enabled", true);
        String i = q83.i("homepage_custom_uri", "");
        if (z == e && equals == e2 && i.equals(j)) {
            return;
        }
        if (z != e) {
            q83.p("Chrome.Homepage.UseNTP", z);
        }
        if (e2 != equals) {
            q83.p("homepage_partner_enabled", equals);
        }
        if (!i.equals(j)) {
            q83.t("homepage_custom_uri", j);
        }
        FI2.a("Settings.Homepage.LocationChanged_V2");
        c10648v91.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LG2 R0() {
        int i;
        String str;
        String str2;
        boolean a = C11334x91.a();
        if (a) {
            if (C11334x91.k == null) {
                C11334x91.k = new C11334x91();
            }
            i = T34.j(C11334x91.k.g);
        } else {
            i = (this.j0.a.e("Chrome.Homepage.UseNTP", false) || (this.j0.a.e("homepage_partner_enabled", true) && T34.j(C10648v91.a()))) ? 1 : 0;
        }
        int i2 = i ^ 1;
        boolean z = !a && C10648v91.d();
        boolean z2 = (a && i == 0) ? false : true;
        boolean z3 = !a || i == 0;
        if (C11334x91.a()) {
            if (C11334x91.k == null) {
                C11334x91.k = new C11334x91();
            }
            str2 = C11334x91.k.g;
        } else {
            String a2 = C10648v91.a();
            String i3 = this.j0.a.i("homepage_custom_uri", "");
            if (this.j0.a.e("homepage_partner_enabled", true)) {
                if (T34.j(a2)) {
                    str2 = "";
                }
            } else if (!TextUtils.isEmpty(i3) || T34.j(a2)) {
                str = i3;
                return new LG2(i2, str, z, z2, z3);
            }
            str2 = a2;
        }
        str = str2;
        return new LG2(i2, str, z, z2, z3);
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        RadioButtonGroupHomepagePreference radioButtonGroupHomepagePreference = this.k0;
        if (radioButtonGroupHomepagePreference != null) {
            radioButtonGroupHomepagePreference.W(R0());
        }
    }
}
