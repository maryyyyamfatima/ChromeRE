package org.chromium.chrome.browser.about_settings;

import J.N;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import defpackage.O83;
import defpackage.ZN3;
import java.util.Calendar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AboutChromeSettings extends AbstractC0123Ay2 implements InterfaceC9555ry2 {
    public static final /* synthetic */ int l0 = 0;
    public int j0;
    public ZN3 k0;

    public AboutChromeSettings() {
        this.j0 = O83.a.e("developer", false) ? -1 : 7;
    }

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140843);
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180000);
        Preference M0 = M0("application_version");
        getActivity();
        M0.P(N.MMSdy2S5());
        M0.k = this;
        M0("os_version").P(N.M6bT9QjF());
        M0("legal_information").P(Q(R.string.0_resource_name_obfuscated_res_0x7f1405b1, Integer.valueOf(Calendar.getInstance().get(1))));
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        int i = this.j0;
        if (i > 0) {
            int i2 = i - 1;
            this.j0 = i2;
            if (i2 == 0) {
                O83.a.p("developer", true);
                ZN3 zn3 = this.k0;
                if (zn3 != null) {
                    zn3.a();
                }
                ZN3 c = ZN3.c(getActivity(), "Developer options are now enabled.", 1);
                this.k0 = c;
                c.d();
            } else if (i2 > 0 && i2 < 5) {
                ZN3 zn32 = this.k0;
                if (zn32 != null) {
                    zn32.a();
                }
                int i3 = this.j0;
                ZN3 c2 = ZN3.c(getActivity(), i3 == 1 ? "1 more tap to enable Developer options." : String.format("%s more taps to enable Developer options.", Integer.valueOf(i3)), 0);
                this.k0 = c2;
                c2.d();
            }
        } else if (i < 0) {
            ZN3 zn33 = this.k0;
            if (zn33 != null) {
                zn33.a();
            }
            ZN3 c3 = ZN3.c(getActivity(), "Developer options are already enabled.", 1);
            this.k0 = c3;
            c3.d();
        }
        return true;
    }
}
