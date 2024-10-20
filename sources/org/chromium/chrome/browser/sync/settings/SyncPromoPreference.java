package org.chromium.chrome.browser.sync.settings;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC9966tA;
import defpackage.C0009Ab3;
import defpackage.C10322uC2;
import defpackage.C1202Jg1;
import defpackage.C1812Ny2;
import defpackage.C3083Xs3;
import defpackage.F4;
import defpackage.InterfaceC12164zb3;
import defpackage.InterfaceC5298fb3;
import defpackage.InterfaceC9979tC2;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.chrome.browser.sync.settings.SyncPromoPreference;
import org.chromium.chrome.browser.ui.signin.PersonalizedSigninPromoView;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.identitymanager.IdentityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SyncPromoPreference extends Preference implements InterfaceC5298fb3, InterfaceC9979tC2, F4 {
    public final C10322uC2 T;
    public final AccountManagerFacade U;
    public int V;
    public Runnable W;
    public C0009Ab3 X;

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void g() {
    }

    public SyncPromoPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.0_resource_name_obfuscated_res_0x7f0e01fb;
        this.T = C10322uC2.b(context);
        this.U = AccountManagerFacadeProvider.getInstance();
        this.V = 0;
        S(false);
    }

    @Override // androidx.preference.Preference
    public final void s() {
        super.s();
        SigninManager a = AbstractC9966tA.a(C1202Jg1.a());
        this.U.b(this);
        a.b(this);
        this.T.a(this);
        this.X = new C0009Ab3(3, C3083Xs3.a());
        X();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000b, code lost:            if (r3 != 2) goto L59;     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(int r3) {
        /*
            r2 = this;
            int r0 = r2.V
            if (r0 != r3) goto L5
            return
        L5:
            if (r0 != 0) goto Le
            r0 = 1
            if (r3 == r0) goto Lf
            r1 = 2
            if (r3 != r1) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L16
            Ab3 r0 = r2.X
            r0.d()
        L16:
            r2.V = r3
            java.lang.Runnable r3 = r2.W
            r3.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.sync.settings.SyncPromoPreference.W(int):void");
    }

    public final void X() {
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        if (!C1202Jg1.c(d).g()) {
            if (C0009Ab3.a(3)) {
                C1202Jg1 a2 = C1202Jg1.a();
                Profile d2 = Profile.d();
                a2.getClass();
                IdentityManager b = C1202Jg1.b(d2);
                if (b.c(0)) {
                    if (!b.c(1)) {
                        W(2);
                        M();
                        S(true);
                        q();
                        return;
                    }
                } else {
                    W(1);
                    M();
                    S(true);
                    q();
                    return;
                }
            }
            W(0);
            S(false);
            return;
        }
        W(0);
        S(false);
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        if (this.V == 0) {
            return;
        }
        PersonalizedSigninPromoView personalizedSigninPromoView = (PersonalizedSigninPromoView) c1812Ny2.v(R.id.signin_promo_view_container);
        this.X.g(this.T, personalizedSigninPromoView, new InterfaceC12164zb3() { // from class: Ft3
            @Override // defpackage.InterfaceC12164zb3
            public final void onDismiss() {
                SyncPromoPreference syncPromoPreference = SyncPromoPreference.this;
                syncPromoPreference.W(0);
                syncPromoPreference.S(false);
            }
        });
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void i() {
        X();
    }

    @Override // defpackage.InterfaceC9979tC2
    public final void u(String str) {
        X();
    }

    @Override // defpackage.F4
    public final void E() {
        X();
    }

    @Override // androidx.preference.Preference
    public final void y() {
        V();
        SigninManager a = AbstractC9966tA.a(C1202Jg1.a());
        this.U.j(this);
        a.f(this);
        this.T.e(this);
        this.X = null;
    }
}
