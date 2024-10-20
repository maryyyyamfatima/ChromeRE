package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.metrics.PageLoadMetrics;
import org.chromium.chrome.browser.metrics.UmaUtils;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o6 */
/* loaded from: classes.dex */
public final class C8228o6 implements InterfaceC0948Hh2 {
    public long a = -1;
    public boolean b;
    public boolean c;
    public final /* synthetic */ C8571p6 d;

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void b(WebContents webContents, long j, int i, long j2, long j3) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void c(WebContents webContents, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void d(WebContents webContents, long j, long j2, long j3) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void e(WebContents webContents, long j, long j2) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void g(WebContents webContents) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void h(WebContents webContents, long j, float f, float f2) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void i(WebContents webContents, long j, long j2, long j3, long j4) {
    }

    public C8228o6(C8571p6 c8571p6) {
        this.d = c8571p6;
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final void f(WebContents webContents, long j, boolean z) {
        if (this.a != -1) {
            return;
        }
        this.a = j;
        boolean z2 = this.d.g;
        this.b = z2;
        if (this.c || !z2) {
            return;
        }
        this.c = true;
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final void a(WebContents webContents, long j, long j2, long j3) {
        if (j == this.a && this.b) {
            long j4 = (j2 / 1000) + j3;
            C8571p6 c8571p6 = this.d;
            if (c8571p6.b == 0) {
                return;
            }
            if (UmaUtils.c() && !UmaUtils.b()) {
                long j5 = j4 - c8571p6.a;
                EI2.k(j5, "Startup.Android.Cold.TimeToFirstContentfulPaint" + c8571p6.c);
                if (c8571p6.c.equals(".Tabbed") && !c8571p6.i) {
                    c8571p6.i = true;
                    EI2.k(j5, "Startup.Android.Cold.TimeToVisibleContent");
                }
            }
            c8571p6.g = false;
            C7196l6 c7196l6 = c8571p6.d;
            if (c7196l6 != null) {
                c7196l6.destroy();
                c8571p6.d = null;
            }
            C8228o6 c8228o6 = c8571p6.e;
            if (c8228o6 != null) {
                Object obj = ThreadUtils.a;
                C12157za2 c12157za2 = PageLoadMetrics.a;
                if (c12157za2 != null) {
                    c12157za2.d(c8228o6);
                }
                c8571p6.e = null;
            }
        }
    }
}
