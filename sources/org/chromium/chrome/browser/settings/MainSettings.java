package org.chromium.chrome.browser.settings;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC0193Bm2;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC1872Ok2;
import defpackage.AbstractC2308Rt3;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC4871eL1;
import defpackage.AbstractC6547jD;
import defpackage.AbstractC8650pL;
import defpackage.AbstractC9108qg3;
import defpackage.AbstractC9966tA;
import defpackage.C10648v91;
import defpackage.C1202Jg1;
import defpackage.C8765pg3;
import defpackage.EK1;
import defpackage.GG3;
import defpackage.I53;
import defpackage.IG3;
import defpackage.InterfaceC0963Hk2;
import defpackage.InterfaceC1528Lt3;
import defpackage.InterfaceC5298fb3;
import defpackage.InterfaceC7697ma2;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import defpackage.O83;
import defpackage.S6;
import defpackage.US;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.password_manager.PasswordManagerLauncher;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.settings.MainSettings;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.signin.SyncConsentFragment;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.chrome.browser.sync.settings.ManageSyncSettings;
import org.chromium.chrome.browser.sync.settings.SignInPreference;
import org.chromium.chrome.browser.sync.settings.SyncPromoPreference;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;
import org.chromium.components.search_engines.TemplateUrl;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MainSettings extends AbstractC0123Ay2 implements GG3, InterfaceC1528Lt3, InterfaceC5298fb3 {
    public static final /* synthetic */ int q0 = 0;
    public final EK1 j0;
    public final HashMap k0 = new HashMap();
    public SyncPromoPreference l0;
    public SignInPreference m0;
    public ChromeBasePreference n0;
    public InterfaceC0963Hk2 o0;
    public InterfaceC7697ma2 p0;

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void i() {
    }

    public MainSettings() {
        F0();
        this.j0 = new EK1();
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140a00);
        this.o0 = AbstractC1872Ok2.b(new I53());
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void v0(View view, Bundle bundle) {
        super.v0(view, bundle);
        this.d0.p0(null);
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void t0() {
        super.t0();
        SigninManager a = AbstractC9966tA.a(C1202Jg1.a());
        if (a.r()) {
            a.b(this);
        }
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        if (b != null) {
            b.a(this);
        }
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void u0() {
        super.u0();
        SigninManager a = AbstractC9966tA.a(C1202Jg1.a());
        if (a.r()) {
            a.f(this);
        }
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        if (b != null) {
            b.l(this);
        }
    }

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        HashMap hashMap;
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180025);
        int Z = N0().Z();
        int i = 0;
        while (true) {
            hashMap = this.k0;
            if (i >= Z) {
                break;
            }
            Preference Y = N0().Y(i);
            hashMap.put(Y.q, Y);
            i++;
        }
        this.l0 = (SyncPromoPreference) hashMap.get("sync_promo");
        this.m0 = (SignInPreference) hashMap.get("sign_in");
        this.n0 = (ChromeBasePreference) M0("manage_sync");
        this.l0.W = new Runnable() { // from class: zK1
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = MainSettings.q0;
                MainSettings mainSettings = MainSettings.this;
                mainSettings.getClass();
                C7928nE c7928nE = UN.a;
                if (N.M09VlOh_("SyncAndroidPromosWithIllustration") || N.M09VlOh_("SyncAndroidPromosWithSingleButton") || N.M09VlOh_("SyncAndroidPromosWithTitle")) {
                    return;
                }
                boolean z = mainSettings.l0.V == 1;
                mainSettings.M0("account_and_google_services_section").S(!z);
                SignInPreference signInPreference = mainSettings.m0;
                signInPreference.W = z;
                signInPreference.X();
            }
        };
        U0();
        boolean l = AbstractC0193Bm2.l();
        EK1 ek1 = this.j0;
        if (l) {
            ChromeBasePreference chromeBasePreference = (ChromeBasePreference) hashMap.get("passwords");
            chromeBasePreference.U = ek1;
            AbstractC4871eL1.b(ek1, chromeBasePreference);
        }
        ChromeBasePreference chromeBasePreference2 = (ChromeBasePreference) hashMap.get("search_engine");
        chromeBasePreference2.U = ek1;
        AbstractC4871eL1.b(ek1, chromeBasePreference2);
        if (Build.VERSION.SDK_INT >= 26) {
            M0("notifications").k = new InterfaceC9555ry2() { // from class: AK1
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    int i2 = MainSettings.q0;
                    MainSettings mainSettings = MainSettings.this;
                    mainSettings.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", V60.a.getPackageName());
                    mainSettings.J0(intent);
                    return true;
                }
            };
        } else {
            N0().b0(M0("notifications"));
        }
        if (!IG3.a().f()) {
            IG3.a().g(this);
            TemplateUrlService a = IG3.a();
            a.getClass();
            Object obj = ThreadUtils.a;
            N.MVKcMDBb(a.c, a);
        }
        new S6(null).b(new Callback() { // from class: BK1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                int i2 = MainSettings.q0;
                MainSettings mainSettings = MainSettings.this;
                mainSettings.getClass();
                if (((R6) obj2).a) {
                    return;
                }
                mainSettings.N0().b0(mainSettings.M0("toolbar_shortcut"));
            }
        });
    }

    public final void V0() {
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        if (C1202Jg1.c(d).r()) {
            R0("sign_in");
        } else {
            Preference X = N0().X("sign_in");
            if (X != null) {
                N0().b0(X);
            }
        }
        T0();
        W0();
        U0();
        R0("homepage").O(C10648v91.d() ? R.string.0_resource_name_obfuscated_res_0x7f140b27 : R.string.0_resource_name_obfuscated_res_0x7f140b26);
        R0("ui_theme").l().putInt("theme_settings_entry", 0);
        if (O83.a.e("developer", false)) {
            R0("developer");
            return;
        }
        Preference X2 = N0().X("developer");
        if (X2 != null) {
            N0().b0(X2);
        }
    }

    public final Preference R0(String str) {
        Preference X = N0().X(str);
        HashMap hashMap = this.k0;
        if (X == null) {
            N0().W((Preference) hashMap.get(str));
        }
        return (Preference) hashMap.get(str);
    }

    public final void T0() {
        Drawable a;
        String string;
        C1202Jg1 a2 = C1202Jg1.a();
        Profile d = Profile.d();
        a2.getClass();
        final String b = CoreAccountInfo.b(C1202Jg1.b(d).b(0));
        boolean z = b != null;
        this.n0.S(z);
        if (z) {
            C1202Jg1 a3 = C1202Jg1.a();
            Profile d2 = Profile.d();
            a3.getClass();
            final boolean z2 = C1202Jg1.b(d2).b(1) != null;
            ChromeBasePreference chromeBasePreference = this.n0;
            Activity activity = getActivity();
            if (!US.a(C1202Jg1.a(), 1)) {
                a = AbstractC2884Wf.a(activity, R.drawable.0_resource_name_obfuscated_res_0x7f09032b);
            } else {
                AbstractC1658Mt3 b2 = AbstractC1658Mt3.b();
                if (b2 == null || !b2.j() || b2.e().isEmpty()) {
                    a = AbstractC2884Wf.a(activity, R.drawable.0_resource_name_obfuscated_res_0x7f09032b);
                } else if (N.M56mW_xB(((SyncServiceImpl) b2).c)) {
                    a = AbstractC2884Wf.a(activity, R.drawable.0_resource_name_obfuscated_res_0x7f09032b);
                } else if (AbstractC2308Rt3.a() != -1) {
                    a = AbstractC2884Wf.a(activity, R.drawable.0_resource_name_obfuscated_res_0x7f090328);
                } else {
                    a = AbstractC2884Wf.a(activity, R.drawable.0_resource_name_obfuscated_res_0x7f09032c);
                }
            }
            chromeBasePreference.J(a);
            ChromeBasePreference chromeBasePreference2 = this.n0;
            Activity activity2 = getActivity();
            if (!US.a(C1202Jg1.a(), 1)) {
                string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140aeb);
            } else {
                AbstractC1658Mt3 b3 = AbstractC1658Mt3.b();
                if (b3 == null) {
                    string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140aeb);
                } else {
                    long j = ((SyncServiceImpl) b3).c;
                    if (N.M56mW_xB(j)) {
                        string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140ae5);
                    } else if (!N.M_K26FRY(j)) {
                        string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140b09);
                    } else if (b3.d() != 0) {
                        string = AbstractC2308Rt3.d(activity2, b3.d());
                    } else if (N.MuE0jZeQ(j)) {
                        string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140adf, AbstractC6547jD.a.a);
                    } else if (N.Mmbpwv9L(j)) {
                        string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140add);
                    } else if (!b3.j() || b3.e().isEmpty()) {
                        string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140ad4);
                    } else if (!N.MbQJKXXr(j)) {
                        string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140b0b);
                    } else if (b3.i()) {
                        string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140ae9);
                    } else if (N.MXx$a024(j)) {
                        if (b3.g()) {
                            string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140ada);
                        } else {
                            string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f1407df);
                        }
                    } else if (N.MTllqxqb(j)) {
                        string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140aea);
                    } else {
                        string = activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140aec);
                    }
                }
            }
            chromeBasePreference2.P(string);
            this.n0.k = new InterfaceC9555ry2() { // from class: yK1
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    int i = MainSettings.q0;
                    MainSettings mainSettings = MainSettings.this;
                    Context K = mainSettings.K();
                    if (N.M56mW_xB(((SyncServiceImpl) AbstractC1658Mt3.b()).c)) {
                        ZN3.c(K, K.getString(R.string.0_resource_name_obfuscated_res_0x7f140ae5), 1).d();
                    } else if (z2) {
                        String name = ManageSyncSettings.class.getName();
                        Intent a4 = AbstractC7459ls0.a(K, SettingsActivity.class);
                        if (!(K instanceof Activity)) {
                            a4.addFlags(268435456);
                            a4.addFlags(67108864);
                        }
                        a4.putExtra("show_fragment", name);
                        ComponentName componentName = AbstractC2281Ro1.a;
                        try {
                            K.startActivity(a4, null);
                        } catch (ActivityNotFoundException unused) {
                        }
                    } else {
                        C7928nE c7928nE = UN.a;
                        if (N.M09VlOh_("TangibleSync")) {
                            new QE3(mainSettings.B0(), (ZX1) ((C8385oa2) mainSettings.p0).g, C3083Xs3.a());
                        } else {
                            C3083Xs3.a().getClass();
                            int i2 = SyncConsentFragment.s0;
                            Bundle N0 = SyncConsentFragmentBase.N0(38, b);
                            N0.putInt("SyncConsentFragment.PersonalizedPromoAction", 1);
                            C3083Xs3.c(K, N0);
                        }
                    }
                    return true;
                }
            };
        }
    }

    public final void W0() {
        if (!IG3.a().f()) {
            ((ChromeBasePreference) M0("search_engine")).G(false);
            return;
        }
        TemplateUrl c = IG3.a().c();
        String c2 = c != null ? c.c() : null;
        Preference M0 = M0("search_engine");
        M0.G(true);
        M0.P(c2);
    }

    public final void U0() {
        CharSequence trim;
        Preference M0 = M0("passwords");
        if (AbstractC0193Bm2.l()) {
            Context K = K();
            if (S0()) {
                trim = AbstractC9108qg3.a(K.getString(R.string.0_resource_name_obfuscated_res_0x7f1407de), new C8765pg3(new SuperscriptSpan(), new RelativeSizeSpan(0.75f), new ForegroundColorSpan(K.getColor(R.color.0_resource_name_obfuscated_res_0x7f070136))));
            } else {
                trim = AbstractC9108qg3.b(K.getString(R.string.0_resource_name_obfuscated_res_0x7f1407de), new C8765pg3(new Object[0])).toString().trim();
            }
            M0.R(trim);
        }
        M0.k = new InterfaceC9555ry2() { // from class: CK1
            @Override // defpackage.InterfaceC9555ry2
            public final boolean p(Preference preference) {
                int i = MainSettings.q0;
                MainSettings mainSettings = MainSettings.this;
                mainSettings.getClass();
                if (MainSettings.S0()) {
                    R44.a(Profile.d()).e("passwords_pref_with_new_label_used", true);
                }
                PasswordManagerLauncher.a(mainSettings.getActivity(), 0, mainSettings.p0);
                return true;
            }
        };
    }

    public static boolean S0() {
        return AbstractC0193Bm2.l() && AbstractC0193Bm2.e(AbstractC1658Mt3.b()) && !AbstractC8650pL.a("passwords_pref_with_new_label_used");
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void b() {
        new Handler().post(new Runnable() { // from class: DK1
            @Override // java.lang.Runnable
            public final void run() {
                int i = MainSettings.q0;
                MainSettings.this.V0();
            }
        });
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void g() {
        V0();
    }

    @Override // defpackage.GG3
    public final void d() {
        TemplateUrlService a = IG3.a();
        a.getClass();
        Object obj = ThreadUtils.a;
        a.a.d(this);
        W0();
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        T0();
        U0();
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        V0();
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.f11484J = true;
        if (!getActivity().isFinishing() || this.o0 == null) {
            return;
        }
        AbstractC1872Ok2.a();
    }
}
