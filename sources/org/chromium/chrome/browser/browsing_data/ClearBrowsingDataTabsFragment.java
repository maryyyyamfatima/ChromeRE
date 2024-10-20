package org.chromium.chrome.browser.browsing_data;

import J.N;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.viewpager2.widget.ViewPager2;
import com.android.chrome.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import defpackage.AbstractC8305oK2;
import defpackage.C0249Bx3;
import defpackage.C0899Gx3;
import defpackage.C1029Hx3;
import defpackage.C1159Ix3;
import defpackage.C11674y84;
import defpackage.C12008z71;
import defpackage.C1289Jx3;
import defpackage.C3535aT;
import defpackage.C3879bT;
import defpackage.C4222cT;
import defpackage.FI2;
import defpackage.O83;
import defpackage.VS0;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.settings.SettingsActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ClearBrowsingDataTabsFragment extends c {
    public static final /* synthetic */ int c0 = 0;
    public ClearBrowsingDataFetcher b0;

    @Override // androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        F0();
        if (bundle == null) {
            ClearBrowsingDataFetcher clearBrowsingDataFetcher = new ClearBrowsingDataFetcher();
            this.b0 = clearBrowsingDataFetcher;
            N.MCILE93S(Profile.d(), clearBrowsingDataFetcher);
            ClearBrowsingDataFetcher clearBrowsingDataFetcher2 = this.b0;
            clearBrowsingDataFetcher2.getClass();
            if (!O83.a.e("org.chromium.chrome.browser.settings.privacy.PREF_OTHER_FORMS_OF_HISTORY_DIALOG_SHOWN", false)) {
                BrowsingDataBridge b = BrowsingDataBridge.b();
                b.getClass();
                N.MxCHuwXz(b, Profile.d(), clearBrowsingDataFetcher2);
            }
        } else {
            this.b0 = (ClearBrowsingDataFetcher) bundle.getParcelable("clearBrowsingDataFetcher");
        }
        FI2.a("ClearBrowsingData_DialogCreated");
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0085, viewGroup, false);
        ViewPager2 viewPager2 = (ViewPager2) inflate.findViewById(R.id.clear_browsing_data_viewpager);
        viewPager2.c(new C3879bT(this.b0, (VS0) getActivity()));
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.clear_browsing_data_tabs);
        C1289Jx3 c1289Jx3 = new C1289Jx3(tabLayout, viewPager2, new C3535aT(this));
        if (c1289Jx3.e) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        AbstractC8305oK2 abstractC8305oK2 = viewPager2.o.r;
        c1289Jx3.d = abstractC8305oK2;
        if (abstractC8305oK2 == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        c1289Jx3.e = true;
        viewPager2.h.a.add(new C1029Hx3(tabLayout));
        tabLayout.b(new C1159Ix3(viewPager2, true));
        c1289Jx3.d.J(new C0899Gx3(c1289Jx3));
        AbstractC8305oK2 abstractC8305oK22 = c1289Jx3.d;
        if (abstractC8305oK22 != null) {
            c1289Jx3.a(Math.max(abstractC8305oK22.q(), tabLayout.l()));
        }
        tabLayout.t(0.0f, viewPager2.i, true, true);
        BrowsingDataBridge b = BrowsingDataBridge.b();
        b.getClass();
        C0249Bx3 k = tabLayout.k(N.MD5TSIMJ(b));
        if (k != null) {
            k.b();
        }
        tabLayout.b(new C4222cT());
        ((AppBarLayout) ((SettingsActivity) getActivity()).findViewById(R.id.app_bar_layout)).setOutlineProvider(null);
        return inflate;
    }

    @Override // androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        bundle.putParcelable("clearBrowsingDataFetcher", this.b0);
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        MenuItem add = menu.add(0, R.id.menu_id_targeted_help, 0, R.string.0_resource_name_obfuscated_res_0x7f140629);
        add.setIcon(C11674y84.b(N(), R.drawable.0_resource_name_obfuscated_res_0x7f09023a, getActivity().getTheme()));
        add.setShowAsAction(1);
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_id_targeted_help) {
            return false;
        }
        C12008z71.a().d(getActivity(), O(R.string.0_resource_name_obfuscated_res_0x7f1404e7), null, Profile.d());
        return true;
    }
}
