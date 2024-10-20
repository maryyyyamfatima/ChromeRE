package org.chromium.chrome.browser.privacy_sandbox;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC2281Ro1;
import defpackage.C11674y84;
import defpackage.QA2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class PrivacySandboxSettingsBaseFragment extends AbstractC0123Ay2 {
    public QA2 j0;

    @Override // defpackage.AbstractC0123Ay2
    public void O0(String str, Bundle bundle) {
        F0();
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menu.add(0, R.id.menu_id_targeted_help, 0, R.string.f77130_resource_name_obfuscated_res_0x7f140629).setIcon(C11674y84.b(N(), R.drawable.f48120_resource_name_obfuscated_res_0x7f09023a, getActivity().getTheme()));
    }

    @Override // androidx.fragment.app.c
    public boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_id_targeted_help) {
            return false;
        }
        R0();
        return true;
    }

    public final void R0() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent.setData(Uri.parse("https://www.privacysandbox.com"));
        Intent a = this.j0.a(K(), intent);
        a.setPackage(K().getPackageName());
        a.putExtra("com.android.browser.application_id", K().getPackageName());
        AbstractC2281Ro1.a(a);
        try {
            K().startActivity(a, null);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
