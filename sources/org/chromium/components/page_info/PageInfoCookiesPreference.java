package org.chromium.components.page_info;

import android.os.Bundle;
import com.android.chrome.R;
import defpackage.C10547us;
import defpackage.DialogC5834h8;
import defpackage.L53;
import org.chromium.components.browser_ui.settings.ChromeImageViewPreference;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.browser_ui.site_settings.SiteSettingsPreferenceFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PageInfoCookiesPreference extends SiteSettingsPreferenceFragment {
    public static final /* synthetic */ int r0 = 0;
    public ChromeSwitchPreference k0;
    public ChromeImageViewPreference l0;
    public Runnable m0;
    public DialogC5834h8 n0;
    public boolean o0;
    public boolean p0;
    public CharSequence q0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        if (this.j0 != null) {
            L53.a(this, R.xml.f114110_resource_name_obfuscated_res_0x7f18002a);
            this.k0 = (ChromeSwitchPreference) M0("cookie_switch");
            this.l0 = (ChromeImageViewPreference) M0("cookie_in_use");
        } else {
            C10547us c10547us = new C10547us(M());
            c10547us.i(this);
            c10547us.e(false);
        }
    }

    @Override // org.chromium.components.browser_ui.site_settings.SiteSettingsPreferenceFragment, defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void k0() {
        super.k0();
        DialogC5834h8 dialogC5834h8 = this.n0;
        if (dialogC5834h8 != null) {
            dialogC5834h8.dismiss();
        }
    }

    public final void R0(int i, boolean z) {
        boolean z2 = i != 2;
        boolean z3 = i == 1;
        this.k0.S(z2);
        if (z2) {
            this.k0.J(L53.c(K(), R.drawable.f47590_resource_name_obfuscated_res_0x7f090204));
            this.k0.W(z3);
            this.k0.G(!z);
        }
    }

    public final void S0(int i, int i2) {
        this.k0.P(i2 > 0 ? K().getResources().getQuantityString(R.plurals.f62380_resource_name_obfuscated_res_0x7f120010, i2, Integer.valueOf(i2)) : null);
        this.l0.R(K().getResources().getQuantityString(R.plurals.f62590_resource_name_obfuscated_res_0x7f120026, i, Integer.valueOf(i)));
        this.p0 |= i != 0;
        T0();
    }

    public final void T0() {
        ChromeImageViewPreference chromeImageViewPreference = this.l0;
        int i = (this.o0 || !this.p0) ? R.color.f17770_resource_name_obfuscated_res_0x7f070119 : R.color.f17710_resource_name_obfuscated_res_0x7f070113;
        if (chromeImageViewPreference.W == i) {
            return;
        }
        chromeImageViewPreference.W = i;
        chromeImageViewPreference.W();
    }
}
