package defpackage;

import android.view.View;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hK0 */
/* loaded from: classes.dex */
public final class C5897hK0 extends AbstractC4472dA0 {
    public final /* synthetic */ C6241iK0 a;

    public C5897hK0(C6241iK0 c6241iK0) {
        this.a = c6241iK0;
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void d(int i) {
        C6241iK0 c6241iK0 = this.a;
        View view = c6241iK0.b.L;
        FeedStream feedStream = c6241iK0.b;
        if (view != null) {
            view.requestFocus();
            feedStream.L = null;
        }
        View view2 = feedStream.M;
        if (view2 != null) {
            view2.sendAccessibilityEvent(8);
            feedStream.M = null;
        }
    }
}
