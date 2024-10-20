package org.chromium.chrome.browser.settings;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AT0;
import defpackage.AbstractC0193Bm2;
import defpackage.AbstractC11008wC2;
import defpackage.AbstractC1872Ok2;
import defpackage.AbstractC8540p04;
import defpackage.AbstractC9771sd;
import defpackage.C0555Eh;
import defpackage.C0685Fh;
import defpackage.C10547us;
import defpackage.C11441xU2;
import defpackage.C11655y53;
import defpackage.C11674y84;
import defpackage.C11939yv1;
import defpackage.C12008z71;
import defpackage.C1612Mk2;
import defpackage.C2241Rg1;
import defpackage.C2392Sk2;
import defpackage.C2860Wa0;
import defpackage.C3083Xs3;
import defpackage.C4998ej;
import defpackage.C7629mN;
import defpackage.C7928nE;
import defpackage.C8385oa2;
import defpackage.C8490os;
import defpackage.C9097qe4;
import defpackage.C9335rL;
import defpackage.GP;
import defpackage.I53;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC0425Dh;
import defpackage.InterfaceC0809Gf3;
import defpackage.InterfaceC12299zy2;
import defpackage.InterfaceC4223cT0;
import defpackage.InterfaceC8146ns;
import defpackage.KH;
import defpackage.LM;
import defpackage.OX2;
import defpackage.QA2;
import defpackage.QZ3;
import defpackage.R44;
import defpackage.UA2;
import defpackage.UN;
import defpackage.ViewOnClickListenerC1069If3;
import defpackage.WT2;
import defpackage.ZX1;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.ApplicationLifetime;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragmentBasic;
import org.chromium.chrome.browser.history.HistoryActivity;
import org.chromium.chrome.browser.image_descriptions.ImageDescriptionsSettings;
import org.chromium.chrome.browser.language.settings.LanguageSettings;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.chrome.browser.password_check.PasswordCheckFragmentView;
import org.chromium.chrome.browser.password_entry_edit.CredentialEditBridge;
import org.chromium.chrome.browser.password_entry_edit.CredentialEntryFragmentViewBase;
import org.chromium.chrome.browser.privacy.settings.PrivacySettings;
import org.chromium.chrome.browser.privacy_sandbox.AdMeasurementFragment;
import org.chromium.chrome.browser.privacy_sandbox.AdPersonalizationFragment;
import org.chromium.chrome.browser.privacy_sandbox.AdPersonalizationRemovedFragment;
import org.chromium.chrome.browser.privacy_sandbox.FlocSettingsFragment;
import org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsBaseFragment;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.safety_check.SafetyCheckSettingsFragment;
import org.chromium.chrome.browser.search_engines.settings.SearchEngineSettings;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.sync.settings.ManageSyncSettings;
import org.chromium.components.browser_ui.accessibility.AccessibilitySettings;
import org.chromium.components.browser_ui.accessibility.FontSizePrefs;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.browser_ui.site_settings.SiteSettingsPreferenceFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SettingsActivity extends LM implements InterfaceC12299zy2, InterfaceC0809Gf3 {
    public static SettingsActivity H;
    public static boolean I;
    public boolean B;
    public final I53 C = new I53();
    public ViewOnClickListenerC1069If3 D;
    public OX2 E;
    public m F;
    public QZ3 G;

    @Override // defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTitle(R.string.f86150_resource_name_obfuscated_res_0x7f140a00);
        if (!I) {
            I = true;
            try {
                if (getPackageManager().getActivityInfo(getComponentName(), 0).exported) {
                    throw new IllegalStateException("SettingsActivity must not be exported.");
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        C7629mN.a().d(false);
        super.onCreate(bundle);
        setContentView(R.layout.f60750_resource_name_obfuscated_res_0x7f0e026d);
        m0((Toolbar) findViewById(R.id.action_bar));
        l0().n(true);
        this.B = bundle == null;
        String stringExtra = getIntent().getStringExtra("show_fragment");
        Bundle bundleExtra = getIntent().getBundleExtra("show_fragment_args");
        if (bundle == null) {
            if (stringExtra == null) {
                stringExtra = MainSettings.class.getName();
            }
            c V = c.V(this, stringExtra, bundleExtra);
            h h0 = h0();
            h0.getClass();
            C10547us c10547us = new C10547us(h0);
            c10547us.j(R.id.content, V, null);
            c10547us.e(false);
        }
        u0();
        if (Build.VERSION.SDK_INT < 28 && !AbstractC8540p04.g()) {
            AbstractC9771sd.g(getWindow(), 0);
            AbstractC9771sd.h(getWindow().getDecorView().getRootView(), getResources().getBoolean(R.bool.f15630_resource_name_obfuscated_res_0x7f06001b));
        }
        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.sheet_container);
        this.E = new OX2(this, new C11655y53(), (ViewGroup) viewGroup.getParent(), getColor(R.color.f17930_resource_name_obfuscated_res_0x7f070131));
        this.F = new m(new InterfaceC0079Ap3() { // from class: u53
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return SettingsActivity.this.E;
            }
        }, new Callback() { // from class: v53
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                SettingsActivity settingsActivity = SettingsActivity.H;
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }, getWindow(), C11939yv1.g, new InterfaceC0079Ap3() { // from class: w53
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                SettingsActivity settingsActivity = SettingsActivity.H;
                return viewGroup;
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, new InterfaceC0079Ap3() { // from class: x53
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                SettingsActivity settingsActivity = SettingsActivity.H;
                return Integer.valueOf(SettingsActivity.this.findViewById(android.R.id.content).getHeight());
            }
        });
        C8490os.a(this, this.l, new InterfaceC8146ns() { // from class: t53
            @Override // defpackage.InterfaceC8146ns
            public final boolean onBackPressed() {
                SettingsActivity settingsActivity = SettingsActivity.H;
                InterfaceC10417uV2 A = SettingsActivity.this.h0().A(R.id.content);
                if (!(A instanceof InterfaceC11998z53) || !((ManageSyncSettings) ((InterfaceC11998z53) A)).k0) {
                    return false;
                }
                FI2.a("Signin_Signin_BackOnAdvancedSyncSettings");
                return false;
            }
        });
    }

    @Override // defpackage.LM, androidx.appcompat.app.a, defpackage.AbstractActivityC6817k00, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u0();
    }

    public final void u0() {
        QZ3 qz3 = this.G;
        if (qz3 == null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f40070_resource_name_obfuscated_res_0x7f08071b);
            View findViewById = findViewById(R.id.content);
            QZ3 qz32 = new QZ3(findViewById);
            this.G = qz32;
            new C9097qe4(findViewById, qz32, 0, dimensionPixelSize).b();
            return;
        }
        qz3.c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D = new ViewOnClickListenerC1069If3(this, (ViewGroup) findViewById(android.R.id.content), null);
        c A = h0().A(R.id.content);
        if (A instanceof SiteSettingsPreferenceFragment) {
            GP gp = ((SiteSettingsPreferenceFragment) A).j0;
            ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = this.D;
            if (viewOnClickListenerC1069If3 != null) {
                gp.d = new UA2(gp.a, viewOnClickListenerC1069If3, new I53());
            } else {
                gp.getClass();
            }
        }
        if (A instanceof AdPersonalizationFragment) {
            ((AdPersonalizationFragment) A).k0 = this.D;
        }
        if (A instanceof AdPersonalizationRemovedFragment) {
            ((AdPersonalizationRemovedFragment) A).o0 = this.D;
        }
    }

    @Override // defpackage.VS0, android.app.Activity
    public final void onResume() {
        super.onResume();
        SettingsActivity settingsActivity = H;
        if (settingsActivity != null && settingsActivity.getTaskId() != getTaskId() && !this.B) {
            finish();
            return;
        }
        SettingsActivity settingsActivity2 = H;
        if (settingsActivity2 != null && settingsActivity2.getTaskId() != getTaskId()) {
            H.finish();
        }
        H = this;
        this.B = false;
    }

    @Override // defpackage.VS0, android.app.Activity
    public final void onPause() {
        super.onPause();
        AbstractC11008wC2.a();
    }

    @Override // androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (H == this) {
            H = null;
        }
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        c A = h0().A(R.id.content);
        if (A != null && A.o0(menuItem)) {
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        if (menuItem.getItemId() == R.id.menu_id_general_help) {
            C12008z71.a().d(this, getString(R.string.f74440_resource_name_obfuscated_res_0x7f1404f4), null, Profile.d());
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menu_id_general_help, 196608, R.string.f77130_resource_name_obfuscated_res_0x7f140629).setIcon(C11674y84.b(getResources(), R.drawable.f48120_resource_name_obfuscated_res_0x7f09023a, getTheme()));
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.size() == 1) {
            MenuItem item = menu.getItem(0);
            if (item.getIcon() != null) {
                item.setShowAsAction(1);
            }
        }
        super.onPrepareOptionsMenu(menu);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [s53] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ex1] */
    @Override // defpackage.VS0
    public final void j0(final c cVar) {
        boolean z = cVar instanceof MainSettings;
        C8385oa2 c8385oa2 = this.y;
        if (z) {
            ((MainSettings) cVar).p0 = c8385oa2;
        }
        if (cVar instanceof SiteSettingsPreferenceFragment) {
            ((SiteSettingsPreferenceFragment) cVar).j0 = new GP(this, Profile.d());
        }
        boolean z2 = cVar instanceof AT0;
        I53 i53 = this.C;
        if (z2) {
            ((AT0) cVar).f(i53);
        }
        if (cVar instanceof InterfaceC4223cT0) {
            ((InterfaceC4223cT0) cVar).z(C12008z71.a());
        }
        if (cVar instanceof SafetyCheckSettingsFragment) {
            C11441xU2 c11441xU2 = new C11441xU2(this);
            I53 i532 = this.C;
            new WT2((SafetyCheckSettingsFragment) cVar, c11441xU2, i532, C3083Xs3.a(), c8385oa2);
            if (!AbstractC0193Bm2.a()) {
                C7928nE c7928nE = UN.a;
                if (N.M09VlOh_("PasswordScriptsFetching") || N.M09VlOh_("PasswordDomainCapabilitiesFetching")) {
                    N.M9QKlyGA(((C2392Sk2) AbstractC1872Ok2.b(i532)).a.a);
                }
            }
        }
        if (cVar instanceof PasswordCheckFragmentView) {
            new C1612Mk2((PasswordCheckFragmentView) cVar, C12008z71.a(), this.C, new KH(), new KH());
        }
        if (cVar instanceof CredentialEntryFragmentViewBase) {
            CredentialEntryFragmentViewBase credentialEntryFragmentViewBase = (CredentialEntryFragmentViewBase) cVar;
            C12008z71 a = C12008z71.a();
            CredentialEditBridge credentialEditBridge = CredentialEditBridge.c;
            if (credentialEditBridge == null) {
                credentialEntryFragmentViewBase.R0();
            } else {
                credentialEditBridge.b = new C2860Wa0(credentialEntryFragmentViewBase, credentialEditBridge, credentialEditBridge, a);
                N.MGXq90Cw(credentialEditBridge.a);
                N.MxEiaAZZ(credentialEditBridge.a);
            }
        }
        if (cVar instanceof SearchEngineSettings) {
            SearchEngineSettings searchEngineSettings = (SearchEngineSettings) cVar;
            Runnable runnable = new Runnable() { // from class: p53
                @Override // java.lang.Runnable
                public final void run() {
                    SettingsActivity settingsActivity = SettingsActivity.H;
                    LocaleManager.getInstance().a.getClass();
                    O83.a.p("LocaleManager_PREF_AUTO_SWITCH", false);
                }
            };
            searchEngineSettings.O0();
            searchEngineSettings.k0.m = runnable;
            searchEngineSettings.O0();
            searchEngineSettings.k0.n = i53;
        }
        if (cVar instanceof ImageDescriptionsSettings) {
            Profile d = Profile.d();
            ImageDescriptionsSettings imageDescriptionsSettings = (ImageDescriptionsSettings) cVar;
            Bundle bundle = imageDescriptionsSettings.l;
            if (bundle != null) {
                C2241Rg1.a().getClass();
                bundle.putBoolean("image_descriptions_switch", R44.a(d).a("settings.a11y.enable_accessibility_image_labels_android"));
                C2241Rg1.a().getClass();
                bundle.putBoolean("image_descriptions_data_policy", R44.a(d).a("settings.a11y.enable_accessibility_image_labels_only_on_wifi"));
            }
            imageDescriptionsSettings.k0 = C2241Rg1.a().a;
        }
        if (cVar instanceof PrivacySandboxSettingsBaseFragment) {
            ((PrivacySandboxSettingsBaseFragment) cVar).j0 = new QA2() { // from class: q53
                @Override // defpackage.QA2
                public final Intent a(Context context, Intent intent) {
                    return C0507Dx1.e(context, intent);
                }
            };
        }
        if (cVar instanceof AdMeasurementFragment) {
            ((AdMeasurementFragment) cVar).k0 = new Runnable() { // from class: r53
                @Override // java.lang.Runnable
                public final void run() {
                    SettingsActivity settingsActivity = SettingsActivity.H;
                    Activity activity = c.this.getActivity();
                    Intent intent = new Intent();
                    intent.setClass(activity, HistoryActivity.class);
                    intent.putExtra("org.chromium.chrome.browser.incognito_mode", false);
                    activity.startActivity(intent);
                }
            };
        }
        if (cVar instanceof FlocSettingsFragment) {
            ((FlocSettingsFragment) cVar).j0 = new QA2() { // from class: q53
                @Override // defpackage.QA2
                public final Intent a(Context context, Intent intent) {
                    return C0507Dx1.e(context, intent);
                }
            };
        }
        if (cVar instanceof LanguageSettings) {
            final ?? r1 = new InterfaceC0425Dh() { // from class: s53
                @Override // defpackage.InterfaceC0425Dh
                public final void a() {
                    SettingsActivity settingsActivity = SettingsActivity.H;
                    ApplicationLifetime.terminate(true);
                }
            };
            ?? r2 = new InterfaceC0425Dh() { // from class: ex1
                @Override // defpackage.InterfaceC0425Dh
                public final void a() {
                    int i = LanguageSettings.m0;
                    C9549rx1.g(16);
                    r1.a();
                }
            };
            C0685Fh c0685Fh = ((LanguageSettings) cVar).k0;
            c0685Fh.getClass();
            c0685Fh.c = new C0555Eh(r2);
        }
        if (cVar instanceof ClearBrowsingDataFragmentBasic) {
            ((ClearBrowsingDataFragmentBasic) cVar).p0 = new KH();
        }
        if (cVar instanceof PrivacySettings) {
            PrivacySettings privacySettings = (PrivacySettings) cVar;
            privacySettings.m0 = this.F;
            privacySettings.l0 = (ViewGroup) findViewById(R.id.dialog_container);
        }
        if (cVar instanceof AccessibilitySettings) {
            AccessibilitySettings accessibilitySettings = (AccessibilitySettings) cVar;
            accessibilitySettings.o0 = new C9335rL();
            Profile d2 = Profile.d();
            Object obj = ThreadUtils.a;
            if (FontSizePrefs.c == null) {
                FontSizePrefs.c = new FontSizePrefs(d2);
            }
            accessibilitySettings.q0 = FontSizePrefs.c;
        }
    }

    public final void v0(Preference preference) {
        String str = preference.s;
        Bundle l = preference.l();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClass(this, getClass());
        intent.putExtra("show_fragment", str);
        intent.putExtra("show_fragment_args", l);
        startActivity(intent);
    }

    @Override // defpackage.InterfaceC0809Gf3
    public final ViewOnClickListenerC1069If3 z() {
        return this.D;
    }

    @Override // defpackage.LM
    public final ZX1 p0() {
        return new ZX1(new C4998ej(this));
    }
}
