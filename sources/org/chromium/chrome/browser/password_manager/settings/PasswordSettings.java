package org.chromium.chrome.browser.password_manager.settings;

import J.N;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC1872Ok2;
import defpackage.AbstractC8457om2;
import defpackage.C12008z71;
import defpackage.C12157za2;
import defpackage.C1293Jy2;
import defpackage.C1882Om2;
import defpackage.C7432ln3;
import defpackage.C8800pm2;
import defpackage.EI2;
import defpackage.F03;
import defpackage.G03;
import defpackage.I53;
import defpackage.InterfaceC0963Hk2;
import defpackage.InterfaceC1528Lt3;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC8113nm2;
import defpackage.InterfaceC9213qy2;
import defpackage.InterfaceC9555ry2;
import defpackage.NF0;
import defpackage.QF0;
import defpackage.R44;
import defpackage.V60;
import defpackage.YH2;
import defpackage.ZN3;
import java.io.File;
import org.chromium.base.Callback;
import org.chromium.base.ContentUriUtils;
import org.chromium.base.IntStringCallback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.password_manager.settings.PasswordSettings;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.chrome.browser.sync.TrustedVaultClient;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.browser_ui.settings.TextMessagePreference;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordSettings extends AbstractC0123Ay2 implements InterfaceC8113nm2, InterfaceC9555ry2, InterfaceC1528Lt3 {
    public static final /* synthetic */ int z0 = 0;
    public boolean j0;
    public boolean k0;
    public MenuItem m0;
    public MenuItem n0;
    public String o0;
    public ChromeBasePreference p0;
    public ChromeSwitchPreference q0;
    public ChromeSwitchPreference r0;
    public ChromeBasePreference s0;
    public ChromeBasePreference t0;
    public TextMessagePreference u0;
    public Menu v0;
    public InterfaceC0963Hk2 w0;
    public int x0;
    public int l0 = 0;
    public final QF0 y0 = new QF0();

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        int i;
        C1882Om2 c1882Om2 = new C1882Om2(this);
        QF0 qf0 = this.y0;
        qf0.g = c1882Om2;
        if (bundle != null) {
            if (bundle.containsKey("saved-state-export-state")) {
                int i2 = bundle.getInt("saved-state-export-state");
                qf0.a = i2;
                if (i2 == 2) {
                    qf0.c();
                }
            }
            if (bundle.containsKey("saved-state-export-file-uri")) {
                String string = bundle.getString("saved-state-export-file-uri");
                if (string.isEmpty()) {
                    qf0.b = Uri.EMPTY;
                } else {
                    qf0.b = Uri.parse(string);
                }
            }
            if (bundle.containsKey("saved-state-entries-count")) {
                qf0.c = Integer.valueOf(bundle.getInt("saved-state-entries-count"));
            }
        }
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f1407dd);
        C1293Jy2 c1293Jy2 = this.c0;
        Q0(c1293Jy2.a(c1293Jy2.a));
        C8800pm2 c8800pm2 = AbstractC8457om2.a;
        c8800pm2.getClass();
        Object obj = ThreadUtils.a;
        if (c8800pm2.a == null) {
            c8800pm2.a = new PasswordUIView(c8800pm2);
        }
        c8800pm2.g.a(this);
        if (AbstractC1658Mt3.b() != null) {
            AbstractC1658Mt3.b().a(this);
        }
        F0();
        if (bundle != null && bundle.containsKey("manage-passwords-referrer")) {
            i = bundle.getInt("manage-passwords-referrer");
        } else {
            i = this.l.getInt("manage-passwords-referrer");
        }
        this.x0 = i;
        if (bundle != null && bundle.containsKey("saved-state-search-query")) {
            this.o0 = bundle.getString("saved-state-search-query");
        }
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        this.w0 = AbstractC1872Ok2.b(new I53());
        R0();
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void v0(View view, Bundle bundle) {
        super.v0(view, bundle);
        this.d0.p0(null);
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        this.v0 = menu;
        menuInflater.inflate(R.menu.0_resource_name_obfuscated_res_0x7f10000b, menu);
        menu.findItem(R.id.export_passwords).setVisible(true);
        menu.findItem(R.id.export_passwords).setEnabled(false);
        MenuItem findItem = menu.findItem(R.id.menu_id_search);
        this.n0 = findItem;
        findItem.setVisible(true);
        this.m0 = menu.findItem(R.id.menu_id_targeted_help);
        G03.c(this.n0, this.o0, getActivity(), new F03() { // from class: Lm2
            @Override // defpackage.F03
            public final void onQueryTextChange(String str) {
                int i = PasswordSettings.z0;
                PasswordSettings passwordSettings = PasswordSettings.this;
                passwordSettings.o0 = str;
                passwordSettings.m0.setShowAsAction(str == null ? 1 : 0);
                passwordSettings.W0();
            }
        });
    }

    @Override // androidx.fragment.app.c
    public final void q0(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.export_passwords);
        boolean z = false;
        if (!this.j0) {
            if (!(this.y0.a != 0)) {
                z = true;
            }
        }
        findItem.setEnabled(z);
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.export_passwords) {
            EI2.h(0, 3, "PasswordManager.PasswordExport.Event");
            final QF0 qf0 = this.y0;
            qf0.a = 1;
            qf0.c = null;
            C8800pm2 c8800pm2 = AbstractC8457om2.a;
            c8800pm2.getClass();
            Object obj = ThreadUtils.a;
            PasswordUIView passwordUIView = c8800pm2.a;
            C7432ln3 e = C7432ln3.e();
            try {
                String str = V60.a.getCacheDir() + "/passwords";
                e.close();
                N.MihpS3i5(passwordUIView.a, passwordUIView, str, new IntStringCallback() { // from class: KF0
                    @Override // org.chromium.base.IntStringCallback
                    public final void onResult(int i, String str2) {
                        Integer valueOf = Integer.valueOf(i);
                        QF0 qf02 = QF0.this;
                        qf02.c = valueOf;
                        if (qf02.a == 0) {
                            return;
                        }
                        File file = new File(str2);
                        file.deleteOnExit();
                        try {
                            qf02.b = ContentUriUtils.b(file);
                            qf02.c();
                        } catch (IllegalArgumentException e2) {
                            qf02.a(R.string.0_resource_name_obfuscated_res_0x7f1407db, e2.getMessage(), R.string.0_resource_name_obfuscated_res_0x7f140b5f, 2);
                        }
                    }
                }, new Callback() { // from class: LF0
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        QF0.this.a(R.string.0_resource_name_obfuscated_res_0x7f1407db, (String) obj2, R.string.0_resource_name_obfuscated_res_0x7f140b5f, 2);
                    }
                });
                if (!((KeyguardManager) qf0.g.a().getApplicationContext().getSystemService("keyguard")).isKeyguardSecure()) {
                    ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f1407c4, 1, qf0.g.a().getApplicationContext()).d();
                    qf0.a = 0;
                } else {
                    YH2.b(R.string.0_resource_name_obfuscated_res_0x7f1405d7, qf0.g.a.L.getId(), qf0.g.a.x, 1);
                }
                return true;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        if (G03.b(menuItem, this.n0, this.o0, getActivity())) {
            this.o0 = null;
            this.m0.setShowAsAction(1);
            W0();
            return true;
        }
        if (itemId != R.id.menu_id_targeted_help) {
            return false;
        }
        C12008z71.a().d(getActivity(), O(R.string.0_resource_name_obfuscated_res_0x7f1404ee), null, Profile.d());
        return true;
    }

    public final void T0() {
        TextMessagePreference textMessagePreference = new TextMessagePreference(this.c0.a, null);
        this.u0 = textMessagePreference;
        textMessagePreference.O(R.string.0_resource_name_obfuscated_res_0x7f1409a1);
        this.u0.K("saved_passwords_no_text");
        this.u0.L(8);
        TextMessagePreference textMessagePreference2 = this.u0;
        textMessagePreference2.V = Boolean.FALSE;
        textMessagePreference2.W(false);
        N0().W(this.u0);
    }

    public final void W0() {
        this.j0 = false;
        this.k0 = false;
        N0().a0();
        if (this.o0 != null) {
            C8800pm2 c8800pm2 = AbstractC8457om2.a;
            c8800pm2.getClass();
            Object obj = ThreadUtils.a;
            PasswordUIView passwordUIView = c8800pm2.a;
            N.MG_PqeQw(passwordUIView.a, passwordUIView);
            return;
        }
        ChromeSwitchPreference chromeSwitchPreference = new ChromeSwitchPreference(this.c0.a, null);
        this.q0 = chromeSwitchPreference;
        chromeSwitchPreference.K("save_passwords_switch");
        this.q0.Q(R.string.0_resource_name_obfuscated_res_0x7f1407dc);
        this.q0.L(0);
        ChromeSwitchPreference chromeSwitchPreference2 = this.q0;
        chromeSwitchPreference2.Y(chromeSwitchPreference2.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140b27));
        ChromeSwitchPreference chromeSwitchPreference3 = this.q0;
        chromeSwitchPreference3.X(chromeSwitchPreference3.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140b26));
        ChromeSwitchPreference chromeSwitchPreference4 = this.q0;
        chromeSwitchPreference4.j = new InterfaceC9213qy2() { // from class: Mm2
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj2) {
                int i = PasswordSettings.z0;
                Boolean bool = (Boolean) obj2;
                PasswordSettings.this.V0().e("credentials_enable_service", bool.booleanValue());
                EI2.b("PasswordManager.Settings.ToggleOfferToSavePasswords", bool.booleanValue());
                if (!bool.booleanValue() || !AbstractC0193Bm2.l()) {
                    return true;
                }
                PrefService a = R44.a(Profile.d());
                if (!a.a("unenrolled_from_google_mobile_services_due_to_errors")) {
                    return true;
                }
                a.e("unenrolled_from_google_mobile_services_due_to_errors", false);
                return true;
            }
        };
        chromeSwitchPreference4.b0(new InterfaceC4184cL1() { // from class: Nm2
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
                int i = PasswordSettings.z0;
                return PasswordSettings.this.V0().d("credentials_enable_service");
            }
        });
        C7432ln3 c = C7432ln3.c();
        try {
            N0().W(this.q0);
            c.close();
            this.q0.W(V0().a("credentials_enable_service"));
            ChromeSwitchPreference chromeSwitchPreference5 = new ChromeSwitchPreference(this.c0.a, null);
            this.r0 = chromeSwitchPreference5;
            chromeSwitchPreference5.K("autosignin_switch");
            this.r0.Q(R.string.0_resource_name_obfuscated_res_0x7f1407e4);
            this.r0.L(1);
            this.r0.O(R.string.0_resource_name_obfuscated_res_0x7f1407e3);
            ChromeSwitchPreference chromeSwitchPreference6 = this.r0;
            chromeSwitchPreference6.j = new InterfaceC9213qy2() { // from class: Im2
                @Override // defpackage.InterfaceC9213qy2
                public final boolean l(Preference preference, Object obj2) {
                    int i = PasswordSettings.z0;
                    Boolean bool = (Boolean) obj2;
                    PasswordSettings.this.V0().e("credentials_enable_autosignin", bool.booleanValue());
                    EI2.b("PasswordManager.Settings.ToggleAutoSignIn", bool.booleanValue());
                    return true;
                }
            };
            chromeSwitchPreference6.b0(new InterfaceC4184cL1() { // from class: Jm2
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
                    int i = PasswordSettings.z0;
                    return PasswordSettings.this.V0().d("credentials_enable_autosignin");
                }
            });
            N0().W(this.r0);
            this.r0.W(V0().a("credentials_enable_autosignin"));
            if (this.w0 != null) {
                ChromeBasePreference chromeBasePreference = new ChromeBasePreference(this.c0.a);
                this.s0 = chromeBasePreference;
                chromeBasePreference.K("check_passwords");
                this.s0.Q(R.string.0_resource_name_obfuscated_res_0x7f1407e6);
                this.s0.L(2);
                this.s0.O(R.string.0_resource_name_obfuscated_res_0x7f1407e5);
                this.s0.k = new InterfaceC9555ry2() { // from class: Km2
                    @Override // defpackage.InterfaceC9555ry2
                    public final boolean p(Preference preference) {
                        int i = PasswordSettings.z0;
                        PasswordSettings passwordSettings = PasswordSettings.this;
                        passwordSettings.getClass();
                        ((C2392Sk2) AbstractC1872Ok2.b(new I53())).b(passwordSettings.c0.a, 0);
                        return true;
                    }
                };
                N0().W(this.s0);
            }
            int i = this.l0;
            if (i == 2) {
                S0(R.string.0_resource_name_obfuscated_res_0x7f1401ef, new InterfaceC9555ry2() { // from class: Gm2
                    @Override // defpackage.InterfaceC9555ry2
                    public final boolean p(Preference preference) {
                        int i2 = PasswordSettings.z0;
                        PasswordSettings passwordSettings = PasswordSettings.this;
                        passwordSettings.getClass();
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(N.M1Os1N9P()));
                        intent.setPackage(passwordSettings.getActivity().getPackageName());
                        passwordSettings.getActivity().startActivity(intent);
                        return true;
                    }
                });
            } else if (i == 1) {
                S0(R.string.0_resource_name_obfuscated_res_0x7f1401ee, new InterfaceC9555ry2() { // from class: Hm2
                    @Override // defpackage.InterfaceC9555ry2
                    public final boolean p(Preference preference) {
                        int i2 = PasswordSettings.z0;
                        PasswordSettings passwordSettings = PasswordSettings.this;
                        passwordSettings.getClass();
                        TrustedVaultClient.a().a.e(AbstractC1658Mt3.b().c()).h(new C2048Pt3(1, passwordSettings), new C2178Qt3(1));
                        return true;
                    }
                });
            }
            C8800pm2 c8800pm22 = AbstractC8457om2.a;
            c8800pm22.getClass();
            Object obj2 = ThreadUtils.a;
            PasswordUIView passwordUIView2 = c8800pm22.a;
            N.MG_PqeQw(passwordUIView2.a, passwordUIView2);
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC8113nm2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(int r12) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.password_manager.settings.PasswordSettings.v(int):void");
    }

    @Override // defpackage.InterfaceC8113nm2
    public final void y(int i) {
        if (this.o0 != null) {
            return;
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) N0().X("exceptions");
        if (preferenceCategory != null) {
            preferenceCategory.a0();
            N0().b0(preferenceCategory);
        }
        Preference X = N0().X("saved_passwords_no_text");
        if (X != null) {
            N0().b0(X);
        }
        boolean z = i == 0;
        this.k0 = z;
        if (z) {
            if (this.j0) {
                T0();
                return;
            }
            return;
        }
        U0();
        PreferenceCategory preferenceCategory2 = new PreferenceCategory(this.c0.a, null);
        preferenceCategory2.K("exceptions");
        preferenceCategory2.Q(R.string.0_resource_name_obfuscated_res_0x7f1409df);
        preferenceCategory2.L(7);
        N0().W(preferenceCategory2);
        for (int i2 = 0; i2 < i; i2++) {
            C8800pm2 c8800pm2 = AbstractC8457om2.a;
            c8800pm2.getClass();
            Object obj = ThreadUtils.a;
            PasswordUIView passwordUIView = c8800pm2.a;
            String Mtl3_dvG = N.Mtl3_dvG(passwordUIView.a, passwordUIView, i2);
            Preference preference = new Preference(this.c0.a, null);
            preference.R(Mtl3_dvG);
            preference.k = this;
            Bundle l = preference.l();
            l.putString("url", Mtl3_dvG);
            l.putInt("id", i2);
            preferenceCategory2.W(preference);
        }
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        QF0 qf0 = this.y0;
        bundle.putInt("saved-state-export-state", qf0.a);
        Integer num = qf0.c;
        if (num != null) {
            bundle.putInt("saved-state-entries-count", num.intValue());
        }
        Uri uri = qf0.b;
        if (uri != null) {
            bundle.putString("saved-state-export-file-uri", uri.toString());
        }
        String str = this.o0;
        if (str != null) {
            bundle.putString("saved-state-search-query", str);
        }
        bundle.putInt("manage-passwords-referrer", this.x0);
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        if (preference == this.p0) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(N.MTEEGYRd()));
            intent.setPackage(getActivity().getPackageName());
            getActivity().startActivity(intent);
        } else {
            boolean z = !preference.l().containsKey("name");
            C8800pm2 c8800pm2 = AbstractC8457om2.a;
            c8800pm2.getClass();
            Object obj = ThreadUtils.a;
            PasswordUIView passwordUIView = c8800pm2.a;
            Activity activity = getActivity();
            I53 i53 = new I53();
            int i = preference.l().getInt("id");
            if (!z) {
                N.MH0CF$4w(passwordUIView.a, activity, i53, i, passwordUIView);
            } else {
                N.M$XUdEaY(passwordUIView.a, activity, i53, i, passwordUIView);
            }
        }
        return true;
    }

    public final void S0(int i, InterfaceC9555ry2 interfaceC9555ry2) {
        ChromeBasePreference chromeBasePreference = new ChromeBasePreference(this.c0.a);
        this.t0 = chromeBasePreference;
        chromeBasePreference.K("trusted_vault_banner");
        this.t0.Q(R.string.0_resource_name_obfuscated_res_0x7f1401ed);
        this.t0.L(3);
        this.t0.O(i);
        this.t0.k = interfaceC9555ry2;
        N0().W(this.t0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0() {
        /*
            r8 = this;
            Mt3 r0 = defpackage.AbstractC1658Mt3.b()
            if (r0 == 0) goto Lc0
            boolean r0 = r0.h()
            if (r0 != 0) goto Le
            goto Lc0
        Le:
            Mt3 r0 = defpackage.AbstractC1658Mt3.b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L4f
            org.chromium.chrome.browser.sync.SyncServiceImpl r0 = (org.chromium.chrome.browser.sync.SyncServiceImpl) r0
            long r3 = r0.c
            boolean r0 = J.N.Mb4wS4pL(r3)
            if (r0 != 0) goto L21
            goto L4f
        L21:
            int[] r0 = J.N.MVqF80Hk(r3)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r6 = r1
        L2b:
            int r7 = r0.length
            if (r6 >= r7) goto L3a
            r7 = r0[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.add(r7)
            int r6 = r6 + 1
            goto L2b
        L3a:
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L46
            goto L4f
        L46:
            boolean r0 = J.N.Mlf1N2n$(r3)
            if (r0 == 0) goto L4d
            goto L4f
        L4d:
            r0 = r2
            goto L50
        L4f:
            r0 = r1
        L50:
            if (r0 != 0) goto L53
            return
        L53:
            java.lang.String r0 = r8.o0
            if (r0 == 0) goto L5c
            boolean r0 = r8.j0
            if (r0 != 0) goto L5c
            return
        L5c:
            androidx.preference.PreferenceScreen r0 = r8.N0()
            java.lang.String r3 = "manage_account_link"
            androidx.preference.Preference r0 = r0.X(r3)
            if (r0 == 0) goto L69
            return
        L69:
            org.chromium.components.browser_ui.settings.ChromeBasePreference r0 = r8.p0
            if (r0 == 0) goto L77
            androidx.preference.PreferenceScreen r0 = r8.N0()
            org.chromium.components.browser_ui.settings.ChromeBasePreference r1 = r8.p0
            r0.W(r1)
            return
        L77:
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            android.content.Context r4 = r8.K()
            int r4 = defpackage.AbstractC10957w33.e(r4)
            r0.<init>(r4)
            r4 = 2132018667(0x7f1405eb, float:1.9675647E38)
            java.lang.String r4 = r8.O(r4)
            pg3[] r2 = new defpackage.C8765pg3[r2]
            pg3 r5 = new pg3
            java.lang.String r6 = "<link>"
            java.lang.String r7 = "</link>"
            r5.<init>(r0, r6, r7)
            r2[r1] = r5
            android.text.SpannableString r0 = defpackage.AbstractC9108qg3.a(r4, r2)
            org.chromium.components.browser_ui.settings.ChromeBasePreference r1 = new org.chromium.components.browser_ui.settings.ChromeBasePreference
            Jy2 r2 = r8.c0
            android.content.Context r2 = r2.a
            r1.<init>(r2)
            r8.p0 = r1
            r1.K(r3)
            org.chromium.components.browser_ui.settings.ChromeBasePreference r1 = r8.p0
            r1.R(r0)
            org.chromium.components.browser_ui.settings.ChromeBasePreference r0 = r8.p0
            r0.k = r8
            r1 = 4
            r0.L(r1)
            androidx.preference.PreferenceScreen r0 = r8.N0()
            org.chromium.components.browser_ui.settings.ChromeBasePreference r1 = r8.p0
            r0.W(r1)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.password_manager.settings.PasswordSettings.U0():void");
    }

    public final PrefService V0() {
        return R44.a(Profile.d());
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        int i = this.l0;
        R0();
        if (i != this.l0) {
            W0();
        }
    }

    public final void R0() {
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        if (b == null) {
            this.l0 = 0;
            return;
        }
        if (!b.h()) {
            this.l0 = 0;
            return;
        }
        if (b.f() == 4) {
            this.l0 = 2;
        } else if (N.MI8FvT4$(((SyncServiceImpl) b).c)) {
            this.l0 = 1;
        } else {
            this.l0 = 0;
        }
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        QF0 qf0 = this.y0;
        if (qf0.a == 1) {
            if (YH2.a(1)) {
                if (qf0.f == null) {
                    ExportWarningDialogFragment exportWarningDialogFragment = new ExportWarningDialogFragment();
                    qf0.f = exportWarningDialogFragment;
                    exportWarningDialogFragment.r0 = new NF0(qf0);
                    exportWarningDialogFragment.Q0(qf0.g.a.x, null);
                }
            } else {
                ExportWarningDialogFragment exportWarningDialogFragment2 = qf0.f;
                if (exportWarningDialogFragment2 != null) {
                    exportWarningDialogFragment2.L0(false, false);
                }
                qf0.a = 0;
            }
        }
        W0();
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.f11484J = true;
        if (AbstractC1658Mt3.b() != null) {
            AbstractC1658Mt3.b().l(this);
        }
        if (getActivity().isFinishing()) {
            C8800pm2 c8800pm2 = AbstractC8457om2.a;
            c8800pm2.getClass();
            Object obj = ThreadUtils.a;
            C12157za2 c12157za2 = c8800pm2.g;
            c12157za2.d(this);
            if (c12157za2.isEmpty()) {
                PasswordUIView passwordUIView = c8800pm2.a;
                long j = passwordUIView.a;
                if (j != 0) {
                    N.MFhG46xL(j, passwordUIView);
                    passwordUIView.a = 0L;
                }
                c8800pm2.a = null;
            }
            if (this.w0 == null || this.x0 == 0) {
                return;
            }
            AbstractC1872Ok2.a();
        }
    }

    @Override // androidx.fragment.app.c
    public final void l0() {
        this.f11484J = true;
        YH2.a = null;
        YH2.b = 0;
    }
}
