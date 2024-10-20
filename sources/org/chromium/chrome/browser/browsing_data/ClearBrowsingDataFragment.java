package org.chromium.chrome.browser.browsing_data;

import J.N;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC8650pL;
import defpackage.AbstractC9048qW;
import defpackage.AbstractC9108qg3;
import defpackage.AbstractC9966tA;
import defpackage.C11997z52;
import defpackage.C1202Jg1;
import defpackage.C5004ek;
import defpackage.C5348fk;
import defpackage.C7851n02;
import defpackage.C7928nE;
import defpackage.C8765pg3;
import defpackage.C9795sh;
import defpackage.EI2;
import defpackage.InterfaceC4486dD;
import defpackage.InterfaceC8386oa3;
import defpackage.InterfaceC9213qy2;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import defpackage.O83;
import defpackage.UN;
import defpackage.US;
import defpackage.VS0;
import defpackage.WS;
import defpackage.XS;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.chrome.browser.sync.settings.ClearDataProgressDialog;
import org.chromium.components.browser_ui.settings.ClickableSpansTextMessagePreference;
import org.chromium.components.browser_ui.settings.SpinnerPreference;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ClearBrowsingDataFragment extends AbstractC0123Ay2 implements InterfaceC4486dD, InterfaceC9555ry2, InterfaceC9213qy2, InterfaceC8386oa3 {
    public static final /* synthetic */ int o0 = 0;
    public OtherFormsOfHistoryDialogFragment j0;
    public ProgressDialog k0;
    public WS[] l0;
    public ClearBrowsingDataFetcher m0;
    public ConfirmImportantSitesDialogFragment n0;

    public abstract int T0();

    public abstract List V0();

    public void Y0() {
    }

    public static int U0(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                if (i == 5) {
                    return 5;
                }
                throw new IllegalArgumentException();
            }
        }
        return i2;
    }

    public static String W0(int i) {
        if (i == 0) {
            return "clear_history_checkbox";
        }
        if (i == 1) {
            return "clear_cookies_checkbox";
        }
        if (i == 2) {
            return "clear_cache_checkbox";
        }
        if (i == 3) {
            return "clear_passwords_checkbox";
        }
        if (i == 4) {
            return "clear_form_data_checkbox";
        }
        if (i == 5) {
            return "clear_site_settings_checkbox";
        }
        throw new IllegalArgumentException();
    }

    public final C5348fk X0() {
        C5348fk c5348fk = new C5348fk(0);
        for (WS ws : this.l0) {
            if (ws.h.T) {
                c5348fk.add(Integer.valueOf(ws.g));
            }
        }
        return c5348fk;
    }

    public final void R0(C5348fk c5348fk, String[] strArr, int[] iArr, String[] strArr2, int[] iArr2) {
        Object selectedItem;
        Y0();
        int i = 1;
        if (getActivity() != null) {
            this.k0 = ProgressDialog.show(getActivity(), getActivity().getString(R.string.0_resource_name_obfuscated_res_0x7f140343), getActivity().getString(R.string.0_resource_name_obfuscated_res_0x7f140342), true, false);
        }
        C5348fk c5348fk2 = new C5348fk(0);
        C5004ek c5004ek = new C5004ek(c5348fk);
        while (c5004ek.hasNext()) {
            c5348fk2.add(Integer.valueOf(U0(((Integer) c5004ek.next()).intValue())));
        }
        if (c5348fk2.contains(2)) {
            if (c5348fk2.contains(1)) {
                i = 3;
            }
        } else {
            i = c5348fk2.contains(1) ? 2 : 0;
        }
        EI2.h(i, 4, "History.ClearBrowsingData.UserDeletedCookieOrCacheFromDialog");
        SpinnerPreference spinnerPreference = (SpinnerPreference) M0("time_period_spinner");
        Spinner spinner = spinnerPreference.T;
        if (spinner == null) {
            selectedItem = spinnerPreference.U.getItem(spinnerPreference.V);
        } else {
            selectedItem = spinner.getSelectedItem();
        }
        int i2 = ((XS) selectedItem).a;
        int[] b = AbstractC9048qW.b(new ArrayList(c5348fk2));
        if (strArr != null && strArr.length != 0) {
            BrowsingDataBridge b2 = BrowsingDataBridge.b();
            b2.a = this;
            N.McYsV35Z(b2, Profile.d(), b, i2, strArr, iArr, strArr2, iArr2);
        } else {
            BrowsingDataBridge.b().a(this, b, i2);
        }
        C9795sh.b().a();
    }

    public final void S0() {
        ProgressDialog progressDialog = this.k0;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.k0.dismiss();
        }
        this.k0 = null;
    }

    @Override // defpackage.InterfaceC4486dD
    public final void q() {
        if (getActivity() == null) {
            return;
        }
        if (C7851n02.m(getActivity()) && X0().contains(0) && this.m0.j && !O83.a.e("org.chromium.chrome.browser.settings.privacy.PREF_OTHER_FORMS_OF_HISTORY_DIALOG_SHOWN", false)) {
            this.j0 = new OtherFormsOfHistoryDialogFragment();
            VS0 vs0 = (VS0) getActivity();
            OtherFormsOfHistoryDialogFragment otherFormsOfHistoryDialogFragment = this.j0;
            otherFormsOfHistoryDialogFragment.getClass();
            otherFormsOfHistoryDialogFragment.Q0(vs0.h0(), "OtherFormsOfHistoryDialogFragment");
            S0();
            EI2.b("History.ClearBrowsingData.ShownHistoryNoticeAfterClearing", true);
            return;
        }
        S0();
        getActivity().finish();
        EI2.b("History.ClearBrowsingData.ShownHistoryNoticeAfterClearing", false);
    }

    public final void Z0() {
        C5348fk X0 = X0();
        boolean z = false;
        if (X0.contains(2) || X0.contains(1)) {
            String[] strArr = this.m0.g;
            if (strArr != null && strArr.length != 0) {
                z = true;
            }
            EI2.b("History.ClearBrowsingData.ImportantDialogShown", z);
        }
        if (!z) {
            R0(X0(), null, null, null, null);
            return;
        }
        ClearBrowsingDataFetcher clearBrowsingDataFetcher = this.m0;
        String[] strArr2 = clearBrowsingDataFetcher.g;
        int[] iArr = clearBrowsingDataFetcher.h;
        String[] strArr3 = clearBrowsingDataFetcher.i;
        ConfirmImportantSitesDialogFragment confirmImportantSitesDialogFragment = new ConfirmImportantSitesDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("ImportantDomains", strArr2);
        bundle.putIntArray("ImportantDomainReasons", iArr);
        bundle.putStringArray("FaviconURLs", strArr3);
        confirmImportantSitesDialogFragment.E0(bundle);
        this.n0 = confirmImportantSitesDialogFragment;
        confirmImportantSitesDialogFragment.H0(1, this);
        this.n0.Q0(this.x, "ConfirmImportantSitesDialogFragment");
    }

    @Override // defpackage.AbstractC0123Ay2
    public void O0(String str, Bundle bundle) {
        boolean z;
        if (bundle != null) {
            this.m0 = (ClearBrowsingDataFetcher) bundle.getParcelable("clearBrowsingDataFetcher");
        }
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f14034b);
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f18000c);
        List V0 = V0();
        this.l0 = new WS[V0.size()];
        for (int i = 0; i < V0.size(); i++) {
            int intValue = ((Integer) V0.get(i)).intValue();
            if (intValue != 0 || AbstractC8650pL.a("history.deleting_enabled")) {
                z = true;
            } else {
                BrowsingDataBridge b = BrowsingDataBridge.b();
                int U0 = U0(0);
                b.getClass();
                N.MBI7g3zY(b, U0, 0, false);
                BrowsingDataBridge b2 = BrowsingDataBridge.b();
                int U02 = U0(0);
                b2.getClass();
                N.MBI7g3zY(b2, U02, 1, false);
                z = false;
            }
            WS[] wsArr = this.l0;
            Activity activity = getActivity();
            ClearBrowsingDataCheckBoxPreference clearBrowsingDataCheckBoxPreference = (ClearBrowsingDataCheckBoxPreference) M0(W0(intValue));
            BrowsingDataBridge b3 = BrowsingDataBridge.b();
            int U03 = U0(intValue);
            int T0 = T0();
            b3.getClass();
            wsArr[i] = new WS(activity, this, intValue, clearBrowsingDataCheckBoxPreference, N.MK1rP8DI(b3, U03, T0), z);
        }
        C5348fk c5348fk = new C5348fk(0);
        for (int i2 = 0; i2 < 6; i2++) {
            c5348fk.add(Integer.valueOf(i2));
        }
        c5348fk.removeAll(V0);
        C5004ek c5004ek = new C5004ek(c5348fk);
        while (c5004ek.hasNext()) {
            N0().b0(M0(W0(((Integer) c5004ek.next()).intValue())));
        }
        SpinnerPreference spinnerPreference = (SpinnerPreference) M0("time_period_spinner");
        Activity activity2 = getActivity();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new XS(0, activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140349)));
        arrayList.add(new XS(1, activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140345)));
        arrayList.add(new XS(2, activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140346)));
        arrayList.add(new XS(3, activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140348)));
        arrayList.add(new XS(4, activity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140347)));
        XS[] xsArr = (XS[]) arrayList.toArray(new XS[0]);
        BrowsingDataBridge b4 = BrowsingDataBridge.b();
        int T02 = T0();
        b4.getClass();
        int MWrAQRuo = N.MWrAQRuo(b4, T02);
        int i3 = 0;
        while (true) {
            if (i3 >= xsArr.length) {
                i3 = -1;
                break;
            } else if (xsArr[i3].a == MWrAQRuo) {
                break;
            } else {
                i3++;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(spinnerPreference.a, spinnerPreference.W ? R.layout.0_resource_name_obfuscated_res_0x7f0e0211 : android.R.layout.simple_spinner_item, xsArr);
        spinnerPreference.U = arrayAdapter;
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPreference.V = i3;
        spinnerPreference.j = this;
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("EnableCbdSignOut") && US.a(C1202Jg1.a(), 0)) {
            C1202Jg1 a = C1202Jg1.a();
            Profile d = Profile.d();
            a.getClass();
            if (C1202Jg1.c(d).c()) {
                ((ClickableSpansTextMessagePreference) M0("sign_out_of_chrome_text")).P(AbstractC9108qg3.a(K().getString(R.string.0_resource_name_obfuscated_res_0x7f140a4e), new C8765pg3(new C11997z52(B0(), new Callback() { // from class: RS
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        int i4 = ClearBrowsingDataFragment.o0;
                        ClearBrowsingDataFragment clearBrowsingDataFragment = ClearBrowsingDataFragment.this;
                        C8729pa3.a(clearBrowsingDataFragment.B0(), ((InterfaceC3562aY1) clearBrowsingDataFragment.getActivity()).N(), clearBrowsingDataFragment, 1, 0);
                    }
                }), "<link1>", "</link1>")));
                return;
            }
        }
        Preference M0 = M0("sign_out_of_chrome_text");
        if (M0 != null) {
            N0().b0(M0);
        }
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        bundle.putParcelable("clearBrowsingDataFetcher", this.m0);
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) super.i0(layoutInflater, viewGroup, bundle);
        ButtonCompat buttonCompat = (ButtonCompat) layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0084, (ViewGroup) linearLayout, false);
        buttonCompat.setOnClickListener(new View.OnClickListener() { // from class: SS
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ClearBrowsingDataFragment.o0;
                ClearBrowsingDataFragment.this.Z0();
            }
        });
        linearLayout.addView(buttonCompat);
        this.d0.p0(null);
        return linearLayout;
    }

    @Override // androidx.fragment.app.c
    public final void d0(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            String[] stringArrayExtra = intent.getStringArrayExtra("DeselectedDomains");
            int[] intArrayExtra = intent.getIntArrayExtra("DeselectedDomainReasons");
            String[] stringArrayExtra2 = intent.getStringArrayExtra("IgnoredDomains");
            int[] intArrayExtra2 = intent.getIntArrayExtra("IgnoredDomainReasons");
            if (stringArrayExtra != null) {
                ClearBrowsingDataFetcher clearBrowsingDataFetcher = this.m0;
                if (clearBrowsingDataFetcher.g != null) {
                    int length = stringArrayExtra.length;
                    int i3 = clearBrowsingDataFetcher.a + 1;
                    EI2.f(length, 1, i3, i3, "History.ClearBrowsingData.ImportantDeselectedNum");
                    int length2 = stringArrayExtra2.length;
                    int i4 = this.m0.a + 1;
                    EI2.f(length2, 1, i4, i4, "History.ClearBrowsingData.ImportantIgnoredNum");
                    EI2.h((stringArrayExtra.length * 20) / this.m0.g.length, 21, "History.ClearBrowsingData.ImportantDeselectedPercent");
                    EI2.h((stringArrayExtra2.length * 20) / this.m0.g.length, 21, "History.ClearBrowsingData.ImportantIgnoredPercent");
                }
            }
            R0(X0(), stringArrayExtra, intArrayExtra, stringArrayExtra2, intArrayExtra2);
        }
    }

    @Override // defpackage.InterfaceC8386oa3
    public final void m(final boolean z) {
        if (US.a(C1202Jg1.a(), 0)) {
            final SigninManager a = AbstractC9966tA.a(C1202Jg1.a());
            a.u(new Runnable() { // from class: TS
                @Override // java.lang.Runnable
                public final void run() {
                    int i = ClearBrowsingDataFragment.o0;
                    ClearBrowsingDataFragment clearBrowsingDataFragment = ClearBrowsingDataFragment.this;
                    clearBrowsingDataFragment.getClass();
                    SigninManager signinManager = a;
                    if (!signinManager.c()) {
                        Preference M0 = clearBrowsingDataFragment.M0("sign_out_of_chrome_text");
                        if (M0 != null) {
                            clearBrowsingDataFragment.N0().b0(M0);
                            return;
                        }
                        return;
                    }
                    signinManager.w(21, new VS(clearBrowsingDataFragment, new ClearDataProgressDialog()), z);
                    Preference M02 = clearBrowsingDataFragment.M0("sign_out_of_chrome_text");
                    if (M02 != null) {
                        clearBrowsingDataFragment.N0().b0(M02);
                    }
                }
            });
        }
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        if (!preference.q.equals("time_period_spinner")) {
            return false;
        }
        for (WS ws : this.l0) {
            ws.j = false;
        }
        BrowsingDataBridge b = BrowsingDataBridge.b();
        int T0 = T0();
        int i = ((XS) obj).a;
        b.getClass();
        N.MyZiGmx0(b, T0, i);
        return true;
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        if (!preference.q.equals("clear_button")) {
            return false;
        }
        Z0();
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        this.f11484J = true;
        ((Button) this.L.findViewById(R.id.clear_button)).setEnabled(true ^ X0().isEmpty());
        P0(null);
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.f11484J = true;
        S0();
        for (WS ws : this.l0) {
            BrowsingDataCounterBridge browsingDataCounterBridge = ws.i;
            long j = browsingDataCounterBridge.a;
            if (j != 0) {
                N.MdFUmBu6(j, browsingDataCounterBridge);
                browsingDataCounterBridge.a = 0L;
            }
        }
    }
}
