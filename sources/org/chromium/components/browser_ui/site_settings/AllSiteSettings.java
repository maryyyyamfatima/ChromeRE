package org.chromium.components.browser_ui.site_settings;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.Formatter;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C11674y84;
import defpackage.C5490g8;
import defpackage.C7034ke3;
import defpackage.F03;
import defpackage.G03;
import defpackage.GP;
import defpackage.InterfaceC9555ry2;
import defpackage.K8;
import defpackage.L53;
import defpackage.L8;
import defpackage.Oo4;
import defpackage.Qo4;
import defpackage.Wn4;
import java.util.HashSet;
import java.util.List;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataTabsFragment;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;
import org.chromium.components.browser_ui.site_settings.AllSiteSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AllSiteSettings extends SiteSettingsPreferenceFragment implements View.OnClickListener {
    public static final /* synthetic */ int r0 = 0;
    public Button k0;
    public TextView l0;
    public MenuItem m0;
    public C7034ke3 n0;
    public String o0;
    public List p0;
    public HashSet q0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7034ke3 c7034ke3;
        Profile profile = this.j0.b;
        Bundle bundle2 = this.l;
        if (bundle2 != null) {
            String string = bundle2.getString("category", "");
            int i = 0;
            while (true) {
                if (i >= 26) {
                    c7034ke3 = null;
                    break;
                }
                if (C7034ke3.m(i).equals(string)) {
                    c7034ke3 = C7034ke3.c(profile, i);
                    break;
                }
                i++;
            }
            this.n0 = c7034ke3;
        }
        if (this.n0 == null) {
            this.n0 = C7034ke3.c(profile, 0);
        }
        if (!this.n0.o(0) && !this.n0.o(22)) {
            throw new IllegalArgumentException("Use SingleCategorySettings instead.");
        }
        ViewGroup viewGroup2 = (ViewGroup) super.i0(layoutInflater, viewGroup, bundle);
        if (this.n0.o(22)) {
            layoutInflater.inflate(R.layout.f60990_resource_name_obfuscated_res_0x7f0e0287, viewGroup2, true);
            this.l0 = (TextView) viewGroup2.findViewById(R.id.empty_storage);
            Button button = (Button) viewGroup2.findViewById(R.id.clear_button);
            this.k0 = button;
            button.setOnClickListener(this);
        }
        this.d0.p0(null);
        P0(null);
        return viewGroup2;
    }

    public final void S0() {
        new Oo4(this.j0.b, false).c(this.n0, new L8(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        if (K() == null || view != this.k0) {
            return;
        }
        this.j0.getClass();
        HashSet a = Wn4.a.a();
        List<Qo4> list = this.p0;
        long j = 0;
        if (list != null) {
            z = false;
            for (Qo4 qo4 : list) {
                j += qo4.d0.h();
                if (!z) {
                    z = a.contains(qo4.d0.a.d());
                }
            }
        } else {
            z = false;
        }
        C5490g8 c5490g8 = new C5490g8(K());
        View inflate = ((LayoutInflater) K().getSystemService("layout_inflater")).inflate(R.layout.f56390_resource_name_obfuscated_res_0x7f0e0087, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(android.R.id.message);
        TextView textView2 = (TextView) inflate.findViewById(R.id.signed_out_text);
        TextView textView3 = (TextView) inflate.findViewById(R.id.offline_text);
        textView2.setText(R.string.f91740_resource_name_obfuscated_res_0x7f140c53);
        textView3.setText(R.string.f91720_resource_name_obfuscated_res_0x7f140c51);
        textView.setText(Q(z ? R.string.f91710_resource_name_obfuscated_res_0x7f140c50 : R.string.f91680_resource_name_obfuscated_res_0x7f140c4d, Formatter.formatShortFileSize(K(), j)));
        c5490g8.a.q = inflate;
        c5490g8.f(R.string.f87500_resource_name_obfuscated_res_0x7f140a8b, new K8(this));
        c5490g8.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, null);
        c5490g8.i(R.string.f87510_resource_name_obfuscated_res_0x7f140a8d);
        c5490g8.a().show();
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        R0();
        String string = this.l.getString("title");
        if (string != null) {
            getActivity().setTitle(string);
        }
        this.q0 = this.l.containsKey("selected_domains") ? new HashSet(this.l.getStringArrayList("selected_domains")) : null;
        F0();
        this.f11484J = true;
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.f62220_resource_name_obfuscated_res_0x7f10000d, menu);
        MenuItem findItem = menu.findItem(R.id.search);
        this.m0 = findItem;
        G03.c(findItem, this.o0, getActivity(), new F03() { // from class: J8
            @Override // defpackage.F03
            public final void onQueryTextChange(String str) {
                AllSiteSettings allSiteSettings = AllSiteSettings.this;
                String str2 = allSiteSettings.o0;
                boolean z = str2 != null ? !str2.equals(str) : !(str == null || str.isEmpty());
                allSiteSettings.o0 = str;
                if (z) {
                    allSiteSettings.S0();
                }
            }
        });
        this.j0.getClass();
        menu.add(0, R.id.menu_id_site_settings_help, 0, R.string.f77130_resource_name_obfuscated_res_0x7f140629).setIcon(C11674y84.b(N(), R.drawable.f48120_resource_name_obfuscated_res_0x7f09023a, K().getTheme()));
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_id_site_settings_help) {
            GP gp = this.j0;
            Activity activity = getActivity();
            gp.getClass();
            GP.b(activity);
            return true;
        }
        boolean z = false;
        if (!G03.b(menuItem, this.m0, this.o0, getActivity())) {
            return false;
        }
        String str = this.o0;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        this.o0 = null;
        if (z) {
            S0();
        }
        return true;
    }

    @Override // defpackage.AbstractC0123Ay2, defpackage.InterfaceC1163Iy2
    public final boolean D(Preference preference) {
        if (preference instanceof Qo4) {
            Qo4 qo4 = (Qo4) preference;
            qo4.s = SingleWebsiteSettings.class.getName();
            qo4.l().putSerializable("org.chromium.chrome.preferences.site", qo4.d0);
            qo4.l().putInt("org.chromium.chrome.preferences.navigation_source", this.l.getInt("org.chromium.chrome.preferences.navigation_source", 0));
        }
        return super.D(preference);
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        MenuItem menuItem;
        this.f11484J = true;
        if (this.o0 == null && (menuItem = this.m0) != null) {
            G03.a(menuItem, getActivity());
            this.o0 = null;
        }
        S0();
    }

    public final void R0() {
        if (N.ManEQDnV("SiteDataImprovements")) {
            L53.a(this, R.xml.f113780_resource_name_obfuscated_res_0x7f180008);
            ChromeBasePreference chromeBasePreference = (ChromeBasePreference) M0("clear_browsing_data_link");
            this.j0.getClass();
            SpannableString spannableString = new SpannableString(N().getString(R.string.f70350_resource_name_obfuscated_res_0x7f140341));
            spannableString.setSpan(new ForegroundColorSpan(K().getColor(R.color.f18110_resource_name_obfuscated_res_0x7f070143)), 0, spannableString.length(), 17);
            chromeBasePreference.P(spannableString);
            chromeBasePreference.k = new InterfaceC9555ry2() { // from class: I8
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    int i = AllSiteSettings.r0;
                    AllSiteSettings allSiteSettings = AllSiteSettings.this;
                    GP gp = allSiteSettings.j0;
                    Activity activity = allSiteSettings.getActivity();
                    gp.getClass();
                    String name = ClearBrowsingDataTabsFragment.class.getName();
                    Intent intent = new Intent();
                    intent.setClass(activity, SettingsActivity.class);
                    if (!(activity instanceof Activity)) {
                        intent.addFlags(268435456);
                        intent.addFlags(67108864);
                    }
                    intent.putExtra("show_fragment", name);
                    ComponentName componentName = AbstractC2281Ro1.a;
                    try {
                        activity.startActivity(intent, null);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                        return true;
                    }
                }
            };
            return;
        }
        L53.a(this, R.xml.f113770_resource_name_obfuscated_res_0x7f180007);
    }
}
