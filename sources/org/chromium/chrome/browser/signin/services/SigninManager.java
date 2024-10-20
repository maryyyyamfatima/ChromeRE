package org.chromium.chrome.browser.signin.services;

import android.accounts.Account;
import defpackage.C9239r30;
import defpackage.InterfaceC4954eb3;
import defpackage.InterfaceC5298fb3;
import defpackage.InterfaceC5642gb3;
import defpackage.YK1;
import org.chromium.components.signin.base.CoreAccountId;
import org.chromium.components.signin.identitymanager.IdentityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public interface SigninManager {
    void a(CoreAccountId coreAccountId);

    void b(InterfaceC5298fb3 interfaceC5298fb3);

    boolean c();

    void d(int i, Account account, InterfaceC4954eb3 interfaceC4954eb3);

    void e(int i);

    void f(InterfaceC5298fb3 interfaceC5298fb3);

    boolean g();

    String h();

    void i(YK1 yk1, boolean z);

    void j(Runnable runnable);

    void k(C9239r30 c9239r30, String str);

    boolean l();

    boolean n();

    IdentityManager p();

    boolean q();

    boolean r();

    void s(Account account, InterfaceC4954eb3 interfaceC4954eb3);

    String t(String str);

    void u(Runnable runnable);

    void w(int i, InterfaceC5642gb3 interfaceC5642gb3, boolean z);
}
