package defpackage;

import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h82 */
/* loaded from: classes.dex */
public final class C5837h82 extends BA0 {
    public final /* synthetic */ C6181i82 a;

    public C5837h82(C6181i82 c6181i82) {
        this.a = c6181i82;
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        if (z) {
            this.a.f();
        }
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        this.a.f();
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        this.a.c();
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        TraceEvent i = TraceEvent.i("NtpFeedSurfaceLifecycleManager.saveInstanceState", null);
        try {
            this.a.e();
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
