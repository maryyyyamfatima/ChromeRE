package defpackage;

import com.android.chrome.R;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$FollowResults;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedMetadata;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hm4 */
/* loaded from: classes.dex */
public final class C6053hm4 implements InterfaceC3467aF1 {
    public final /* synthetic */ WebFeedBridge$FollowResults a;
    public final /* synthetic */ Tab g;
    public final /* synthetic */ GURL h;
    public final /* synthetic */ C8115nm4 i;
    public final /* synthetic */ C8459om4 j;

    @Override // defpackage.InterfaceC3467aF1
    public final void P() {
    }

    @Override // defpackage.InterfaceC3467aF1
    public final void n() {
        C8459om4 c8459om4 = this.j;
        C10173tm4 c10173tm4 = c8459om4.h;
        Q53 q53 = c10173tm4.g;
        if (q53 != null) {
            q53.b();
            c10173tm4.g.t.b();
            c10173tm4.g = null;
        }
        WebFeedBridge$FollowResults webFeedBridge$FollowResults = this.a;
        if (webFeedBridge$FollowResults.a == 1) {
            C10173tm4 c10173tm42 = c8459om4.h;
            c10173tm42.getClass();
            Q53 q532 = new Q53(c10173tm42.a, c10173tm42.d, R.string.0_resource_name_obfuscated_res_0x7f140625, R.string.0_resource_name_obfuscated_res_0x7f140625, c10173tm42.a(), R.drawable.0_resource_name_obfuscated_res_0x7f0901eb, C10021tL.f().c(), null);
            q532.g(true);
            q532.h();
        }
        WebFeedBridge$WebFeedMetadata webFeedBridge$WebFeedMetadata = webFeedBridge$FollowResults.b;
        c8459om4.g.a(this.g, webFeedBridge$FollowResults, webFeedBridge$WebFeedMetadata != null ? webFeedBridge$WebFeedMetadata.a : null, this.h, this.i.c, 2);
    }

    public C6053hm4(WebFeedBridge$FollowResults webFeedBridge$FollowResults, C8115nm4 c8115nm4, C8459om4 c8459om4, Tab tab, GURL gurl) {
        this.j = c8459om4;
        this.a = webFeedBridge$FollowResults;
        this.g = tab;
        this.h = gurl;
        this.i = c8115nm4;
    }
}
