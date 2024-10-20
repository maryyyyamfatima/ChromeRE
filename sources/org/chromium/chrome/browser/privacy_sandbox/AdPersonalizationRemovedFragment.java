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
import defpackage.LA2;
import defpackage.TS3;
import defpackage.ViewOnClickListenerC1069If3;
import defpackage.YP0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AdPersonalizationRemovedFragment extends PrivacySandboxSettingsBaseFragment implements InterfaceC9555ry2, AT0 {
    public PreferenceCategory k0;
    public Preference l0;
    public PreferenceCategory m0;
    public Preference n0;
    public ViewOnClickListenerC1069If3 o0;
    public LargeIconBridge p0;
    public SettingsLauncher q0;

    @Override // org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsBaseFragment, defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        F0();
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f1408f1);
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180005);
        this.k0 = (PreferenceCategory) M0("topic_interests");
        this.l0 = M0("empty_topics");
        this.m0 = (PreferenceCategory) M0("fledge_interests");
        this.n0 = M0("empty_fledge");
        if (this.p0 == null) {
            this.p0 = new LargeIconBridge(Profile.d());
        }
        List<Topic> asList = Arrays.asList((Topic[]) N.M7p7P4Yj());
        Collections.sort(asList, new LA2());
        for (Topic topic : asList) {
            TS3 ts3 = new TS3(K(), topic);
            String string = N().getString(R.string.0_resource_name_obfuscated_res_0x7f1408c4, topic.c);
            ts3.Y = R.drawable.0_resource_name_obfuscated_res_0x7f0901b9;
            ts3.Z = string;
            ts3.W(false);
            ts3.k = this;
            this.k0.W(ts3);
        }
        for (String str2 : Arrays.asList(N.MCGJWOhZ())) {
            YP0 yp0 = new YP0(K(), str2, this.p0);
            String string2 = N().getString(R.string.0_resource_name_obfuscated_res_0x7f1408c6, str2);
            yp0.Y = R.drawable.0_resource_name_obfuscated_res_0x7f0901b9;
            yp0.Z = string2;
            yp0.W(false);
            yp0.k = this;
            this.m0.W(yp0);
        }
        S0();
    }

    @Override // defpackage.AT0
    public final void f(SettingsLauncher settingsLauncher) {
        this.q0 = settingsLauncher;
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
        LargeIconBridge largeIconBridge = this.p0;
        if (largeIconBridge != null) {
            largeIconBridge.a();
            this.p0 = null;
        }
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        if (preference instanceof TS3) {
            Topic topic = ((TS3) preference).a0;
            N.MUKJJ8VA(topic.a, topic.b, true);
            this.k0.b0(preference);
            this.o0.c(C12188zf3.a(N().getString(R.string.0_resource_name_obfuscated_res_0x7f1408c5), null, 0, 49));
            FI2.a("Settings.PrivacySandbox.RemovedInterests.TopicAdded");
        } else if (preference instanceof YP0) {
            N.MK6T9EFy(((YP0) preference).a0, true);
            this.m0.b0(preference);
            this.o0.c(C12188zf3.a(N().getString(R.string.0_resource_name_obfuscated_res_0x7f1408c7), null, 0, 49));
            FI2.a("Settings.PrivacySandbox.RemovedInterests.SiteAdded");
        }
        S0();
        return true;
    }

    public final void S0() {
        this.l0.S(this.k0.Z() == 0);
        this.n0.S(this.m0.Z() == 0);
    }

    @Override // org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsBaseFragment, androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_id_targeted_help) {
            return false;
        }
        this.q0.c(K(), LearnMoreFragment.class);
        return true;
    }
}
