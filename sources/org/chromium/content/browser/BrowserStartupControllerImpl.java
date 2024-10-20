package org.chromium.content.browser;

import J.N;
import android.os.StrictMode;
import android.os.Trace;
import defpackage.AX;
import defpackage.AbstractC5103f04;
import defpackage.B43;
import defpackage.C6597jN;
import defpackage.C7432ln3;
import defpackage.EI2;
import defpackage.SC;
import defpackage.TC;
import defpackage.VC;
import defpackage.WC;
import defpackage.XC;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.BuildInfo;
import org.chromium.base.ThreadUtils;
import org.chromium.base.library_loader.b;
import org.chromium.base.task.PostTask;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BrowserStartupControllerImpl {
    public static BrowserStartupControllerImpl l;
    public static boolean m;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean i;
    public boolean j;
    public TracingControllerAndroidImpl k;
    public int h = 0;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    public static void browserStartupComplete(int i) {
        BrowserStartupControllerImpl browserStartupControllerImpl = l;
        if (browserStartupControllerImpl != null) {
            browserStartupControllerImpl.c(i);
        }
    }

    public static void minimalBrowserStartupComplete() {
        BrowserStartupControllerImpl browserStartupControllerImpl = l;
        if (browserStartupControllerImpl != null) {
            browserStartupControllerImpl.j = true;
            if (browserStartupControllerImpl.i) {
                browserStartupControllerImpl.h = 0;
                if (browserStartupControllerImpl.b() > 0) {
                    PostTask.c(AbstractC5103f04.e, new TC(browserStartupControllerImpl));
                    return;
                }
                return;
            }
            if (browserStartupControllerImpl.h == 1) {
                browserStartupControllerImpl.d(-1);
            }
            g();
        }
    }

    public static boolean shouldStartGpuProcessOnBrowserStartup() {
        return m;
    }

    public BrowserStartupControllerImpl() {
        if (BuildInfo.a()) {
            PostTask.c(AbstractC5103f04.a, new VC(this));
        }
    }

    public final int b() {
        boolean z = this.h == 1;
        int M1Y_XVCN = N.M1Y_XVCN(z);
        if (!z) {
            this.i = false;
        }
        this.e = true;
        return M1Y_XVCN;
    }

    public final boolean e() {
        Object obj = ThreadUtils.a;
        return this.f && this.g;
    }

    public final void a(SC sc) {
        Object obj = ThreadUtils.a;
        if (!this.f) {
            this.a.add(sc);
        } else {
            PostTask.c(AbstractC5103f04.e, new XC(this, sc));
        }
    }

    public final void c(int i) {
        this.f = true;
        this.g = i <= 0;
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SC sc = (SC) it.next();
            if (this.g) {
                sc.b();
            } else {
                sc.a();
            }
        }
        arrayList.clear();
        d(i);
        g();
    }

    public final void d(int i) {
        this.g = i <= 0;
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SC sc = (SC) it.next();
            if (this.g) {
                sc.b();
            } else {
                sc.a();
            }
        }
        arrayList.clear();
    }

    public final void h(boolean z, boolean z2, C6597jN c6597jN) {
        b.n.getClass();
        B43 b43 = B43.c;
        int a = B43.a(this.f, this.j, z2);
        if (a >= 0) {
            if (b43.b) {
                EI2.h(a, 4, "Servicification.Startup2");
            } else {
                int[] iArr = b43.a;
                iArr[a] = iArr[a] + 1;
            }
        }
        if (!this.f && (!z2 || !this.j)) {
            if (z2) {
                this.b.add(c6597jN);
            } else {
                this.a.add(c6597jN);
            }
            boolean z3 = this.i | (this.h == 1 && !z2);
            this.i = z3;
            if (!this.c) {
                this.c = true;
                m = z;
                f(new WC(this, z2));
                return;
            } else {
                if (this.j && z3) {
                    this.h = 0;
                    if (b() > 0) {
                        PostTask.c(AbstractC5103f04.e, new TC(this));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        PostTask.c(AbstractC5103f04.e, new XC(this, c6597jN));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r6 = this;
            org.chromium.base.library_loader.b r0 = org.chromium.base.library_loader.b.n
            r0.getClass()
            B43 r0 = defpackage.B43.c
            boolean r1 = r6.f
            boolean r2 = r6.j
            r3 = 0
            int r1 = defpackage.B43.a(r1, r2, r3)
            r2 = 4
            r4 = 1
            if (r1 >= 0) goto L15
            goto L26
        L15:
            boolean r5 = r0.b
            if (r5 == 0) goto L1f
            java.lang.String r0 = "Servicification.Startup2"
            defpackage.EI2.h(r1, r2, r0)
            goto L26
        L1f:
            int[] r0 = r0.a
            r5 = r0[r1]
            int r5 = r5 + r4
            r0[r1] = r5
        L26:
            boolean r0 = r6.f
            if (r0 != 0) goto L4f
            r0 = 0
            r6.f(r0)
            boolean r0 = r6.e
            if (r0 == 0) goto L36
            int r0 = r6.h
            if (r0 != r4) goto L49
        L36:
            r6.h = r3
            int r0 = r6.b()
            if (r0 <= 0) goto L49
            QF3 r0 = defpackage.AbstractC5103f04.e
            TC r1 = new TC
            r1.<init>(r6)
            org.chromium.base.task.PostTask.c(r0, r1)
            goto L4a
        L49:
            r3 = r4
        L4a:
            if (r3 == 0) goto L4f
            J.N.M9iLjy6T()
        L4f:
            boolean r0 = r6.g
            if (r0 == 0) goto L54
            return
        L54:
            jB2 r0 = new jB2
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.content.browser.BrowserStartupControllerImpl.i():void");
    }

    public final void f(WC wc) {
        if (this.d) {
            return;
        }
        this.d = true;
        Trace.beginSection("prepareToStartBrowserProcess");
        try {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                b.n.a();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                C7432ln3 c = C7432ln3.c();
                try {
                    if (!DeviceFormFactor.isTablet()) {
                        AX.e().a("use-mobile-user-agent");
                    }
                    c.close();
                    N.MwoPtAzD(false);
                    Trace.endSection();
                    if (wc != null) {
                        PostTask.c(AbstractC5103f04.d, wc);
                    }
                } catch (Throwable th) {
                    try {
                        c.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Trace.endSection();
            } catch (Throwable unused2) {
            }
            throw th3;
        }
    }

    public static void g() {
        B43 b43 = B43.c;
        b43.b = true;
        for (int i = 0; i < 4; i++) {
            int[] iArr = b43.a;
            if (iArr[i] > 0) {
                for (int i2 = 0; i2 < iArr[i]; i2++) {
                    EI2.h(i, 4, "Servicification.Startup2");
                }
                iArr[i] = 0;
            }
        }
    }
}
