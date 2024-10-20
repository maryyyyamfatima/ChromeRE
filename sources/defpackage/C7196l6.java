package defpackage;

import android.os.SystemClock;
import org.chromium.chrome.browser.metrics.UmaUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l6 */
/* loaded from: classes.dex */
public final class C7196l6 extends AbstractC1429Kz3 {
    public boolean i;
    public final /* synthetic */ C8571p6 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7196l6(C8571p6 c8571p6, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.j = c8571p6;
        this.i = true;
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        if (!this.i) {
            this.j.g = false;
        } else {
            this.i = false;
        }
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        boolean z = navigationHandle.g && navigationHandle.a && !navigationHandle.i && !navigationHandle.c && T34.h(navigationHandle.e);
        C8571p6 c8571p6 = this.j;
        if (c8571p6.g) {
            if (z && UmaUtils.c() && !UmaUtils.b()) {
                c8571p6.b = SystemClock.uptimeMillis() - c8571p6.a;
                EI2.k(c8571p6.b, "Startup.Android.Cold.TimeToFirstNavigationCommit" + c8571p6.c);
                if (c8571p6.c.equals(".Tabbed")) {
                    long j = c8571p6.b;
                    if (!c8571p6.h) {
                        c8571p6.h = true;
                        EI2.k(j, "Startup.Android.Cold.TimeToFirstVisibleContent");
                    }
                    long andSet = c8571p6.l.getAndSet(0L);
                    if (andSet != 0) {
                        EI2.k(andSet / 1000, "Startup.Android.Cold.FirstSafeBrowsingResponseTime.Tabbed");
                    }
                }
                EI2.b("Startup.Android.Cold.FirstNavigationCommitOccurredPreForeground", false);
            } else if (z && !UmaUtils.c() && !UmaUtils.b()) {
                c8571p6.j = true;
            }
            c8571p6.g = false;
        }
    }
}
