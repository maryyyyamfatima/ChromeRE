package defpackage;

import com.google.android.gms.clearcut.internal.LogErrorParcelable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7601mH1 {
    public static C7601mH1 c;
    public int b = 0;
    public final C4317ck a = new C4317ck();

    public static synchronized C7601mH1 b() {
        C7601mH1 c7601mH1;
        synchronized (C7601mH1.class) {
            if (c == null) {
                c = new C7601mH1();
            }
            c7601mH1 = c;
        }
        return c7601mH1;
    }

    public final synchronized void a(LogErrorParcelable logErrorParcelable) {
        C8776pi2 c8776pi2 = new C8776pi2(logErrorParcelable.a, Integer.valueOf(logErrorParcelable.g));
        LogErrorParcelable logErrorParcelable2 = (LogErrorParcelable) this.a.get(c8776pi2);
        int i = Integer.MIN_VALUE;
        if (logErrorParcelable2 != null) {
            long j = logErrorParcelable2.h + logErrorParcelable.h;
            if (j > 2147483647L) {
                i = Integer.MAX_VALUE;
            } else if (j >= -2147483648L) {
                i = (int) j;
            }
            logErrorParcelable2.h = i;
            return;
        }
        C4317ck c4317ck = this.a;
        if (c4317ck.h >= 100) {
            long j2 = this.b + logErrorParcelable.h;
            if (j2 > 2147483647L) {
                i = Integer.MAX_VALUE;
            } else if (j2 >= -2147483648L) {
                i = (int) j2;
            }
            this.b = i;
            return;
        }
        c4317ck.put(c8776pi2, logErrorParcelable);
    }
}
