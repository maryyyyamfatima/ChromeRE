package org.chromium.chrome.browser.autofill_assistant;

import J.N;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC6072hq;
import defpackage.O83;
import defpackage.Q83;
import defpackage.T60;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillAssistantPreferenceFragment extends AbstractC0123Ay2 {
    public static final /* synthetic */ int p0 = 0;
    public final Q83 j0 = O83.a;
    public PreferenceCategory k0;
    public ChromeSwitchPreference l0;
    public ChromeSwitchPreference m0;
    public ChromeSwitchPreference n0;
    public Preference o0;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    @Override // defpackage.AbstractC0123Ay2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(java.lang.String r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.autofill_assistant.AutofillAssistantPreferenceFragment.O0(java.lang.String, android.os.Bundle):void");
    }

    public final void R0() {
        boolean z;
        boolean a = AbstractC6072hq.a(true);
        this.l0.W(a);
        boolean z2 = !this.l0.C || a;
        boolean Mfmn09fr = N.Mfmn09fr(Profile.d());
        boolean z3 = T60.a.getBoolean("Chrome.AutofillAssistant.ProactiveHelp", true);
        if (N.MRiRQ_Ey(N.MffiISNV(4))) {
            z = false;
        } else {
            boolean z4 = Mfmn09fr && z2;
            boolean z5 = z4;
            z = !z4 && z2;
            z2 = z5;
        }
        this.m0.G(z2);
        this.m0.W(z2 && z3);
        this.o0.S(z);
        this.n0.W(this.j0.e("Chrome.Assistant.Enabled", false));
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        R0();
    }
}
