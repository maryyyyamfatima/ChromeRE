package org.chromium.chrome.browser.sync.settings;

import J.N;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC1171Ja0;
import defpackage.AbstractC2077Pz2;
import defpackage.AbstractC6072hq;
import defpackage.AbstractC9966tA;
import defpackage.C12008z71;
import defpackage.C1202Jg1;
import defpackage.C8729pa3;
import defpackage.C9626sA2;
import defpackage.InterfaceC3562aY1;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC8386oa3;
import defpackage.InterfaceC9213qy2;
import defpackage.R44;
import defpackage.S70;
import defpackage.US;
import defpackage.Y31;
import defpackage.Z31;
import org.chromium.chrome.browser.metrics.UmaSessionStats;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.sync.settings.GoogleServicesSettings;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.prefs.PrefService;
import org.chromium.components.signin.identitymanager.IdentityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GoogleServicesSettings extends AbstractC0123Ay2 implements InterfaceC9213qy2, InterfaceC8386oa3 {
    public static final /* synthetic */ int t0 = 0;
    public final PrefService j0 = R44.a(Profile.d());
    public final C9626sA2 k0 = C9626sA2.g();
    public final Y31 l0 = new InterfaceC4184cL1() { // from class: Y31
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
            int i = GoogleServicesSettings.t0;
            GoogleServicesSettings googleServicesSettings = GoogleServicesSettings.this;
            googleServicesSettings.getClass();
            String str = preference.q;
            boolean equals = "allow_signin".equals(str);
            PrefService prefService = googleServicesSettings.j0;
            if (equals) {
                return prefService.d("signin.allowed");
            }
            if ("search_suggestions".equals(str)) {
                return prefService.d("search.suggest_enabled");
            }
            if ("usage_and_crash_reports".equals(str)) {
                return !C9626sA2.g().b();
            }
            if ("url_keyed_anonymized_data".equals(str)) {
                return N.MIMq96JJ(Profile.d());
            }
            return false;
        }
    };
    public ChromeSwitchPreference m0;
    public ChromeSwitchPreference n0;
    public ChromeSwitchPreference o0;
    public ChromeSwitchPreference p0;
    public ChromeSwitchPreference q0;
    public ChromeSwitchPreference r0;
    public Preference s0;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    @Override // defpackage.AbstractC0123Ay2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(java.lang.String r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.sync.settings.GoogleServicesSettings.O0(java.lang.String, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menu.add(0, R.id.menu_id_targeted_help, 0, R.string.0_resource_name_obfuscated_res_0x7f140629).setIcon(R.drawable.0_resource_name_obfuscated_res_0x7f09023a);
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_id_targeted_help) {
            return false;
        }
        C12008z71.a().d(getActivity(), O(R.string.0_resource_name_obfuscated_res_0x7f1404f5), null, Profile.d());
        return true;
    }

    public final void R0() {
        ChromeSwitchPreference chromeSwitchPreference = this.m0;
        PrefService prefService = this.j0;
        chromeSwitchPreference.W(prefService.a("signin.allowed"));
        this.n0.W(prefService.a("search.suggest_enabled"));
        ChromeSwitchPreference chromeSwitchPreference2 = this.o0;
        C9626sA2 c9626sA2 = this.k0;
        c9626sA2.getClass();
        chromeSwitchPreference2.W(AbstractC1171Ja0.a(c9626sA2));
        this.p0.W(N.Mfmn09fr(Profile.d()));
        ChromeSwitchPreference chromeSwitchPreference3 = this.r0;
        if (chromeSwitchPreference3 != null) {
            chromeSwitchPreference3.W(AbstractC6072hq.a(false));
        }
        if (this.s0 != null) {
            this.s0.O(S70.b() ^ true ? R.string.0_resource_name_obfuscated_res_0x7f140b27 : R.string.0_resource_name_obfuscated_res_0x7f140b26);
        }
        ChromeSwitchPreference chromeSwitchPreference4 = this.q0;
        if (chromeSwitchPreference4 != null) {
            chromeSwitchPreference4.W(AbstractC2077Pz2.c());
        }
    }

    @Override // defpackage.InterfaceC8386oa3
    public final void m(boolean z) {
        if (US.a(C1202Jg1.a(), 0)) {
            AbstractC9966tA.a(C1202Jg1.a()).w(3, new Z31(this, new ClearDataProgressDialog()), z);
            this.j0.e("signin.allowed", false);
            R0();
        }
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        String str = preference.q;
        boolean equals = "allow_signin".equals(str);
        PrefService prefService = this.j0;
        if (equals) {
            C1202Jg1 a = C1202Jg1.a();
            Profile d = Profile.d();
            a.getClass();
            IdentityManager b = C1202Jg1.b(d);
            if (!(b.c(0) && !((Boolean) obj).booleanValue())) {
                prefService.e("signin.allowed", ((Boolean) obj).booleanValue());
                return true;
            }
            if (!(b.b(1) != null)) {
                C1202Jg1 a2 = C1202Jg1.a();
                Profile d2 = Profile.d();
                a2.getClass();
                C1202Jg1.c(d2).w(3, null, false);
                prefService.e("signin.allowed", false);
                return true;
            }
            C8729pa3.a(B0(), ((InterfaceC3562aY1) getActivity()).N(), this, 1, 0);
            return false;
        }
        if ("search_suggestions".equals(str)) {
            prefService.e("search.suggest_enabled", ((Boolean) obj).booleanValue());
        } else if ("usage_and_crash_reports".equals(str)) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C9626sA2 g = C9626sA2.g();
            g.b.p("Chrome.Privacy.UsageAndCrashReportingPermittedByUser", booleanValue);
            N.MmqfIJ4g(AbstractC1171Ja0.a(g));
            N.Mh1r7OJ$(booleanValue);
            UmaSessionStats.a();
        } else if (!"url_keyed_anonymized_data".equals(str)) {
            if ("autofill_assistant".equals(str)) {
                AbstractC6072hq.c("autofill_assistant_switch", ((Boolean) obj).booleanValue());
            } else if ("price_tracking_annotations".equals(str)) {
                AbstractC2077Pz2.a.p("Chrome.PriceTracking.TrackPricesOnTabs", ((Boolean) obj).booleanValue());
            }
        } else {
            N.MnEYaN9w(Profile.d(), ((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        R0();
    }
}
