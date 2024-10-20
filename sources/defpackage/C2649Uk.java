package defpackage;

import J.N;
import android.content.Context;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.identitymanager.IdentityManager;
import org.chromium.components.signin.identitymanager.PrimaryAccountChangeEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uk */
/* loaded from: classes.dex */
public final class C2649Uk implements HG3, InterfaceC1072Ig1, F4 {
    public final InterfaceC2519Tk a;
    public final Context g;
    public final C4502dG0 h;
    public final TemplateUrlService i;
    public final NW0 j;
    public final Q83 k;
    public final IdentityManager l;
    public final AccountManagerFacade m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public String s;

    @Override // defpackage.InterfaceC1072Ig1
    public final /* synthetic */ void m(AccountInfo accountInfo) {
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final /* synthetic */ void v() {
    }

    public C2649Uk(Context context, C4502dG0 c4502dG0, TemplateUrlService templateUrlService, NW0 nw0, InterfaceC2519Tk interfaceC2519Tk, Q83 q83, IdentityManager identityManager, AccountManagerFacade accountManagerFacade) {
        this.g = context;
        this.h = c4502dG0;
        this.i = templateUrlService;
        this.j = nw0;
        this.k = q83;
        this.a = interfaceC2519Tk;
        this.l = identityManager;
        this.m = accountManagerFacade;
        accountManagerFacade.b(this);
        identityManager.a(this);
        templateUrlService.a(this);
        C7928nE c7928nE = UN.a;
        this.o = N.M09VlOh_("OmniboxAssistantVoiceSearch");
        this.p = N.M6bsIDpc("OmniboxAssistantVoiceSearch", "colorful_mic", false);
        this.s = N.MMltG$kc("OmniboxAssistantVoiceSearch", "min_agsa_version");
        this.r = N.M6bsIDpc("OmniboxAssistantVoiceSearch", "enable_multi_account_check", true);
        this.n = templateUrlService.e();
        this.q = a();
    }

    public final boolean d() {
        boolean z = this.o;
        if (!z) {
            return false;
        }
        if (!(z && b(null, true))) {
            return false;
        }
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("AssistantNonPersonalizedVoiceSearch") ? true : this.k.e("Chrome.Assistant.Enabled", false);
    }

    public final boolean a() {
        return this.g.getPackageManager() != null && this.p && d();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.util.ArrayList r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2649Uk.b(java.util.ArrayList, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[LOOP:0: B:19:0x007c->B:21:0x0082, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            boolean r2 = r7.b(r0, r1)
            java.lang.String r3 = "Assistant.VoiceSearch.UserEligibility"
            java.lang.String r3 = r3.concat(r8)
            defpackage.EI2.b(r3, r2)
            NW0 r2 = r7.j
            java.lang.String r2 = r2.b()
            java.lang.String r3 = "GSAState"
            if (r2 != 0) goto L1e
            goto L68
        L1e:
            java.util.regex.Pattern r4 = defpackage.NW0.f
            java.util.regex.Matcher r2 = r4.matcher(r2)
            boolean r4 = r2.find()
            if (r4 == 0) goto L68
            int r4 = r2.groupCount()
            r5 = 2
            if (r4 >= r5) goto L32
            goto L68
        L32:
            r4 = 1
            java.lang.String r4 = r2.group(r4)     // Catch: java.lang.NumberFormatException -> L61
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L61
            r6 = 999(0x3e7, float:1.4E-42)
            if (r4 <= r6) goto L47
            java.lang.String r2 = "Major verison exceeded maximum of 999."
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.NumberFormatException -> L61
            defpackage.AbstractC4851eH1.a(r3, r2, r4)     // Catch: java.lang.NumberFormatException -> L61
            goto L68
        L47:
            java.lang.String r2 = r2.group(r5)     // Catch: java.lang.NumberFormatException -> L61
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L61
            if (r2 <= r6) goto L59
            java.lang.String r2 = "Minor verison exceeded maximum of 999."
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.NumberFormatException -> L61
            defpackage.AbstractC4851eH1.a(r3, r2, r4)     // Catch: java.lang.NumberFormatException -> L61
            goto L68
        L59:
            int r4 = r4 * 1000
            int r4 = r4 + r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L61
            goto L69
        L61:
            java.lang.String r2 = "Version was incorrectly formatted."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            defpackage.AbstractC4851eH1.a(r3, r2, r1)
        L68:
            r1 = 0
        L69:
            if (r1 == 0) goto L78
            java.lang.String r2 = "Assistant.VoiceSearch.AgsaVersion"
            java.lang.String r2 = r2.concat(r8)
            int r1 = r1.intValue()
            defpackage.EI2.m(r1, r2)
        L78:
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "Assistant.VoiceSearch.UserEligibility.FailureReason"
            java.lang.String r2 = r2.concat(r8)
            r3 = 12
            defpackage.EI2.h(r1, r3, r2)
            goto L7c
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2649Uk.c(java.lang.String):void");
    }

    @Override // defpackage.F4
    public final void E() {
        new C2389Sk(this, a()).c(AbstractC0185Bl.e);
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final void o(PrimaryAccountChangeEvent primaryAccountChangeEvent) {
        new C2389Sk(this, a()).c(AbstractC0185Bl.e);
    }

    @Override // defpackage.HG3
    public final void x() {
        boolean e = this.i.e();
        if (this.n == e) {
            return;
        }
        this.n = e;
        this.q = a();
        InterfaceC2519Tk interfaceC2519Tk = this.a;
        if (interfaceC2519Tk == null) {
            return;
        }
        interfaceC2519Tk.b();
    }
}
