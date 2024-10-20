package org.chromium.chrome.browser.sync.settings;

import J.N;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import androidx.fragment.app.h;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC5103f04;
import defpackage.C12008z71;
import defpackage.C1202Jg1;
import defpackage.C1788Nt3;
import defpackage.C1918Ot3;
import defpackage.C7928nE;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.FI2;
import defpackage.InterfaceC10214tt3;
import defpackage.InterfaceC11998z53;
import defpackage.InterfaceC1528Lt3;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC6382ik2;
import defpackage.InterfaceC8386oa3;
import defpackage.InterfaceC8788pk2;
import defpackage.InterfaceC9213qy2;
import defpackage.InterfaceC9816sk2;
import defpackage.L53;
import defpackage.NK1;
import defpackage.UN;
import defpackage.YK1;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.chrome.browser.sync.TrustedVaultClient;
import org.chromium.chrome.browser.sync.settings.ManageSyncSettings;
import org.chromium.chrome.browser.sync.ui.PassphraseDialogFragment;
import org.chromium.chrome.browser.sync.ui.PassphraseTypeDialogFragment;
import org.chromium.components.browser_ui.settings.ChromeBaseCheckBoxPreference;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ManageSyncSettings extends AbstractC0123Ay2 implements InterfaceC8788pk2, InterfaceC6382ik2, InterfaceC9816sk2, InterfaceC9213qy2, InterfaceC1528Lt3, InterfaceC11998z53, InterfaceC8386oa3, InterfaceC10214tt3 {
    public static final /* synthetic */ int D0 = 0;
    public PreferenceCategory A0;
    public ChromeSwitchPreference B0;
    public C1788Nt3 C0;
    public final AbstractC1658Mt3 j0 = AbstractC1658Mt3.b();
    public boolean k0;
    public SyncErrorCardPreference l0;
    public PreferenceCategory m0;
    public ChromeSwitchPreference n0;
    public ChromeBaseCheckBoxPreference o0;
    public ChromeBaseCheckBoxPreference p0;
    public ChromeBaseCheckBoxPreference q0;
    public ChromeBaseCheckBoxPreference r0;
    public ChromeBaseCheckBoxPreference s0;
    public ChromeBaseCheckBoxPreference t0;
    public ChromeBaseCheckBoxPreference u0;
    public ChromeBaseCheckBoxPreference v0;
    public ChromeBaseCheckBoxPreference[] w0;
    public Preference x0;
    public Preference y0;
    public Preference z0;

    @Override // defpackage.InterfaceC8788pk2
    public final void F() {
    }

    public static Bundle S0(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ManageSyncSettings.isFromSigninScreen", z);
        return bundle;
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menu.add(0, R.id.menu_id_targeted_help, 0, R.string.0_resource_name_obfuscated_res_0x7f140629).setIcon(R.drawable.0_resource_name_obfuscated_res_0x7f09023a);
        if (this.k0) {
            ((a) getActivity()).l0().o();
            FI2.a("Signin_Signin_ShowAdvancedSyncSettings");
        }
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_id_targeted_help) {
            C12008z71.a().d(getActivity(), O(R.string.0_resource_name_obfuscated_res_0x7f1404f5), null, Profile.d());
            return true;
        }
        if (menuItem.getItemId() != 16908332 || !this.k0) {
            return false;
        }
        FI2.a("Signin_Signin_BackOnAdvancedSyncSettings");
        return false;
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!this.k0) {
            return super.i0(layoutInflater, viewGroup, bundle);
        }
        ViewGroup viewGroup2 = (ViewGroup) super.i0(layoutInflater, viewGroup, bundle);
        layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e017d, viewGroup2, true);
        ((ButtonCompat) viewGroup2.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: QK1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ManageSyncSettings.D0;
                ManageSyncSettings manageSyncSettings = ManageSyncSettings.this;
                manageSyncSettings.getClass();
                FI2.a("Signin_Signin_CancelAdvancedSyncSettings");
                C1202Jg1 a = C1202Jg1.a();
                Profile d = Profile.d();
                a.getClass();
                C1202Jg1.c(d).e(3);
                manageSyncSettings.getActivity().finish();
            }
        });
        ((ButtonCompat) viewGroup2.findViewById(R.id.confirm_button)).setOnClickListener(new View.OnClickListener() { // from class: RK1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ManageSyncSettings.D0;
                ManageSyncSettings manageSyncSettings = ManageSyncSettings.this;
                manageSyncSettings.getClass();
                FI2.a("Signin_Signin_ConfirmAdvancedSyncSettings");
                AbstractC1658Mt3.b().m(1);
                N.M2AYruv7(Profile.d());
                manageSyncSettings.getActivity().finish();
            }
        });
        this.A0.S(true);
        this.m0.S(true);
        return viewGroup2;
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void t0() {
        super.t0();
        this.j0.a(this);
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void u0() {
        super.u0();
        this.j0.l(this);
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: PK1
            @Override // java.lang.Runnable
            public final void run() {
                int i = ManageSyncSettings.D0;
                ManageSyncSettings.this.V0();
            }
        });
        return true;
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        PostTask.c(AbstractC5103f04.a, new NK1(this));
    }

    public final void U0() {
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        final String b = CoreAccountInfo.b(C1202Jg1.b(d).b(1));
        if (b == null) {
            getActivity().finish();
            return;
        }
        this.y0.k = new C1918Ot3(this, new Runnable() { // from class: OK1
            @Override // java.lang.Runnable
            public final void run() {
                int i = ManageSyncSettings.D0;
                ManageSyncSettings manageSyncSettings = ManageSyncSettings.this;
                manageSyncSettings.getClass();
                AppHooks.get().i().a(b, manageSyncSettings.getActivity());
                FI2.a("Signin_AccountSettings_GoogleActivityControlsClicked");
            }
        });
        AbstractC1658Mt3 abstractC1658Mt3 = this.j0;
        boolean Mlc5dpRY = N.Mlc5dpRY(((SyncServiceImpl) abstractC1658Mt3).c);
        this.n0.W(Mlc5dpRY);
        if (Mlc5dpRY) {
            for (ChromeBaseCheckBoxPreference chromeBaseCheckBoxPreference : this.w0) {
                chromeBaseCheckBoxPreference.W(true);
                chromeBaseCheckBoxPreference.G(false);
            }
        } else {
            HashSet e = abstractC1658Mt3.e();
            this.o0.W(e.contains(5));
            this.o0.G(true);
            this.p0.W(e.contains(1));
            this.p0.G(true);
            this.r0.W(e.contains(10));
            this.r0.G(true);
            this.s0.W(e.contains(3));
            this.s0.G(true);
            this.t0.W(e.contains(25));
            this.t0.G(true);
            this.u0.W(e.contains(38));
            this.u0.G(true);
            this.v0.W(e.contains(2));
            this.v0.G(true);
            boolean contains = e.contains(5);
            this.q0.W(contains && N.M4NdKhmj());
            this.q0.G(contains);
        }
        boolean h = abstractC1658Mt3.h();
        this.z0.G(h);
        this.z0.P(null);
        if (!h) {
            R0("custom_password");
            R0("enter_password");
            return;
        }
        if (N.MUR3vHAY(((SyncServiceImpl) abstractC1658Mt3).c)) {
            R0("custom_password");
            R0("enter_password");
            T0(abstractC1658Mt3.g() ? R.string.0_resource_name_obfuscated_res_0x7f140ada : R.string.0_resource_name_obfuscated_res_0x7f1407df);
        } else {
            if (!abstractC1658Mt3.i()) {
                R0("enter_password");
            }
            if (abstractC1658Mt3.i() && W()) {
                T0(R.string.0_resource_name_obfuscated_res_0x7f140ae9);
            }
        }
    }

    public final void V0() {
        int[] iArr;
        boolean z = this.n0.T;
        HashSet hashSet = new HashSet();
        if (this.o0.T) {
            hashSet.add(5);
        }
        boolean z2 = true;
        if (this.p0.T) {
            hashSet.add(1);
        }
        if (this.r0.T) {
            hashSet.add(10);
        }
        if (this.s0.T) {
            hashSet.add(3);
        }
        if (this.t0.T) {
            hashSet.add(25);
        }
        if (this.u0.T) {
            hashSet.add(38);
        }
        if (this.v0.T) {
            hashSet.add(2);
        }
        SyncServiceImpl syncServiceImpl = (SyncServiceImpl) this.j0;
        if (z) {
            iArr = SyncServiceImpl.f;
        } else {
            syncServiceImpl.getClass();
            int[] iArr2 = new int[hashSet.size()];
            Iterator it = hashSet.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr2[i] = ((Integer) it.next()).intValue();
                i++;
            }
            iArr = iArr2;
        }
        N.Mn4DCKmu(syncServiceImpl.c, z, iArr);
        if (!this.n0.T && (!this.q0.T || !this.o0.T)) {
            z2 = false;
        }
        N.MIN2Dr59(z2);
        PostTask.c(AbstractC5103f04.a, new NK1(this));
    }

    public final void T0(int i) {
        SpannableString spannableString = new SpannableString(O(i));
        spannableString.setSpan(new ForegroundColorSpan(K().getColor(R.color.0_resource_name_obfuscated_res_0x7f0705b0)), 0, spannableString.length(), 0);
        this.z0.P(spannableString);
    }

    @Override // defpackage.InterfaceC8788pk2
    public final boolean t(String str) {
        AbstractC1658Mt3 abstractC1658Mt3 = this.j0;
        if (!abstractC1658Mt3.h() || !abstractC1658Mt3.i() || str.isEmpty() || !N.MVem29BX(((SyncServiceImpl) abstractC1658Mt3).c, str)) {
            return false;
        }
        R0("enter_password");
        U0();
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void d0(int i, int i2, Intent intent) {
        if (i == 1) {
            long j = TrustedVaultClient.a().b;
            if (j != 0) {
                N.MlSGBpm_(j);
            }
        }
        if (i == 2) {
            long j2 = TrustedVaultClient.a().b;
            if (j2 != 0) {
                N.Mv4bfVgt(j2);
            }
        }
    }

    @Override // defpackage.InterfaceC8386oa3
    public final void m(boolean z) {
        Profile d = Profile.d();
        C1202Jg1.a().getClass();
        if (C1202Jg1.b(d).c(1)) {
            YK1 yk1 = new YK1(this, new ClearDataProgressDialog());
            if (d.h()) {
                C1202Jg1.a().getClass();
                C1202Jg1.c(d).i(yk1, z);
            } else {
                C1202Jg1.a().getClass();
                C1202Jg1.c(d).w(3, yk1, z);
            }
        }
    }

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        this.k0 = AbstractC2281Ro1.i(this.l, "ManageSyncSettings.isFromSigninScreen", false);
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140ad2);
        F0();
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180026);
        SyncErrorCardPreference syncErrorCardPreference = (SyncErrorCardPreference) M0("sync_error_card");
        this.l0 = syncErrorCardPreference;
        syncErrorCardPreference.U = this;
        this.m0 = (PreferenceCategory) M0("syncing_category");
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("sync_everything");
        this.n0 = chromeSwitchPreference;
        chromeSwitchPreference.j = this;
        this.o0 = (ChromeBaseCheckBoxPreference) M0("sync_autofill");
        this.p0 = (ChromeBaseCheckBoxPreference) M0("sync_bookmarks");
        this.q0 = (ChromeBaseCheckBoxPreference) M0("sync_payments_integration");
        this.r0 = (ChromeBaseCheckBoxPreference) M0("sync_history");
        this.s0 = (ChromeBaseCheckBoxPreference) M0("sync_passwords");
        this.t0 = (ChromeBaseCheckBoxPreference) M0("sync_reading_list");
        this.u0 = (ChromeBaseCheckBoxPreference) M0("sync_recent_tabs");
        this.v0 = (ChromeBaseCheckBoxPreference) M0("sync_settings");
        this.x0 = M0("turn_off_sync");
        final Profile d = Profile.d();
        if (!this.k0) {
            if (d.h()) {
                C7928nE c7928nE = UN.a;
                if (N.M09VlOh_("AllowSyncOffForChildAccounts")) {
                    this.x0.S(true);
                    this.x0.I(R.drawable.0_resource_name_obfuscated_res_0x7f090332);
                    this.x0.Q(R.string.0_resource_name_obfuscated_res_0x7f140b60);
                    this.x0.k = new C1918Ot3(this, new Runnable() { // from class: TK1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = ManageSyncSettings.D0;
                            ManageSyncSettings manageSyncSettings = ManageSyncSettings.this;
                            manageSyncSettings.getClass();
                            if (US.a(C1202Jg1.a(), 1)) {
                                C8729pa3.a(manageSyncSettings.B0(), ((InterfaceC3562aY1) manageSyncSettings.getActivity()).N(), manageSyncSettings, 0, 0);
                            }
                        }
                    });
                } else {
                    this.x0.S(false);
                }
            } else {
                this.x0.S(true);
                this.x0.I(R.drawable.0_resource_name_obfuscated_res_0x7f09031d);
                this.x0.Q(R.string.0_resource_name_obfuscated_res_0x7f140a4d);
                this.x0.k = new C1918Ot3(this, new Runnable() { // from class: SK1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = ManageSyncSettings.D0;
                        ManageSyncSettings manageSyncSettings = ManageSyncSettings.this;
                        manageSyncSettings.getClass();
                        if (US.a(C1202Jg1.a(), 1)) {
                            C8729pa3.a(manageSyncSettings.B0(), ((InterfaceC3562aY1) manageSyncSettings.getActivity()).N(), manageSyncSettings, 1, 0);
                        }
                    }
                });
            }
            M0("advanced_category").S(true);
        }
        this.y0 = M0("google_activity_controls");
        Preference M0 = M0("encryption");
        this.z0 = M0;
        M0.k = new C1918Ot3(this, new Runnable() { // from class: UK1
            @Override // java.lang.Runnable
            public final void run() {
                ManageSyncSettings manageSyncSettings = ManageSyncSettings.this;
                AbstractC1658Mt3 abstractC1658Mt3 = manageSyncSettings.j0;
                if (abstractC1658Mt3.h()) {
                    if (abstractC1658Mt3.i()) {
                        h hVar = manageSyncSettings.x;
                        hVar.getClass();
                        C10547us c10547us = new C10547us(hVar);
                        PassphraseDialogFragment passphraseDialogFragment = new PassphraseDialogFragment();
                        passphraseDialogFragment.H0(-1, manageSyncSettings);
                        passphraseDialogFragment.P0(c10547us, "enter_password");
                        return;
                    }
                    long j = ((SyncServiceImpl) abstractC1658Mt3).c;
                    if (N.MUR3vHAY(j)) {
                        C1202Jg1 a = C1202Jg1.a();
                        Profile d2 = Profile.d();
                        a.getClass();
                        CoreAccountInfo b = C1202Jg1.b(d2).b(1);
                        if (b != null) {
                            TrustedVaultClient.a().getClass();
                            N.M5G1GV5m(0);
                            TrustedVaultClient.a().a.a(b).h(new C2048Pt3(1, manageSyncSettings), new C2178Qt3(1));
                            return;
                        }
                        return;
                    }
                    h hVar2 = manageSyncSettings.x;
                    hVar2.getClass();
                    C10547us c10547us2 = new C10547us(hVar2);
                    int f = abstractC1658Mt3.f();
                    boolean MQNi8hO7 = N.MQNi8hO7(j);
                    PassphraseTypeDialogFragment passphraseTypeDialogFragment = new PassphraseTypeDialogFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("arg_current_type", f);
                    bundle2.putBoolean("arg_is_custom_passphrase_allowed", MQNi8hO7);
                    passphraseTypeDialogFragment.E0(bundle2);
                    passphraseTypeDialogFragment.P0(c10547us2, "password_type");
                    passphraseTypeDialogFragment.H0(-1, manageSyncSettings);
                }
            }
        });
        M0("sync_review_data").k = new C1918Ot3(this, new Runnable() { // from class: VK1
            @Override // java.lang.Runnable
            public final void run() {
                int i = ManageSyncSettings.D0;
                AbstractC2308Rt3.e("https://www.google.com/settings/chrome/sync", ManageSyncSettings.this.getActivity());
            }
        });
        ChromeBaseCheckBoxPreference[] chromeBaseCheckBoxPreferenceArr = {this.o0, this.p0, this.q0, this.r0, this.s0, this.t0, this.u0, this.v0};
        this.w0 = chromeBaseCheckBoxPreferenceArr;
        for (int i = 0; i < 8; i++) {
            chromeBaseCheckBoxPreferenceArr[i].j = this;
        }
        SyncServiceImpl syncServiceImpl = (SyncServiceImpl) this.j0;
        syncServiceImpl.getClass();
        Object obj = ThreadUtils.a;
        int i2 = syncServiceImpl.d + 1;
        syncServiceImpl.d = i2;
        if (i2 == 1) {
            N.M$maQ5d_(syncServiceImpl.c, true);
        }
        this.C0 = new C1788Nt3(syncServiceImpl);
        this.A0 = (PreferenceCategory) M0("search_and_browse_category");
        ChromeSwitchPreference chromeSwitchPreference2 = (ChromeSwitchPreference) M0("url_keyed_anonymized_data");
        this.B0 = chromeSwitchPreference2;
        chromeSwitchPreference2.W(N.Mfmn09fr(d));
        ChromeSwitchPreference chromeSwitchPreference3 = this.B0;
        chromeSwitchPreference3.j = new InterfaceC9213qy2() { // from class: WK1
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj2) {
                int i3 = ManageSyncSettings.D0;
                N.MnEYaN9w(Profile.this, ((Boolean) obj2).booleanValue());
                return true;
            }
        };
        chromeSwitchPreference3.b0(new InterfaceC4184cL1() { // from class: XK1
            @Override // defpackage.InterfaceC4184cL1
            public final /* synthetic */ boolean a(Preference preference) {
                return false;
            }

            @Override // defpackage.InterfaceC4184cL1
            public final /* synthetic */ boolean b(Preference preference) {
                return AbstractC3841bL1.a(this, preference);
            }

            @Override // defpackage.InterfaceC4184cL1
            public final /* synthetic */ boolean c() {
                return AbstractC9008qO.a();
            }

            @Override // defpackage.InterfaceC4184cL1
            public final boolean d(Preference preference) {
                int i3 = ManageSyncSettings.D0;
                return N.MIMq96JJ(Profile.this);
            }
        });
    }

    public final void R0(String str) {
        DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0;
        h hVar = this.x;
        if (hVar == null || (dialogInterfaceOnCancelListenerC7423lm0 = (DialogInterfaceOnCancelListenerC7423lm0) hVar.B(str)) == null) {
            return;
        }
        dialogInterfaceOnCancelListenerC7423lm0.L0(false, false);
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        U0();
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.f11484J = true;
        C1788Nt3 c1788Nt3 = this.C0;
        c1788Nt3.getClass();
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
