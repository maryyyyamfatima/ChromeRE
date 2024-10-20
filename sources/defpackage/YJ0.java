package defpackage;

import J.N;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YJ0 extends DK2 {
    public final /* synthetic */ FeedStream a;

    public YJ0(FeedStream feedStream) {
        this.a = feedStream;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        FeedStream feedStream = this.a;
        if (feedStream.z != null) {
            int i3 = feedStream.n + i2;
            feedStream.n = i3;
            if (i3 < 0) {
                feedStream.n = 0;
            }
            if (feedStream.n >= TypedValue.applyDimension(1, feedStream.b, feedStream.y.getResources().getDisplayMetrics()) && feedStream.f(feedStream.o)) {
                feedStream.n = 0;
            }
        }
        N.MI0NT3kQ(feedStream.d, feedStream);
        C7271lK0 c7271lK0 = feedStream.t;
        if (i2 != 0) {
            int i4 = c7271lK0.c;
            if (i4 != 0) {
                if ((i2 > 0) != (i4 > 0)) {
                    c7271lK0.a();
                }
            }
            c7271lK0.c += i2;
            if (c7271lK0.a == null) {
                c7271lK0.b = true;
                RunnableC10089tY2 runnableC10089tY2 = new RunnableC10089tY2(c7271lK0);
                c7271lK0.a = runnableC10089tY2;
                PostTask.b(AbstractC5103f04.a, runnableC10089tY2, 200L);
                return;
            }
            c7271lK0.b = false;
            return;
        }
        c7271lK0.getClass();
    }
}
