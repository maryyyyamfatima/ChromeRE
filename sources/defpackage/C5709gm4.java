package defpackage;

import J.N;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$FollowResults;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedPageInformation;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.widget.LoadingView;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gm4 */
/* loaded from: classes.dex */
public final class C5709gm4 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public final /* synthetic */ C8115nm4 b;
    public final /* synthetic */ C8459om4 c;

    public C5709gm4(C8459om4 c8459om4, C8115nm4 c8115nm4) {
        this.c = c8459om4;
        this.b = c8115nm4;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!this.a) {
            this.a = true;
            final C8459om4 c8459om4 = this.c;
            if (!c8459om4.d.a("webfeed_follow_intro_debug.enable")) {
                c8459om4.f.notifyEvent("web_feed_follow_intro_clicked");
            }
            Q53 q53 = c8459om4.h.g;
            if (q53 != null) {
                P53 p53 = new P53(q53);
                LoadingView loadingView = q53.t;
                loadingView.a(p53);
                loadingView.e();
            }
            final Tab tab = (Tab) ((C8385oa2) c8459om4.i).g;
            N.MxULk9PS(0, 33);
            final GURL url = tab.getUrl();
            final C8115nm4 c8115nm4 = this.b;
            N.MztsaYnr(new WebFeedBridge$WebFeedPageInformation(tab, url), 2, new Callback() { // from class: dm4
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Tab tab2 = tab;
                    GURL gurl = url;
                    C8115nm4 c8115nm42 = c8115nm4;
                    WebFeedBridge$FollowResults webFeedBridge$FollowResults = (WebFeedBridge$FollowResults) obj;
                    C8459om4 c8459om42 = C8459om4.this;
                    c8459om42.getClass();
                    C6053hm4 c6053hm4 = new C6053hm4(webFeedBridge$FollowResults, c8115nm42, c8459om42, tab2, gurl);
                    Q53 q532 = c8459om42.h.g;
                    if (q532 != null) {
                        LoadingView loadingView2 = q532.t;
                        loadingView2.a(c6053hm4);
                        loadingView2.c();
                    }
                }
            });
        }
        return true;
    }
}
