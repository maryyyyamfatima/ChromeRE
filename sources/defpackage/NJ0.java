package defpackage;

import android.content.Context;
import org.chromium.base.BundleUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.feed.FeedImageFetchClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NJ0 implements WB2 {
    public final Context a;
    public final FeedImageFetchClient b;
    public final KJ0 c;
    public final KH d;
    public final C9626sA2 e;
    public final String f;

    public NJ0(C9626sA2 c9626sA2) {
        Context context = V60.a;
        context = BundleUtils.d(context, "feedv2") ? new C7579mD(BundleUtils.f("feedv2"), context) : context;
        this.a = context;
        this.b = new FeedImageFetchClient();
        this.c = new KJ0();
        this.e = c9626sA2;
        this.f = "AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw";
        if (BundleUtils.d(context, "feedv2")) {
            this.d = new KH();
        }
    }

    public final void a(Runnable runnable, long j) {
        PostTask.b(AbstractC5103f04.a, runnable, j);
    }
}
