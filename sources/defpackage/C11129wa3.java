package defpackage;

import J.N;
import android.accounts.Account;
import org.chromium.chrome.browser.signin.services.SigninManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wa3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11129wa3 implements Q2 {
    public final /* synthetic */ C0524Ea3 a;

    @Override // defpackage.Q2
    public final void a(boolean z, final Account account) {
        final C0524Ea3 c0524Ea3 = this.a;
        if (z) {
            c0524Ea3.getClass();
            c0524Ea3.a.u(new Runnable() { // from class: xa3
                @Override // java.lang.Runnable
                public final void run() {
                    final C0524Ea3 c0524Ea32 = C0524Ea3.this;
                    c0524Ea32.getClass();
                    C7928nE c7928nE = UN.a;
                    boolean z2 = !N.M09VlOh_("AllowSyncOffForChildAccounts");
                    SigninManager signinManager = c0524Ea32.a;
                    if ((z2 || !signinManager.l()) && !(z2 && signinManager.n())) {
                        return;
                    }
                    final C0264Ca3 c0264Ca3 = new C0264Ca3(c0524Ea32);
                    final C0394Da3 c0394Da3 = new C0394Da3(c0524Ea32);
                    final Account account2 = account;
                    signinManager.j(new Runnable() { // from class: Aa3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0524Ea3 c0524Ea33 = C0524Ea3.this;
                            c0524Ea33.getClass();
                            FI2.a("Signin_Signin_WipeDataOnChildAccountSignin2");
                            C7928nE c7928nE2 = UN.a;
                            boolean M09VlOh_ = N.M09VlOh_("AllowSyncOffForChildAccounts");
                            Account account3 = account2;
                            SigninManager signinManager2 = c0524Ea33.a;
                            if (M09VlOh_) {
                                signinManager2.s(account3, c0264Ca3);
                            } else {
                                signinManager2.d(29, account3, c0394Da3);
                            }
                        }
                    });
                }
            });
        }
        c0524Ea3.i++;
    }
}
