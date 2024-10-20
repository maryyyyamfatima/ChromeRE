package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L12 {
    public final Callback a;
    public final Handler b = new Handler(ThreadUtils.c());
    public final LinkedList c = new LinkedList();
    public boolean d;
    public boolean e;
    public boolean f;

    public L12(C2615Ud0 c2615Ud0) {
        this.a = c2615Ud0;
    }

    public final void b() {
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.b.removeCallbacks((Runnable) it.next());
        }
        linkedList.clear();
    }

    public final void a(Tab tab, Callable callable, long j) {
        if (this.f) {
            return;
        }
        K12 k12 = new K12(this, tab, callable);
        this.c.add(k12);
        this.b.postDelayed(k12, j);
    }
}
