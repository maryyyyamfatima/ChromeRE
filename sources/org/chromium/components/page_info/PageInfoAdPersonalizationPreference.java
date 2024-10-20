package org.chromium.components.page_info;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C10547us;
import defpackage.C11507xg2;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import org.chromium.components.browser_ui.site_settings.SiteSettingsPreferenceFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PageInfoAdPersonalizationPreference extends SiteSettingsPreferenceFragment implements InterfaceC9555ry2 {
    public C11507xg2 k0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        if (this.j0 != null) {
            L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180029);
            M0("manage_interest_button").k = this;
            R0();
        } else {
            C10547us c10547us = new C10547us(M());
            c10547us.i(this);
            c10547us.e(false);
        }
    }

    public final void R0() {
        C11507xg2 c11507xg2;
        int i;
        if (this.c0 == null || (c11507xg2 = this.k0) == null) {
            return;
        }
        if (!c11507xg2.a || c11507xg2.b.isEmpty()) {
            i = this.k0.a ? R.string.0_resource_name_obfuscated_res_0x7f140746 : R.string.0_resource_name_obfuscated_res_0x7f140749;
        } else {
            i = R.string.0_resource_name_obfuscated_res_0x7f140748;
        }
        M0("personalization_summary").O(i);
        Preference M0 = M0("topic_info");
        M0.S(!this.k0.b.isEmpty());
        M0.R(TextUtils.join("\n\n", this.k0.b));
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        if (!preference.q.equals("manage_interest_button")) {
            return false;
        }
        C11507xg2 c11507xg2 = this.k0;
        if (c11507xg2 == null) {
            return true;
        }
        c11507xg2.c.run();
        return true;
    }
}
