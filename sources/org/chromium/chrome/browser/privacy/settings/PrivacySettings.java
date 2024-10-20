package org.chromium.chrome.browser.privacy.settings;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC9108qg3;
import defpackage.C11674y84;
import defpackage.C11997z52;
import defpackage.C12008z71;
import defpackage.C1202Jg1;
import defpackage.C3166Yj1;
import defpackage.C3792bB2;
import defpackage.C7928nE;
import defpackage.C8765pg3;
import defpackage.C8781pj1;
import defpackage.C9626sA2;
import defpackage.H13;
import defpackage.I13;
import defpackage.I53;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC9213qy2;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import defpackage.QB;
import defpackage.R44;
import defpackage.UN;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.incognito.reauth.IncognitoReauthSettingSwitchPreference;
import org.chromium.chrome.browser.privacy.settings.PrivacySettings;
import org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsFragmentV3;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.safe_browsing.settings.SafeBrowsingSettingsFragment;
import org.chromium.chrome.browser.sync.settings.GoogleServicesSettings;
import org.chromium.chrome.browser.sync.settings.ManageSyncSettings;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PrivacySettings extends AbstractC0123Ay2 implements InterfaceC9213qy2 {
    public static final /* synthetic */ int n0 = 0;
    public C3792bB2 j0;
    public C8781pj1 k0;
    public ViewGroup l0;
    public QB m0;

    /* JADX WARN: Type inference failed for: r9v12, types: [bB2] */
    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        SpannableString a;
        C9626sA2.g();
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f18002e);
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140853);
        Preference M0 = M0("privacy_sandbox");
        if (N.MewRKkCC()) {
            N0().b0(M0);
        } else {
            M0.P(K().getString(N.MhaiireD() ? R.string.0_resource_name_obfuscated_res_0x7f1408fd : R.string.0_resource_name_obfuscated_res_0x7f1408fc));
            M0.k = new InterfaceC9555ry2() { // from class: WA2
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    int i = PrivacySettings.n0;
                    PrivacySandboxSettingsFragmentV3.S0(PrivacySettings.this.K(), new I53(), 0);
                    return true;
                }
            };
        }
        Preference M02 = M0("privacy_review");
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("PrivacyGuideAndroid")) {
            N0().b0(M02);
        } else {
            M02.k = new InterfaceC9555ry2() { // from class: XA2
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    int i = PrivacySettings.n0;
                    PrivacySettings privacySettings = PrivacySettings.this;
                    Context K = privacySettings.K();
                    ViewGroup viewGroup = privacySettings.l0;
                    viewGroup.addView(new AA2(K, viewGroup, privacySettings.m0).c);
                    viewGroup.setVisibility(0);
                    return true;
                }
            };
        }
        IncognitoReauthSettingSwitchPreference incognitoReauthSettingSwitchPreference = (IncognitoReauthSettingSwitchPreference) M0("incognito_lock");
        final C8781pj1 c8781pj1 = new C8781pj1(incognitoReauthSettingSwitchPreference);
        this.k0 = c8781pj1;
        final Activity activity = getActivity();
        if (!C3166Yj1.b()) {
            incognitoReauthSettingSwitchPreference.S(false);
        } else {
            incognitoReauthSettingSwitchPreference.f0 = new Runnable() { // from class: mj1
                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent = new Intent("android.settings.SECURITY_SETTINGS");
                    intent.setFlags(268435456);
                    activity.startActivity(intent);
                }
            };
            incognitoReauthSettingSwitchPreference.j = new InterfaceC9213qy2() { // from class: nj1
                @Override // defpackage.InterfaceC9213qy2
                public final boolean l(Preference preference, Object obj) {
                    C8781pj1 c8781pj12 = C8781pj1.this;
                    c8781pj12.getClass();
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (c8781pj12.b) {
                        return true;
                    }
                    boolean a2 = AbstractC8650pL.a("incognito.incognito_reauthentication");
                    if (c8781pj12.c == null) {
                        c8781pj12.c = new C3166Yj1();
                    }
                    c8781pj12.c.c(new C8438oj1(c8781pj12, a2, booleanValue));
                    return true;
                }
            };
            c8781pj1.a(activity);
        }
        Preference M03 = M0("safe_browsing");
        M03.P(SafeBrowsingSettingsFragment.T0(K()));
        M03.k = new InterfaceC9555ry2() { // from class: YA2
            @Override // defpackage.InterfaceC9555ry2
            public final boolean p(Preference preference) {
                int i = PrivacySettings.n0;
                preference.l().putInt("SafeBrowsingSettingsFragment.AccessPoint", 1);
                return false;
            }
        };
        F0();
        this.j0 = new InterfaceC4184cL1() { // from class: bB2
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
                int i = PrivacySettings.n0;
                if ("https_first_mode".equals(preference.q)) {
                    return R44.a(Profile.d()).d("https_only_mode_enabled");
                }
                return false;
            }
        };
        ((ChromeSwitchPreference) M0("can_make_payment")).j = this;
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("https_first_mode");
        chromeSwitchPreference.S(N.M09VlOh_("HttpsOnlyMode"));
        chromeSwitchPreference.j = this;
        chromeSwitchPreference.b0(this.j0);
        chromeSwitchPreference.W(R44.a(Profile.d()).a("https_only_mode_enabled"));
        M0("secure_dns").S(N.M6bsIDpc("DnsOverHttps", "ShowUi", true));
        Preference M04 = M0("sync_and_services_link");
        final I53 i53 = new I53();
        C11997z52 c11997z52 = new C11997z52(K(), new Callback() { // from class: ZA2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i = PrivacySettings.n0;
                i53.c(PrivacySettings.this.getActivity(), GoogleServicesSettings.class);
            }
        });
        C1202Jg1 a2 = C1202Jg1.a();
        Profile d = Profile.d();
        a2.getClass();
        if (C1202Jg1.b(d).b(1) == null) {
            a = AbstractC9108qg3.a(O(R.string.0_resource_name_obfuscated_res_0x7f140904), new C8765pg3(c11997z52, "<link>", "</link>"));
        } else {
            a = AbstractC9108qg3.a(O(R.string.0_resource_name_obfuscated_res_0x7f140905), new C8765pg3(new C11997z52(K(), new Callback() { // from class: aB2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int i = PrivacySettings.n0;
                    i53.b(PrivacySettings.this.getActivity(), ManageSyncSettings.class, ManageSyncSettings.S0(false));
                }
            }), "<link1>", "</link1>"), new C8765pg3(c11997z52, "<link2>", "</link2>"));
        }
        M04.P(a);
        R0();
    }

    public final void R0() {
        String format;
        String string;
        PrefService a = R44.a(Profile.d());
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("can_make_payment");
        if (chromeSwitchPreference != null) {
            chromeSwitchPreference.W(a.a("payments.can_make_payment_enabled"));
        }
        Preference M0 = M0("do_not_track");
        if (M0 != null) {
            M0.O(a.a("enable_do_not_track") ? R.string.0_resource_name_obfuscated_res_0x7f140b27 : R.string.0_resource_name_obfuscated_res_0x7f140b26);
        }
        Preference M02 = M0("preload_pages");
        if (M02 != null) {
            Context K = K();
            int MaV3tKHW = N.MaV3tKHW();
            C7928nE c7928nE = UN.a;
            if (!N.M09VlOh_("ShowExtendedPreloadingSetting") && MaV3tKHW == 2) {
                MaV3tKHW = 1;
            }
            if (MaV3tKHW == 2) {
                string = K.getString(R.string.0_resource_name_obfuscated_res_0x7f140866);
            } else if (MaV3tKHW == 1) {
                string = K.getString(R.string.0_resource_name_obfuscated_res_0x7f14086f);
            } else {
                string = MaV3tKHW == 0 ? K.getString(R.string.0_resource_name_obfuscated_res_0x7f140868) : "";
            }
            M02.P(string);
        }
        Preference M03 = M0("secure_dns");
        if (M03 != null && M03.C) {
            Context K2 = K();
            int MvJZm_HK = N.MvJZm_HK();
            if (MvJZm_HK == 0) {
                format = K2.getString(R.string.0_resource_name_obfuscated_res_0x7f140b26);
            } else if (MvJZm_HK == 1) {
                format = K2.getString(R.string.0_resource_name_obfuscated_res_0x7f140a03);
            } else {
                String MBuwU61d = N.MBuwU61d();
                ArrayList a2 = I13.a();
                int i = 0;
                while (true) {
                    if (i >= a2.size()) {
                        break;
                    }
                    H13 h13 = (H13) a2.get(i);
                    if (h13.b.equals(MBuwU61d)) {
                        MBuwU61d = h13.a;
                        break;
                    }
                    i++;
                }
                format = String.format("%s - %s", K2.getString(R.string.0_resource_name_obfuscated_res_0x7f140b27), MBuwU61d);
            }
            M03.P(format);
        }
        Preference M04 = M0("safe_browsing");
        if (M04 != null && M04.C) {
            M04.P(SafeBrowsingSettingsFragment.T0(K()));
        }
        Preference M05 = M0("usage_stats_reporting");
        if (M05 != null) {
            if (Build.VERSION.SDK_INT < 29 || !a.a("usage_stats_reporting.enabled")) {
                N0().b0(M05);
            } else {
                M05.k = new InterfaceC9555ry2() { // from class: VA2
                    /* JADX WARN: Type inference failed for: r1v0, types: [cB2] */
                    @Override // defpackage.InterfaceC9555ry2
                    public final boolean p(Preference preference) {
                        int i2 = PrivacySettings.n0;
                        final PrivacySettings privacySettings = PrivacySettings.this;
                        Activity activity = privacySettings.getActivity();
                        C7189l44 c7189l44 = new C7189l44(activity, new Callback() { // from class: cB2
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj) {
                                return new ZE(this, obj);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj) {
                                int i3 = PrivacySettings.n0;
                                PrivacySettings privacySettings2 = PrivacySettings.this;
                                privacySettings2.getClass();
                                if (((Boolean) obj).booleanValue()) {
                                    privacySettings2.R0();
                                }
                            }
                        });
                        Resources resources = activity.getResources();
                        BD2 bd2 = new BD2(AbstractC4249cY1.B);
                        bd2.e(AbstractC4249cY1.a, new C6845k44(c7189l44));
                        bd2.d(AbstractC4249cY1.n, resources, R.string.0_resource_name_obfuscated_res_0x7f1402f4);
                        PD2 pd2 = AbstractC4249cY1.j;
                        PD2 pd22 = AbstractC4249cY1.f;
                        bd2.d(AbstractC4249cY1.c, resources, R.string.0_resource_name_obfuscated_res_0x7f140b82);
                        bd2.e(pd22, resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140b81));
                        bd2.d(pd2, resources, R.string.0_resource_name_obfuscated_res_0x7f140953);
                        c7189l44.b = bd2.a();
                        ZX1 zx1 = new ZX1(new C4998ej(activity));
                        c7189l44.a = zx1;
                        zx1.l(c7189l44.b, 1, false);
                        return true;
                    }
                };
            }
        }
        Preference M06 = M0("privacy_sandbox");
        if (M06 != null) {
            M06.P(K().getString(N.MhaiireD() ? R.string.0_resource_name_obfuscated_res_0x7f1408fd : R.string.0_resource_name_obfuscated_res_0x7f1408fc));
        }
        this.k0.a(getActivity());
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menu.add(0, R.id.menu_id_targeted_help, 0, R.string.0_resource_name_obfuscated_res_0x7f140629).setIcon(C11674y84.b(N(), R.drawable.0_resource_name_obfuscated_res_0x7f09023a, getActivity().getTheme()));
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_id_targeted_help) {
            return false;
        }
        C12008z71.a().d(getActivity(), O(R.string.0_resource_name_obfuscated_res_0x7f1404ef), null, Profile.d());
        return true;
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        String str = preference.q;
        if ("can_make_payment".equals(str)) {
            R44.a(Profile.d()).e("payments.can_make_payment_enabled", ((Boolean) obj).booleanValue());
            return true;
        }
        if (!"https_first_mode".equals(str)) {
            return true;
        }
        R44.a(Profile.d()).e("https_only_mode_enabled", ((Boolean) obj).booleanValue());
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        R0();
    }
}
