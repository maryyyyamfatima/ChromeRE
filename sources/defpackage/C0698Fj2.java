package defpackage;

import J.N;
import java.util.Iterator;
import org.chromium.chrome.browser.partnerbookmarks.PartnerBookmarksReader$FetchFaviconCallback;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fj2 */
/* loaded from: classes.dex */
public final class C0698Fj2 implements PartnerBookmarksReader$FetchFaviconCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ C1088Ij2 b;

    @Override // org.chromium.chrome.browser.partnerbookmarks.PartnerBookmarksReader$FetchFaviconCallback
    public final void onFaviconFetched(int i) {
        EI2.h(i, 8, "PartnerBookmark.FaviconThrottleFetchResult");
        synchronized (this.b.d) {
            boolean z = true;
            if (i == 6) {
                this.b.g = true;
                Iterator it = C1088Ij2.j.iterator();
                while (it.hasNext()) {
                    InterfaceC0828Gj2 interfaceC0828Gj2 = (InterfaceC0828Gj2) it.next();
                    String McXhQJZC = N.McXhQJZC(this.a);
                    C8252oA c8252oA = (C8252oA) interfaceC0828Gj2;
                    c8252oA.r.c.remove(new GURL(McXhQJZC));
                    c8252oA.s = true;
                }
            }
            this.b.a.b(i, this.a);
            C1088Ij2 c1088Ij2 = this.b;
            int i2 = c1088Ij2.e - 1;
            c1088Ij2.e = i2;
            if (i2 != 0 || !c1088Ij2.h || !c1088Ij2.i) {
                z = false;
            }
            if (z) {
                c1088Ij2.a();
            }
        }
    }

    public C0698Fj2(C1088Ij2 c1088Ij2, String str) {
        this.b = c1088Ij2;
        this.a = str;
    }

    @Override // org.chromium.chrome.browser.partnerbookmarks.PartnerBookmarksReader$FetchFaviconCallback
    public final void onFaviconFetch() {
        synchronized (this.b.d) {
            this.b.e++;
        }
    }
}
