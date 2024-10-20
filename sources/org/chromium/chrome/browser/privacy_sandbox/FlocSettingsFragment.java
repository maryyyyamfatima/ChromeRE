package org.chromium.chrome.browser.privacy_sandbox;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC9108qg3;
import defpackage.C11997z52;
import defpackage.C8765pg3;
import defpackage.FI2;
import defpackage.InterfaceC9213qy2;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import defpackage.QA2;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.privacy_sandbox.FlocSettingsFragment;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FlocSettingsFragment extends AbstractC0123Ay2 implements InterfaceC9213qy2, InterfaceC9555ry2 {
    public static final /* synthetic */ int k0 = 0;
    public QA2 j0;

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        return true;
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        return true;
    }

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140852);
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180018);
        M0("floc_description").P(AbstractC9108qg3.a(N.MHCgxumR() + " " + K().getString(R.string.0_resource_name_obfuscated_res_0x7f1408dc), new C8765pg3(new C11997z52(K(), new Callback() { // from class: zQ0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i = FlocSettingsFragment.k0;
                FlocSettingsFragment flocSettingsFragment = FlocSettingsFragment.this;
                flocSettingsFragment.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
                    intent.putExtras(bundle2);
                }
                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent.putExtras(new Bundle());
                intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                intent.setData(Uri.parse("https://www.privacysandbox.com/proposals/floc"));
                Intent a = flocSettingsFragment.j0.a(flocSettingsFragment.K(), intent);
                a.setPackage(flocSettingsFragment.K().getPackageName());
                a.putExtra("com.android.browser.application_id", flocSettingsFragment.K().getPackageName());
                AbstractC2281Ro1.a(a);
                try {
                    flocSettingsFragment.K().startActivity(a, null);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }), "<link>", "</link>")));
        M0("reset_floc_explanation").P(N.M8beoiRM());
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("floc_toggle");
        chromeSwitchPreference.j = this;
        chromeSwitchPreference.W(false);
        chromeSwitchPreference.G(false);
        Preference M0 = M0("reset_floc_button");
        M0.G(false);
        M0.k = this;
        M0.Q(R.string.0_resource_name_obfuscated_res_0x7f1408de);
        FI2.a("Settings.PrivacySandbox.FlocSubpageOpened");
        M0("floc_status").P(K().getString(R.string.0_resource_name_obfuscated_res_0x7f1408df) + "\n" + N.MWBejMEu());
        M0("floc_group").P(K().getString(R.string.0_resource_name_obfuscated_res_0x7f1408dd) + "\n" + N.MLYptWc6());
        M0("floc_update").P(K().getString(R.string.0_resource_name_obfuscated_res_0x7f1408e0) + "\n" + N.M4do85LF());
    }
}
