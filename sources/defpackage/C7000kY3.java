package defpackage;

import J.N;
import android.os.SystemClock;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kY3 */
/* loaded from: classes.dex */
public final class C7000kY3 implements InterfaceC3657ao2 {
    public final C9766sc0 a;
    public final C10776vY3 g;
    public final C6166i6 h;
    public long i;
    public long j;
    public boolean k;
    public boolean l;

    public C7000kY3(I5 i5, C9766sc0 c9766sc0, C10776vY3 c10776vY3, C6166i6 c6166i6) {
        this.a = c9766sc0;
        this.g = c10776vY3;
        this.h = c6166i6;
        i5.b(this);
        c9766sc0.j.a(new Runnable() { // from class: jY3
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                C7000kY3 c7000kY3 = C7000kY3.this;
                C9423rc0 c9423rc0 = c7000kY3.a.i;
                if (c9423rc0 == null || (i = c9423rc0.b) == 0) {
                    return;
                }
                boolean z = i == 1;
                if (z == c7000kY3.k) {
                    return;
                }
                c7000kY3.a();
                c7000kY3.k = z;
                c7000kY3.j = SystemClock.elapsedRealtime();
                if (!c7000kY3.k || c7000kY3.l) {
                    return;
                }
                Tab tab = (Tab) c7000kY3.h.g;
                if (tab != null) {
                    WebContents b = tab.b();
                    c7000kY3.g.getClass();
                    FI2.a("BrowserServices.TwaOpened");
                    if (b != null) {
                        N.M$ejnyHh(b, "TrustedWebActivity.Open", "HasOccurred");
                    }
                }
                c7000kY3.l = true;
            }
        });
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        this.i = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.i;
        this.g.getClass();
        EI2.j(elapsedRealtime, "BrowserServices.TwaOpenTime.V2");
        a();
        this.i = 0L;
    }

    public final void a() {
        if (this.j == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - Math.max(this.j, this.i);
        boolean z = this.k;
        C10776vY3 c10776vY3 = this.g;
        if (z) {
            c10776vY3.getClass();
            EI2.j(elapsedRealtime, "TrustedWebActivity.TimeInVerifiedOrigin.V2");
        } else {
            c10776vY3.getClass();
            EI2.j(elapsedRealtime, "TrustedWebActivity.TimeOutOfVerifiedOrigin.V2");
        }
    }
}
