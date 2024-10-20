package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zm2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3312Zm2 {
    public final int a;
    public final String b;
    public final long c = SystemClock.elapsedRealtime();

    public C3312Zm2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final void b(Exception exc) {
        EI2.b(a("Success"), exc == null);
        EI2.n(SystemClock.elapsedRealtime() - this.c, a(exc == null ? "Latency" : "ErrorLatency"));
        if (exc != null) {
            int b = AbstractC3989bm2.b(exc);
            EI2.h(b, 9, a("ErrorCode"));
            if (b == 7) {
                EI2.m(AbstractC3989bm2.a(exc), a("APIError1"));
            }
        }
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder("PasswordManager.PasswordSettings.");
        sb.append(this.b);
        sb.append(".");
        int i = this.a;
        return AbstractC10204ts.a(sb, i != 0 ? i != 1 ? "" : "AutoSignIn" : "OfferToSavePasswords", ".", str);
    }
}
