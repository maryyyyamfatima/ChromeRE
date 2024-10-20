package defpackage;

import J.N;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7271lK0 {
    public RunnableC10089tY2 a;
    public boolean b;
    public int c;
    public final /* synthetic */ FeedStream d;

    public final void a() {
        int i = this.c;
        if (i != 0) {
            FeedStream feedStream = this.d;
            N.M9DpFDeH(feedStream.d, feedStream, i);
            this.c = 0;
        }
        this.b = false;
    }

    public C7271lK0(FeedStream feedStream) {
        this.d = feedStream;
    }
}
