package defpackage;

import android.accounts.Account;
import android.content.Context;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C31 {
    public static C0713Fm2 a(AbstractC9095qe2 abstractC9095qe2, Callback callback) {
        Context context = V60.a;
        if (context == null) {
            callback.onResult(new C3995bn2("Cannot call API without context.", 1));
            return null;
        }
        if (abstractC9095qe2.c()) {
            Account account = (Account) abstractC9095qe2.b();
            C6956kQ c6956kQ = new C6956kQ();
            c6956kQ.a = account;
            return new C0713Fm2(context, new C7300lQ(c6956kQ));
        }
        throw new AssertionError("Local password priority preferences not supported!");
    }
}
