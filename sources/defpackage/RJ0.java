package defpackage;

import J.N;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RJ0 implements ViewTreeObserver.OnPreDrawListener {
    public RecyclerView a;
    public C7555m82 g;
    public boolean i;
    public C8303oK0 j;
    public final HashSet h = new HashSet();
    public HashMap k = new HashMap();

    public RJ0(RecyclerView recyclerView, C7555m82 c7555m82, C8303oK0 c8303oK0) {
        this.a = recyclerView;
        this.g = c7555m82;
        this.j = c8303oK0;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View r;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null) {
            return true;
        }
        AbstractC12077zK2 abstractC12077zK2 = recyclerView.s;
        if (!(abstractC12077zK2 instanceof LinearLayoutManager)) {
            return true;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC12077zK2;
        int T0 = linearLayoutManager.T0();
        for (int R0 = linearLayoutManager.R0(); R0 <= T0 && R0 < this.g.d() && R0 >= 0; R0++) {
            String str = this.g.b(R0).a;
            if (str.startsWith("c/") && (r = linearLayoutManager.r(R0)) != null) {
                if (!this.i) {
                    this.i = true;
                    FeedStream feedStream = this.j.a;
                    N.MSbKfLjT(feedStream.d, feedStream);
                }
                ArrayList arrayList = (ArrayList) this.k.get(str);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        QJ0 qj0 = (QJ0) arrayList.get(i);
                        if (a(r, qj0.a)) {
                            arrayList3.add(qj0.b);
                            arrayList2.add(Integer.valueOf(i));
                        }
                    }
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        arrayList.remove(((Integer) arrayList2.get(size)).intValue());
                    }
                    if (arrayList.isEmpty()) {
                        this.k.remove(str);
                    }
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                HashSet hashSet = this.h;
                if (!hashSet.contains(str) && a(r, 0.66f)) {
                    hashSet.add(str);
                    FeedStream feedStream2 = this.j.a;
                    N.MziuA46j(feedStream2.d, feedStream2, str);
                }
            }
        }
        return true;
    }

    public final boolean a(View view, float f) {
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        int height = rect.height() * rect.width();
        if (height > 0 && this.a.getChildVisibleRect(view, rect, null)) {
            return ((float) (rect.height() * rect.width())) / ((float) height) >= f;
        }
        return false;
    }
}
