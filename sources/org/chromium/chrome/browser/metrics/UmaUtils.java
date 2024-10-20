package org.chromium.chrome.browser.metrics;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C7540m6;
import defpackage.C8571p6;
import defpackage.EI2;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class UmaUtils {
    public static C12157za2 a;
    public static long b;
    public static long c;
    public static long d;

    public static void d() {
        long j = c;
        if (j == 0 || j < d) {
            C12157za2 c12157za2 = a;
            if (c12157za2 != null && j == 0) {
                Iterator it = c12157za2.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    }
                    C8571p6 c8571p6 = ((C7540m6) c11814ya2.next()).a;
                    if (c8571p6.j) {
                        EI2.b("Startup.Android.Cold.FirstNavigationCommitOccurredPreForeground", true);
                    }
                    if (c8571p6.k) {
                        EI2.b("Startup.Android.Cold.FirstPaintOccurredPreForeground", true);
                    }
                    C7540m6 c7540m6 = c8571p6.f;
                    if (c7540m6 != null) {
                        Object obj = ThreadUtils.a;
                        C12157za2 c12157za22 = a;
                        if (c12157za22 != null) {
                            c12157za22.d(c7540m6);
                        }
                        c8571p6.f = null;
                    }
                }
            }
            c = SystemClock.uptimeMillis();
        }
    }

    public static boolean c() {
        return c != 0;
    }

    public static boolean b() {
        return d != 0;
    }

    public static int a(Context context) {
        int appStandbyBucket;
        if (Build.VERSION.SDK_INT < 28) {
            return 5;
        }
        appStandbyBucket = ((UsageStatsManager) context.getSystemService("usagestats")).getAppStandbyBucket();
        if (appStandbyBucket == 10) {
            return 0;
        }
        if (appStandbyBucket == 20) {
            return 1;
        }
        if (appStandbyBucket == 30) {
            return 2;
        }
        if (appStandbyBucket != 40) {
            return appStandbyBucket != 45 ? 5 : 4;
        }
        return 3;
    }

    public static long getApplicationStartTime() {
        return b;
    }

    public static long getProcessStartTime() {
        long startUptimeMillis;
        if (Build.VERSION.SDK_INT < 24) {
            return 0L;
        }
        startUptimeMillis = Process.getStartUptimeMillis();
        return startUptimeMillis;
    }
}
