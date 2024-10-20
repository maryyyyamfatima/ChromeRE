package org.chromium.components.browser_ui.site_settings;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.android.chrome.R;
import defpackage.AbstractC4871eL1;
import defpackage.C11674y84;
import defpackage.C1293Jy2;
import defpackage.C5901hL;
import defpackage.C6408io4;
import defpackage.C7034ke3;
import defpackage.C7275lL;
import defpackage.C7619mL;
import defpackage.C7963nL;
import defpackage.GP;
import defpackage.Oo4;
import defpackage.Qo4;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.ChromeImageViewPreference;
import org.chromium.components.browser_ui.site_settings.ChosenObjectSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChosenObjectSettings extends SiteSettingsPreferenceFragment {
    public static final /* synthetic */ int p0 = 0;
    public C7034ke3 k0;
    public ArrayList l0;
    public ArrayList m0;
    public SearchView n0;
    public String o0 = "";

    @Override // androidx.fragment.app.c
    public final void c0() {
        C7034ke3 c7034ke3 = null;
        P0(null);
        int i = this.l.getInt("org.chromium.chrome.preferences.content_settings_type");
        Profile profile = this.j0.b;
        int i2 = 0;
        while (true) {
            if (i2 >= 26) {
                break;
            }
            if (C7034ke3.b(i2) == i) {
                c7034ke3 = C7034ke3.c(profile, i2);
                break;
            }
            i2++;
        }
        this.k0 = c7034ke3;
        this.l0 = (ArrayList) this.l.getSerializable("org.chromium.chrome.preferences.object_infos");
        this.m0 = (ArrayList) this.l.getSerializable("org.chromium.chrome.preferences.site_set");
        String string = this.l.getString("title");
        if (string != null) {
            getActivity().setTitle(string);
        }
        F0();
        this.f11484J = true;
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.f62220_resource_name_obfuscated_res_0x7f10000d, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        this.n0 = searchView;
        searchView.u.setImeOptions(33554432);
        this.n0.L = new C7275lL(this);
        this.j0.getClass();
        menu.add(0, R.id.menu_id_site_settings_help, 0, R.string.f77130_resource_name_obfuscated_res_0x7f140629).setIcon(C11674y84.b(N(), R.drawable.f48120_resource_name_obfuscated_res_0x7f09023a, K().getTheme()));
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_id_site_settings_help) {
            return false;
        }
        GP gp = this.j0;
        Activity activity = getActivity();
        gp.getClass();
        GP.b(activity);
        return true;
    }

    public final void R0() {
        new Oo4(this.j0.b, false).c(this.k0, new C7963nL(this));
    }

    public final void S0() {
        PreferenceScreen N0 = N0();
        N0.a0();
        PreferenceScreen N02 = N0();
        ChromeImageViewPreference chromeImageViewPreference = new ChromeImageViewPreference(this.c0.a);
        String str = ((C5901hL) this.l0.get(0)).h;
        final String format = String.format(this.L.getContext().getString(R.string.f70160_resource_name_obfuscated_res_0x7f14032e), str);
        chromeImageViewPreference.R(str);
        chromeImageViewPreference.X(R.drawable.f47260_resource_name_obfuscated_res_0x7f0901e2, R.string.f91590_resource_name_obfuscated_res_0x7f140c44, new View.OnClickListener() { // from class: jL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ChosenObjectSettings.p0;
                final ChosenObjectSettings chosenObjectSettings = ChosenObjectSettings.this;
                C5490g8 c5490g8 = new C5490g8(chosenObjectSettings.K(), R.style.f105200_resource_name_obfuscated_res_0x7f150545);
                c5490g8.i(R.string.f84570_resource_name_obfuscated_res_0x7f14095d);
                c5490g8.c(format);
                c5490g8.f(R.string.f84570_resource_name_obfuscated_res_0x7f14095d, new DialogInterface.OnClickListener() { // from class: kL
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ChosenObjectSettings chosenObjectSettings2 = ChosenObjectSettings.this;
                        Iterator it = chosenObjectSettings2.l0.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            C5901hL c5901hL = (C5901hL) it.next();
                            if (c5901hL.j) {
                                z = true;
                            } else {
                                c5901hL.a(chosenObjectSettings2.j0.b);
                            }
                        }
                        if (z) {
                            AbstractC4871eL1.e(chosenObjectSettings2.K(), R.string.f76720_resource_name_obfuscated_res_0x7f1405f2);
                        } else {
                            chosenObjectSettings2.getActivity().finish();
                        }
                        chosenObjectSettings2.R0();
                    }
                });
                c5490g8.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, null);
                c5490g8.k();
            }
        });
        N02.W(chromeImageViewPreference);
        Preference preference = new Preference(this.c0.a, null);
        preference.K = R.layout.f57080_resource_name_obfuscated_res_0x7f0e00d4;
        N02.W(preference);
        for (int i = 0; i < this.m0.size() && i < this.l0.size(); i++) {
            C6408io4 c6408io4 = (C6408io4) this.m0.get(i);
            final C5901hL c5901hL = (C5901hL) this.l0.get(i);
            Qo4 qo4 = new Qo4(this.c0.a, this.j0, c6408io4, this.k0);
            qo4.l().putSerializable("org.chromium.chrome.preferences.site", c6408io4);
            qo4.s = SingleWebsiteSettings.class.getCanonicalName();
            qo4.X(R.drawable.f47260_resource_name_obfuscated_res_0x7f0901e2, R.string.f91600_resource_name_obfuscated_res_0x7f140c45, new View.OnClickListener() { // from class: iL
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = ChosenObjectSettings.p0;
                    ChosenObjectSettings chosenObjectSettings = ChosenObjectSettings.this;
                    c5901hL.a(chosenObjectSettings.j0.b);
                    chosenObjectSettings.R0();
                }
            });
            C7619mL c7619mL = new C7619mL(this.j0.a(), c5901hL);
            qo4.T = c7619mL;
            AbstractC4871eL1.b(c7619mL, qo4);
            N0.W(qo4);
        }
        this.m0 = null;
    }

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        C1293Jy2 c1293Jy2 = this.c0;
        Q0(c1293Jy2.a(c1293Jy2.a));
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        if (this.m0 == null) {
            R0();
        } else {
            S0();
        }
    }
}
