package org.chromium.chrome.browser.signin;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import defpackage.AbstractC2281Ro1;
import defpackage.C3688at3;
import defpackage.EI2;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.sync.settings.ManageSyncSettings;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;
import org.chromium.components.signin.AccountManagerFacadeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SyncConsentFragment extends SyncConsentFragmentBase {
    public static final /* synthetic */ int s0 = 0;
    public int r0;

    @Override // org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        String str;
        super.g0(bundle);
        int i = this.l.getInt("SyncConsentFragment.PersonalizedPromoAction", 0);
        this.r0 = i;
        if (i != 0) {
            if (i == 1) {
                str = "Signin.SigninStartedAccessPoint.WithDefault";
            } else if (i == 2) {
                str = "Signin.SigninStartedAccessPoint.NotDefault";
            } else if (i != 3) {
                return;
            } else {
                str = "Signin.SigninStartedAccessPoint.NewAccountNoExistingAccount";
            }
            EI2.h(this.m0, 39, str);
        }
    }

    @Override // org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase
    public final void P0() {
        getActivity().finish();
    }

    @Override // org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase
    public final void M0(boolean z) {
        String str;
        if (z) {
            Activity activity = getActivity();
            Bundle S0 = ManageSyncSettings.S0(true);
            String name = ManageSyncSettings.class.getName();
            Intent intent = new Intent();
            intent.setClass(activity, SettingsActivity.class);
            if (!(activity instanceof Activity)) {
                intent.addFlags(268435456);
                intent.addFlags(67108864);
            }
            intent.putExtra("show_fragment", name);
            intent.putExtra("show_fragment_args", S0);
            ComponentName componentName = AbstractC2281Ro1.a;
            try {
                activity.startActivity(intent, null);
            } catch (ActivityNotFoundException unused) {
            }
        }
        int i = this.r0;
        if (i != 0) {
            if (i == 1) {
                str = "Signin.SigninCompletedAccessPoint.WithDefault";
            } else if (i == 2) {
                str = "Signin.SigninCompletedAccessPoint.NotDefault";
            } else if (i == 3) {
                str = "Signin.SigninCompletedAccessPoint.NewAccountNoExistingAccount";
            }
            EI2.h(this.m0, 39, str);
        }
        Activity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @Override // org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase
    public final void O0(String str, boolean z, Runnable runnable) {
        AccountManagerFacadeProvider.getInstance().a().g(new C3688at3(this, str, runnable, z));
    }
}
