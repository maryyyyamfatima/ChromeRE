package org.chromium.chrome.browser.download.settings;

import J.N;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.C3340Zs0;
import defpackage.InterfaceC9213qy2;
import defpackage.L53;
import defpackage.R44;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadSettings extends AbstractC0123Ay2 implements InterfaceC9213qy2 {
    public DownloadLocationPreference j0;
    public ChromeSwitchPreference k0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140621);
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180013);
        R44.a(Profile.d());
        N.MGOzH4qx();
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("location_prompt_enabled");
        this.k0 = chromeSwitchPreference;
        chromeSwitchPreference.j = this;
        chromeSwitchPreference.b0(new C3340Zs0());
        this.j0 = (DownloadLocationPreference) M0("location_change");
    }

    @Override // defpackage.AbstractC0123Ay2, defpackage.InterfaceC0903Gy2
    public final void x(Preference preference) {
        if (preference instanceof DownloadLocationPreference) {
            DownloadLocationPreferenceDialog downloadLocationPreferenceDialog = new DownloadLocationPreferenceDialog();
            Bundle bundle = new Bundle(1);
            bundle.putString("key", ((DownloadLocationPreference) preference).q);
            downloadLocationPreferenceDialog.E0(bundle);
            downloadLocationPreferenceDialog.H0(0, this);
            downloadLocationPreferenceDialog.Q0(this.x, "DownloadLocationPreferenceDialog");
            return;
        }
        super.x(preference);
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        if ("location_prompt_enabled".equals(preference.q)) {
            if (((Boolean) obj).booleanValue()) {
                if (R44.a(Profile.d()).b("download.prompt_for_download_android") != 0) {
                    N.MPBZLcVx(R44.a(Profile.d()).a, "download.prompt_for_download_android", 1);
                }
            } else {
                N.MPBZLcVx(R44.a(Profile.d()).a, "download.prompt_for_download_android", 2);
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        this.j0.W();
        if (N.MGOzH4qx()) {
            this.k0.W(R44.a(Profile.d()).a("download.prompt_for_download"));
        } else {
            this.k0.W(R44.a(Profile.d()).b("download.prompt_for_download_android") != 2);
            this.k0.G(true);
        }
    }
}
