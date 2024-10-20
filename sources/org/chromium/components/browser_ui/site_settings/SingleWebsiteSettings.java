package org.chromium.components.browser_ui.site_settings;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.android.chrome.R;
import defpackage.AbstractC5316fe3;
import defpackage.C10547us;
import defpackage.C11170wh2;
import defpackage.C11205wn1;
import defpackage.C11548xn1;
import defpackage.C1193Je2;
import defpackage.C1319Kd3;
import defpackage.C5490g8;
import defpackage.C6348ie3;
import defpackage.C6408io4;
import defpackage.C6751jo4;
import defpackage.C7034ke3;
import defpackage.DialogC5834h8;
import defpackage.GP;
import defpackage.InterfaceC1189Jd3;
import defpackage.InterfaceC9213qy2;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import defpackage.N50;
import defpackage.Oo4;
import defpackage.RunnableC0279Cd3;
import defpackage.Y50;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.ChromeImageViewPreference;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.browser_ui.site_settings.SingleWebsiteSettings;
import org.chromium.components.page_info.PageInfoController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SingleWebsiteSettings extends SiteSettingsPreferenceFragment implements InterfaceC9213qy2, InterfaceC9555ry2 {
    public static final String[] x0 = {"site_heading", "site_title", "site_usage", "site_permissions", "clear_data"};
    public boolean k0;
    public int m0;
    public InterfaceC1189Jd3 n0;
    public C6408io4 p0;
    public int q0;
    public int r0;
    public Integer s0;
    public HashMap t0;
    public DialogC5834h8 u0;
    public int v0;
    public int l0 = -1;
    public final C6348ie3 o0 = new C6348ie3();
    public final RunnableC0279Cd3 w0 = new Runnable() { // from class: Cd3
        @Override // java.lang.Runnable
        public final void run() {
            String[] strArr = SingleWebsiteSettings.x0;
            SingleWebsiteSettings singleWebsiteSettings = SingleWebsiteSettings.this;
            Activity activity = singleWebsiteSettings.getActivity();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            singleWebsiteSettings.a1("clear_data");
            if (!(singleWebsiteSettings.M0("clear_data") != null)) {
                singleWebsiteSettings.a1("site_usage");
            }
            Preference M0 = singleWebsiteSettings.M0("chooser_permission_list");
            if (M0 != null) {
                ChromeImageViewPreference chromeImageViewPreference = (ChromeImageViewPreference) M0;
                InterfaceC4184cL1 interfaceC4184cL1 = chromeImageViewPreference.T;
                if (!(interfaceC4184cL1 != null && (interfaceC4184cL1.d(chromeImageViewPreference) || chromeImageViewPreference.T.a(chromeImageViewPreference)))) {
                    singleWebsiteSettings.N0().b0(M0);
                }
            }
            singleWebsiteSettings.q0 = 0;
            if (singleWebsiteSettings.r0 > 0) {
                AbstractC4871eL1.e(singleWebsiteSettings.K(), R.string.f76720_resource_name_obfuscated_res_0x7f1405f2);
            }
            if (singleWebsiteSettings.X0()) {
                return;
            }
            if ((singleWebsiteSettings.M0("clear_data") != null) || singleWebsiteSettings.getActivity() == null) {
                return;
            }
            singleWebsiteSettings.getActivity().finish();
        }
    };

    public static String W0(int i) {
        if (i == 0) {
            return "cookies_permission_list";
        }
        if (i == 15) {
            return "protected_media_identifier_permission_list";
        }
        if (i == 21) {
            return "background_sync_permission_list";
        }
        if (i == 25) {
            return "ads_permission_list";
        }
        if (i == 30) {
            return "sound_permission_list";
        }
        if (i == 32) {
            return "sensors_permission_list";
        }
        if (i == 38) {
            return "idle_detection_permission_list";
        }
        if (i == 43) {
            return "bluetooth_scanning_permission_list";
        }
        if (i == 51) {
            return "nfc_permission_list";
        }
        if (i == 53) {
            return "clipboard_permission_list";
        }
        if (i == 2) {
            return "javascript_permission_list";
        }
        if (i == 3) {
            return "popup_permission_list";
        }
        if (i == 4) {
            return "location_access_list";
        }
        if (i == 5) {
            return "push_notifications_list";
        }
        if (i == 8) {
            return "microphone_permission_list";
        }
        if (i == 9) {
            return "camera_permission_list";
        }
        if (i == 12) {
            return "automatic_downloads_permission_list";
        }
        if (i == 13) {
            return "midi_sysex_permission_list";
        }
        if (i == 56) {
            return "vr_permission_list";
        }
        if (i == 57) {
            return "ar_permission_list";
        }
        switch (i) {
            case 73:
                return "auto_dark_web_content_permission_list";
            case 74:
                return "request_desktop_site_permission_list";
            case 75:
                return "federated_identity_api_list";
            default:
                return null;
        }
    }

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
    }

    public final boolean e1(int i) {
        Profile profile = this.j0.b;
        Integer d = this.p0.d(profile, C7034ke3.b(i));
        if (d == null || d.intValue() == 2) {
            return false;
        }
        return C7034ke3.c(profile, i).n(K());
    }

    public static Bundle R0(String str) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("org.chromium.chrome.preferences.site_address", C6751jo4.b(C1193Je2.c(str).toString()));
        return bundle;
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        Integer num = this.s0;
        if (num != null) {
            bundle.putInt("previous_notification_permission", num.intValue());
        }
        super.s0(bundle);
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        getActivity().setTitle(K().getString(R.string.f82060_resource_name_obfuscated_res_0x7f14085e));
        if (this.j0 != null) {
            Serializable serializable = this.l.getSerializable("org.chromium.chrome.preferences.site");
            Serializable serializable2 = this.l.getSerializable("org.chromium.chrome.preferences.site_address");
            if (serializable != null && serializable2 == null) {
                this.p0 = (C6408io4) serializable;
                T0();
            } else if (serializable2 != null && serializable == null) {
                new Oo4(this.j0.b, false).b(new C1319Kd3(this, (C6751jo4) serializable2));
            }
            P0(null);
            this.d0.p0(null);
        } else {
            C10547us c10547us = new C10547us(M());
            c10547us.i(this);
            c10547us.e(false);
        }
        this.f11484J = true;
    }

    @Override // org.chromium.components.browser_ui.site_settings.SiteSettingsPreferenceFragment, defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void k0() {
        super.k0();
        DialogC5834h8 dialogC5834h8 = this.u0;
        if (dialogC5834h8 != null) {
            dialogC5834h8.dismiss();
        }
    }

    @Override // defpackage.AbstractC0123Ay2, defpackage.InterfaceC0903Gy2
    public final void x(Preference preference) {
        if (preference instanceof ClearWebsiteStorage) {
            if (this.x.J()) {
                return;
            }
            Callback callback = new Callback() { // from class: Gd3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    String[] strArr = SingleWebsiteSettings.x0;
                    SingleWebsiteSettings singleWebsiteSettings = SingleWebsiteSettings.this;
                    singleWebsiteSettings.getClass();
                    if (((Boolean) obj).booleanValue()) {
                        C6408io4 c6408io4 = singleWebsiteSettings.p0;
                        Profile profile = singleWebsiteSettings.j0.b;
                        final RunnableC0279Cd3 runnableC0279Cd3 = singleWebsiteSettings.w0;
                        Objects.requireNonNull(runnableC0279Cd3);
                        c6408io4.a(profile, new InterfaceC6065ho4() { // from class: Hd3
                            @Override // defpackage.InterfaceC6065ho4
                            public final void b() {
                                runnableC0279Cd3.run();
                            }
                        });
                    }
                }
            };
            ClearWebsiteStorageDialog clearWebsiteStorageDialog = new ClearWebsiteStorageDialog();
            ClearWebsiteStorageDialog.A0 = callback;
            Bundle bundle = new Bundle(1);
            bundle.putString("key", preference.q);
            clearWebsiteStorageDialog.E0(bundle);
            clearWebsiteStorageDialog.H0(0, this);
            clearWebsiteStorageDialog.Q0(this.x, "ClearWebsiteStorageDialog");
            return;
        }
        super.x(preference);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:            if ("*".equals(r6) != false) goto L29;     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C6408io4 Z0(defpackage.C6751jo4 r9, java.util.Collection r10) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.browser_ui.site_settings.SingleWebsiteSettings.Z0(jo4, java.util.Collection):io4");
    }

    public final Drawable U0(int i, Integer num) {
        Context K = K();
        Drawable c = L53.c(K, N50.c(i).a);
        return (num == null || num.intValue() != 2) ? c : N50.a(K.getResources(), c);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T0() {
        /*
            Method dump skipped, instructions count: 947
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.browser_ui.site_settings.SingleWebsiteSettings.T0():void");
    }

    public final ChromeImageViewPreference S0(ChromeSwitchPreference chromeSwitchPreference, String str, Integer num) {
        ChromeImageViewPreference chromeImageViewPreference = new ChromeImageViewPreference(chromeSwitchPreference.a);
        chromeImageViewPreference.K(chromeSwitchPreference.q);
        b1(chromeImageViewPreference, num);
        chromeImageViewPreference.P(str);
        if (V0(chromeImageViewPreference.q) == this.l0) {
            int i = this.m0;
            Integer num2 = chromeImageViewPreference.X;
            if (num2 == null || num2.intValue() != i) {
                Integer valueOf = Integer.valueOf(i);
                chromeImageViewPreference.X = valueOf;
                View view = chromeImageViewPreference.b0;
                if (view != null && valueOf != null) {
                    view.setBackgroundColor(Y50.b(chromeImageViewPreference.a, valueOf.intValue()).getDefaultColor());
                }
            }
        }
        return chromeImageViewPreference;
    }

    public final boolean c1(ChromeSwitchPreference chromeSwitchPreference, int i, int i2, Integer num) {
        String str;
        String str2;
        C1193Je2 b = C1193Je2.b(this.p0.a.d());
        if (b == null) {
            return false;
        }
        this.j0.getClass();
        if (i2 == 5) {
            C11548xn1 c11548xn1 = C11205wn1.a().a;
            c11548xn1.getClass();
            str = c11548xn1.a.getString(C11548xn1.b(b), null);
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        this.j0.getClass();
        if (i2 == 5) {
            C11548xn1 c11548xn12 = C11205wn1.a().a;
            c11548xn12.getClass();
            str2 = c11548xn12.a.getString(C11548xn1.c(b), null);
        } else {
            str2 = null;
        }
        final Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26 && i2 == 5) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", str2);
        } else {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + str2));
        }
        ChromeImageViewPreference S0 = S0(chromeSwitchPreference, Q(R.string.f90680_resource_name_obfuscated_res_0x7f140be4, str), num);
        S0.X(R.drawable.f52010_resource_name_obfuscated_res_0x7f090402, i, null);
        if (S0.Z) {
            S0.Z = false;
            S0.W();
        }
        S0.k = new InterfaceC9555ry2() { // from class: Bd3
            @Override // defpackage.InterfaceC9555ry2
            public final boolean p(Preference preference) {
                String[] strArr = SingleWebsiteSettings.x0;
                SingleWebsiteSettings.this.J0(intent);
                return true;
            }
        };
        return true;
    }

    public final void Y0(Preference preference) {
        if (this.p0.i(5)) {
            this.p0.k(this.j0.b, 5, 2);
        }
        GP gp = this.j0;
        String d = this.p0.a.d();
        gp.getClass();
        String b = AbstractC5316fe3.a.b(d);
        Context context = preference.a;
        this.s0 = this.p0.d(this.j0.b, 5);
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.CHANNEL_ID", b);
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        startActivityForResult(intent, 1);
    }

    @Override // androidx.fragment.app.c
    public final void d0(int i, int i2, Intent intent) {
        C6408io4 c6408io4;
        if (N0() == null || (c6408io4 = this.p0) == null || i != 1) {
            return;
        }
        int intValue = c6408io4.d(this.j0.b, 5).intValue();
        Preference M0 = M0(W0(5));
        if (M0 != null) {
            l(M0, Integer.valueOf(intValue));
        }
        if (this.s0.intValue() != 1 || intValue == 1) {
            return;
        }
        N.M$1c3w6w(this.j0.b, this.p0.a.d(), intValue);
        this.s0 = null;
    }

    public final boolean X0() {
        if (this.q0 > 0 || this.r0 > 0) {
            return true;
        }
        PreferenceScreen N0 = N0();
        for (int i = 0; i < N0.Z(); i++) {
            if (V0(N0.Y(i).q) != -1) {
                return true;
            }
        }
        return false;
    }

    public final void d1(ChromeSwitchPreference chromeSwitchPreference, Integer num, boolean z) {
        String O;
        if (num == null) {
            return;
        }
        b1(chromeSwitchPreference, num);
        chromeSwitchPreference.W(num.intValue() == 1);
        if (z) {
            O = O(R.string.f68740_resource_name_obfuscated_res_0x7f140262);
        } else {
            O = O(N50.b(num.intValue()));
        }
        chromeSwitchPreference.P(O);
        chromeSwitchPreference.j = this;
        if (V0(chromeSwitchPreference.q) == this.l0) {
            int i = this.m0;
            Integer num2 = chromeSwitchPreference.d0;
            if (num2 == null || num2.intValue() != i) {
                Integer valueOf = Integer.valueOf(i);
                chromeSwitchPreference.d0 = valueOf;
                View view = chromeSwitchPreference.c0;
                if (view == null || valueOf == null) {
                    return;
                }
                view.setBackgroundColor(Y50.b(chromeSwitchPreference.a, valueOf.intValue()).getDefaultColor());
            }
        }
    }

    public final void b1(Preference preference, Integer num) {
        C7034ke3 c7034ke3;
        int V0 = V0(preference.q);
        int i = N50.c(V0).b;
        if (i != 0) {
            preference.Q(i);
        }
        Profile profile = this.j0.b;
        int i2 = 0;
        while (true) {
            if (i2 >= 26) {
                c7034ke3 = null;
                break;
            } else {
                if (C7034ke3.b(i2) == V0) {
                    c7034ke3 = C7034ke3.c(profile, i2);
                    break;
                }
                i2++;
            }
        }
        if (c7034ke3 != null && num != null && num.intValue() != 2) {
            if (!(c7034ke3.e() && c7034ke3.d(getActivity()))) {
                preference.J(C7034ke3.g(K()));
                preference.G(false);
                preference.x = false;
                int i3 = this.v0 + 1;
                this.v0 = i3;
                preference.L(i3);
                N0().W(preference);
            }
        }
        preference.J(U0(V0, num));
        preference.x = false;
        int i32 = this.v0 + 1;
        this.v0 = i32;
        preference.L(i32);
        N0().W(preference);
    }

    public final int V0(String str) {
        if (this.t0 == null) {
            this.t0 = new HashMap();
            for (int i = 0; i < 77; i++) {
                String W0 = W0(i);
                if (W0 != null) {
                    this.t0.put(W0, Integer.valueOf(i));
                }
            }
        }
        Integer num = (Integer) this.t0.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        String O;
        boolean z = this.k0;
        int i = z ? R.string.f79670_resource_name_obfuscated_res_0x7f140769 : R.string.f90660_resource_name_obfuscated_res_0x7f140be2;
        if (z) {
            O = Q(R.string.f79660_resource_name_obfuscated_res_0x7f140768, this.p0.a.h);
        } else {
            O = O(R.string.f90670_resource_name_obfuscated_res_0x7f140be3);
        }
        int i2 = this.k0 ? R.string.f84570_resource_name_obfuscated_res_0x7f14095d : i;
        C5490g8 c5490g8 = new C5490g8(K(), R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g8.i(i);
        c5490g8.a.f = O;
        c5490g8.f(i2, new DialogInterface.OnClickListener() { // from class: Dd3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                SingleWebsiteSettings singleWebsiteSettings = SingleWebsiteSettings.this;
                boolean z2 = singleWebsiteSettings.k0;
                C6348ie3 c6348ie3 = singleWebsiteSettings.o0;
                if (z2) {
                    Profile profile = singleWebsiteSettings.j0.b;
                    C6408io4 c6408io4 = singleWebsiteSettings.p0;
                    c6348ie3.getClass();
                    C6348ie3.a(profile, c6408io4);
                } else if (singleWebsiteSettings.getActivity() != null) {
                    for (int i4 = 0; i4 < 77; i4++) {
                        String W0 = SingleWebsiteSettings.W0(i4);
                        if (W0 != null) {
                            singleWebsiteSettings.a1(W0);
                        }
                    }
                    boolean z3 = singleWebsiteSettings.p0.h() == 0 && singleWebsiteSettings.r0 == 0;
                    Profile profile2 = singleWebsiteSettings.j0.b;
                    C6408io4 c6408io42 = singleWebsiteSettings.p0;
                    c6348ie3.getClass();
                    C6348ie3.a(profile2, c6408io42);
                    Profile profile3 = singleWebsiteSettings.j0.b;
                    C6408io4 c6408io43 = singleWebsiteSettings.p0;
                    String d = c6408io43.a.d();
                    N.Mks53EZS(profile3, d);
                    N.MyQGLOqU(profile3, d);
                    N.MSoF8bn2(profile3, d);
                    RunnableC0279Cd3 runnableC0279Cd3 = singleWebsiteSettings.w0;
                    Objects.requireNonNull(runnableC0279Cd3);
                    c6408io43.a(profile3, new C6004he3(runnableC0279Cd3));
                    EI2.h(singleWebsiteSettings.l.getInt("org.chromium.chrome.preferences.navigation_source", 0), 3, "SingleWebsitePreferences.NavigatedFromToReset");
                    if (z3) {
                        singleWebsiteSettings.getActivity().finish();
                    }
                }
                InterfaceC1189Jd3 interfaceC1189Jd3 = singleWebsiteSettings.n0;
                if (interfaceC1189Jd3 != null) {
                    C11170wh2 c11170wh2 = (C11170wh2) interfaceC1189Jd3;
                    PageInfoController pageInfoController = (PageInfoController) c11170wh2.h;
                    pageInfoController.g(15);
                    c11170wh2.m = true;
                    pageInfoController.d();
                }
            }
        });
        c5490g8.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, new DialogInterface.OnClickListener() { // from class: Ed3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                SingleWebsiteSettings.this.u0 = null;
            }
        });
        this.u0 = c5490g8.k();
        return true;
    }

    public final void a1(String str) {
        Preference M0 = M0(str);
        if (M0 != null) {
            N0().b0(M0);
        }
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        int intValue;
        if (this.L == null) {
            return true;
        }
        Profile profile = this.j0.b;
        int V0 = V0(preference.q);
        if (V0 == -1) {
            return false;
        }
        if (obj instanceof Boolean) {
            intValue = ((Boolean) obj).booleanValue() ? 1 : 2;
        } else {
            intValue = ((Integer) obj).intValue();
        }
        this.p0.k(profile, V0, intValue);
        preference.P(O(N50.b(intValue)));
        preference.J(U0(V0, Integer.valueOf(intValue)));
        InterfaceC1189Jd3 interfaceC1189Jd3 = this.n0;
        if (interfaceC1189Jd3 != null) {
            C11170wh2 c11170wh2 = (C11170wh2) interfaceC1189Jd3;
            if (c11170wh2.n != -1) {
                c11170wh2.p.a(3);
            }
            ((PageInfoController) c11170wh2.h).g(5);
            c11170wh2.m = true;
        }
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void w0(Bundle bundle) {
        this.f11484J = true;
        if (bundle != null && bundle.containsKey("previous_notification_permission")) {
            this.s0 = Integer.valueOf(bundle.getInt("previous_notification_permission"));
        }
    }
}
