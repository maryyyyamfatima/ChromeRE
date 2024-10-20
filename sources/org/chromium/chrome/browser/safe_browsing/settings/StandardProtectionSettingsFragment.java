package org.chromium.chrome.browser.safe_browsing.settings;

import J.N;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC3841bL1;
import defpackage.C2643Ui3;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC9213qy2;
import defpackage.R44;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.safe_browsing.settings.StandardProtectionSettingsFragment;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class StandardProtectionSettingsFragment extends SafeBrowsingSettingsFragmentBase implements InterfaceC9213qy2 {
    public static final /* synthetic */ int o0 = 0;
    public ChromeSwitchPreference k0;
    public ChromeSwitchPreference l0;
    public final C2643Ui3 m0 = new InterfaceC4184cL1() { // from class: Ui3
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
            int i = StandardProtectionSettingsFragment.o0;
            StandardProtectionSettingsFragment standardProtectionSettingsFragment = StandardProtectionSettingsFragment.this;
            standardProtectionSettingsFragment.getClass();
            String str = preference.q;
            if (!"extended_reporting".equals(str)) {
                if ("password_leak_detection".equals(str)) {
                    return standardProtectionSettingsFragment.n0.d("profile.password_manager_leak_detection");
                }
                return false;
            }
            return N.Mp340wGB();
        }
    };
    public final PrefService n0 = R44.a(Profile.d());

    @Override // org.chromium.chrome.browser.safe_browsing.settings.SafeBrowsingSettingsFragmentBase
    public final int R0() {
        return R.xml.0_resource_name_obfuscated_res_0x7f18003d;
    }

    @Override // org.chromium.chrome.browser.safe_browsing.settings.SafeBrowsingSettingsFragmentBase
    public final void S0() {
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("extended_reporting");
        this.k0 = chromeSwitchPreference;
        chromeSwitchPreference.j = this;
        C2643Ui3 c2643Ui3 = this.m0;
        chromeSwitchPreference.b0(c2643Ui3);
        ChromeSwitchPreference chromeSwitchPreference2 = (ChromeSwitchPreference) M0("password_leak_detection");
        this.l0 = chromeSwitchPreference2;
        chromeSwitchPreference2.j = this;
        chromeSwitchPreference2.b0(c2643Ui3);
        int MdyQjr8h = N.MdyQjr8h();
        boolean z = false;
        boolean z2 = MdyQjr8h == 2;
        boolean z3 = MdyQjr8h == 1;
        boolean z4 = z2 || (z3 && N.MWJZTkWR());
        ChromeSwitchPreference chromeSwitchPreference3 = this.k0;
        c2643Ui3.getClass();
        this.k0.G(z3 && !AbstractC3841bL1.a(c2643Ui3, chromeSwitchPreference3));
        this.k0.W(z4);
        boolean z5 = N.MiM2m7HY() || N.MqSYugfQ();
        boolean a = this.n0.a("profile.password_manager_leak_detection");
        boolean a2 = AbstractC3841bL1.a(c2643Ui3, this.l0);
        boolean z6 = z2 || (z3 && a);
        boolean z7 = z6 && z5;
        ChromeSwitchPreference chromeSwitchPreference4 = this.l0;
        if (z3 && z5 && !a2) {
            z = true;
        }
        chromeSwitchPreference4.G(z);
        this.l0.W(z7);
        if (!z6 || z5) {
            return;
        }
        this.l0.O(R.string.0_resource_name_obfuscated_res_0x7f1407e7);
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        String str = preference.q;
        if (!"extended_reporting".equals(str)) {
            if (!"password_leak_detection".equals(str)) {
                return true;
            }
            this.n0.e("profile.password_manager_leak_detection", ((Boolean) obj).booleanValue());
            return true;
        }
        N.MjGeUNkF(((Boolean) obj).booleanValue());
        return true;
    }
}
