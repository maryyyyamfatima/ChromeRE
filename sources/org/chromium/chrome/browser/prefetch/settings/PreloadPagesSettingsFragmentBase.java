package org.chromium.chrome.browser.prefetch.settings;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.C11674y84;
import defpackage.C12008z71;
import defpackage.InterfaceC4223cT0;
import defpackage.L53;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class PreloadPagesSettingsFragmentBase extends AbstractC0123Ay2 implements InterfaceC4223cT0 {
    public C12008z71 j0;

    public abstract int R0();

    public void S0() {
    }

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        L53.a(this, R0());
        getActivity().setTitle(R.string.f82040_resource_name_obfuscated_res_0x7f14085c);
        S0();
        F0();
    }

    @Override // defpackage.InterfaceC4223cT0
    public final void z(C12008z71 c12008z71) {
        this.j0 = c12008z71;
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menu.add(0, R.id.menu_id_targeted_help, 0, R.string.f77130_resource_name_obfuscated_res_0x7f140629).setIcon(C11674y84.b(N(), R.drawable.f48120_resource_name_obfuscated_res_0x7f09023a, getActivity().getTheme()));
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_id_targeted_help) {
            return false;
        }
        this.j0.d(getActivity(), O(R.string.f74390_resource_name_obfuscated_res_0x7f1404ef), null, Profile.d());
        return true;
    }
}
