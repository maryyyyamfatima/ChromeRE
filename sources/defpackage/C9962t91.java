package defpackage;

import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t91 */
/* loaded from: classes2.dex */
public final class C9962t91 extends BA0 {
    public final /* synthetic */ C10305u91 a;

    public C9962t91(C10305u91 c10305u91) {
        this.a = c10305u91;
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        TraceEvent i = TraceEvent.i("HomeButtonCoordinator::onPageLoadFinished", null);
        try {
            this.a.a(gurl);
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
