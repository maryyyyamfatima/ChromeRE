package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Process;
import android.os.SystemClock;
import java.io.IOException;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gu3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5756gu3 implements P2 {
    public final AccountManager a = AccountManager.get(V60.a);
    public F4 b = null;

    @Override // defpackage.P2
    public int b(Account account, String str) {
        EI2.h(15, 22, "Signin.AccountCapabilities.GetFromSystemLibraryResult");
        return 0;
    }

    public static boolean e() {
        return AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "android.permission.GET_ACCOUNTS") == 0;
    }

    @Override // defpackage.P2
    public Account[] a() {
        if (e()) {
            C4502dG0.b.getClass();
            if (C4502dG0.b()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Account[] accountsByType = this.a.getAccountsByType("com.google");
                EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Signin.AndroidGetAccountsTime_AccountManager");
                return accountsByType;
            }
        }
        return new Account[0];
    }

    @Override // defpackage.P2
    public G0 c(Account account, String str) {
        Object obj = ThreadUtils.a;
        try {
            return new G0(AbstractC7174l21.q(V60.a, account, str).g, 0L);
        } catch (C6486j21 e) {
            throw new C10854vm(AbstractC4199cO1.a("Error while getting token for scope '", str, "'"), e);
        } catch (IOException e2) {
            throw new C10854vm(true, (Exception) e2);
        }
    }

    public boolean d(Account account, String[] strArr) {
        if (e()) {
            try {
                return this.a.hasFeatures(account, strArr, null, null).getResult().booleanValue();
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                AbstractC4851eH1.a("Auth", "Error while checking features: ", e);
            }
        }
        return false;
    }
}
