package org.chromium.components.signin;

import android.accounts.Account;
import android.app.Activity;
import defpackage.F4;
import defpackage.G0;
import defpackage.MC2;
import defpackage.Q2;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public interface AccountManagerFacade {
    MC2 a();

    void b(F4 f4);

    String c(String str);

    void d(Account account, Q2 q2);

    MC2 e(Account account);

    void f(Callback callback);

    void g(Account account, Activity activity, Callback callback);

    void h(String str);

    G0 i(Account account, String str);

    void j(F4 f4);

    boolean k();
}
