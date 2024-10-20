package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bK0 */
/* loaded from: classes.dex */
public final class C3835bK0 implements InterfaceC3486aJ0 {
    public final /* synthetic */ FeedStream a;

    public final void a(View view, float f, Runnable runnable) {
        FeedStream feedStream = this.a;
        RJ0 rj0 = feedStream.s;
        String e = feedStream.e(view);
        ArrayList arrayList = (ArrayList) rj0.k.get(e);
        if (arrayList == null) {
            arrayList = new ArrayList();
            rj0.k.put(e, arrayList);
        }
        arrayList.add(new QJ0(f, runnable));
    }

    public C3835bK0(FeedStream feedStream) {
        this.a = feedStream;
    }
}
