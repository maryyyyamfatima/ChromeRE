package org.chromium.chrome.browser.language.settings;

import J.N;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.android.chrome.R;
import defpackage.A50;
import defpackage.AT0;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC4649di;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC6547jD;
import defpackage.C0685Fh;
import defpackage.C12188zf3;
import defpackage.C5772gx1;
import defpackage.C6116hx1;
import defpackage.C6132i01;
import defpackage.C6151i32;
import defpackage.C6458ix1;
import defpackage.C7928nE;
import defpackage.C8178nx1;
import defpackage.C9549rx1;
import defpackage.E23;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC7834mx1;
import defpackage.InterfaceC8184ny2;
import defpackage.InterfaceC9207qx1;
import defpackage.InterfaceC9555ry2;
import defpackage.KH;
import defpackage.L53;
import defpackage.O8;
import defpackage.R44;
import defpackage.UN;
import defpackage.ViewOnClickListenerC1069If3;
import java.util.Arrays;
import java.util.HashSet;
import org.chromium.base.BundleUtils;
import org.chromium.base.LocaleUtils;
import org.chromium.chrome.browser.language.settings.LanguageItemPickerPreference;
import org.chromium.chrome.browser.language.settings.LanguageSettings;
import org.chromium.chrome.browser.preferences.PrefChangeRegistrar;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.components.prefs.PrefService;
import org.chromium.ui.base.ResourceBundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LanguageSettings extends AbstractC0123Ay2 implements E23, AT0 {
    public static final /* synthetic */ int m0 = 0;
    public SettingsLauncher j0;
    public final C0685Fh k0 = new C0685Fh();
    public PrefChangeRegistrar l0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f14058e);
        this.l0 = new PrefChangeRegistrar();
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("DetailedLanguageSettings") || N.M09VlOh_("AppLanguagePrompt") || C6132i01.d.c) {
            if (C8178nx1.f == null) {
                C8178nx1.f = new C8178nx1();
            }
            C8178nx1 c8178nx1 = C8178nx1.f;
            c8178nx1.getClass();
            AbstractC4851eH1.d("LanguageSettings", TextUtils.concat("Installed Languages: ", TextUtils.join(",", !BundleUtils.c() ? new HashSet(Arrays.asList(ResourceBundle.a)) : c8178nx1.c.f())).toString(), new Object[0]);
            L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f18001f);
            ((PreferenceCategory) M0("app_language_section")).R(N().getString(R.string.0_resource_name_obfuscated_res_0x7f1401f4, AbstractC6547jD.a.a));
            LanguageItemPickerPreference languageItemPickerPreference = (LanguageItemPickerPreference) M0("app_language_preference");
            languageItemPickerPreference.X(AbstractC4649di.a());
            languageItemPickerPreference.Z = true;
            languageItemPickerPreference.Y();
            languageItemPickerPreference.k = new C6458ix1(this, 3, 1, 2);
            C0685Fh c0685Fh = this.k0;
            c0685Fh.getClass();
            Activity activity = getActivity();
            c0685Fh.e = activity;
            c0685Fh.d = languageItemPickerPreference;
            c0685Fh.a = new ViewOnClickListenerC1069If3(activity, (ViewGroup) activity.findViewById(android.R.id.content), null);
            ContentLanguagesPreference contentLanguagesPreference = (ContentLanguagesPreference) M0("content_languages_preference");
            contentLanguagesPreference.W = this;
            PreferenceCategory preferenceCategory = (PreferenceCategory) M0("translation_advanced_settings_section");
            preferenceCategory.a0 = new KH();
            preferenceCategory.S(R0().a("translate.enabled"));
            final LanguageItemPickerPreference languageItemPickerPreference2 = (LanguageItemPickerPreference) M0("translate_settings_target_language");
            languageItemPickerPreference2.X(LocaleUtils.a(N.MMKf4EpW()));
            languageItemPickerPreference2.k = new C6458ix1(this, 5, 2, 3);
            this.l0.a("translate_recent_target", new InterfaceC8184ny2() { // from class: cx1
                @Override // defpackage.InterfaceC8184ny2
                public final void c() {
                    int i = LanguageSettings.m0;
                    LanguageItemPickerPreference.this.X(LocaleUtils.a(N.MMKf4EpW()));
                }
            });
            final LanguageItemListPreference languageItemListPreference = (LanguageItemListPreference) M0("translate_settings_always_languages");
            languageItemListPreference.Y = new O8();
            languageItemListPreference.X();
            this.l0.a("translate_allowlists", languageItemListPreference);
            languageItemListPreference.k = new InterfaceC9555ry2() { // from class: fx1
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    LanguageSettings languageSettings = LanguageSettings.this;
                    languageSettings.J0(languageSettings.j0.e(languageSettings.getActivity(), languageItemListPreference.Y.a()));
                    return true;
                }
            };
            final LanguageItemListPreference languageItemListPreference2 = (LanguageItemListPreference) M0("translate_settings_never_languages");
            languageItemListPreference2.Y = new C6151i32();
            languageItemListPreference2.X();
            this.l0.a("translate_blocked_languages", languageItemListPreference2);
            languageItemListPreference2.k = new InterfaceC9555ry2() { // from class: fx1
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    LanguageSettings languageSettings = LanguageSettings.this;
                    languageSettings.J0(languageSettings.j0.e(languageSettings.getActivity(), languageItemListPreference2.Y.a()));
                    return true;
                }
            };
            ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) M0("translate_switch");
            chromeSwitchPreference.W(R0().a("translate.enabled"));
            chromeSwitchPreference.j = new C6116hx1(contentLanguagesPreference, preferenceCategory);
            chromeSwitchPreference.b0(new InterfaceC4184cL1() { // from class: dx1
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
                    return LanguageSettings.R0().d("translate.enabled");
                }
            });
        } else {
            L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180020);
            ContentLanguagesPreference contentLanguagesPreference2 = (ContentLanguagesPreference) M0("preferred_languages");
            contentLanguagesPreference2.W = this;
            ChromeSwitchPreference chromeSwitchPreference2 = (ChromeSwitchPreference) M0("translate_switch");
            chromeSwitchPreference2.W(R0().a("translate.enabled"));
            chromeSwitchPreference2.j = new C5772gx1(contentLanguagesPreference2);
            chromeSwitchPreference2.b0(new InterfaceC4184cL1() { // from class: bx1
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
                    return LanguageSettings.R0().d("translate.enabled");
                }
            });
        }
        C9549rx1.h(0);
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void t0() {
        super.t0();
        C0685Fh c0685Fh = this.k0;
        C12188zf3 c12188zf3 = c0685Fh.b;
        if (c12188zf3 != null) {
            ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = c0685Fh.a;
            if (viewOnClickListenerC1069If3.j) {
                viewOnClickListenerC1069If3.c(c12188zf3);
                c0685Fh.b = null;
            }
        }
    }

    @Override // androidx.fragment.app.c
    public final void d0(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        String stringExtra = intent.getStringExtra("SelectLanguageFragment.SelectedLanguage");
        if (i == 1) {
            C9549rx1 b = C9549rx1.b();
            b.getClass();
            N.Me60Lv4_(stringExtra, true);
            InterfaceC9207qx1 interfaceC9207qx1 = b.b;
            if (interfaceC9207qx1 != null) {
                ((A50) interfaceC9207qx1).S();
            }
            C9549rx1.g(2);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                ((LanguageItemPickerPreference) M0("translate_settings_target_language")).X(stringExtra);
                N.MMJjRfp9(stringExtra);
                C9549rx1.g(10);
                return;
            }
            return;
        }
        C9549rx1.g(9);
        final C0685Fh c0685Fh = this.k0;
        c0685Fh.d.X(stringExtra);
        c0685Fh.d.P(c0685Fh.e.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1405a5, c0685Fh.d.Y.c));
        c0685Fh.d.G(false);
        AbstractC4649di.c(stringExtra, new InterfaceC7834mx1() { // from class: Ch
            @Override // defpackage.InterfaceC7834mx1
            public final void a(boolean z) {
                C0685Fh c0685Fh2 = C0685Fh.this;
                if (z) {
                    c0685Fh2.d.P(c0685Fh2.e.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1405a7, c0685Fh2.d.Y.c, AbstractC6547jD.a.a));
                    c0685Fh2.d.G(true);
                    c0685Fh2.a.a(c0685Fh2.c);
                    String str = c0685Fh2.d.Y.b;
                    Resources resources = c0685Fh2.e.getResources();
                    C12188zf3 a = C12188zf3.a(resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140592, str), c0685Fh2.c, 2, 11);
                    a.d = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140593);
                    a.e = null;
                    a.i = false;
                    ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = c0685Fh2.a;
                    if (viewOnClickListenerC1069If3.j) {
                        viewOnClickListenerC1069If3.c(a);
                        return;
                    } else {
                        c0685Fh2.b = a;
                        return;
                    }
                }
                c0685Fh2.d.P(c0685Fh2.e.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1405a6, c0685Fh2.d.Y.c));
                c0685Fh2.d.G(true);
            }
        });
        if (TextUtils.equals(stringExtra, null)) {
            stringExtra = C6132i01.d.a.getLanguage();
        }
        N.MMJjRfp9(stringExtra);
    }

    @Override // defpackage.AT0
    public final void f(SettingsLauncher settingsLauncher) {
        this.j0 = settingsLauncher;
    }

    public static PrefService R0() {
        return R44.a(Profile.d());
    }

    @Override // androidx.fragment.app.c
    public final void l0() {
        this.f11484J = true;
        C9549rx1.c = null;
        this.l0.b();
    }
}
