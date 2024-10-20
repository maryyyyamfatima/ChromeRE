package org.chromium.content.browser.framehost;

import J.N;
import android.graphics.Bitmap;
import android.os.SystemClock;
import defpackage.AbstractC4851eH1;
import defpackage.C3498aL2;
import defpackage.EI2;
import defpackage.G12;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NavigationControllerImpl implements NavigationController {
    public long a;

    public NavigationControllerImpl(long j) {
        this.a = j;
    }

    public static NavigationControllerImpl create(long j) {
        return new NavigationControllerImpl(j);
    }

    public final void destroy() {
        this.a = 0L;
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final boolean h() {
        long j = this.a;
        return j != 0 && N.MgAw5sIR(j, this);
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final boolean j() {
        long j = this.a;
        return j != 0 && N.MCUxt83x(j, this);
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final boolean a(int i) {
        long j = this.a;
        return j != 0 && N.M4jjW0jG(j, this, i);
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void z(int i) {
        long j = this.a;
        if (j != 0) {
            N.MuxwAbEo(j, this, i);
        }
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void f() {
        long j = this.a;
        if (j != 0) {
            N.Mdhd0AR3(j, this);
        }
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void i() {
        long j = this.a;
        if (j != 0) {
            N.MEEEhNfT(j, this);
        }
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final boolean p() {
        long j = this.a;
        return j != 0 && N.MEOFE6aD(j, this);
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void l() {
        long j = this.a;
        if (j != 0) {
            N.MWJb9aa$(j, this);
        }
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final boolean g() {
        long j = this.a;
        return j != 0 && N.MsUTH_HQ(j, this);
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void b() {
        N.MQgIP2q9(this.a, this);
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void c() {
        long j = this.a;
        if (j != 0) {
            N.M81h$w2r(j, this, true);
        }
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void t() {
        long j = this.a;
        if (j != 0) {
            N.My0bMgld(j, this, true);
        }
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void y() {
        long j = this.a;
        if (j != 0) {
            N.MNF4lMMb(j, this);
        }
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void A() {
        long j = this.a;
        if (j != 0) {
            N.Mp5SLq_N(j, this);
        }
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void d(LoadUrlParams loadUrlParams) {
        String a;
        if (this.a != 0) {
            if (loadUrlParams.f != null) {
                a = loadUrlParams.a();
            } else {
                a = loadUrlParams.g;
            }
            String str = a;
            long j = loadUrlParams.q;
            if (j == 0) {
                j = loadUrlParams.p;
            }
            long j2 = j;
            EI2.n(SystemClock.uptimeMillis() - j2, "Android.Omnibox.InputToNavigationControllerStart");
            long j3 = this.a;
            String str2 = loadUrlParams.a;
            int i = loadUrlParams.c;
            int i2 = loadUrlParams.d;
            C3498aL2 c3498aL2 = loadUrlParams.e;
            N.MAqmDh4t(j3, this, str2, i, i2, c3498aL2 != null ? c3498aL2.a : null, c3498aL2 != null ? c3498aL2.b : 0, loadUrlParams.h, str, loadUrlParams.i, loadUrlParams.j, loadUrlParams.k, loadUrlParams.l, loadUrlParams.m, loadUrlParams.n, loadUrlParams.o, loadUrlParams.b, loadUrlParams.r, loadUrlParams.s, j2);
        }
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final G12 q() {
        if (this.a == 0) {
            return null;
        }
        G12 g12 = new G12();
        g12.b = N.MUZRDUOx(this.a, this, g12);
        return g12;
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final G12 n(boolean z) {
        if (this.a == 0) {
            return null;
        }
        G12 g12 = new G12();
        N.Mx5VuK3_(this.a, this, g12, z, 8);
        return g12;
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final boolean m() {
        long j = this.a;
        if (j == 0) {
            return false;
        }
        return N.MCIN9$qH(j, this);
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void u(int i, boolean z, boolean z2) {
        if (this.a != 0) {
            AbstractC4851eH1.d("NavigationController", "Thread dump for debugging, override: " + z + " reloadOnChange: " + z2 + " caller: " + i, new Object[0]);
            Thread.dumpStack();
            N.MrilyCK6(this.a, this, z, z2, i);
        }
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final NavigationEntry e(int i) {
        long j = this.a;
        if (j != 0) {
            return (NavigationEntry) N.MLcS2$Fy(j, this, i);
        }
        return null;
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final NavigationEntry w() {
        long j = this.a;
        if (j != 0) {
            return (NavigationEntry) N.Mgxh2WfC(j, this);
        }
        return null;
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final int k() {
        long j = this.a;
        if (j != 0) {
            return N.Mil0WqAo(j, this);
        }
        return -1;
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final boolean r(int i) {
        long j = this.a;
        if (j != 0) {
            return N.MVbDeBRx(j, this, i);
        }
        return false;
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void x() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.M2mQucXv(j, this);
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final String v(int i, String str) {
        long j = this.a;
        if (j == 0) {
            return null;
        }
        return N.McQE1GI8(j, this, i, str);
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final void o(int i, String str, String str2) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.Mw19wBW8(j, this, i, str, str2);
    }

    @Override // org.chromium.content_public.browser.NavigationController
    public final boolean s(int i) {
        long j = this.a;
        if (j == 0) {
            return false;
        }
        return N.MVjP87pN(j, this, i);
    }

    public static void addToNavigationHistory(Object obj, Object obj2) {
        ((G12) obj).a.add((NavigationEntry) obj2);
    }

    public static NavigationEntry createNavigationEntry(int i, GURL gurl, GURL gurl2, GURL gurl3, GURL gurl4, String str, Bitmap bitmap, int i2, long j, boolean z) {
        return new NavigationEntry(i, gurl, gurl2, gurl3, gurl4, str, bitmap);
    }
}
