package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$UnfollowResults;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Lm4 extends Rm4 {
    public final /* synthetic */ byte[] j;
    public final /* synthetic */ int k;
    public final /* synthetic */ GURL l;
    public final /* synthetic */ String m;
    public final /* synthetic */ Sm4 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lm4(Sm4 sm4, byte[] bArr, int i, GURL gurl, String str) {
        super(sm4);
        this.n = sm4;
        this.j = bArr;
        this.k = i;
        this.l = gurl;
        this.m = str;
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        c();
        N.MxULk9PS(0, 36);
        final byte[] bArr = this.j;
        final int i = this.k;
        final GURL gurl = this.l;
        final String str = this.m;
        N.MVWVyQhp(bArr, false, i, new Callback() { // from class: Km4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                Lm4.this.n.d(((WebFeedBridge$UnfollowResults) obj2).a, bArr, gurl, str, i);
            }
        });
    }
}
