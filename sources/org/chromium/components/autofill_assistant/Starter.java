package org.chromium.components.autofill_assistant;

import J.N;
import android.app.Activity;
import defpackage.AbstractC3194Yp;
import defpackage.AbstractC6072hq;
import defpackage.C0180Bk;
import defpackage.C0440Dk;
import defpackage.C4353cq;
import defpackage.C6309iX3;
import defpackage.C6415iq;
import defpackage.C6758jq;
import defpackage.C7102kq;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC0570Ek;
import defpackage.J44;
import defpackage.T60;
import org.chromium.base.Callback;
import org.chromium.components.autofill_assistant.Starter;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class Starter implements InterfaceC0570Ek, J44 {
    public final InterfaceC0079Ap3 a;
    public final AssistantStaticDependencies g;
    public final C6758jq h;
    public final C7102kq i;
    public final C0180Bk j;
    public WebContents k;
    public long l;
    public AssistantDependencies m;
    public C6309iX3 n;

    public static boolean getFeatureModuleInstalled() {
        return AbstractC3194Yp.b();
    }

    public static boolean getIsFirstTimeUser() {
        return T60.a.getBoolean("Chrome.AutofillAssistant.LiteScriptFirstTimeUser", true);
    }

    public Starter(C6415iq c6415iq, WebContents webContents, C0440Dk c0440Dk, C6758jq c6758jq, C7102kq c7102kq, C0180Bk c0180Bk) {
        this.a = c6415iq;
        this.g = c0440Dk;
        this.h = c6758jq;
        this.i = c7102kq;
        this.j = c0180Bk;
        a(webContents);
    }

    public static void setOnboardingAccepted(boolean z) {
        if (z) {
            AbstractC6072hq.c("autofill_assistant_switch", z);
        }
        AbstractC6072hq.c("AUTOFILL_ASSISTANT_ONBOARDING_ACCEPTED", z);
    }

    public final void b(C6309iX3 c6309iX3) {
        long j = this.l;
        if (j == 0) {
            this.n = c6309iX3;
        } else {
            N.McY8emyf(j, this, c6309iX3.c.toString(), (String[]) c6309iX3.c().keySet().toArray(new String[0]), (String[]) c6309iX3.c().values().toArray(new String[0]), (String[]) c6309iX3.b().keySet().toArray(new String[0]), (String[]) c6309iX3.b().values().toArray(new String[0]), c6309iX3.d);
        }
    }

    public final void a(WebContents webContents) {
        if (this.k != webContents) {
            this.k = webContents;
            long j = this.l;
            if (j != 0) {
                N.M_ksUDgi(j, this);
                this.l = 0L;
            }
            WebContents webContents2 = this.k;
            if (webContents2 != null) {
                this.m = null;
                long M2_hDktG = N.M2_hDktG(webContents2, this.g);
                this.l = M2_hDktG;
                N.MqkOj9Ar(M2_hDktG, this);
                C6309iX3 c6309iX3 = this.n;
                if (c6309iX3 != null) {
                    b(c6309iX3);
                    this.n = null;
                }
            }
        }
    }

    public static void setIsFirstTimeUser(boolean z) {
        AbstractC6072hq.c("Chrome.AutofillAssistant.LiteScriptFirstTimeUser", z);
    }

    public static void setProactiveHelpSettingEnabled(boolean z) {
        AbstractC6072hq.c("Chrome.AutofillAssistant.ProactiveHelp", z);
    }

    @Override // defpackage.J44
    public final void destroy() {
        long j = this.l;
        if (j == 0) {
            return;
        }
        N.M_ksUDgi(j, this);
        this.l = 0L;
    }

    public final void installFeatureModule(boolean z) {
        if (getFeatureModuleInstalled()) {
            long j = this.l;
            if (j == 0) {
                return;
            }
            N.MhVfR81n(j, this, 3);
            return;
        }
        Callback callback = new Callback() { // from class: Tj3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                X5.a(obj);
                Starter starter = Starter.this;
                starter.getClass();
                long j2 = starter.l;
                if (j2 == 0) {
                    return;
                }
                N.MhVfR81n(j2, starter, 2);
            }
        };
        if (AbstractC3194Yp.b()) {
            AbstractC3194Yp.a();
        }
        C4353cq.a(callback, this.j, z);
    }

    public final void hideOnboarding(AssistantOnboardingHelper assistantOnboardingHelper) {
        assistantOnboardingHelper.a();
    }

    public final boolean getMakeSearchesAndBrowsingBetterSettingEnabled() {
        return this.i.a();
    }

    public final Object[] getOrCreateDependenciesAndOnboardingHelper() {
        AssistantDependencies assistantDependencies = this.m;
        if (assistantDependencies != null) {
            return new Object[]{assistantDependencies, null};
        }
        if (getFeatureModuleInstalled()) {
            if (AbstractC3194Yp.b()) {
                AbstractC3194Yp.a();
            }
            this.m = this.g.b((Activity) this.a.get());
            throw null;
        }
        throw new RuntimeException("Failed to create dependencies: Feature module not installed");
    }

    public final boolean getIsTabCreatedByGSA() {
        return ((Boolean) this.h.apply((Activity) this.a.get())).booleanValue();
    }

    public static boolean getOnboardingAccepted() {
        boolean z = false;
        if (!N.MRiRQ_Ey(N.MffiISNV(3)) && (!AbstractC6072hq.a(true) || !AbstractC6072hq.b())) {
            z = true;
        }
        return !z;
    }

    public static boolean getProactiveHelpSettingEnabled() {
        return (!N.MRiRQ_Ey(N.MffiISNV(7)) ? false : T60.a.getBoolean("Chrome.AutofillAssistant.ProactiveHelp", true)) && AbstractC6072hq.a(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:            if (defpackage.AbstractC6072hq.b() != false) goto L85;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void showOnboarding(org.chromium.components.autofill_assistant.AssistantOnboardingHelper r4, boolean r5, java.lang.String r6, java.lang.String[] r7, java.lang.String[] r8) {
        /*
            r3 = this;
            r5 = 3
            long r0 = J.N.MffiISNV(r5)
            boolean r6 = J.N.MRiRQ_Ey(r0)
            r0 = 0
            if (r6 == 0) goto Ld
            goto L1b
        Ld:
            r6 = 1
            boolean r1 = defpackage.AbstractC6072hq.a(r6)
            if (r1 == 0) goto L1c
            boolean r1 = defpackage.AbstractC6072hq.b()
            if (r1 != 0) goto L1b
            goto L1c
        L1b:
            r6 = r0
        L1c:
            if (r6 != 0) goto L2b
            long r6 = r3.l
            r1 = 0
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 != 0) goto L27
            goto L2a
        L27:
            J.N.M1oC_EyL(r6, r3, r0, r5)
        L2a:
            return
        L2b:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L30:
            int r6 = r7.length
            if (r0 >= r6) goto L3d
            r6 = r7[r0]
            r1 = r8[r0]
            r5.put(r6, r1)
            int r0 = r0 + 1
            goto L30
        L3d:
            r4.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.autofill_assistant.Starter.showOnboarding(org.chromium.components.autofill_assistant.AssistantOnboardingHelper, boolean, java.lang.String, java.lang.String[], java.lang.String[]):void");
    }
}
