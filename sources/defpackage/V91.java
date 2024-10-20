package defpackage;

import J.N;
import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.io.IOException;
import org.chromium.base.ThreadUtils;
import org.chromium.net.HttpNegotiateAuthenticator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class V91 implements AccountManagerCallback {
    public final Y91 a;
    public final /* synthetic */ HttpNegotiateAuthenticator b;

    public V91(HttpNegotiateAuthenticator httpNegotiateAuthenticator, Y91 y91) {
        this.b = httpNegotiateAuthenticator;
        this.a = y91;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        Y91 y91 = this.a;
        HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            if (accountArr.length == 0) {
                AbstractC4851eH1.f("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                N.M0s8NeYn(y91.a, httpNegotiateAuthenticator, -341, null);
                return;
            }
            if (accountArr.length > 1) {
                AbstractC4851eH1.f("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(accountArr.length));
                N.M0s8NeYn(y91.a, httpNegotiateAuthenticator, -341, null);
                return;
            }
            Context context = V60.a;
            httpNegotiateAuthenticator.getClass();
            if (HttpNegotiateAuthenticator.a(context, "android.permission.USE_CREDENTIALS", true)) {
                AbstractC4851eH1.a("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                N.M0s8NeYn(y91.a, httpNegotiateAuthenticator, -343, null);
            } else {
                Account account = accountArr[0];
                y91.e = account;
                y91.b.getAuthToken(account, y91.d, y91.c, true, (AccountManagerCallback<Bundle>) new X91(httpNegotiateAuthenticator, y91), new Handler(ThreadUtils.c()));
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            AbstractC4851eH1.f("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            N.M0s8NeYn(y91.a, httpNegotiateAuthenticator, -9, null);
        }
    }
}
