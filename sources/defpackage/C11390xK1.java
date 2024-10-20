package defpackage;

import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11390xK1 {
    public static boolean b;
    public static boolean c;
    public final RunnableC10704vK1 a = new Runnable() { // from class: vK1
        @Override // java.lang.Runnable
        public final void run() {
            C11390xK1.this.a(false);
        }
    };

    public final void a(boolean z) {
        if (!c) {
            c = true;
            ApplicationStatus.d(new C11047wK1());
        }
        if (b) {
            return;
        }
        b = true;
        Q83 q83 = O83.a;
        long currentTimeMillis = System.currentTimeMillis();
        long g = q83.g(0L, "MainIntent.LaunchTimestamp");
        int i = 0;
        int f = q83.f(0, "MainIntent.LaunchCount");
        if (currentTimeMillis - g > 86400000) {
            if (g != 0) {
                EI2.e(f, "MobileStartup.DailyLaunchCount");
            }
            q83.s(currentTimeMillis, "MainIntent.LaunchTimestamp");
        } else {
            i = f;
        }
        q83.q(i + 1, "MainIntent.LaunchCount");
        EI2.h(!z ? 1 : 0, 2, "MobileStartup.LaunchType");
        q83.d("Chrome.DefaultBrowserPromo.SessionCount");
        ThreadUtils.b().removeCallbacks(this.a);
    }
}
