package org.chromium.chrome.browser.feed.webfeed;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class WebFeedBridge$WebFeedPageInformation {
    public final GURL a;
    public final Tab b;

    public WebFeedBridge$WebFeedPageInformation(Tab tab, GURL gurl) {
        this.a = gurl;
        this.b = tab;
    }

    public GURL getUrl() {
        return this.a;
    }

    public Tab getTab() {
        return this.b;
    }
}
