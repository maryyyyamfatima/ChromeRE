package defpackage;

import android.accounts.Account;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u01 */
/* loaded from: classes.dex */
public final class C10251u01 extends C5756gu3 {
    public final C4502dG0 c;

    public C10251u01(C4502dG0 c4502dG0) {
        this.c = c4502dG0;
    }

    @Override // defpackage.C5756gu3
    public final boolean d(Account account, String[] strArr) {
        if (!f()) {
            return super.d(account, strArr);
        }
        try {
            return Arrays.asList(AbstractC7174l21.p(V60.a, account.type, strArr)).contains(account);
        } catch (C6486j21 | IOException e) {
            AbstractC4851eH1.f("Auth", "Unable to check features using GoogleAuthUtil.", e);
            return super.d(account, strArr);
        }
    }

    @Override // defpackage.C5756gu3, defpackage.P2
    public final int b(Account account, String str) {
        int i;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int r = AbstractC7174l21.r(V60.a, new HasCapabilitiesRequest(account, new String[]{str}, null));
            EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Signin.AccountCapabilities.GetFromSystemLibraryDuration");
            switch (r) {
                case -1:
                    i = 10;
                    break;
                case 0:
                default:
                    i = 21;
                    break;
                case 1:
                case 2:
                    i = 0;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i = 11;
                    break;
                case 4:
                    i = 12;
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    i = 13;
                    break;
                case 6:
                    i = 14;
                    break;
            }
            EI2.h(i, 22, "Signin.AccountCapabilities.GetFromSystemLibraryResult");
            if (r != 1) {
                return r != 2 ? 0 : 2;
            }
            return 1;
        } catch (C6486j21 | IOException e) {
            AbstractC4851eH1.f("Auth", "Unable to get capability for account: " + account + " error:" + e, new Object[0]);
            EI2.h(1, 22, "Signin.AccountCapabilities.GetFromSystemLibraryResult");
            return 0;
        }
    }

    @Override // defpackage.C5756gu3, defpackage.P2
    public final Account[] a() {
        if (!f()) {
            return super.a();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Account[] o = AbstractC7174l21.o(V60.a);
            EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Signin.AndroidGetAccountsTime_GoogleAuthUtil");
            return o;
        } catch (S31 | T31 | RemoteException e) {
            AbstractC4851eH1.f("Auth", "Unable to retrieve accounts using GoogleAuthUtil.", e);
            return super.a();
        }
    }

    @Override // defpackage.C5756gu3, defpackage.P2
    public final G0 c(Account account, String str) {
        if (!f()) {
            return super.c(account, str);
        }
        try {
            TokenData q = AbstractC7174l21.q(V60.a, account, str);
            Long l = q.h;
            return new G0(q.g, l == null ? 0L : l.longValue());
        } catch (C6486j21 | IOException e) {
            AbstractC4851eH1.f("Auth", "Unable to get auth token using GoogleAuthUtil.", e);
            return super.c(account, str);
        }
    }

    public final boolean f() {
        int i = Build.VERSION.SDK_INT;
        C4502dG0 c4502dG0 = this.c;
        if (i >= 26) {
            return c4502dG0.f();
        }
        return !C5756gu3.e() && c4502dG0.f();
    }
}
