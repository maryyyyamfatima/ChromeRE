package org.chromium.chrome.browser.firstrun;

import J.N;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.android.chrome.R;
import defpackage.AbstractActivityC4890eP0;
import defpackage.AbstractC7296lP0;
import defpackage.B4;
import defpackage.C10106tb3;
import defpackage.C3688at3;
import defpackage.C7928nE;
import defpackage.InterfaceC7640mP0;
import defpackage.O83;
import defpackage.Q83;
import defpackage.UN;
import java.util.List;
import org.chromium.chrome.browser.signin.services.FREMobileIdentityConsistencyFieldTrial;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;
import org.chromium.components.signin.AccountManagerFacadeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SyncConsentFirstRunFragment extends SyncConsentFragmentBase implements InterfaceC7640mP0 {
    @Override // defpackage.InterfaceC7640mP0
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC7640mP0
    public final /* synthetic */ void reset() {
    }

    @Override // org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase
    public final void M0(boolean z) {
        O83.a.p("first_run_signin_setup", z);
        ((FirstRunActivity) AbstractC7296lP0.a(this)).U0();
    }

    @Override // org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase, androidx.fragment.app.c
    public final void f0(Context context) {
        super.f0(context);
        List e = B4.e(AccountManagerFacadeProvider.getInstance().a());
        boolean z = ((FirstRunActivity) AbstractC7296lP0.a(this)).e0.getBoolean("IsChildAccount", false);
        Bundle N0 = SyncConsentFragmentBase.N0(0, e.isEmpty() ? null : ((Account) e.get(0)).name);
        N0.putBoolean("SyncConsentFragmentBase.ChildAccountStatus", z);
        E0(N0);
    }

    @Override // org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase
    public final void P0() {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("AllowSyncOffForChildAccounts") || !this.c0) {
            C10106tb3 c10106tb3 = C10106tb3.b;
            c10106tb3.a.s(System.currentTimeMillis(), "ntp.signin_promo_suppression_period_start");
            Q83 q83 = O83.a;
            q83.t("first_run_signin_account_name", null);
            q83.p("first_run_signin_setup", false);
            ((FirstRunActivity) AbstractC7296lP0.a(this)).Z0(5);
            ((FirstRunActivity) AbstractC7296lP0.a(this)).U0();
            return;
        }
        FirstRunActivity firstRunActivity = (FirstRunActivity) AbstractC7296lP0.a(this);
        firstRunActivity.finish();
        AbstractActivityC4890eP0.Q0(firstRunActivity.getIntent(), false);
    }

    @Override // org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase
    public final void O0(String str, boolean z, Runnable runnable) {
        ((FirstRunActivity) AbstractC7296lP0.a(this)).Z0(4);
        if (z) {
            ((FirstRunActivity) AbstractC7296lP0.a(this)).Z0(11);
        }
        C7928nE c7928nE = UN.a;
        if (!(N.M09VlOh_("AllowSyncOffForChildAccounts") && N.M09VlOh_("EnableSyncImmediatelyInFRE"))) {
            Q83 q83 = O83.a;
            q83.t("first_run_signin_account_name", str);
            q83.p("first_run_signin_setup", z);
            ((FirstRunActivity) AbstractC7296lP0.a(this)).U0();
            runnable.run();
            return;
        }
        O83.a.t("first_run_signin_account_name", null);
        AccountManagerFacadeProvider.getInstance().a().g(new C3688at3(this, str, runnable, z));
    }

    @Override // org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase
    public final void R0(List list) {
        String str = this.g0;
        boolean z = str != null && B4.d(str, list) == null;
        if (FREMobileIdentityConsistencyFieldTrial.isEnabled() && z) {
            FirstRunActivity firstRunActivity = (FirstRunActivity) AbstractC7296lP0.a(this);
            firstRunActivity.finish();
            AbstractActivityC4890eP0.Q0(firstRunActivity.getIntent(), false);
            return;
        }
        super.R0(list);
    }

    @Override // defpackage.InterfaceC7640mP0
    public final void e() {
        View view = this.L;
        if (view == null) {
            return;
        }
        view.findViewById(R.id.signin_title).sendAccessibilityEvent(8);
    }
}
