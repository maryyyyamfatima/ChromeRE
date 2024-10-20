package org.chromium.chrome.browser.contextualsearch;

import J.N;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC9213qy2;
import defpackage.L53;
import defpackage.S70;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchPreferenceFragment;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ContextualSearchPreferenceFragment extends AbstractC0123Ay2 {
    public static final /* synthetic */ int j0 = 0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        boolean a;
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180010);
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f1403d1);
        F0();
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("contextual_search_switch");
        final ChromeSwitchPreference chromeSwitchPreference2 = (ChromeSwitchPreference) M0("see_better_results_switch");
        boolean z = !S70.b();
        chromeSwitchPreference.W(z);
        chromeSwitchPreference.j = new InterfaceC9213qy2() { // from class: T70
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [int] */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                int i = ContextualSearchPreferenceFragment.j0;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ?? r0 = S70.a().a("search.contextual_search_fully_opted_in");
                if (!booleanValue) {
                    r0 = 2;
                }
                S70.f(r0);
                boolean booleanValue2 = bool.booleanValue();
                Pattern pattern = AbstractC8584p80.a;
                EI2.h(booleanValue2 ? 1 : 2, 3, "Search.ContextualSearchPreferenceStateChange");
                ChromeSwitchPreference.this.S(bool.booleanValue());
                return true;
            }
        };
        chromeSwitchPreference.b0(new InterfaceC4184cL1() { // from class: U70
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
                int i = ContextualSearchPreferenceFragment.j0;
                return S70.a().d("search.contextual_search_enabled") && S70.b();
            }
        });
        if (!(!N.MFs_R_Ad(S70.a().a, "search.contextual_search_fully_opted_in"))) {
            a = S70.a().a("search.contextual_search_fully_opted_in");
        } else {
            a = S70.c();
        }
        chromeSwitchPreference2.W(a);
        chromeSwitchPreference2.j = new InterfaceC9213qy2() { // from class: V70
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                int i = ContextualSearchPreferenceFragment.j0;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                Pattern pattern = AbstractC8584p80.a;
                EI2.b("Search.ContextualSearchPrivacyOptInPreferenceStateChange", booleanValue);
                boolean booleanValue2 = bool.booleanValue();
                S70.a().e("search.contextual_search_fully_opted_in", booleanValue2);
                S70.f(booleanValue2 ? 1 : 0);
                return true;
            }
        };
        chromeSwitchPreference2.S(z);
    }
}
