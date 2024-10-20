package org.chromium.chrome.browser.metrics;

import J.N;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import defpackage.AbstractC1171Ja0;
import defpackage.C11283x04;
import defpackage.C9626sA2;
import defpackage.ComponentCallbacksC10940w04;
import defpackage.InterfaceC10590uz3;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class UmaSessionStats {
    public static long f;
    public InterfaceC10590uz3 a;
    public C11283x04 b;
    public final Context c;
    public ComponentCallbacksC10940w04 d;
    public boolean e;

    public UmaSessionStats(Context context) {
        this.c = context;
    }

    public static void a() {
        C9626sA2 g = C9626sA2.g();
        g.getClass();
        N.MmqfIJ4g(AbstractC1171Ja0.a(g));
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) g.a.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = true;
        if (!(activeNetworkInfo != null && activeNetworkInfo.isConnected()) || (!AbstractC1171Ja0.a(g) && !g.e())) {
            z = false;
        }
        N.Mq3Hvtdc(z);
    }

    public static boolean hasVisibleActivity() {
        return ApplicationStatus.hasVisibleActivities();
    }
}
