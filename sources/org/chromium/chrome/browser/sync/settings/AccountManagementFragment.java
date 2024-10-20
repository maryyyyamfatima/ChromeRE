package org.chromium.chrome.browser.sync.settings;

import J.N;
import android.accounts.Account;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC4871eL1;
import defpackage.AbstractC9771sd;
import defpackage.AbstractC9966tA;
import defpackage.B4;
import defpackage.C10322uC2;
import defpackage.C1202Jg1;
import defpackage.C1788Nt3;
import defpackage.C1918Ot3;
import defpackage.C6073hq0;
import defpackage.G2;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC5298fb3;
import defpackage.InterfaceC8386oa3;
import defpackage.InterfaceC9555ry2;
import defpackage.InterfaceC9979tC2;
import defpackage.O2;
import defpackage.Q2;
import defpackage.R44;
import defpackage.US;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.chrome.browser.sync.settings.AccountManagementFragment;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;
import org.chromium.components.prefs.PrefService;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AccountManagementFragment extends AbstractC0123Ay2 implements InterfaceC8386oa3, InterfaceC5298fb3, InterfaceC9979tC2 {
    public static final /* synthetic */ int o0 = 0;
    public int j0 = 0;
    public Profile k0;
    public String l0;
    public C10322uC2 m0;
    public C1788Nt3 n0;

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        if (b != null) {
            SyncServiceImpl syncServiceImpl = (SyncServiceImpl) b;
            Object obj = ThreadUtils.a;
            int i = syncServiceImpl.d + 1;
            syncServiceImpl.d = i;
            if (i == 1) {
                N.M$maQ5d_(syncServiceImpl.c, true);
            }
            this.n0 = new C1788Nt3(syncServiceImpl);
        }
        Bundle bundle2 = this.l;
        if (bundle2 != null) {
            this.j0 = bundle2.getInt("ShowGAIAServiceType", this.j0);
        }
        this.k0 = Profile.d();
        N.MX17n_KK(0, this.j0);
        this.m0 = C10322uC2.b(B0());
    }

    public final void T0() {
        CharSequence O;
        int i;
        if (getActivity() == null) {
            return;
        }
        if (N0() != null) {
            N0().a0();
        }
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        String b = CoreAccountInfo.b(C1202Jg1.b(d).b(0));
        this.l0 = b;
        if (b == null) {
            getActivity().finish();
            return;
        }
        L0(R.xml.0_resource_name_obfuscated_res_0x7f180002);
        C6073hq0 c = this.m0.c(this.l0);
        CharSequence charSequence = c.c;
        if (charSequence == null) {
            charSequence = c.a;
        }
        getActivity().setTitle(charSequence);
        Preference M0 = M0("sign_out");
        if (this.k0.h()) {
            N0().b0(M0);
            N0().b0(M0("sign_out_divider"));
        } else {
            M0.K = R.layout.0_resource_name_obfuscated_res_0x7f0e0023;
            M0.I(R.drawable.0_resource_name_obfuscated_res_0x7f09031d);
            M0.Q(US.a(C1202Jg1.a(), 1) ? R.string.0_resource_name_obfuscated_res_0x7f140a4d : R.string.0_resource_name_obfuscated_res_0x7f140a4c);
            M0.k = new InterfaceC9555ry2() { // from class: K2
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    int i2 = AccountManagementFragment.o0;
                    AccountManagementFragment accountManagementFragment = AccountManagementFragment.this;
                    if (!accountManagementFragment.b0() || !accountManagementFragment.a0() || accountManagementFragment.l0 == null) {
                        return false;
                    }
                    C1202Jg1 a2 = C1202Jg1.a();
                    Profile d2 = Profile.d();
                    a2.getClass();
                    if (C1202Jg1.b(d2).b(1) != null) {
                        C8729pa3.a(accountManagementFragment.B0(), ((InterfaceC3562aY1) accountManagementFragment.getActivity()).N(), accountManagementFragment, 1, accountManagementFragment.j0);
                    } else {
                        C1202Jg1 a3 = C1202Jg1.a();
                        Profile d3 = Profile.d();
                        a3.getClass();
                        C1202Jg1.c(d3).w(3, null, false);
                    }
                    return true;
                }
            };
        }
        Preference M02 = M0("parent_accounts");
        Preference M03 = M0("child_content");
        if (this.k0.h()) {
            PrefService a2 = R44.a(this.k0);
            String c2 = a2.c("profile.managed.custodian_email");
            String c3 = a2.c("profile.managed.second_custodian_email");
            if (!c3.isEmpty()) {
                O = Q(R.string.0_resource_name_obfuscated_res_0x7f1401a7, c2, c3);
            } else if (!c2.isEmpty()) {
                O = Q(R.string.0_resource_name_obfuscated_res_0x7f1401a3, c2);
            } else {
                O = O(R.string.0_resource_name_obfuscated_res_0x7f1401a2);
            }
            M02.P(O);
            if (a2.b("profile.managed.default_filtering_behavior") == 2) {
                i = R.string.0_resource_name_obfuscated_res_0x7f14019f;
            } else {
                i = a2.a("profile.managed.safe_sites") ? R.string.0_resource_name_obfuscated_res_0x7f1401a0 : R.string.0_resource_name_obfuscated_res_0x7f14019e;
            }
            M03.O(i);
            Drawable c4 = AbstractC9771sd.c(N(), R.drawable.0_resource_name_obfuscated_res_0x7f0901f2, 0);
            c4.mutate().setColorFilter(AbstractC10957w33.c(K()), PorterDuff.Mode.SRC_IN);
            M03.J(c4);
        } else {
            PreferenceScreen N0 = N0();
            N0.b0(M0("parental_settings"));
            N0.b0(M02);
            N0.b0(M03);
        }
        AccountManagerFacadeProvider.getInstance().a().g(new G2(this));
    }

    public static void R0(AccountManagementFragment accountManagementFragment, List list) {
        if (accountManagementFragment.a0()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AccountManagerFacadeProvider.getInstance().d((Account) it.next(), new Q2() { // from class: J2
                    @Override // defpackage.Q2
                    public final void a(boolean z, final Account account) {
                        AccountManagementFragment accountManagementFragment2 = AccountManagementFragment.this;
                        if (!z) {
                            int i = AccountManagementFragment.o0;
                            accountManagementFragment2.getClass();
                            return;
                        }
                        final C10322uC2 c10322uC2 = accountManagementFragment2.m0;
                        HashMap hashMap = c10322uC2.d;
                        if (hashMap.containsKey(account.name) && ((C9636sC2) hashMap.get(account.name)).a == R.drawable.0_resource_name_obfuscated_res_0x7f0901b6) {
                            return;
                        }
                        hashMap.put(account.name, new C9636sC2(c10322uC2.a, R.drawable.0_resource_name_obfuscated_res_0x7f0901b6));
                        D2.b().g(new Callback() { // from class: rC2
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj) {
                                return new ZE(this, obj);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj) {
                                C10322uC2 c10322uC22 = C10322uC2.this;
                                c10322uC22.getClass();
                                ((C2) obj).b(account.name).g(new C8951qC2(c10322uC22));
                            }
                        });
                    }
                });
            }
            PreferenceCategory preferenceCategory = (PreferenceCategory) accountManagementFragment.M0("accounts_category");
            if (preferenceCategory == null) {
                return;
            }
            preferenceCategory.a0();
            preferenceCategory.W(accountManagementFragment.S0(B4.c(accountManagementFragment.l0)));
            Preference preference = new Preference(accountManagementFragment.c0.a, null);
            preference.K = R.layout.0_resource_name_obfuscated_res_0x7f0e0022;
            preferenceCategory.W(preference);
            Preference preference2 = new Preference(accountManagementFragment.c0.a, null);
            preference2.K = R.layout.0_resource_name_obfuscated_res_0x7f0e0023;
            preference2.Q(R.string.0_resource_name_obfuscated_res_0x7f1405ed);
            preference2.I(R.drawable.0_resource_name_obfuscated_res_0x7f090218);
            preference2.k = new C1918Ot3(accountManagementFragment, new Runnable() { // from class: I2
                @Override // java.lang.Runnable
                public final void run() {
                    int i = AccountManagementFragment.o0;
                    Activity activity = AccountManagementFragment.this.getActivity();
                    FI2.a("SyncPreferences_ManageGoogleAccountClicked");
                    AbstractC2308Rt3.e("https://myaccount.google.com/smartlink/home", activity);
                }
            });
            preferenceCategory.W(preference2);
            Preference preference3 = new Preference(accountManagementFragment.c0.a, null);
            preference3.K = R.layout.0_resource_name_obfuscated_res_0x7f0e00d4;
            preferenceCategory.W(preference3);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Account account = (Account) it2.next();
                if (!accountManagementFragment.l0.equals(account.name)) {
                    preferenceCategory.W(accountManagementFragment.S0(account));
                }
            }
            if (accountManagementFragment.k0.h()) {
                return;
            }
            ChromeBasePreference chromeBasePreference = new ChromeBasePreference(accountManagementFragment.c0.a);
            chromeBasePreference.K = R.layout.0_resource_name_obfuscated_res_0x7f0e0023;
            chromeBasePreference.I(R.drawable.0_resource_name_obfuscated_res_0x7f0902f8);
            chromeBasePreference.Q(R.string.0_resource_name_obfuscated_res_0x7f140a5b);
            chromeBasePreference.k = new InterfaceC9555ry2() { // from class: L2
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference4) {
                    int i = AccountManagementFragment.o0;
                    final AccountManagementFragment accountManagementFragment2 = AccountManagementFragment.this;
                    if (!accountManagementFragment2.b0() || !accountManagementFragment2.a0()) {
                        return false;
                    }
                    N.MX17n_KK(1, accountManagementFragment2.j0);
                    AccountManagerFacadeProvider.getInstance().f(new Callback() { // from class: N2
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            Intent intent = (Intent) obj;
                            int i2 = AccountManagementFragment.o0;
                            AccountManagementFragment accountManagementFragment3 = AccountManagementFragment.this;
                            if (accountManagementFragment3.b0() && accountManagementFragment3.a0()) {
                                if (intent != null) {
                                    accountManagementFragment3.J0(intent);
                                } else {
                                    AbstractC0399Db3.a(accountManagementFragment3.getActivity());
                                }
                                if (accountManagementFragment3.j0 == 0 || !accountManagementFragment3.W()) {
                                    return;
                                }
                                accountManagementFragment3.getActivity().finish();
                            }
                        }
                    });
                    return true;
                }
            };
            InterfaceC4184cL1 interfaceC4184cL1 = new InterfaceC4184cL1() { // from class: M2
                @Override // defpackage.InterfaceC4184cL1
                public final /* synthetic */ boolean a(Preference preference4) {
                    return false;
                }

                @Override // defpackage.InterfaceC4184cL1
                public final /* synthetic */ boolean b(Preference preference4) {
                    return AbstractC3841bL1.a(this, preference4);
                }

                @Override // defpackage.InterfaceC4184cL1
                public final /* synthetic */ boolean c() {
                    return AbstractC9008qO.a();
                }

                @Override // defpackage.InterfaceC4184cL1
                public final boolean d(Preference preference4) {
                    int i = AccountManagementFragment.o0;
                    return !(!((UserManager) AccountManagementFragment.this.getActivity().getSystemService("user")).hasUserRestriction("no_modify_accounts"));
                }
            };
            chromeBasePreference.U = interfaceC4184cL1;
            AbstractC4871eL1.b(interfaceC4184cL1, chromeBasePreference);
            preferenceCategory.W(chromeBasePreference);
        }
    }

    public final Preference S0(final Account account) {
        Preference preference = new Preference(this.c0.a, null);
        preference.K = R.layout.0_resource_name_obfuscated_res_0x7f0e0023;
        preference.R(account.name);
        preference.J(this.m0.c(account.name).b);
        preference.k = new C1918Ot3(this, new Runnable() { // from class: H2
            @Override // java.lang.Runnable
            public final void run() {
                int i = AccountManagementFragment.o0;
                Activity activity = AccountManagementFragment.this.getActivity();
                if (Build.VERSION.SDK_INT >= 26) {
                    AbstractC0399Db3.a(activity);
                    return;
                }
                Intent intent = new Intent("android.settings.ACCOUNT_SYNC_SETTINGS");
                intent.putExtra("account", account);
                ComponentName componentName = AbstractC2281Ro1.a;
                try {
                    activity.startActivity(intent, null);
                } catch (ActivityNotFoundException unused) {
                }
            }
        });
        return preference;
    }

    @Override // defpackage.InterfaceC9979tC2
    public final void u(String str) {
        AccountManagerFacadeProvider.getInstance().a().g(new G2(this));
    }

    @Override // defpackage.InterfaceC8386oa3
    public final void m(boolean z) {
        if (US.a(C1202Jg1.a(), 0)) {
            AbstractC9966tA.a(C1202Jg1.a()).w(3, new O2(this, new ClearDataProgressDialog()), z);
        }
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void b() {
        T0();
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void g() {
        T0();
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        this.f11484J = true;
        P0(null);
        this.d0.p0(null);
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        C1202Jg1.c(d).b(this);
        this.m0.a(this);
        T0();
    }

    @Override // androidx.fragment.app.c
    public final void p0() {
        this.f11484J = true;
        this.m0.e(this);
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        C1202Jg1.c(d).f(this);
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.f11484J = true;
        C1788Nt3 c1788Nt3 = this.n0;
        if (c1788Nt3 != null) {
            Object obj = ThreadUtils.a;
            if (c1788Nt3.a) {
                return;
            }
            c1788Nt3.a = true;
            SyncServiceImpl syncServiceImpl = c1788Nt3.b;
            int i = syncServiceImpl.d - 1;
            syncServiceImpl.d = i;
            if (i == 0) {
                N.M$maQ5d_(syncServiceImpl.c, false);
            }
        }
    }
}
