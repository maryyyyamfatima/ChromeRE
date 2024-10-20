package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$FollowResults;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedMetadata;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedPageInformation;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Pm4 extends Rm4 {
    public final byte[] j;
    public final GURL k;
    public final String l;
    public final int m;
    public final int n;
    public final /* synthetic */ Sm4 o;

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        c();
        N.MxULk9PS(0, this.m);
        byte[] bArr = this.j;
        boolean z = (bArr == null || bArr.length == 0) ? false : true;
        int i = this.n;
        if (!z) {
            N.MztsaYnr(new WebFeedBridge$WebFeedPageInformation(this.a, this.k), i, new Callback() { // from class: Nm4
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    WebFeedBridge$FollowResults webFeedBridge$FollowResults = (WebFeedBridge$FollowResults) obj2;
                    Pm4 pm4 = Pm4.this;
                    pm4.getClass();
                    WebFeedBridge$WebFeedMetadata webFeedBridge$WebFeedMetadata = webFeedBridge$FollowResults.b;
                    pm4.o.a(pm4.a, webFeedBridge$FollowResults, webFeedBridge$WebFeedMetadata != null ? webFeedBridge$WebFeedMetadata.a : null, pm4.k, pm4.l, pm4.n);
                }
            });
        } else {
            N.MtL148iF(bArr, false, i, new Callback() { // from class: Om4
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    WebFeedBridge$FollowResults webFeedBridge$FollowResults = (WebFeedBridge$FollowResults) obj2;
                    Pm4 pm4 = Pm4.this;
                    pm4.o.a(pm4.a, webFeedBridge$FollowResults, pm4.j, pm4.k, pm4.l, pm4.n);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pm4(Sm4 sm4, byte[] bArr, GURL gurl, String str, int i, int i2) {
        super(sm4);
        this.o = sm4;
        this.j = bArr;
        this.k = gurl;
        this.l = str;
        this.m = i;
        this.n = i2;
    }
}
