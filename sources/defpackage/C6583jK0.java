package defpackage;

import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jK0 */
/* loaded from: classes.dex */
public final class C6583jK0 extends AbstractC8991qK2 {
    public final /* synthetic */ FeedStream a;

    @Override // defpackage.AbstractC8991qK2
    public final void d(int i, int i2) {
        FeedStream feedStream = this.a;
        PJ0 pj0 = feedStream.C;
        if (pj0 == null || !feedStream.g(pj0)) {
            return;
        }
        feedStream.C = null;
    }

    public C6583jK0(FeedStream feedStream) {
        this.a = feedStream;
    }
}
