package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.suggestions.mostvisited.MostVisitedSitesBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aM3 */
/* loaded from: classes.dex */
public final class C3504aM3 implements InterfaceC0679Ff3 {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ C3848bM3 g;

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        C3848bM3 c3848bM3 = this.g;
        if (c3848bM3.e) {
            return;
        }
        GURL gurl = (GURL) obj;
        this.a.onResult(gurl);
        MostVisitedSitesBridge mostVisitedSitesBridge = c3848bM3.d;
        long j = mostVisitedSitesBridge.a;
        if (j == 0) {
            return;
        }
        N.MQm3a0t7(j, mostVisitedSitesBridge, gurl, false);
    }

    public C3504aM3(C3848bM3 c3848bM3, XL3 xl3) {
        this.g = c3848bM3;
        this.a = xl3;
    }
}
