package defpackage;

import org.chromium.chrome.browser.feed.FeedServiceBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nK0 */
/* loaded from: classes.dex */
public final class C7959nK0 extends FeedServiceBridge.UnreadContentObserver {
    public final C8385oa2 b;

    public C7959nK0() {
        C8385oa2 c8385oa2 = new C8385oa2();
        this.b = c8385oa2;
        c8385oa2.p(Boolean.FALSE);
    }

    @Override // org.chromium.chrome.browser.feed.FeedServiceBridge.UnreadContentObserver
    public final void hasUnreadContentChanged(boolean z) {
        this.b.p(Boolean.valueOf(z));
    }
}
