package org.chromium.chrome.browser.autofill.settings;

import J.N;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC1774Nr;
import defpackage.AbstractC9771sd;
import defpackage.C1293Jy2;
import defpackage.C1634Mp;
import defpackage.C7108kr;
import defpackage.C7432ln3;
import defpackage.C8484or;
import defpackage.InterfaceC1912Os2;
import defpackage.InterfaceC9213qy2;
import defpackage.L7;
import defpackage.ViewOnClickListenerC0501Dw0;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.autofill.settings.AutofillProfilesFragment;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillProfilesFragment extends AbstractC0123Ay2 implements InterfaceC1912Os2 {
    public static final /* synthetic */ int k0 = 0;
    public ViewOnClickListenerC0501Dw0 j0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f14020b);
        F0();
        C1293Jy2 c1293Jy2 = this.c0;
        PreferenceScreen a = c1293Jy2.a(c1293Jy2.a);
        if (a.Y) {
            throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
        }
        a.c0 = false;
        Q0(a);
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
        AbstractC1774Nr.e(getActivity(), Profile.d());
        return true;
    }

    public final void R0() {
        C7432ln3 e;
        N0().a0();
        N0().W = true;
        ChromeSwitchPreference chromeSwitchPreference = new ChromeSwitchPreference(this.c0.a, null);
        chromeSwitchPreference.Q(R.string.0_resource_name_obfuscated_res_0x7f140234);
        chromeSwitchPreference.O(R.string.0_resource_name_obfuscated_res_0x7f140235);
        chromeSwitchPreference.W(PersonalDataManager.h());
        chromeSwitchPreference.j = new InterfaceC9213qy2() { // from class: mr
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                int i = AutofillProfilesFragment.k0;
                PersonalDataManager.e().e("autofill.profile_enabled", ((Boolean) obj).booleanValue());
                return true;
            }
        };
        chromeSwitchPreference.b0(new C8484or());
        N0().W(chromeSwitchPreference);
        Iterator it = PersonalDataManager.d().f().iterator();
        while (it.hasNext()) {
            PersonalDataManager.AutofillProfile autofillProfile = (PersonalDataManager.AutofillProfile) it.next();
            C7108kr c7108kr = new C7108kr(this.c0.a);
            c7108kr.R(autofillProfile.getFullName());
            c7108kr.P(autofillProfile.p);
            c7108kr.K(c7108kr.m.toString());
            c7108kr.l().putString("guid", autofillProfile.getGUID());
            e = C7432ln3.e();
            try {
                N0().W(c7108kr);
                e.close();
            } finally {
            }
        }
        if (PersonalDataManager.h()) {
            C7108kr c7108kr2 = new C7108kr(this.c0.a);
            Drawable c = AbstractC9771sd.c(N(), R.drawable.0_resource_name_obfuscated_res_0x7f090409, 0);
            c.mutate();
            c.setColorFilter(AbstractC10957w33.b(K()), PorterDuff.Mode.SRC_IN);
            c7108kr2.J(c);
            c7108kr2.Q(R.string.0_resource_name_obfuscated_res_0x7f140223);
            c7108kr2.K("new_profile");
            e = C7432ln3.e();
            try {
                N0().W(c7108kr2);
                e.close();
            } finally {
            }
        }
    }

    @Override // defpackage.InterfaceC1912Os2
    public final void C() {
        R0();
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void k0() {
        PersonalDataManager d = PersonalDataManager.d();
        d.getClass();
        Object obj = ThreadUtils.a;
        d.b.remove(this);
        super.k0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC0123Ay2, defpackage.InterfaceC0903Gy2
    public final void x(Preference preference) {
        if (preference instanceof C7108kr) {
            final String string = ((C7108kr) preference).l().getString("guid");
            C1634Mp c1634Mp = null;
            this.j0 = new ViewOnClickListenerC0501Dw0(getActivity(), string == null ? 0 : new Runnable() { // from class: nr
                @Override // java.lang.Runnable
                public final void run() {
                    int i = AutofillProfilesFragment.k0;
                    PersonalDataManager d = PersonalDataManager.d();
                    d.getClass();
                    Object obj = ThreadUtils.a;
                    long j = d.a;
                    String str = string;
                    N.MIAwuIe5(j, d, str);
                    H53.a().getClass();
                    Iterator it = H53.a.iterator();
                    while (it.hasNext()) {
                        PostTask.c(AbstractC5103f04.a, new D53((G53) it.next(), str));
                    }
                }
            }, Profile.d());
            if (string != null) {
                PersonalDataManager d = PersonalDataManager.d();
                d.getClass();
                Object obj = ThreadUtils.a;
                PersonalDataManager.AutofillProfile autofillProfile = (PersonalDataManager.AutofillProfile) N.M172IO7Q(d.a, d, string);
                if (autofillProfile != null) {
                    c1634Mp = new C1634Mp(getActivity(), autofillProfile, 0);
                }
            }
            ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0 = this.j0;
            L7 l7 = new L7(true);
            l7.a = viewOnClickListenerC0501Dw0;
            l7.b = viewOnClickListenerC0501Dw0.getContext();
            Callback callback = new Callback() { // from class: lr
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    C1634Mp c1634Mp2 = (C1634Mp) obj2;
                    int i = AutofillProfilesFragment.k0;
                    if (c1634Mp2 != null) {
                        PersonalDataManager d2 = PersonalDataManager.d();
                        PersonalDataManager.AutofillProfile autofillProfile2 = c1634Mp2.q;
                        d2.getClass();
                        Object obj3 = ThreadUtils.a;
                        N.MgzFcfQz(d2.a, d2, autofillProfile2);
                        H53.a().getClass();
                        Iterator it = H53.a.iterator();
                        while (it.hasNext()) {
                            PostTask.c(AbstractC5103f04.a, new C53((G53) it.next(), c1634Mp2));
                        }
                    }
                }
            };
            l7.d(c1634Mp, callback, callback);
            return;
        }
        super.x(preference);
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        this.f11484J = true;
        PersonalDataManager d = PersonalDataManager.d();
        d.getClass();
        Object obj = ThreadUtils.a;
        d.b.add(this);
        N.Melg71WL(d.a, d);
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        R0();
    }

    @Override // androidx.fragment.app.c, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f11484J = true;
        ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0 = this.j0;
        if (viewOnClickListenerC0501Dw0 != null) {
            viewOnClickListenerC0501Dw0.d();
        }
    }
}
