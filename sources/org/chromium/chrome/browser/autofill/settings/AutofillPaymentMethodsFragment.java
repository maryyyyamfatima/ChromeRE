package org.chromium.chrome.browser.autofill.settings;

import J.N;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.preference.PreferenceScreen;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC1774Nr;
import defpackage.C1293Jy2;
import defpackage.InterfaceC1912Os2;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillPaymentMethodsFragment extends AbstractC0123Ay2 implements InterfaceC1912Os2 {
    public static final /* synthetic */ int j0 = 0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f140242);
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

    /* JADX WARN: Code restructure failed: missing block: B:63:0x008c, code lost:            if ((r0 != null && r0.hasEnrolledFingerprints()) != false) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0065, code lost:            if (r0 == 0) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008e, code lost:            r0 = true;     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa A[LOOP:0: B:20:0x00f7->B:22:0x00fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R0() {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.autofill.settings.AutofillPaymentMethodsFragment.R0():void");
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
}
