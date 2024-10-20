package org.chromium.chrome.browser.sync.settings;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC2884Wf;
import defpackage.C10322uC2;
import defpackage.C1202Jg1;
import defpackage.C1812Ny2;
import defpackage.C6073hq0;
import defpackage.F4;
import defpackage.FI2;
import defpackage.Ge4;
import defpackage.InterfaceC1528Lt3;
import defpackage.InterfaceC5298fb3;
import defpackage.InterfaceC9555ry2;
import defpackage.InterfaceC9979tC2;
import defpackage.R44;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.sync.settings.SignInPreference;
import org.chromium.components.prefs.PrefService;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SignInPreference extends Preference implements InterfaceC5298fb3, InterfaceC9979tC2, InterfaceC1528Lt3, F4 {
    public final PrefService T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final C10322uC2 X;
    public final AccountManagerFacade Y;

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void g() {
    }

    public SignInPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.0_resource_name_obfuscated_res_0x7f0e0023;
        this.T = R44.a(Profile.d());
        this.X = C10322uC2.b(context);
        this.Y = AccountManagerFacadeProvider.getInstance();
        this.W = false;
    }

    @Override // androidx.preference.Preference
    public final void s() {
        super.s();
        this.Y.b(this);
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        C1202Jg1.c(d).b(this);
        this.X.a(this);
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        if (b != null) {
            b.a(this);
        }
        X();
    }

    public final void X() {
        S(!this.W);
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        if (C1202Jg1.c(d).g()) {
            if (this.T.d("signin.allowed")) {
                Q(R.string.0_resource_name_obfuscated_res_0x7f140b04);
                O(R.string.0_resource_name_obfuscated_res_0x7f140a4b);
                this.s = null;
                I(R.drawable.0_resource_name_obfuscated_res_0x7f0901cd);
                W(false);
                this.k = new InterfaceC9555ry2() { // from class: ha3
                    @Override // defpackage.InterfaceC9555ry2
                    public final boolean p(Preference preference) {
                        AbstractC4871eL1.e(SignInPreference.this.a, R.string.0_resource_name_obfuscated_res_0x7f1405ef);
                        return true;
                    }
                };
                this.U = false;
                return;
            }
            this.U = false;
            S(false);
            return;
        }
        C1202Jg1 a2 = C1202Jg1.a();
        Profile d2 = Profile.d();
        a2.getClass();
        CoreAccountInfo b = C1202Jg1.b(d2).b(0);
        if (b != null) {
            String email = b.getEmail();
            C6073hq0 c = this.X.c(email);
            CharSequence charSequence = c.c;
            if (charSequence == null) {
                charSequence = c.a;
            }
            R(charSequence);
            P(email);
            this.s = AccountManagementFragment.class.getName();
            J(c.b);
            W(true);
            this.k = null;
            this.U = false;
            return;
        }
        Q(R.string.0_resource_name_obfuscated_res_0x7f140b04);
        O(R.string.0_resource_name_obfuscated_res_0x7f140a6c);
        this.s = null;
        J(AbstractC2884Wf.a(this.a, R.drawable.0_resource_name_obfuscated_res_0x7f090374));
        W(true);
        this.k = new InterfaceC9555ry2() { // from class: ia3
            @Override // defpackage.InterfaceC9555ry2
            public final boolean p(Preference preference) {
                SignInPreference signInPreference = SignInPreference.this;
                signInPreference.getClass();
                C3083Xs3.a().getClass();
                return C3083Xs3.b(signInPreference.a, 38);
            }
        };
        if (!this.U) {
            FI2.a("Signin_Impression_FromSettings");
        }
        this.U = true;
    }

    public final void W(boolean z) {
        if (this.V == z) {
            return;
        }
        this.V = z;
        q();
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        Ge4.g(c1812Ny2.a, this.V);
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        X();
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
        this.Y.j(this);
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        C1202Jg1.c(d).f(this);
        this.X.e(this);
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        if (b != null) {
            b.l(this);
        }
    }
}
