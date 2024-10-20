package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: El2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578El2 {
    public final int a;
    public final long b = SystemClock.elapsedRealtime();

    public C0578El2(int i) {
        this.a = i;
    }

    public final void b(AbstractC9095qe2 abstractC9095qe2) {
        int i;
        EI2.b(a("Success"), !abstractC9095qe2.c());
        EI2.n(SystemClock.elapsedRealtime() - this.b, a(abstractC9095qe2.c() ? "ErrorLatency" : "Latency"));
        if (abstractC9095qe2.c()) {
            Exception exc = (Exception) abstractC9095qe2.b();
            if (exc instanceof C11194wl2) {
                i = ((C11194wl2) exc).a;
            } else {
                i = exc instanceof C10114td ? 2 : 3;
            }
            EI2.h(i, 6, a("Error"));
            if (i == 2) {
                EI2.m(AbstractC3989bm2.a(exc), a("APIError"));
            }
        }
    }

    public final String a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder("PasswordManager.PasswordCheckup.");
        int i = this.a;
        if (i == 0) {
            str2 = "RunPasswordCheckup";
        } else if (i == 1) {
            str2 = "GetBreachedCredentialsCount";
        } else {
            if (i != 2) {
                throw new AssertionError("All operations need to be handled.");
            }
            str2 = "GetIntent";
        }
        return AbstractC10204ts.a(sb, str2, ".", str);
    }
}
