package org.chromium.chrome.browser.metrics;

import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.InterfaceC0948Hh2;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PageLoadMetrics {
    public static C12157za2 a;

    public static void a(InterfaceC0948Hh2 interfaceC0948Hh2) {
        Object obj = ThreadUtils.a;
        if (a == null) {
            a = new C12157za2();
        }
        a.a(interfaceC0948Hh2);
    }

    public static void onNewNavigation(WebContents webContents, long j, boolean z) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = a;
        if (c12157za2 == null) {
            return;
        }
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0948Hh2) c11814ya2.next()).f(webContents, j, z);
            }
        }
    }

    public static void onNetworkQualityEstimate(WebContents webContents, long j, int i, long j2, long j3) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = a;
        if (c12157za2 == null) {
            return;
        }
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0948Hh2) c11814ya2.next()).b(webContents, j, i, j2, j3);
            }
        }
    }

    public static void onFirstContentfulPaint(WebContents webContents, long j, long j2, long j3) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = a;
        if (c12157za2 == null) {
            return;
        }
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0948Hh2) c11814ya2.next()).a(webContents, j, j2, j3);
            }
        }
    }

    public static void onLargestContentfulPaint(WebContents webContents, long j, long j2, long j3, long j4) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = a;
        if (c12157za2 == null) {
            return;
        }
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0948Hh2) c11814ya2.next()).i(webContents, j, j2, j3, j4);
            }
        }
    }

    public static void onFirstMeaningfulPaint(WebContents webContents, long j, long j2, long j3) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = a;
        if (c12157za2 == null) {
            return;
        }
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0948Hh2) c11814ya2.next()).g(webContents);
            }
        }
    }

    public static void onFirstInputDelay(WebContents webContents, long j, long j2) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = a;
        if (c12157za2 == null) {
            return;
        }
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0948Hh2) c11814ya2.next()).e(webContents, j, j2);
            }
        }
    }

    public static void onLoadEventStart(WebContents webContents, long j, long j2, long j3) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = a;
        if (c12157za2 == null) {
            return;
        }
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0948Hh2) c11814ya2.next()).d(webContents, j, j2, j3);
            }
        }
    }

    public static void onLoadedMainResource(WebContents webContents, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = a;
        if (c12157za2 == null) {
            return;
        }
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0948Hh2) c11814ya2.next()).c(webContents, j, j2, j3, j4, j5, j6, j7, j8);
            }
        }
    }

    public static void onLayoutShiftScore(WebContents webContents, long j, float f, float f2) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = a;
        if (c12157za2 == null) {
            return;
        }
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0948Hh2) c11814ya2.next()).h(webContents, j, f, f2);
            }
        }
    }
}
