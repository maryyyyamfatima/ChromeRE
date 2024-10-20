package org.chromium.chrome.browser.signin;

import J.N;
import android.accounts.Account;
import android.content.Context;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC5103f04;
import defpackage.AbstractC9771sd;
import defpackage.C10106tb3;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C2;
import defpackage.C4502dG0;
import defpackage.C7928nE;
import defpackage.C8938qA;
import defpackage.C9078qb3;
import defpackage.C9239r30;
import defpackage.C9420rb3;
import defpackage.D2;
import defpackage.EI2;
import defpackage.FI2;
import defpackage.InterfaceC1072Ig1;
import defpackage.InterfaceC4954eb3;
import defpackage.InterfaceC5298fb3;
import defpackage.InterfaceC5642gb3;
import defpackage.MC2;
import defpackage.RunnableC6330ib3;
import defpackage.RunnableC8735pb3;
import defpackage.UN;
import defpackage.V60;
import defpackage.YK1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.SigninManagerImpl;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.base.CoreAccountId;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.components.signin.identitymanager.AccountTrackerService;
import org.chromium.components.signin.identitymanager.IdentityManager;
import org.chromium.components.signin.identitymanager.IdentityMutator;
import org.chromium.components.signin.identitymanager.PrimaryAccountChangeEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SigninManagerImpl implements InterfaceC1072Ig1, SigninManager {
    public static final int[] p = {0, 1, 2, 3, 4};
    public long a;
    public final AccountTrackerService g;
    public final IdentityManager h;
    public final IdentityMutator i;
    public final C12157za2 j = new C12157za2();
    public final ArrayList k = new ArrayList();
    public boolean l;
    public C9078qb3 m;
    public C9420rb3 n;
    public boolean o;

    @Override // defpackage.InterfaceC1072Ig1
    public final /* synthetic */ void m(AccountInfo accountInfo) {
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final void o(PrimaryAccountChangeEvent primaryAccountChangeEvent) {
        int i = primaryAccountChangeEvent.a;
        if (i == 0) {
            if (primaryAccountChangeEvent.b == 2) {
                if (this.n == null) {
                    this.n = new C9420rb3(null, 0);
                }
                x(new Runnable() { // from class: jb3
                    @Override // java.lang.Runnable
                    public final void run() {
                        SigninManagerImpl.this.z();
                    }
                });
                return;
            }
            return;
        }
        if (i == 1 || i != 2) {
            return;
        }
        if (this.n == null) {
            this.n = new C9420rb3(null, h() != null ? 2 : 0);
        }
        C10106tb3.b.a.t("google.services.username", null);
        x(new Runnable() { // from class: jb3
            @Override // java.lang.Runnable
            public final void run() {
                SigninManagerImpl.this.z();
            }
        });
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final void a(CoreAccountId coreAccountId) {
        N.McMy7mwQ(this.i.a, coreAccountId);
    }

    public static SigninManager create(long j, AccountTrackerService accountTrackerService, IdentityManager identityManager, IdentityMutator identityMutator) {
        SigninManagerImpl signinManagerImpl = new SigninManagerImpl(j, accountTrackerService, identityManager, identityMutator);
        identityManager.a(signinManagerImpl);
        MC2 mc2 = D2.a;
        if (mc2 == null || !mc2.d()) {
            C2 c2 = new C2(identityManager, accountTrackerService);
            MC2 mc22 = D2.a;
            if (mc22 == null) {
                D2.a = MC2.c(c2);
            } else {
                mc22.b(c2);
            }
        }
        CoreAccountInfo b = identityManager.b(0);
        signinManagerImpl.a(b == null ? null : b.getId());
        return signinManagerImpl;
    }

    public SigninManagerImpl(long j, AccountTrackerService accountTrackerService, IdentityManager identityManager, IdentityMutator identityMutator) {
        Object obj = ThreadUtils.a;
        this.a = j;
        this.g = accountTrackerService;
        this.h = identityManager;
        this.i = identityMutator;
        this.l = N.Mo0prJ3k(j);
    }

    public void destroy() {
        C2 a = D2.a();
        a.g.d.d(a);
        a.a.d(a);
        this.h.d(this);
        this.a = 0L;
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final IdentityManager p() {
        return this.h;
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final boolean l() {
        return this.m == null && this.l && this.h.b(0) == null && r();
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final void k(C9239r30 c9239r30, String str) {
        N.M7ZP5quR(this.a, (AccountInfo) N.MAwvRw4K(this.h.a, str), c9239r30);
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final boolean n() {
        return this.m == null && this.l && this.h.b(1) == null && r();
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final void e(int i) {
        w(i, null, false);
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final boolean g() {
        return !this.l;
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final boolean r() {
        if (AbstractC9771sd.e()) {
            return false;
        }
        C4502dG0 c4502dG0 = C4502dG0.b;
        Context context = V60.a;
        c4502dG0.getClass();
        int d = C4502dG0.d(context);
        return (d == 1 || d == 9) ^ true;
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final boolean q() {
        return N.MRa0T_Mz(this.a);
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final void b(InterfaceC5298fb3 interfaceC5298fb3) {
        this.j.a(interfaceC5298fb3);
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final void f(InterfaceC5298fb3 interfaceC5298fb3) {
        this.j.d(interfaceC5298fb3);
    }

    public final void B(C9078qb3 c9078qb3) {
        this.m = c9078qb3;
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(c9078qb3.a != null);
        AbstractC4851eH1.d("SigninManager", "Signin starts (enabling sync: %b).", objArr);
        D2.a().b(this.m.c.name).g(new Callback() { // from class: mb3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final SigninManagerImpl signinManagerImpl = SigninManagerImpl.this;
                signinManagerImpl.m.d = (AccountInfo) obj;
                PostTask.c(AbstractC5103f04.a, new RunnableC6330ib3(signinManagerImpl));
                C9078qb3 c9078qb32 = signinManagerImpl.m;
                if (!(c9078qb32.a != null)) {
                    signinManagerImpl.y();
                } else {
                    N.Mn1Rv$d9(signinManagerImpl.a, c9078qb32.d, new Runnable() { // from class: nb3
                        @Override // java.lang.Runnable
                        public final void run() {
                            SigninManagerImpl.this.y();
                        }
                    });
                }
            }
        });
    }

    public final void y() {
        a(this.m.d.getId());
        C9078qb3 c9078qb3 = this.m;
        if (!N.MASdubqY(this.i.a, c9078qb3.d.getId(), c9078qb3.a != null ? 1 : 0)) {
            AbstractC4851eH1.f("SigninManager", "Failed to set the PrimaryAccount in IdentityManager, aborting signin", new Object[0]);
            C9078qb3 c9078qb32 = this.m;
            this.m = null;
            A();
            InterfaceC4954eb3 interfaceC4954eb3 = c9078qb32.b;
            if (interfaceC4954eb3 != null) {
                interfaceC4954eb3.b();
            }
            N.MREkQQeM(this.a);
            PostTask.c(AbstractC5103f04.a, new RunnableC6330ib3(this));
            return;
        }
        C9078qb3 c9078qb33 = this.m;
        if (c9078qb33.a != null) {
            C10106tb3.b.a.t("google.services.username", c9078qb33.d.getEmail());
            N.MYTq2YI9(((SyncServiceImpl) AbstractC1658Mt3.b()).c, true);
            FI2.a("Signin_Signin_Succeed");
            EI2.h(this.m.a.intValue(), 39, "Signin.SigninCompletedAccessPoint");
            EI2.h(0, 7, "Signin.SigninReason");
        }
        InterfaceC4954eb3 interfaceC4954eb32 = this.m.b;
        if (interfaceC4954eb32 != null) {
            interfaceC4954eb32.a();
        }
        AbstractC4851eH1.d("SigninManager", "Signin completed.", new Object[0]);
        this.m = null;
        A();
        PostTask.c(AbstractC5103f04.a, new RunnableC6330ib3(this));
        Iterator it = this.j.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC5298fb3) c11814ya2.next()).b();
            }
        }
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final void u(Runnable runnable) {
        Object obj = ThreadUtils.a;
        if ((this.m == null && this.n == null && !this.o) ? false : true) {
            this.k.add(runnable);
        } else {
            PostTask.c(AbstractC5103f04.a, runnable);
        }
    }

    public final void A() {
        Object obj = ThreadUtils.a;
        while (true) {
            ArrayList arrayList = this.k;
            if (arrayList.isEmpty()) {
                return;
            }
            Object obj2 = ThreadUtils.a;
            if ((this.m == null && this.n == null && !this.o) ? false : true) {
                return;
            } else {
                PostTask.c(AbstractC5103f04.a, (Runnable) arrayList.remove(0));
            }
        }
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final void i(YK1 yk1, boolean z) {
        String h = h();
        int i = 1;
        this.n = new C9420rb3(yk1, (z || h != null) ? 1 : 0);
        Object[] objArr = new Object[1];
        if (!z && h == null) {
            i = 0;
        }
        objArr[0] = Integer.valueOf(i);
        AbstractC4851eH1.d("SigninManager", "Revoking sync consent, dataWipeAction: %d", objArr);
        N.MFKwWXk6(this.i.a, 16, 2);
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final boolean c() {
        return !Profile.d().h();
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final void w(int i, InterfaceC5642gb3 interfaceC5642gb3, boolean z) {
        String h = h();
        this.n = new C9420rb3(interfaceC5642gb3, (z || h != null) ? 2 : 0);
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf((z || h != null) ? 2 : 0);
        AbstractC4851eH1.d("SigninManager", "Signing out, dataWipeAction: %d", objArr);
        N.Mw3X2cb0(this.i.a, i, 2);
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final String h() {
        return N.MM6ImjTk(this.a);
    }

    public final void z() {
        InterfaceC5642gb3 interfaceC5642gb3 = this.n.a;
        this.n = null;
        if (interfaceC5642gb3 != null) {
            interfaceC5642gb3.a();
        }
        A();
        Iterator it = this.j.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC5298fb3) c11814ya2.next()).g();
            }
        }
    }

    public final void onSigninAllowedByPolicyChanged(boolean z) {
        this.l = z;
        PostTask.c(AbstractC5103f04.a, new RunnableC6330ib3(this));
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final void v() {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("EnableCbdSignOut")) {
            return;
        }
        IdentityManager identityManager = this.h;
        if (identityManager.b(0) == null || identityManager.b(1) != null) {
            return;
        }
        if (N.M09VlOh_("AllowSyncOffForChildAccounts")) {
            final AccountManagerFacade accountManagerFacadeProvider = AccountManagerFacadeProvider.getInstance();
            accountManagerFacadeProvider.a().g(new Callback() { // from class: hb3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    final SigninManagerImpl signinManagerImpl = SigninManagerImpl.this;
                    signinManagerImpl.getClass();
                    Q2 q2 = new Q2() { // from class: lb3
                        @Override // defpackage.Q2
                        public final void a(boolean z, Account account) {
                            SigninManagerImpl signinManagerImpl2 = SigninManagerImpl.this;
                            if (z) {
                                signinManagerImpl2.getClass();
                            } else {
                                signinManagerImpl2.e(12);
                            }
                        }
                    };
                    B4.b(accountManagerFacadeProvider, (List) obj, q2);
                }
            });
        } else {
            e(12);
        }
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final void j(Runnable runnable) {
        this.o = true;
        C8938qA c8938qA = new C8938qA();
        c8938qA.e(new RunnableC8735pb3(this, c8938qA, runnable));
    }

    public final void x(Runnable runnable) {
        AbstractC4851eH1.d("SigninManager", "Native signout complete, wiping data (user callback: %s)", Integer.valueOf(this.n.b));
        InterfaceC5642gb3 interfaceC5642gb3 = this.n.a;
        if (interfaceC5642gb3 != null) {
            interfaceC5642gb3.b();
        }
        int i = this.n.b;
        if (i == 0) {
            N.M3tTsu$h(this.a, runnable);
        } else if (i == 1) {
            j(runnable);
        } else if (i == 2) {
            N.MyfLWqOr(this.a, runnable);
        }
        final AccountTrackerService accountTrackerService = this.g;
        Objects.requireNonNull(accountTrackerService);
        ThreadUtils.d(new Runnable() { // from class: kb3
            @Override // java.lang.Runnable
            public final void run() {
                AccountTrackerService accountTrackerService2 = AccountTrackerService.this;
                if (accountTrackerService2.c == 1) {
                    accountTrackerService2.f = true;
                } else {
                    accountTrackerService2.a(true);
                }
            }
        });
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final void s(Account account, InterfaceC4954eb3 interfaceC4954eb3) {
        B(new C9078qb3(null, account, interfaceC4954eb3));
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final void d(int i, Account account, InterfaceC4954eb3 interfaceC4954eb3) {
        B(new C9078qb3(Integer.valueOf(i), account, interfaceC4954eb3));
    }

    @Override // org.chromium.chrome.browser.signin.services.SigninManager
    public final String t(String str) {
        return N.MiQjxiSl(str);
    }
}
