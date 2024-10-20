package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.ProfileManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gn2 */
/* loaded from: classes.dex */
public final class C0848Gn2 {
    public static C1228Jl2 a(AbstractC9095qe2 abstractC9095qe2, Callback callback) {
        Context context = V60.a;
        if (context != null) {
            if (!ProfileManager.b) {
                callback.onResult(new C3995bn2("Profile isn't initialized yet.", 3));
                return null;
            }
            if (!(C8543p11.d.c(context, AbstractC4676dm2.b()) == 0)) {
                callback.onResult(new C3995bn2("GMS API is not recent enough.", 6));
                return null;
            }
            if (!abstractC9095qe2.c()) {
                callback.onResult(new C3995bn2("API does not support local accounts.", 2));
                return null;
            }
            Account account = (Account) abstractC9095qe2.b();
            C6956kQ c6956kQ = new C6956kQ();
            c6956kQ.a = account;
            return new C1228Jl2(context, new C7300lQ(c6956kQ));
        }
        callback.onResult(new C3995bn2("Cannot call API without context.", 1));
        return null;
    }

    public static C2017Pn2 b(Callback callback, byte[] bArr) {
        try {
            C2017Pn2 c2017Pn2 = C2017Pn2.j;
            int length = bArr.length;
            XF0 c = XF0.c();
            C2017Pn2 c2017Pn22 = new C2017Pn2();
            try {
                try {
                    QW2 a = C7931nE2.c.a(c2017Pn22);
                    a.f(c2017Pn22, bArr, 0, length + 0, new C2254Rj(c));
                    a.b(c2017Pn22);
                    if (c2017Pn22.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(c2017Pn22);
                    return c2017Pn22;
                } catch (C1127Ir1 e) {
                    if (e.g) {
                        throw new C1127Ir1(e);
                    }
                    throw e;
                } catch (IndexOutOfBoundsException unused) {
                    throw C1127Ir1.h();
                }
            } catch (IOException e2) {
                if (e2.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e2.getCause());
                }
                throw new C1127Ir1(e2);
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (Exception e4) {
            callback.onResult(e4);
            return null;
        }
    }
}
