package org.chromium.chrome.browser.privacy_sandbox;

import J.N;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.android.chrome.R;
import defpackage.AT0;
import defpackage.C12188zf3;
import defpackage.FI2;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import defpackage.TS3;
import defpackage.ViewOnClickListenerC1069If3;
import defpackage.YP0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.privacy_sandbox.AdPersonalizationFragment;
import org.chromium.chrome.browser.privacy_sandbox.Topic;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AdPersonalizationFragment extends PrivacySandboxSettingsBaseFragment implements InterfaceC9555ry2, AT0 {
    public static final /* synthetic */ int u0 = 0;
    public ViewOnClickListenerC1069If3 k0;
    public PreferenceCategory l0;
    public ChromeBasePreference m0;
    public Preference n0;
    public PreferenceCategory o0;
    public ChromeBasePreference p0;
    public Preference q0;
    public Preference r0;
    public LargeIconBridge s0;
    public SettingsLauncher t0;

    @Override // org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsBaseFragment, defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        F0();
        getActivity().setTitle(R.string.f83060_resource_name_obfuscated_res_0x7f1408c3);
        L53.a(this, R.xml.f113740_resource_name_obfuscated_res_0x7f180004);
        this.r0 = M0("ad_personalization_description");
        this.l0 = (PreferenceCategory) M0("topic_interests");
        this.m0 = (ChromeBasePreference) M0("empty_topics");
        this.n0 = M0("removed_topics");
        this.o0 = (PreferenceCategory) M0("fledge_interests");
        this.p0 = (ChromeBasePreference) M0("empty_fledge");
        this.q0 = M0("removed_sites");
    }

    @Override // defpackage.AT0
    public final void f(SettingsLauncher settingsLauncher) {
        this.t0 = settingsLauncher;
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View i0 = super.i0(layoutInflater, viewGroup, bundle);
        this.d0.p0(null);
        return i0;
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void k0() {
        super.k0();
        LargeIconBridge largeIconBridge = this.s0;
        if (largeIconBridge != null) {
            largeIconBridge.a();
            this.s0 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z6] */
    @Override // androidx.fragment.app.c
    public final void r0() {
        final ?? r0 = new Callback() { // from class: z6
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                List<String> list = (List) obj;
                int i = AdPersonalizationFragment.u0;
                AdPersonalizationFragment adPersonalizationFragment = AdPersonalizationFragment.this;
                adPersonalizationFragment.getClass();
                List<Topic> asList = Arrays.asList((Topic[]) N.M9$8x7Sf());
                Collections.sort(asList, new LA2());
                List asList2 = Arrays.asList((Topic[]) N.M7p7P4Yj());
                Collections.sort(asList2, new LA2());
                List asList3 = Arrays.asList(N.MCGJWOhZ());
                adPersonalizationFragment.r0.O(N.MhaiireD() ? !asList.isEmpty() || !asList2.isEmpty() || !list.isEmpty() || !asList3.isEmpty() ? R.string.f83030_resource_name_obfuscated_res_0x7f1408c0 : R.string.f83010_resource_name_obfuscated_res_0x7f1408be : R.string.f83020_resource_name_obfuscated_res_0x7f1408bf);
                adPersonalizationFragment.l0.a0();
                adPersonalizationFragment.l0.S(true);
                for (Topic topic : asList) {
                    TS3 ts3 = new TS3(adPersonalizationFragment.K(), topic);
                    String string = adPersonalizationFragment.N().getString(R.string.f83490_resource_name_obfuscated_res_0x7f1408ee, topic.c);
                    ts3.Y = R.drawable.f45020_resource_name_obfuscated_res_0x7f0900c5;
                    ts3.Z = string;
                    ts3.V = Boolean.FALSE;
                    ts3.k = adPersonalizationFragment;
                    adPersonalizationFragment.l0.W(ts3);
                }
                adPersonalizationFragment.n0.S((asList.isEmpty() && asList2.isEmpty()) ? false : true);
                adPersonalizationFragment.m0.W(adPersonalizationFragment.n0.C);
                adPersonalizationFragment.o0.a0();
                adPersonalizationFragment.o0.S(true);
                if (adPersonalizationFragment.s0 == null) {
                    adPersonalizationFragment.s0 = new LargeIconBridge(Profile.d());
                }
                for (String str : list) {
                    YP0 yp0 = new YP0(adPersonalizationFragment.K(), str, adPersonalizationFragment.s0);
                    String string2 = adPersonalizationFragment.N().getString(R.string.f83530_resource_name_obfuscated_res_0x7f1408f2, str);
                    yp0.Y = R.drawable.f45020_resource_name_obfuscated_res_0x7f0900c5;
                    yp0.Z = string2;
                    yp0.V = Boolean.FALSE;
                    yp0.k = adPersonalizationFragment;
                    adPersonalizationFragment.o0.W(yp0);
                }
                adPersonalizationFragment.q0.S((list.isEmpty() && asList3.isEmpty()) ? false : true);
                adPersonalizationFragment.p0.W(adPersonalizationFragment.q0.C);
                adPersonalizationFragment.S0();
            }
        };
        N.MfWQDaSM(new Callback() { // from class: MA2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                r0.onResult(Arrays.asList((String[]) obj));
            }
        });
        this.f11484J = true;
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        if (preference instanceof TS3) {
            Topic topic = ((TS3) preference).a0;
            N.MUKJJ8VA(topic.a, topic.b, false);
            this.l0.b0(preference);
            this.k0.c(C12188zf3.a(N().getString(R.string.f83510_resource_name_obfuscated_res_0x7f1408f0), null, 0, 50));
            FI2.a("Settings.PrivacySandbox.AdPersonalization.TopicRemoved");
        } else if (preference instanceof YP0) {
            N.MK6T9EFy(((YP0) preference).a0, false);
            this.o0.b0(preference);
            this.k0.c(C12188zf3.a(N().getString(R.string.f83540_resource_name_obfuscated_res_0x7f1408f3), null, 0, 50));
            FI2.a("Settings.PrivacySandbox.AdPersonalization.SiteRemoved");
        }
        S0();
        return true;
    }

    public final void S0() {
        this.m0.S(this.l0.Z() == 0);
        this.p0.S(this.o0.Z() == 0);
    }

    @Override // org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsBaseFragment, androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_id_targeted_help) {
            return false;
        }
        this.t0.c(K(), LearnMoreFragment.class);
        return true;
    }
}
