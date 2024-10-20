package org.chromium.components.browser_ui.site_settings;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.d;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC4871eL1;
import defpackage.AbstractC5316fe3;
import defpackage.C11141wc3;
import defpackage.C11484xc3;
import defpackage.C11674y84;
import defpackage.C12008z71;
import defpackage.C5490g8;
import defpackage.C6408io4;
import defpackage.C7034ke3;
import defpackage.C7928nE;
import defpackage.F03;
import defpackage.G03;
import defpackage.GP;
import defpackage.GS0;
import defpackage.HS0;
import defpackage.InterfaceC9213qy2;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import defpackage.M50;
import defpackage.N50;
import defpackage.Oo4;
import defpackage.Qo4;
import defpackage.R44;
import defpackage.UN;
import defpackage.Y6;
import java.util.HashSet;
import java.util.Locale;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.ChromeBaseCheckBoxPreference;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.browser_ui.settings.ExpandablePreferenceGroup;
import org.chromium.components.browser_ui.site_settings.SingleCategorySettings;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SingleCategorySettings extends SiteSettingsPreferenceFragment implements InterfaceC9213qy2, InterfaceC9555ry2, Y6 {
    public static final /* synthetic */ int A0 = 0;
    public RecyclerView k0;
    public MenuItem l0;
    public C7034ke3 m0;
    public String n0;
    public boolean o0;
    public boolean p0;
    public boolean r0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public ChromeBaseCheckBoxPreference w0;
    public ChromeBaseCheckBoxPreference x0;
    public ChromeBaseCheckBoxPreference y0;
    public HashSet z0;
    public boolean q0 = true;
    public boolean s0 = true;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
    }

    public final void a1() {
        Profile profile = this.j0.b;
        Boolean valueOf = Boolean.valueOf(N.MJSt3Ocq(profile, 5));
        ChromeBaseCheckBoxPreference chromeBaseCheckBoxPreference = (ChromeBaseCheckBoxPreference) N0().X("notifications_vibrate");
        if (chromeBaseCheckBoxPreference != null) {
            chromeBaseCheckBoxPreference.G(valueOf.booleanValue());
        }
        this.j0.getClass();
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("QuietNotificationPrompts")) {
            if (valueOf.booleanValue()) {
                N0().W(this.w0);
                this.w0.W(R44.a(profile).a("profile.content_settings.enable_quiet_permission_ui.notifications"));
                return;
            }
            N0().b0(this.w0);
        }
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7034ke3 c7034ke3;
        Profile profile = this.j0.b;
        Bundle bundle2 = this.l;
        if (bundle2 != null) {
            String string = bundle2.getString("category", "");
            int i = 0;
            while (true) {
                if (i >= 26) {
                    c7034ke3 = null;
                    break;
                }
                if (C7034ke3.m(i).equals(string)) {
                    c7034ke3 = C7034ke3.c(profile, i);
                    break;
                }
                i++;
            }
            this.m0 = c7034ke3;
        }
        if (this.m0.o(0) || this.m0.o(22)) {
            throw new IllegalArgumentException("Use AllSiteSettings instead.");
        }
        int f = this.m0.f();
        this.u0 = f == 15;
        this.v0 = f == 0;
        ViewGroup viewGroup2 = (ViewGroup) super.i0(layoutInflater, viewGroup, bundle);
        RecyclerView recyclerView = this.d0;
        this.k0 = recyclerView;
        recyclerView.p0(null);
        P0(null);
        return viewGroup2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    @Override // defpackage.InterfaceC9213qy2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(androidx.preference.Preference r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.browser_ui.site_settings.SingleCategorySettings.l(androidx.preference.Preference, java.lang.Object):boolean");
    }

    public final void T0() {
        C7034ke3 c7034ke3 = this.m0;
        if (!(c7034ke3.e() && c7034ke3.d(getActivity()))) {
            V0();
        } else {
            new Oo4(this.j0.b, false).c(this.m0, new C11141wc3(this));
        }
    }

    public final void W0(int i, boolean z) {
        ExpandablePreferenceGroup expandablePreferenceGroup = (ExpandablePreferenceGroup) N0().X("allowed_group");
        if (expandablePreferenceGroup == null) {
            return;
        }
        if (i == 0) {
            N0().b0(expandablePreferenceGroup);
            return;
        }
        if (this.o0) {
            expandablePreferenceGroup.R(S0(this.m0.o(24) ? R.string.0_resource_name_obfuscated_res_0x7f140bf6 : z ? R.string.0_resource_name_obfuscated_res_0x7f140bf5 : R.string.0_resource_name_obfuscated_res_0x7f140c3a, i));
            boolean z2 = this.q0;
            if (expandablePreferenceGroup.c0 == z2) {
                return;
            }
            expandablePreferenceGroup.c0 = z2;
            expandablePreferenceGroup.q();
        }
    }

    public final void X0(int i) {
        int i2;
        ExpandablePreferenceGroup expandablePreferenceGroup = (ExpandablePreferenceGroup) N0().X("blocked_group");
        if (i == 0) {
            if (expandablePreferenceGroup != null) {
                N0().b0(expandablePreferenceGroup);
            }
        } else if (this.o0) {
            if (this.m0.o(18)) {
                i2 = R.string.0_resource_name_obfuscated_res_0x7f140bf9;
            } else {
                i2 = this.m0.o(24) ? R.string.0_resource_name_obfuscated_res_0x7f140bf8 : R.string.0_resource_name_obfuscated_res_0x7f140bf7;
            }
            expandablePreferenceGroup.R(S0(i2, i));
            boolean z = this.p0;
            if (expandablePreferenceGroup.c0 == z) {
                return;
            }
            expandablePreferenceGroup.c0 = z;
            expandablePreferenceGroup.q();
        }
    }

    public final void Z0(int i) {
        ExpandablePreferenceGroup expandablePreferenceGroup = (ExpandablePreferenceGroup) N0().X("managed_group");
        if (i == 0) {
            if (expandablePreferenceGroup != null) {
                N0().b0(expandablePreferenceGroup);
            }
        } else if (this.o0) {
            expandablePreferenceGroup.R(S0(R.string.0_resource_name_obfuscated_res_0x7f140c3d, i));
            boolean z = this.r0;
            if (expandablePreferenceGroup.c0 == z) {
                return;
            }
            expandablePreferenceGroup.c0 = z;
            expandablePreferenceGroup.q();
        }
    }

    public final SpannableStringBuilder S0(int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(O(i));
        String format = String.format(Locale.getDefault(), " - %d", Integer.valueOf(i2));
        spannableStringBuilder.append((CharSequence) format);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AbstractC10957w33.g(R.attr.0_resource_name_obfuscated_res_0x7f05013a, K())), 0, spannableStringBuilder.length() - format.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AbstractC10957w33.g(R.attr.0_resource_name_obfuscated_res_0x7f050132, K())), spannableStringBuilder.length() - format.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180040);
        String string = this.l.getString("title");
        if (string != null) {
            getActivity().setTitle(string);
        }
        this.z0 = this.l.containsKey("selected_domains") ? new HashSet(this.l.getStringArrayList("selected_domains")) : null;
        R0();
        F0();
        this.f11484J = true;
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.0_resource_name_obfuscated_res_0x7f10000d, menu);
        MenuItem findItem = menu.findItem(R.id.search);
        this.l0 = findItem;
        G03.c(findItem, this.n0, getActivity(), new F03() { // from class: vc3
            @Override // defpackage.F03
            public final void onQueryTextChange(String str) {
                SingleCategorySettings singleCategorySettings = SingleCategorySettings.this;
                String str2 = singleCategorySettings.n0;
                boolean z = str2 != null ? !str2.equals(str) : !(str == null || str.isEmpty());
                singleCategorySettings.n0 = str;
                if (z) {
                    singleCategorySettings.T0();
                }
            }
        });
        this.j0.getClass();
        menu.add(0, R.id.menu_id_site_settings_help, 0, R.string.0_resource_name_obfuscated_res_0x7f140629).setIcon(C11674y84.b(N(), R.drawable.0_resource_name_obfuscated_res_0x7f09023a, K().getTheme()));
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_id_site_settings_help) {
            if (this.m0.o(16)) {
                GP gp = this.j0;
                Activity activity = getActivity();
                gp.getClass();
                C12008z71.a().d(activity, activity.getString(R.string.0_resource_name_obfuscated_res_0x7f1404f0), null, Profile.d());
            } else {
                GP gp2 = this.j0;
                Activity activity2 = getActivity();
                gp2.getClass();
                GP.b(activity2);
            }
            return true;
        }
        boolean z = false;
        if (!G03.b(menuItem, this.l0, this.n0, getActivity())) {
            return false;
        }
        String str = this.n0;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        this.n0 = null;
        if (z) {
            T0();
        }
        return true;
    }

    @Override // defpackage.AbstractC0123Ay2, defpackage.InterfaceC1163Iy2
    public final boolean D(Preference preference) {
        if (N0().X("binary_toggle") == null || !this.m0.k()) {
            if (preference instanceof Qo4) {
                Qo4 qo4 = (Qo4) preference;
                boolean equals = qo4.O.q.equals("managed_group");
                final C6408io4 c6408io4 = qo4.d0;
                if (equals) {
                    qo4.s = SingleWebsiteSettings.class.getName();
                    qo4.l().putSerializable("org.chromium.chrome.preferences.site_address", c6408io4.a);
                    qo4.l().putInt("org.chromium.chrome.preferences.navigation_source", this.l.getInt("org.chromium.chrome.preferences.navigation_source", 0));
                } else if (Build.VERSION.SDK_INT >= 26 && this.m0.o(14)) {
                    GP gp = this.j0;
                    String d = c6408io4.a.d();
                    gp.getClass();
                    String b = AbstractC5316fe3.a.b(d);
                    Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.CHANNEL_ID", b);
                    intent.putExtra("android.provider.extra.APP_PACKAGE", preference.a.getPackageName());
                    startActivityForResult(intent, 1);
                } else {
                    final Profile profile = this.j0.b;
                    final int f = this.m0.f();
                    Integer d2 = c6408io4.d(profile, f);
                    String[] strArr = new String[2];
                    Integer num = 1;
                    int intValue = num.intValue();
                    int i = R.string.0_resource_name_obfuscated_res_0x7f140c40;
                    strArr[0] = O(intValue != 1 ? intValue != 2 ? 0 : R.string.0_resource_name_obfuscated_res_0x7f140c40 : R.string.0_resource_name_obfuscated_res_0x7f140c3e);
                    Integer num2 = 2;
                    int intValue2 = num2.intValue();
                    if (intValue2 == 1) {
                        i = R.string.0_resource_name_obfuscated_res_0x7f140c3e;
                    } else if (intValue2 != 2) {
                        i = 0;
                    }
                    strArr[1] = O(i);
                    C5490g8 c5490g8 = new C5490g8(K(), R.style.f105200_resource_name_obfuscated_res_0x7f150545);
                    c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f1402f4, null);
                    c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f140953, new DialogInterface.OnClickListener() { // from class: sc3
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3 = SingleCategorySettings.A0;
                            SingleCategorySettings singleCategorySettings = SingleCategorySettings.this;
                            singleCategorySettings.getClass();
                            c6408io4.k(profile, f, 0);
                            if (singleCategorySettings.m0.o(23)) {
                                AbstractC0065An.a(3, false);
                            }
                            singleCategorySettings.T0();
                            dialogInterface.dismiss();
                        }
                    });
                    c5490g8.h(strArr, d2.intValue() != 1 ? 1 : 0, new DialogInterface.OnClickListener() { // from class: tc3
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3 = SingleCategorySettings.A0;
                            SingleCategorySettings singleCategorySettings = SingleCategorySettings.this;
                            singleCategorySettings.getClass();
                            c6408io4.k(profile, f, i2 == 0 ? 1 : 2);
                            singleCategorySettings.T0();
                            dialogInterface.dismiss();
                        }
                    });
                    c5490g8.k();
                }
            }
            return super.D(preference);
        }
        if (!this.m0.l()) {
            AbstractC4871eL1.e(K(), R.string.0_resource_name_obfuscated_res_0x7f1405ef);
        } else {
            AbstractC4871eL1.e(K(), this.j0.a().c() ? R.string.0_resource_name_obfuscated_res_0x7f1405f1 : R.string.0_resource_name_obfuscated_res_0x7f1405f0);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:            if ((((org.chromium.components.browser_ui.site_settings.FourStateCookieSettingsPreference) N0().X("four_state_cookie_toggle")).X() == defpackage.GS0.ALLOW ? 1 : 0) != 0) goto L331;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:            r8 = com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140bea;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:            r8 = com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140beb;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:            if (J.N.MJSt3Ocq(r11, 0) != false) goto L331;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V0() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.browser_ui.site_settings.SingleCategorySettings.V0():void");
    }

    public final boolean U0() {
        if (this.u0) {
            return ((TriStateSiteSettingsPreference) N0().X("tri_state_toggle")).T == 2;
        }
        if (this.v0) {
            return ((FourStateCookieSettingsPreference) N0().X("four_state_cookie_toggle")).X() == GS0.BLOCK;
        }
        if (((ChromeSwitchPreference) N0().X("binary_toggle")) != null) {
            return !r0.T;
        }
        return false;
    }

    public final void R0() {
        int f = this.m0.f();
        PreferenceScreen N0 = N0();
        ChromeSwitchPreference chromeSwitchPreference = (ChromeSwitchPreference) N0.X("binary_toggle");
        TriStateSiteSettingsPreference triStateSiteSettingsPreference = (TriStateSiteSettingsPreference) N0.X("tri_state_toggle");
        FourStateCookieSettingsPreference fourStateCookieSettingsPreference = (FourStateCookieSettingsPreference) N0.X("four_state_cookie_toggle");
        Preference X = N0.X("notifications_vibrate");
        this.w0 = (ChromeBaseCheckBoxPreference) N0.X("notifications_quiet_ui");
        this.x0 = (ChromeBaseCheckBoxPreference) N0.X("desktop_site_peripheral");
        this.y0 = (ChromeBaseCheckBoxPreference) N0.X("desktop_site_display");
        Preference X2 = N0.X("protected_content_learn_more");
        d dVar = (d) N0.X("allowed_group");
        d dVar2 = (d) N0.X("blocked_group");
        d dVar3 = (d) N0.X("managed_group");
        boolean n = this.m0.n(K());
        if (this.u0) {
            N0.b0(chromeSwitchPreference);
            N0.b0(fourStateCookieSettingsPreference);
            triStateSiteSettingsPreference.j = this;
            int M7ddkyN4 = N.M7ddkyN4(this.j0.b, f);
            int[] iArr = f == 15 ? new int[]{R.string.0_resource_name_obfuscated_res_0x7f140c2a, R.string.0_resource_name_obfuscated_res_0x7f140c2b, R.string.0_resource_name_obfuscated_res_0x7f140c2d} : null;
            triStateSiteSettingsPreference.T = M7ddkyN4;
            triStateSiteSettingsPreference.U = iArr;
        } else if (this.v0) {
            N0.b0(chromeSwitchPreference);
            N0.b0(triStateSiteSettingsPreference);
            fourStateCookieSettingsPreference.j = this;
            HS0 hs0 = new HS0();
            hs0.a = N.MJSt3Ocq(this.j0.b, 0);
            PrefService a = R44.a(this.j0.b);
            hs0.b = a.b("profile.cookie_controls_mode");
            hs0.d = this.m0.k();
            hs0.e = a.d("profile.cookie_controls_mode");
            this.j0.getClass();
            hs0.c = N.M$3vpOHw();
            if (fourStateCookieSettingsPreference.Y != null) {
                fourStateCookieSettingsPreference.W(hs0);
            } else {
                fourStateCookieSettingsPreference.T = hs0;
            }
        } else {
            N0.b0(triStateSiteSettingsPreference);
            N0.b0(fourStateCookieSettingsPreference);
            chromeSwitchPreference.j = this;
            chromeSwitchPreference.Q(N50.c(f).b);
            Profile profile = this.j0.b;
            boolean o = this.m0.o(9);
            Context context = chromeSwitchPreference.a;
            if (o && N.M__mL5j3(profile)) {
                chromeSwitchPreference.Y(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bfe));
            } else {
                M50 c = N50.c(f);
                int i = c.e;
                if (i == 0) {
                    i = N50.b(c.c.intValue());
                }
                chromeSwitchPreference.Y(context.getString(i));
            }
            M50 c2 = N50.c(f);
            int i2 = c2.f;
            if (i2 == 0) {
                i2 = N50.b(c2.d.intValue());
            }
            chromeSwitchPreference.X(context.getString(i2));
            chromeSwitchPreference.b0(new C11484xc3(this, this.j0.a()));
            chromeSwitchPreference.W(N.MJSt3Ocq(profile, f));
        }
        if (!this.m0.o(8)) {
            N0.b0(N0.X("cookie_info_text"));
        }
        if (n) {
            if (!U0()) {
                ChromeBasePreference chromeBasePreference = new ChromeBasePreference(this.c0.a, null);
                ChromeBasePreference chromeBasePreference2 = new ChromeBasePreference(this.c0.a, null);
                this.m0.a(chromeBasePreference, chromeBasePreference2, K(), true, this.j0.a.getString(R.string.0_resource_name_obfuscated_res_0x7f1401f5));
                if (chromeBasePreference.m != null) {
                    chromeBasePreference.K("os_permissions_warning");
                    N0.W(chromeBasePreference);
                }
                if (chromeBasePreference2.m != null) {
                    chromeBasePreference2.K("os_permissions_warning_extra");
                    N0.W(chromeBasePreference2);
                }
            }
            N0.b0(X);
            N0.b0(this.w0);
            N0.b0(this.x0);
            N0.b0(this.y0);
            N0.b0(X2);
            N0.b0(dVar);
            N0.b0(dVar2);
            N0.b0(dVar3);
            return;
        }
        if (this.m0.o(14)) {
            if (Build.VERSION.SDK_INT < 26) {
                X.j = this;
            } else {
                N0.b0(X);
            }
            this.j0.getClass();
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("QuietNotificationPrompts")) {
                this.w0.j = this;
            } else {
                N0.b0(this.w0);
            }
            a1();
        } else {
            N0.b0(X);
            N0.b0(this.w0);
        }
        if (this.m0.o(24) && N.Mudil8Bg("RequestDesktopSiteAdditions")) {
            this.x0.j = this;
            this.y0.j = this;
            Y0();
        } else {
            N0.b0(this.x0);
            N0.b0(this.y0);
        }
        if (this.m0.o(16)) {
            this.j0.getClass();
            X2.k = new InterfaceC9555ry2() { // from class: uc3
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    int i3 = SingleCategorySettings.A0;
                    SingleCategorySettings singleCategorySettings = SingleCategorySettings.this;
                    GP gp = singleCategorySettings.j0;
                    Activity activity = singleCategorySettings.getActivity();
                    gp.getClass();
                    C12008z71.a().d(activity, activity.getString(R.string.0_resource_name_obfuscated_res_0x7f1404f0), null, Profile.d());
                    return true;
                }
            };
            this.k0.setFocusable(false);
        } else {
            N0.b0(X2);
            this.k0.setFocusable(true);
        }
        if (!this.o0) {
            this.p0 = false;
            this.q0 = true;
            this.r0 = false;
        }
        this.o0 = true;
        dVar.k = this;
        dVar2.k = this;
        dVar3.k = this;
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        if ("allowed_group".equals(preference.q)) {
            this.q0 = !this.q0;
        } else if ("blocked_group".equals(preference.q)) {
            this.p0 = !this.p0;
        } else {
            this.r0 = !this.r0;
        }
        T0();
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        MenuItem menuItem;
        this.f11484J = true;
        if (this.n0 == null && (menuItem = this.l0) != null) {
            G03.a(menuItem, getActivity());
            this.n0 = null;
        }
        T0();
    }

    public final void Y0() {
        if (N.Mudil8Bg("RequestDesktopSiteAdditions")) {
            Profile profile = this.j0.b;
            if (Boolean.valueOf(N.MJSt3Ocq(profile, 74)).booleanValue()) {
                N0().b0(this.x0);
                N0().b0(this.y0);
                return;
            }
            N0().W(this.x0);
            N0().W(this.y0);
            PrefService a = R44.a(profile);
            this.x0.W(a.a("desktop_site.peripheral_setting"));
            this.y0.W(a.a("desktop_site.display_setting"));
        }
    }
}
